package com.proj.SPLABDianaGliga;

public class TableOfContentUpdate implements Visitor {
    int pageCounter = 0;
    TableOfContents tableOfContents = new TableOfContents();
    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {
        tableOfContents.addEntry(section.getTitle() + "................" + pageCounter);
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        pageCounter++;
    }

    @Override
    public void visitImage(Image image) {
        pageCounter++;
    }

    @Override
    public void visitTable(Table table) {
        pageCounter++;
    }

    TableOfContents getTableOfContents() {
        return this.tableOfContents;
    }
}
