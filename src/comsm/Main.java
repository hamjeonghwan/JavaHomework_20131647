package comsm;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Main {
	
	   private static final int ARRAY_SIZE = 10000;
	   private static final int NUMBER_SIZE = 1000;
	   private static final int DEFINED_NUMBER = 215;
	   private static final int MODULATE_NUMBER = 1000;
	   
	   public static void main(String[] args) {
	      int[] arr_variables = new int[ARRAY_SIZE];
	      int[] count = new int[NUMBER_SIZE];

	      arr_variables[0] = 946;
	      arr_variables[1] = 1;
	      count[arr_variables[0]]++;
	      count[arr_variables[1]]++;
	      for (int i = 2; i < ARRAY_SIZE; i++) {
	         arr_variables[i] =(arr_variables[i - 1] +arr_variables[i - 2]) % MODULATE_NUMBER;
	         count[arr_variables[i]]++;
	      }
	      
	      HSSFWorkbook workbook = new HSSFWorkbook();
	      HSSFSheet sheet = workbook.createSheet("가산식 합동법");
	      
	      HSSFRow row = sheet.createRow(0);
	      HSSFCell cell[] = {row.createCell(0), row.createCell(1), row.createCell(2)};
	      
	      cell[0].setCellValue("범위");
	      cell[1].setCellValue("횟수");
	      cell[2].setCellValue("확률");
	      for (int i = 1; i < NUMBER_SIZE + 1; i++) {
	         row = sheet.createRow(i);
	         cell[0] = row.createCell(0);
	         cell[1] = row.createCell(1);
	         cell[2] = row.createCell(2);
	         
	         cell[0].setCellValue(i - 1);
	         cell[1].setCellValue(count[i - 1]);
	         cell[2].setCellValue((double)count[i - 1] / ARRAY_SIZE);
	      }
	      
	      try {
	         FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\컴퓨터시뮬레이션5.xls");
	         workbook.write(fos);
	         fos.close();
	         System.out.println("파일 생성 완료");
	      } catch (IOException e) {
	         System.out.println("파일 생성 실패");
	      }
	   }
	}