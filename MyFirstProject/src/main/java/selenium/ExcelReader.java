package selenium;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
     
	
	public static void main(String[] args) throws IOException {

		        // Specify the path of the Excel file
		        String filePath = "/path/to/your/excel/file.xlsx";

		        // Create a file object
		        File file = new File(filePath);

		        // Create a FileInputStream object to read the Excel file
		        FileInputStream inputStream = new FileInputStream(file);

		        // Create a Workbook object for the Excel file
		        Workbook workbook = new XSSFWorkbook(inputStream);

		        // Get the first sheet of the Excel file
		        Sheet sheet = workbook.getSheetAt(0);

		        // Iterate through each row of the sheet
		        for (Row row : sheet) {

		            // Iterate through each cell of the row
		            for (Cell cell : row) {

		                // Extract the cell value
		                String cellValue = cell.getStringCellValue();

		                // Print the cell value
		                System.out.print(cellValue + "\t");
		            }

		            // Print a new line after each row
		            System.out.println();
		        }

		        // Close the workbook and the input stream
		        workbook.close();
		        inputStream.close();
		    }
		}

		
		
		

	}

}
