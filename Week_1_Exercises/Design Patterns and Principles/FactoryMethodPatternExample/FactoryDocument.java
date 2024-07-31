package FactoryMethodPatternExample;

// Abstract factory class
abstract class FactoryDocument {
    public abstract Document createDocument();
}

// Concrete factory for creating Word documents
class WordFactoryDocument extends FactoryDocument {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

// Concrete factory for creating PDF documents
class PdfFactoryDocument extends FactoryDocument {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

// Concrete factory for creating Excel documents
class ExcelFactoryDocument extends FactoryDocument {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

