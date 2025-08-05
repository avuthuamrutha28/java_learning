package ExcelPoi;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
    private static final String FILE_NAME = "students.xlsx";

    public static List<Student> readStudentsFromExcel() {
        List<Student> students = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getPhysicalNumberOfRows();

            for (int i = 1; i < rowCount; i++) { // Start from row 1 to skip header
                Row row = sheet.getRow(i);
                String name = row.getCell(0).getStringCellValue();
                int roll = (int) row.getCell(1).getNumericCellValue();
                double marks = row.getCell(2).getNumericCellValue();
                students.add(new Student(name, roll, marks));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}
