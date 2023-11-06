package com.proj.SPLABDianaGliga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Table implements Element {

    private String title;

    @Override
    public void print() {
        System.out.println("Table with Title: " + title);
    }

}
