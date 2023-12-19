package com.proj.SPLABDianaGliga;

public class RenderContentVisitor implements Visitor {

    @Override
    public void visitBook(Book book) {
        book.print();
    }

    @Override
    public void visitSection(Section section) {
        section.print();
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        tableOfContents.print();
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraph.print();
    }

    @Override
    public void visitImage(Image image) {

    }

    @Override
    public void visitTable(Table table) {

    }
}
