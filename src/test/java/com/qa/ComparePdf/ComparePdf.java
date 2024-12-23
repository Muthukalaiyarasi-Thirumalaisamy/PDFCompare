package com.qa.ComparePdf;

import java.io.IOException;

import de.redsix.pdfcompare.PdfComparator;

public class ComparePdf {

	public static void main(String[] args) throws Exception, IOException {

		String pdf1="C:\\Users\\MOMS'GIRL\\Downloads\\Free_Test_Data_100KB_PDF.pdf";
		String pdf2="C:\\Users\\MOMS'GIRL\\OneDrive\\Desktop\\pdf2.pdf";
		String outputPdf="C:\\Users\\MOMS'GIRL\\OneDrive\\Desktop\\result\\results";
		
		//Compare two PDF's
		new PdfComparator(pdf1, pdf2).compare().writeTo(outputPdf);
		
		
		/* Compare PDF's and get result in console
		final CompareResult result = new PdfComparator("expected.pdf", "actual.pdf").compare();
if (result.isNotEqual()) {
    System.out.println("Differences found!");
}
if (result.isEqual()) {
    System.out.println("No Differences found!");
}
if (result.hasDifferenceInExclusion()) {
    System.out.println("Differences in excluded areas found!");
}
result.getDifferences(); // returns page areas, where differences were found
		 */

		//********Compare with ignore file***********
		//new PdfComparator("expected.pdf", "actual.pdf").withIgnore("ignore.conf").compare();
		
		//*********Compare ********** 
		
		/*new PdfComparator("expected.pdf", "actual.pdf")
		.withIgnore(new PageArea(1, 230, 350, 450, 420))
		.withIgnore(new PageArea(2))
		.compare(); */
		
		//**************encrypted PDF ******************
		
		/*new PdfComparator("expected.pdf", "actual.pdf")
	    .withExpectedPassword("somePwd")
	    .withActualPassword("anotherPwd")
	    .compare(); */
	}

}
