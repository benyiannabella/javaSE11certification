import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyFirstDBConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
//        String username = "username";
//        String password = "password123";
        Connection myDBConnect = DriverManager.getConnection(url);
        String select = "Select * from exhibits";
        String insert = "Insert into exhibits values(4, 'tiger', 15.0) ";
        String delete = "delete from exhibits where id = 0";
//        try(var ps = myDBConnect.prepareStatement(insert)) {
//           int result = ps.executeUpdate();
//            System.out.println(result);
//
//        }

//        var insert2 = "Insert into exhibits values(?,?,?)";
////        int id = 0;
////        String name = "";
////        double acre = 0.0;
////        try(var ps = myDBConnect.prepareStatement(insert2)){
////            ps.setInt(1,id);
////            ps.setString(2, name);
////            ps.setDouble(3, acre);
////
////            System.out.println(ps.executeUpdate());

//        try(var ps = myDBConnect.prepareStatement(insert)){
//            boolean result = ps.execute();
//            if(result){
//                ResultSet rs = ps.getResultSet();
//                System.out.println("result set");
//            } else{
//                int count = ps.getUpdateCount();
//                System.out.println("update, record number = " + count);
//            }
//        }

        try(var ps = myDBConnect.prepareStatement(delete) ){
            int res = ps.executeUpdate();
            System.out.println(res);
        }

        try(var ps = myDBConnect.prepareStatement(select);
                ResultSet rs = ps.executeQuery()){
            Map<Integer,String>exhibitMap = new HashMap<>();
            while(rs.next()){
                Object id = rs.getObject("id");
                Object name = rs.getObject("name");
                if(id instanceof Integer && name instanceof String) {
                    exhibitMap.put((Integer) id, (String)name);
                }
            }
            System.out.println(exhibitMap);
        }
    }
}
