import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateStudent {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Course: ");
            String course = sc.nextLine();

            Connection con = DBConnection.getConnection();
            String sql = "UPDATE students SET course=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, course);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Student Updated Successfully ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
