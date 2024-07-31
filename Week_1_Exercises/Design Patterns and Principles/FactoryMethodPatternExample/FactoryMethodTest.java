package FactoryMethodPatternExample;

public class FactoryMethodTest {
    public static void main(String[] args) {
        FactoryDocument wordFactory = new WordFactoryDocument();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.close();

        FactoryDocument pdfFactory = new PdfFactoryDocument();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.close();

        FactoryDocument excelFactory = new ExcelFactoryDocument();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.close();
    }
}

