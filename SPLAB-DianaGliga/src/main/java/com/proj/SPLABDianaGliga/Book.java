package com.proj.SPLABDianaGliga;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {

    private Author author;
    private TableOfContents tableOfContents;

    public Book(String title) {
        super(title);
    }

    public void addContent(Element element) {
        this.add(element);
    }
    public void addAuthor(Author author) {
        this.author = author;
    }

    public void print() {
        author.print();
        super.print();
    }

}

