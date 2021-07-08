package database;

import entity.Discipline;
import entity.Group;
import entity.Student;

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

    public static ArrayList<Student> getAllActiveStudents() {
        ArrayList<Student> students = new ArrayList<Student>();
        Group group = new Group();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:7777/students_progress?user=root&password=Rfhectkmrf2011&useUnicode=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `student` where `status` = '1';");

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setLastname(rs.getString("lastname"));
                student.setName(rs.getString("name"));
                group.setName(rs.getString("id_group"));
                student.setGroup(group);
                student.setDate(rs.getDate("date"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void creatNewDiscipline(String disc) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:7777/students_progress?user=root&password=Rfhectkmrf2011&useUnicode=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
            Statement stmt = connection.createStatement();
            stmt.execute("INSERT INTO `discipline` (`discipline`) VALUES ('" + disc + "');");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void creatNewStudent(String lastname, String name, String date) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:7777/students_progress?user=root&password=Rfhectkmrf2011&useUnicode=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
            Statement stmt = connection.createStatement();
            stmt.execute("INSERT INTO `student` (`lastname`, `name`, `date`) VALUES ('" + lastname + "', '" + name + "', '" + date + "');");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static Discipline getDisciplineById(String id) {
        Discipline discipline = new Discipline();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:7777/students_progress?user=root&password=Rfhectkmrf2011&useUnicode=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `discipline` where `id` = '" + id + "';");

            while (rs.next()) {
                discipline.setDiscipline(rs.getString("discipline"));
                discipline.setId(rs.getInt("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return discipline;
    }

    public static void modifyDiscipline(String id, String disc) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:7777/students_progress?user=root&password=Rfhectkmrf2011&useUnicode=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
            Statement stmt = connection.createStatement();
            stmt.execute("UPDATE `discipline` SET `discipline` = '" + disc + "'  WHERE (`id` = '" + id + "');");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void deleteDiscipline(String id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:7777/students_progress?user=root&password=Rfhectkmrf2011&useUnicode=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
            Statement stmt = connection.createStatement();
            stmt.execute("UPDATE `discipline` SET `status` = '0' WHERE (`id` = '" + id + "');");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void deleteStudent(String id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:7777/students_progress?user=root&password=Rfhectkmrf2011&useUnicode=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
            Statement stmt = connection.createStatement();
            stmt.execute("UPDATE `student` SET `status` = '0' WHERE (`id` = '" + id + "');");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



