package lms.FactoryMethod.creators;

import lms.FactoryMethod.interfaces.ICreator;
import lms.FactoryMethod.interfaces.IProduct;
import lms.FactoryMethod.products.Assignment;

public class AssignmentICreator implements ICreator {
    @Override
    public IProduct createProduct() {
        return new Assignment();
    }
}
