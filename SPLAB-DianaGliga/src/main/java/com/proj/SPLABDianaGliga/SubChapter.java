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
    private final List<Image> imageList = new ArrayList<>();
    private final List<Paragraph> paragraphList = new ArrayList<>();
    private final List<Table> tableList = new ArrayList<>();

    void print(String name) {
        System.out.println("Name of the subchapter: " + name);
    }

    public void createNewParagraph(String s) {
        paragraphList.add(new Paragraph(s));
    }

    public void createNewImage(String s) {
        imageList.add(new Image(s));
    }

    public void createNewTable(String s) {
        tableList.add(new Table(s));
    }

    void print() {
        System.out.println("Subchapter: " + this.name);
        paragraphList.forEach(p -> p.print());
        imageList.forEach(i -> i.print());
        tableList.forEach(t -> t.print());
    }
}
