package ObjectTutorial;

import java.util.Date;

public class Post {
    private String text;
    private Date timePosted;
    private String userId;

    public Post(String text, Date timePosted, String userId) {
        this.text=text;
        this.timePosted=timePosted;
        this.userId=userId;
    }
}
