import java.sql.*;


// Retrieving Data


//public class CRUD {
//
//    public static void main(String[] args) throws ClassNotFoundException{
//
//        String url="jdbc:mysql://localhost:3306/mydatabase";
//        String username="Marutheesh";
//        String password="1718";
//        String query="Select * from employees";
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Drivers Loaded Successfully");
//        } catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{
//            Connection con=DriverManager.getConnection(url,username,password);
//            System.out.println("Connection Established Successfully");
//
//            Statement stmt=con.createStatement();
//            ResultSet rs=stmt.executeQuery(query);
//            while(rs.next()){
//                int id=rs.getInt("id");
//                String name=rs.getString("name");
//                String job_title=rs.getString("job_title");
//                double salary=rs.getDouble("salary");
//
//                System.out.println("ID : "+id);
//                System.out.println("Name : "+name);
//                System.out.println("Job Title : "+job_title);
//                System.out.println("Salary : "+salary);
//                System.out.println("--------------------------");
//            }
//
//            rs.close();
//            stmt.close();
//            con.close();
//            System.out.println("Connection Closed Successfully");
//
//        } catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}



//Insering Data


//public class CRUD {
//
//    public static void main(String[] args) throws ClassNotFoundException{
//
//        String url="jdbc:mysql://localhost:3306/mydatabase";
//        String username="Marutheesh";
//        String password="1718";
//        String query="insert into employees(id,name,job_title,salary) values(3,'Harshith', 'Full Stack Developer', 80000.0);";
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Drivers Loaded Successfully");
//        } catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{
//            Connection con=DriverManager.getConnection(url,username,password);
//            System.out.println("Connection Established Successfully");
//
//            Statement stmt=con.createStatement();
//            int rowsAffected=stmt.executeUpdate(query);
//
//            if(rowsAffected>0){
//                System.out.println("Insertion Successfull and "+ rowsAffected+" Row Affected");
//            } else{
//                System.out.println("Insertion Failed");
//            }
//            stmt.close();
//            con.close();
//            System.out.println("Connection Closed Successfully");
//
//        } catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}


//Deleting Data


//public class CRUD  {
//
//    public static void main(String[] args) throws ClassNotFoundException{
//
//        String url="jdbc:mysql://localhost:3306/mydatabase";
//        String username="Marutheesh";
//        String password="1718";
//        String query="delete from employees where id=3;";
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Drivers Loaded Successfully");
//        } catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{
//            Connection con=DriverManager.getConnection(url,username,password);
//            System.out.println("Connection Established Successfully");
//
//            Statement stmt=con.createStatement();
//            int rowsAffected=stmt.executeUpdate(query);
//
//            if(rowsAffected>0){
//                System.out.println("Deletion Successfull and "+ rowsAffected+" Row Affected");
//            } else{
//                System.out.println("Deletion Failed");
//            }
//            stmt.close();
//            con.close();
//            System.out.println("Connection Closed Successfully");
//
//        } catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}


//Updating Data


public class CRUD  {

    public static void main(String[] args) throws ClassNotFoundException{

        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="Marutheesh";
        String password="1718";
        String query="update employees set job_title = 'Full Stack Developer' , salary= 80000.0 where id=2";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers Loaded Successfully");
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established Successfully");

            Statement stmt=con.createStatement();
            int rowsAffected=stmt.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Updation Successfull and "+ rowsAffected+" Row Affected");
            } else{
                System.out.println("Updation Failed");
            }
            stmt.close();
            con.close();
            System.out.println("Connection Closed Successfully");

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}