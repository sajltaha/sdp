package lms.AbstractFactory.factories;

import lms.AbstractFactory.interfaces.IAssignment;
import lms.AbstractFactory.interfaces.IFactory;
import lms.AbstractFactory.interfaces.IQuiz;
import lms.AbstractFactory.interfaces.IVideo;
import lms.AbstractFactory.products.stem.StemAssignment;
import lms.AbstractFactory.products.stem.StemQuiz;
import lms.AbstractFactory.products.stem.StemVideo;

public class StemFactory implements IFactory {
    @Override
    public IQuiz createQuiz() {
        return new StemQuiz();
    }

    @Override
    public IVideo createVideo() {
        return new StemVideo();
    }

    @Override
    public IAssignment createAssignment() {
        return new StemAssignment();
    }
}
