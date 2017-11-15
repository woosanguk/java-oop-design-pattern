package decorator.exercise_01;

public class BasicEmailContent extends EmailContent {
    private String content;

    public BasicEmailContent(String content){
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
