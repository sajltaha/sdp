package lms.AbstractFactory.products.stem;

import lms.AbstractFactory.interfaces.IQuiz;

public class StemQuiz implements IQuiz {
    @Override
    public void showQuestion() {
        System.out.println("STEM Quiz: Solve math problem");
    }
}
