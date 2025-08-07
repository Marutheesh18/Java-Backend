import java.sql.*;
import java.util.Scanner;

// Retrieving Data

//public class PreparedStatements {
//
//    public static void main(String[] args) throws ClassNotFoundException{
//
//        String url="jdbc:mysql://localhost:3306/mydatabase";
//        String username="Marutheesh";
//        String password="1718";
//        String query="select * from employees where name = ? and job_title = ? ";
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Drivers Loaded Successfully");
//        } catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{
//            Connection con= DriverManager.getConnection(url,username,password);
//            System.out.println("Connection Established Successfully");
//
//            PreparedStatement preparedStatement=con.prepareStatement(query);
//            preparedStatement.setString(1,"Hemanth");
//            preparedStatement.setString(2, "Full Stack Developer");
//            ResultSet resultSet=preparedStatement.executeQuery();
//
//            while(resultSet.next()){
//                int id=resultSet.getInt("id");
//                String name=resultSet.getString("name");
//                String job_title=resultSet.getString("job_title");
//                double salary=resultSet.getDouble("salary");
//
//                System.out.println("Id : "+id);
//                System.out.println("Name : "+name);
//                System.out.println("Job Title : "+ job_title);
//                System.out.println("Salary : "+salary);
//            }
//
//            con.close();
//            System.out.println("Connection Closed Successfully");
//
//        } catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//}


//Inserting Data


//public class PreparedStatements {
//
//    public static void main(String[] args) throws ClassNotFoundException{
//
//        String url="jdbc:mysql://localhost:3306/mydatabase";
//        String username="Marutheesh";
//        String password="1718";
//        String query="insert into employees(id,name,job_title,salary) values(?,?,?,?)";
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Drivers Loaded Successfully");
//        } catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{
//            Connection con= DriverManager.getConnection(url,username,password);
//            System.out.println("Connection Established Successfully");
//
//            PreparedStatement preparedStatement=con.prepareStatement(query);

//            preparedStatement.setInt(1,3);
//            preparedStatement.setString(2, "Nishanth");
//            preparedStatement.setString(3, "DevOps Engineer");
//            preparedStatement.setDouble(4, 65000.0);
//
//            int rowsAffected=preparedStatement.executeUpdate();
//
//            if(rowsAffected>0){
//                System.out.println("Insertion Successfull : "+rowsAffected+" Row Affected");
//            } else{
//                System.out.println("Insertion Failed");
//            }
//
//            preparedStatement.close();
//            con.close();
//            System.out.println("Connection Closed Successfully");
//
//        } catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//}





public class PreparedStatements {

    public static void main(String[] args) throws ClassNotFoundException{

        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="Marutheesh";
        String password="1718";
        String query="insert into employees(id,name,job_title,salary) values(?,?,?,?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers Loaded Successfully");
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con= DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established Successfully");

            PreparedStatement preparedStatement=con.prepareStatement(query);

            System.out.println("Enter The Values");
            Scanner sc=new Scanner(System.in);
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String job_title=sc.nextLine();
            double salary=sc.nextDouble();

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, job_title);
            preparedStatement.setDouble(4, salary);

            int rowsAffected=preparedStatement.executeUpdate();

            if(rowsAffected>0){
                System.out.println("Insertion Successfull : "+rowsAffected+" Row Affected");
            } else{
                System.out.println("Insertion Failed");
            }

            preparedStatement.close();
            con.close();
            System.out.println("Connection Closed Successfully");

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}