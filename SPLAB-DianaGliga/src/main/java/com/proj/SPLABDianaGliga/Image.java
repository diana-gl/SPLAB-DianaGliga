package com.proj.SPLABDianaGliga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Image implements Element {

    private String imageName;

    @Override
    public void print() {
        System.out.println("Image with name: " + imageName);
    }

}
