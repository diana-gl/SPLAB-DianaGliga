package com.proj.SPLABDianaGliga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Author {
    private String name;

    void print(String name) {
        System.out.println("Author name: " + name);
    }
}
