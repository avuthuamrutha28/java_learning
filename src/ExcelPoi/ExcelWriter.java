package ExcelPoi;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelWriter {
    private static final String FILE_NAME = "students.xlsx";

    public static void writeStudentsToExcel(List<Student> students) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Students");

        // Header
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Name");
        header.createCell(1).setCellValue("Roll");
        header.createCell(2).setCellValue("Marks");

        // Data
        int rowNum = 1;
        for (Student student : students) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(student.getName());
            row.createCell(1).setCellValue(student.getRoll());
            row.createCell(2).setCellValue(student.getMarks());
        }

        // Auto-size columns
        for (int i = 0; i < 3; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write to file
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME)) {
            workbook.write(fos);
            System.out.println("✅ Excel file written: " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



