package fileOperations;
import java.io.*;
import org.apache.commons.io.FileUtils;
public class CopyFiles  {
    public static void main(String[] args) throws IOException{
        File file1=new File("C:/Users/RDK030/Desktop/Sample1.txt");
        File file2=new File("C:/Users/RDK030/Desktop/Sample2.txt");
        File dir=new File("C:/Users/RDK030/Desktop/Dir");
        File file3=new File("C:/Users/RDK030/Desktop/Sample3.txt");
        FileUtils.copyFile(file1,file2);  //destination file should be present
        FileUtils.copyFileToDirectory(file1,dir);
        FileUtils.moveFile(file1,file3);  //destination file should not be present
    }
}

