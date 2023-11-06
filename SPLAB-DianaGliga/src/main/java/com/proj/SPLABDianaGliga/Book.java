package com.proj.SPLABDianaGliga;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapterList = new ArrayList<>();
    private TableOfContents tableOfContents;

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String chapterTitle) {
        Chapter chapter = new Chapter(chapterTitle);
        chapterList.add(chapter);
        return chapterList.indexOf(chapter);
    }

    void print() {
        System.out.println("Title of the book: " + title);
    }

    public Chapter getChapter(int indexChapter) {
        return chapterList.get(indexChapter);
    }
}

