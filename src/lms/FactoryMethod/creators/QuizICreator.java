package lms.FactoryMethod.creators;

import lms.FactoryMethod.interfaces.ICreator;
import lms.FactoryMethod.interfaces.IProduct;
import lms.FactoryMethod.products.Quiz;

public class QuizICreator implements ICreator {
    @Override
    public IProduct createProduct() {
        return new Quiz();
    }
}
