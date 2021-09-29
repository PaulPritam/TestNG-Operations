package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PoiWrite {

    @Test
    public void write() throws Exception {
        File source = new File("C:\\Users\\Pritam Paul\\Downloads\\demo1\\" +
                "TestNGOps\\src\\dataset.xlsx");

        FileInputStream inputStream = new FileInputStream(source);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheetAt(0);

//        sheet.getRow(0).createCell(3).setCellValue("User1");
//        sheet.getRow(1).createCell(2).setCellValue("User2");

        FileOutputStream fileOutputStream = new FileOutputStream(source);

        workbook.write(fileOutputStream);

        workbook.close();


    }
}
