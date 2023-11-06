package com.proj.SPLABDianaGliga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class SubChapter {

    private String name;
    private final List<Element> elementsList = new ArrayList<>();

    public void createNewElement(Element element) {
        elementsList.add(element);
    }

    void print() {
        System.out.println("Subchapter: " + this.name);
        elementsList.forEach(e -> e.print());
    }

}
