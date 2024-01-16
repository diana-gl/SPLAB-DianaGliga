package com.proj.SPLABDianaGliga;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ImageProxy implements Element {
    private String url;
    private Dimension dim;
    private Image realImage = null;

    public ImageProxy(String imageName) {
        this.url = imageName;
    }

    Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void print() {
        loadImage().print();
    }
}
