package clinic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientDAO {

    public void addPatient(String name, int age, String disease) {
        String sql = "INSERT INTO patient (name, age, disease) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, disease);
            ps.executeUpdate();
            System.out.println("Patient added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewPatients() {
        String sql = "SELECT * FROM patient";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Age: " + rs.getInt("age") +
                                   ", Disease: " + rs.getString("disease"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}