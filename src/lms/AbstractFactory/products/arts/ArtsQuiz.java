package lms.AbstractFactory.products.arts;

import lms.AbstractFactory.interfaces.IQuiz;

public class ArtsQuiz implements IQuiz {
    @Override
    public void showQuestion() {
        System.out.println("Arts Quiz: Identify painting style");
    }
}
