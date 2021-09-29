package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;


public class PoiTryout {

    @Test
    public void readData() throws Exception {

        File file = new File("C:\\Users\\Pritam Paul\\Downloads\\demo1\\TestNGOps\\src\\dataset.xlsx");
        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheetAt(0);

        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                System.out.println(cell.getStringCellValue());
            }
            System.out.println();
        }

    }
}
