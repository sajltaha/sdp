package lms.AbstractFactory.interfaces;

public interface IFactory {
    IQuiz createQuiz();
    IVideo createVideo();
    IAssignment createAssignment();
}
