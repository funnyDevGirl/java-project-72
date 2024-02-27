package hexlet.code.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class UrlCheck {
    @Setter
    private int id;

    private int urlId;
    private int statusCode;
    private String title;
    private String h1;
    private String description;
    @Setter
    private Timestamp createdAt;

    public UrlCheck(int urlId, int statusCode, String title, String h1, String description) {
        this.id = urlId;
        this.statusCode = statusCode;
        this.title = title;
        this.h1 = h1;
        this.description = description;
    }

    public UrlCheck(int urlId, int statusCode, String title, String h1, String description, Timestamp createdAt) {
        this.urlId = urlId;
        this.statusCode = statusCode;
        this.title = title;
        this.h1 = h1;
        this.description = description;
        this.createdAt = createdAt;
    }
}
