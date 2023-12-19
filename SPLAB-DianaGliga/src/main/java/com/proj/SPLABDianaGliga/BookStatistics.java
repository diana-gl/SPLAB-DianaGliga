package com.proj.SPLABDianaGliga;

public class BookStatistics implements Visitor {

    private int tableNum = 0;
    private int paragraphNum = 0;
    private int imageNum = 0;

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + imageNum);
        System.out.println("*** Number of tables: " + tableNum);
        System.out.println("*** Number of paragraphs: " + paragraphNum);
    }

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraphNum++;
    }

    @Override
    public void visitImage(Image image) {
        imageNum++;
    }

    @Override
    public void visitTable(Table table) {
        tableNum++;
    }
}
