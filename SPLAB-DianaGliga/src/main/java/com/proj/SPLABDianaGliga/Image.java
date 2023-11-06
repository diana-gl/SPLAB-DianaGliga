package com.proj.SPLABDianaGliga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Image {
    private String imageName;

    void print() {
        System.out.println("Image with name: " + imageName);
    }
}
