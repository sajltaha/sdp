package lms.FactoryMethod;

import lms.FactoryMethod.creators.AssignmentICreator;
import lms.FactoryMethod.creators.QuizICreator;
import lms.FactoryMethod.creators.VideoICreator;
import lms.FactoryMethod.interfaces.ICreator;
import lms.FactoryMethod.interfaces.IProduct;

public class Client {
    public static void main(String[] args) {
        ICreator quizICreator = new QuizICreator();
        IProduct quiz = quizICreator.createProduct();
        quiz.display();

        ICreator videoICreator = new VideoICreator();
        IProduct video = videoICreator.createProduct();
        video.display();

        ICreator assignmentICreator = new AssignmentICreator();
        IProduct assignment = assignmentICreator.createProduct();
        assignment.display();
    }
}
