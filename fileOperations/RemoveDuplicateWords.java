package fileOperations;
import java.io.*;
import org.apache.commons.io.FileUtils;
public class RemoveDuplicateWords {
    public static void main(String[] args) throws IOException{
        File file=new File("C:/Users/RDK030/Desktop/Sample.txt");
        String s=FileUtils.readFileToString(file,"UTF-8");
        s=s.replaceAll("\n"," ");
        String[] strs=s.split(" ");
        String st="";
        for(String e:strs){
            if(!st.contains(e)&& s.trim()==""){
                st=st+" "+e;
            }
        }
        FileUtils.write(file,st,"UTF-8",false);
    }
}
