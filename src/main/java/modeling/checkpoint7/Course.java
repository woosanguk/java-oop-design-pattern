package modeling.checkpoint7;

import java.util.ArrayList;
import java.util.List;

class Course {
    List<Transcript> transcripts = new ArrayList<Transcript>();

    public void addTranscript(Transcript transcript) {
        this.transcripts.add(transcript);
    }
}
