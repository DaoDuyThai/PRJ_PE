/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DUYTHAI
 */
public class Coach {
    String coachId;
    String coachName;
    String position;
    int salary;
    String teamId;

    public Coach() {
    }

    public Coach(String coachId, String coachName, String position, int salary, String teamId) {
        this.coachId = coachId;
        this.coachName = coachName;
        this.position = position;
        this.salary = salary;
        this.teamId = teamId;
    }

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
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
        return "Coach{" + "coachId=" + coachId + ", coachName=" + coachName + ", position=" + position + ", salary=" + salary + ", teamId=" + teamId + '}';
    }
    
}
