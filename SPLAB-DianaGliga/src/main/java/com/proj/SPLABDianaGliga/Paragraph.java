package com.proj.SPLABDianaGliga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Paragraph {
    private String text;

    void print() {
        System.out.println("Paragraph: " + text);
    }
}
