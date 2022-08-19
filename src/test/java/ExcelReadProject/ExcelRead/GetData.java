package ExcelReadProject.ExcelRead;

import java.io.IOException;
import java.util.ArrayList;

public class GetData {

	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Excelreading obj = new Excelreading();
		
		
		ArrayList<String> data= obj.readData("testdata");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
	}

}
