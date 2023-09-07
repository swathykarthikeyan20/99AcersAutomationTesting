package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet {

    private String filePath="C:\\Users\\SWAKARTH\\Documents\\Acers99SprintProject\\acres\\Screenshots\\logins.xlsx";

    public Excelsheet(String filePath) {
        this.filePath = filePath;
    }

    public String[] getValues() throws IOException {
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet s = workbook.getSheetAt(0);
        // Assuming you're working with the first sheet (index 0).
        
        s.createRow(0);
        s.getRow(0).createCell(0).setCellValue("swathy");
        s.getRow(0).createCell(1).setCellValue("swathykarthikeyan20@gmail.com");
       
      
        String cellvalue=s.getRow(0).getCell(0).getStringCellValue();
     String cellvalue1=s.getRow(0).getCell(1).getStringCellValue();
     
      System.out.println(cellvalue);
      System.out.println(cellvalue1);
    
        Row row = s.getRow(0); // Assuming your data is in the first row.

        String[] values = new String[row.getLastCellNum()];
        
        for (int i = 0; i < row.getLastCellNum(); i++) {
            Cell cell = row.getCell(i);
            values[i] = cell.getStringCellValue();
        }

        workbook.close();
        fis.close();

        return values;
    }
   
}
