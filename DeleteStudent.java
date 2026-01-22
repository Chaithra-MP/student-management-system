import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteStudent {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student ID to Delete: ");
            int id = sc.nextInt();

            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Student Deleted Successfully ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
