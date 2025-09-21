package lms.AbstractFactory.products.stem;

import lms.AbstractFactory.interfaces.IVideo;

public class StemVideo implements IVideo {
    @Override
    public void play() {
        System.out.println("STEM Video: Physics lecture");
    }
}
