import java.io.*;
import java.sql.*;

//Creation and Insertion

//public class ImageHandling {
//
//    public static void main(String[] args) throws ClassNotFoundException{
//
//        String url="jdbc:mysql://localhost:3306/mydatabase";
//        String username="Marutheesh";
//        String password="1718";
//        String image_path="C:\\Users\\Marutheesh\\OneDrive\\Pictures\\lwp.jpg";
//        String query="insert into image_table(image_data) values(?)";
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
//            FileInputStream fileInputStream=new FileInputStream(image_path);
//            byte[] imageData= new byte[fileInputStream.available()];
//            fileInputStream.read(imageData);
//
//            PreparedStatement pd=con.prepareStatement(query);
//            pd.setBytes(1, imageData);
//            int affectedRows=pd.executeUpdate();
//
//            if(affectedRows>0){
//                System.out.println("Insertion Of Image Is Successfull : "+affectedRows+" Rows Affected");
//            }else{
//                System.out.println("Insetion Of Image Failed");
//            }
//            con.close();
//            System.out.println("Connection Closed Successfully");
//
//        } catch(SQLException e){
//            System.out.println(e.getMessage());
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}


//Retrieving Image

public class ImageHandling {

    public static void main(String[] args) throws ClassNotFoundException{

        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="Marutheesh";
        String password="1718";
        String folder_path="C:\\Users\\Marutheesh\\OneDrive\\Pictures\\Saved Pictures\\";
        String query="select image_data from image_table where image_id=(?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers Loaded Successfully");
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con= DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established Successfully");

            PreparedStatement pd=con.prepareStatement(query);
            pd.setInt(1,1);

            ResultSet resultSet= pd.executeQuery();
            if(resultSet.next()){
                byte[] image_data=resultSet.getBytes("image_data");
                String image_path=folder_path+"Wallpaper.jpg";
                OutputStream outputStream=new FileOutputStream(image_path);
                outputStream.write(image_data);
            }else{
                System.out.println("No Image Found");
            }


            con.close();
            System.out.println("Connection Closed Successfully");

        } catch(SQLException e){
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}