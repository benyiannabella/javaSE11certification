import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        Connection con = DriverManager.getConnection(url);
        String select = "Select name from exhibits where id =?";
        List<String> names = new ArrayList<>();
        int id = 1;
        try(var ps = con.prepareStatement(select)){
            ps.setInt(1,id);
            try(var rs = ps.executeQuery()){
                while(rs.next()){
                    String name = rs.getString("name");
                    names.add(name);
                }
                System.out.println(names);
            }
        }

    }
}
