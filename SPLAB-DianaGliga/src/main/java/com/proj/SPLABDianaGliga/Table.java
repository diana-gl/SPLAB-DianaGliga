package com.proj.SPLABDianaGliga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Table {
    private String title;
    void print() {
        System.out.println("Table with Title: " + title);
    }
}
