package com.proj.SPLABDianaGliga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Section implements Element {
    public String title;
    public List<Element> elementList;

    public Section(String title) {
        this.title = title;
        this.elementList = new ArrayList<>();
    }

    String getTitle() {
        return this.title;
    }

    @Override
    public void add(Element element) {
        elementList.add(element);
    }

    @Override
    public void remove(Element element) {
        elementList.remove(element);
    }

    @Override
    public Element get(int index) {
        return elementList.get(index);
    }

    @Override
    public void print() {
        System.out.println(title);
        //elementList.forEach(e -> e.print());

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        elementList.forEach(element -> {
            element.accept(visitor);
        });
    }
}
