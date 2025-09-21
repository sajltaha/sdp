package lms.AbstractFactory;

import lms.AbstractFactory.factories.ArtsFactory;
import lms.AbstractFactory.factories.StemFactory;
import lms.AbstractFactory.interfaces.IAssignment;
import lms.AbstractFactory.interfaces.IFactory;
import lms.AbstractFactory.interfaces.IQuiz;
import lms.AbstractFactory.interfaces.IVideo;

public class Client {
    private final IQuiz quiz;
    private final IVideo video;
    private final IAssignment assignment;

    public Client(IFactory factory) {
        this.quiz = factory.createQuiz();
        this.video = factory.createVideo();
        this.assignment = factory.createAssignment();
    }

    public void runCourse() {
        quiz.showQuestion();
        video.play();
        assignment.submit();
    }

    public static void main(String[] args) {
        IFactory stemFactory = new StemFactory();
        Client stemClient = new Client(stemFactory);
        stemClient.runCourse();

        IFactory artsFactory = new ArtsFactory();
        Client artsClient = new Client(artsFactory);
        artsClient.runCourse();
    }
}
