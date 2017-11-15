package decorator.exercise_01;

public abstract class ContentDecorator extends EmailContent{
    private EmailContent decoratedContent;

    public ContentDecorator(EmailContent decoratedContent) {
        this.decoratedContent = decoratedContent;
    }

    public String getContent() {
        return decoratedContent.getContent();
    }
}
