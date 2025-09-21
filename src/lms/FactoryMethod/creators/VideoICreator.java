package lms.FactoryMethod.creators;

import lms.FactoryMethod.interfaces.ICreator;
import lms.FactoryMethod.interfaces.IProduct;
import lms.FactoryMethod.products.Video;

public class VideoICreator implements ICreator {
    @Override
    public IProduct createProduct() {
        return new Video();
    }
}
