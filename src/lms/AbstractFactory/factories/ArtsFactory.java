package lms.AbstractFactory.factories;

import lms.AbstractFactory.interfaces.IAssignment;
import lms.AbstractFactory.interfaces.IFactory;
import lms.AbstractFactory.interfaces.IQuiz;
import lms.AbstractFactory.interfaces.IVideo;
import lms.AbstractFactory.products.arts.ArtsAssignment;
import lms.AbstractFactory.products.arts.ArtsQuiz;
import lms.AbstractFactory.products.arts.ArtsVideo;

public class ArtsFactory implements IFactory {
    @Override
    public IQuiz createQuiz() {
        return new ArtsQuiz();
    }

    @Override
    public IVideo createVideo() {
        return new ArtsVideo();
    }

    @Override
    public IAssignment createAssignment() {
        return new ArtsAssignment();
    }
}
