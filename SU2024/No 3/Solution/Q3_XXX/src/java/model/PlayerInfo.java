/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DUYTHAI
 */
public class PlayerInfo {

    String playerId;
    String playerName;
    String position;
    int salary;
    String teamName;

    public PlayerInfo() {
    }

    public PlayerInfo(String playerId, String playerName, String position, int salary, String teamName) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.position = position;
        this.salary = salary;
        this.teamName = teamName;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "PlayerInfo{" + "playerId=" + playerId + ", playerName=" + playerName + ", position=" + position + ", salary=" + salary + ", teamName=" + teamName + '}';
    }

}
