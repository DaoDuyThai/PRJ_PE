/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DUYTHAI
 */
public class Player {
    String playerId;
    String playerName; 
    String position;
    int salary;
    String teamId;

    public Player() {
    }

    public Player(String playerId, String playerName, String position, int salary, String teamId) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.position = position;
        this.salary = salary;
        this.teamId = teamId;
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

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Player{" + "playerId=" + playerId + ", playerName=" + playerName + ", position=" + position + ", salary=" + salary + ", teamId=" + teamId + '}';
    }
    
}
