package excelOperations;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadingFile {
    public static void main(String[] args){
        File file=new File("C:\\Users\\RDK030\\Desktop\\Book1.xlsx");
        XSSFWorkbook wb;
        XSSFSheet sh;
        try{

            FileInputStream excel=new FileInputStream(file);

            wb=new XSSFWorkbook(excel);
            sh=wb.getSheet("Sheet1");

//            System.out.println(sh.getRow(2).getCell(0).getStringCellValue());
            int s=sh.getFirstRowNum();
            int e=sh.getLastRowNum();
            for(int i=s;i<=e;i++){
                System.out.print(sh.getRow(i).getCell(0).getStringCellValue()+"\t");
                System.out.print(sh.getRow(i).getCell(1).getNumericCellValue()+"\t");
                System.out.print(sh.getRow(i).getCell(2).getBooleanCellValue()+"\t");
                System.out.println(sh.getRow(i).getCell(3).getStringCellValue());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
