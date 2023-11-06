package com.proj.SPLABDianaGliga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Chapter {
    private String name;
    private final List<SubChapter> subChapterList = new ArrayList<>();

    public int createSubChapter(String subChapterTitle) {
        SubChapter subChapter = new SubChapter(subChapterTitle);
        subChapterList.add(subChapter);
        return subChapterList.indexOf(subChapter);
    }

    void print(String name) {
        System.out.println("Name of the chapter: " + name);
    }

    public SubChapter getSubChapter(int indexSubChapter) {
        return subChapterList.get(indexSubChapter);
    }
}
