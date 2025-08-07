import java.io.*;

public class FileHandling{
  
    public static void main(String[] args) {

        //Creating New File

        File myFile=new File("file1.txt");
        try {
            myFile.createNewFile();
            System.out.println("File Created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

       //writing into the file
           
            //  try {
            //     FileWriter fwrite=new FileWriter("file1.txt");
            //     fwrite.write("Namaste Saar \nHe He");
            //     fwrite.close();

            // } catch (IOException e) {
            //     e.printStackTrace();
            // }

       //Reading a File

    //    File myFile=new File("file1.txt");

    // try {
    //     Scanner  sc = new Scanner(myFile);
    //     while(sc.hasNextLine()){
    //         String content=sc.nextLine();
    //         System.out.println(content);
    //        }
    //        sc.close();
    // } catch (FileNotFoundException e) {
       
    //     e.printStackTrace();
    // }

     
    
    //Delete a file
    //   File myFile=new File("file1.txt");
    //   if(myFile.delete()){
    //     System.out.println("File Has Deleted");
    //   }
    //   else{
    //     System.out.println("Problem Has Occured");
    //   }

      //Methods
      System.out.println(myFile.getName());
      System.out.println(myFile.exists());

    }
}