package fileOperations;
import java.io.*;
import java.util.*;
import org.apache.commons.io.FileUtils;
public class SortingLines {
    public static void main(String[] args) throws IOException{
        File file=new File("C:/Users/RDK030/Desktop/Sample1.txt");
        List<String> l= FileUtils.readLines(file,"UTF-8");
        Collections.sort(l);
        FileUtils.write(file,"","UTf-8",false);
        for(String e:l){
            FileUtils.write(file,e+"\n","UTF-8",true);
        }

    }
}
