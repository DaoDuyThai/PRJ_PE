/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import model.Player;

/**
 *
 * @author DUYTHAI
 */
public class DAO extends DBContext {

    public List<String> getIds() {
        List<String> ids = new ArrayList<>();
        String sql = "SELECT PlayerId FROM Players";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("playerid");
                ids.add(id);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ids;
    }

    public Player getPlayerById(String id) {
        String sql = "SELECT P.PlayerID, P.PlayerName, P.Position, P.Salary, T.TeamName \n"
                + "FROM Players P JOIN Teams T ON P.TeamID = T.TeamID\n"
                + "WHERE P.PlayerID = '" + id + "'";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString("playername");
                String position = rs.getString("position");
                int salary = rs.getInt("salary");
                String team = rs.getString("teamname");
                Player player = new Player(id, name, position, salary, team);
                return player;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void deletePlayer(String id) {
        String sql = "DELETE FROM Players WHERE PlayerID = '" + id + "'";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
//        List<String> list = dao.getIds();
//        for (String id : list) {
//            System.out.println(id);
//        }
        Player p = dao.getPlayerById("P001");
        System.out.println(p.toString());
    }
}
