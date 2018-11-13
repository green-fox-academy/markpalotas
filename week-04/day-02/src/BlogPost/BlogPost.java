package BlogPost;

import java.time.LocalDate;
import java.util.Date;

public class BlogPost {
    String authorName;
    String title;
    String text;
    LocalDate publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = LocalDate.parse(publicationDate);
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
