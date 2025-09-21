package lms.AbstractFactory.products.arts;

import lms.AbstractFactory.interfaces.IVideo;

public class ArtsVideo implements IVideo {
    @Override
    public void play() {
        System.out.println("Arts Video: Music history");
    }
}
