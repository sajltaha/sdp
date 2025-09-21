package lms.FactoryMethod;

import lms.FactoryMethod.creators.AssignmentCreator;
import lms.FactoryMethod.creators.QuizCreator;
import lms.FactoryMethod.creators.VideoCreator;
import lms.FactoryMethod.interfaces.ICreator;
import lms.FactoryMethod.interfaces.IProduct;

public class Client {
    public static void main(String[] args) {
        ICreator quizCreator = new QuizCreator();
        IProduct quiz = quizCreator.createProduct();
        quiz.display();

        ICreator videoCreator = new VideoCreator();
        IProduct video = videoCreator.createProduct();
        video.display();

        ICreator assignmentCreator = new AssignmentCreator();
        IProduct assignment = assignmentCreator.createProduct();
        assignment.display();
    }
}
