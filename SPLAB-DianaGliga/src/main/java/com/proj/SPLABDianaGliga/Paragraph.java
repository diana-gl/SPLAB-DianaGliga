package com.proj.SPLABDianaGliga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Paragraph implements Element {

    private String text;

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
        System.out.println("Paragraph: " + text);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

}
