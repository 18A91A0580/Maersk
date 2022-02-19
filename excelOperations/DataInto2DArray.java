package excelOperations;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class DataInto2DArray {
    public static void main(String[] args){
        Object[][] a=read();
        for(Object[] e:a){
            for(Object j:e){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    static Object[][] read(){
        Object[][] a=new Object[0][0];
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
            a=new Object[e-s+1][4];
            for(int i=s;i<=e;i++){
                a[i][0]=sh.getRow(i).getCell(0).getStringCellValue();
                a[i][1]=sh.getRow(i).getCell(1).getNumericCellValue();
                a[i][2]=sh.getRow(i).getCell(2).getBooleanCellValue();
                a[i][3]=sh.getRow(i).getCell(3).getStringCellValue();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return a;
    }
}
