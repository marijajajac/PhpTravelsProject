package utils;

public class Main {
	public static void main(String[] args) {

		ExcelUtils eu = new ExcelUtils();
		eu.setExcell("..\\Projekat\\excel\\Username.xlsx");
		eu.setWorkSheet(0);

		System.out.println(eu.getRowNumber());

		for (int i = 1; i < eu.getRowNumber(); i++) {
			System.out.println(eu.getDataAt(i, 0) + " " + eu.getDataAt(i, 1) + " " + eu.getDataAt(i, 2));

		}

		eu.closeExcell();
	}

}
