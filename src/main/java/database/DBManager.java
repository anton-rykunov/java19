package database;

import entity.Discipline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Discipline> getAllActiveDisciplines() {
        ArrayList<Discipline> disciplines = new ArrayList<Discipline>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:7777/students_progress?user=root&password=Rfhectkmrf2011&useUnicode=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from `discipline` where `status` = '1'");

            while (rs.next()) {
                Discipline discipline = new Discipline();
                discipline.setDiscipline(rs.getString("discipline"));
                discipline.setId(rs.getInt("id"));
                disciplines.add(discipline);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplines;
    }

    public static void creatNewDiscipline(String disc) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:7777/students_progress?user=root&password=Rfhectkmrf2011&useUnicode=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
            Statement stmt = connection.createStatement();
            stmt.execute("INSERT INTO `discipline` (`discipline`) VALUES ('" + disc + "');");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
