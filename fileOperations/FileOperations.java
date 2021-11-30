package fileOperations;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\RDK030\\Desktop\\Sample.txt"); //reading document
        String s= FileUtils.readFileToString(file,"UTF-8"); // converting document to string
        System.out.println(s);  // printing string
        FileUtils.write(file," Appending","UTF-8",true); // true-> to append, false->override
       System.out.println(s);
    }
}
