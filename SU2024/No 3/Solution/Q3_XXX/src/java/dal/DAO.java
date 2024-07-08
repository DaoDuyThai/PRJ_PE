/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.PlayerInfo;

/**
 *
 * @author DUYTHAI
 */
public class DAO extends DBContext {

    public List<String> getIds() {
        List<String> ids = new ArrayList<>();
        String sql = "select playerid from Players";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("playerid");
                ids.add(id);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return ids;

    }

    public PlayerInfo getPlayerInfo(String playerId) {
        String sql = "SELECT P.PlayerID, P.PlayerName, P.Position, P.Salary, T.TeamName "
                + "FROM players P JOIN Teams T ON P.TeamID = T.TeamID "
                + "WHERE P.PlayerID = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, playerId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String playerName = rs.getString("PlayerName");
                String position = rs.getString("Position");
                int salary = rs.getInt("Salary");
                String teamName = rs.getString("TeamName");

                PlayerInfo playerInfo = new PlayerInfo(playerId, playerName, position, salary, teamName);
                return playerInfo;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public void deletePlayer(String playerId) {
        String sql = "DELETE FROM Players WHERE playerid = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, playerId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<String> coachIds = dao.getIds();
        for (String id : coachIds) {
            System.out.println(id);
        }

        PlayerInfo playerInfo = dao.getPlayerInfo("P006");
        if (playerInfo != null) {
            System.out.println("Player Info:");
            System.out.println(playerInfo.toString());
        } else {
            System.out.println("Player not found or error occurred.");
        }

        // Add more tests for other DAO methods as needed...
    }
}
