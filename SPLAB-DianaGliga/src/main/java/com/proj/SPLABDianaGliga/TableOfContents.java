package com.proj.SPLABDianaGliga;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element {
    List<String> bookContent = new ArrayList<>();

    public void addEntry(String content) {
        bookContent.add(content);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void print() {
        bookContent.forEach(c -> {
            System.out.println(c);
        });
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}
