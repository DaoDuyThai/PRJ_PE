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

    String code;
    String name;
    String position;
    int salary;
    String team;

    public Player() {
    }

    public Player(String code, String name, String position, int salary, String team) {
        this.code = code;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.team = team;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" + "code=" + code + ", name=" + name + ", position=" + position + ", salary=" + salary + ", team=" + team + '}';
    }

}