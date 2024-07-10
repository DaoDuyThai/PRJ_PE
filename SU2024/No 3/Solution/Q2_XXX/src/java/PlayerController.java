/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUYTHAI
 */
@WebServlet(urlPatterns = {"/player"})
public class PlayerController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PlayerController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PlayerController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        List<Player> players = (List<Player>) session.getAttribute("players");
        if (players == null) {
            players = new ArrayList<>();
        }

        String code = request.getParameter("code");
        String name = request.getParameter("name");
        String position = request.getParameter("position");
        String salaryStr = request.getParameter("salary");

        int salary = 0;

        String errorMessage = "";
        boolean valid = true;

        //Validate if code exist
        for (Player p : players) {
            if (p.getCode().equalsIgnoreCase(code)) {
                errorMessage = "Code existed!";
                valid = false;
                break;
            }
        }

        //Validate salary
        try {
            salary = Integer.parseInt(salaryStr);
            if (salary <= 0) {
                errorMessage = "You must input an integer > 0 for salary!";
                valid = false;
            }
        } catch (Exception e) {
            errorMessage = "You must input an integer > 0 for salary!";
            valid = false;
        }

        //add player
        if (valid) {
            Player p = new Player(code, name, position, salary);
            players.add(p);
        }

        session.setAttribute("players", players);
        request.setAttribute("errorMessage", errorMessage);

        request.getRequestDispatcher("MyExam.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
