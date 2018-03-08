package utils;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample {
	
	
	public static void main(String[] args) {
		
		try {
			//File f=new File("D:\\report\\report.xlsx");
			//ExcelUtils.setExcelFile("D:\\report\\report.xlsx", "Sheet1");
			
		/*	//System.out.println(ExcelUtils.getCellData(1, 1));
			
			
			int l= ExcelUtils.getlostrow();
			//int n=ExcelUtils.getlostcell();
			System.out.println(l);
			
			for (int i = 1; i <=l+1; i++) {
				
				
				
				
				for (int j = 0; j <=4; j++) {
					
			
				System.out.println(ExcelUtils.getCellData(i,j));
				
				}
			}*/
			
			
			//ExcelUtils.setCellData("pass", 0, 0, "D:\\report\\report.xlsx");
			
			
			XSSFWorkbook work=new XSSFWorkbook();
			
			FileOutputStream fos=new FileOutputStream(new File("D:\\report\\report.xlsx"));
			XSSFSheet she=work.createSheet("praveen");
			Row r=she.createRow(0);
			
			r.createCell(0).setCellValue("Testing");
			
			work.write(fos);
			System.out.println("done");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
