
public class HandlingExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Xls_Reader obj=new Xls_Reader("E:\\FilesConcept\\seleniumTC.xlsx");
		
		
		System.out.println(obj.getRowCount("Test"));
		System.out.println(obj.getColumnCount("Test"));
		
		System.out.println(obj.getCellData("Test", 2, 2));

		System.out.println(obj.getCellData("Test", "Salary", 5));
		//obj.setCellData("Test", "role", 6, "Owner");
	}

}
