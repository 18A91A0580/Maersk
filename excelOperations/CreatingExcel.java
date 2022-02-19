package excelOperations;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class CreatingExcel {
    public static void main(String[] args){
        File file=new File("C:\\Users\\RDK030\\Desktop\\Book2.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook();
        XSSFSheet sh=wb.createSheet("Sheet1");
        Row r;
        Cell c;
//        r=sh.createRow(0);
//        c= r.createCell(0);
//        c.setCellValue("Hi");
//        System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
        for(int i=0;i<10;i++){
            r=sh.createRow(i);
            for(int j=0;j<10;j++){
                c=r.createCell(j);
                c.setCellValue((i+1)*(j+1));
            }
        }

        try{
            FileOutputStream excel=new FileOutputStream(file);
            wb.write(excel);
            excel.close();
            wb.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
