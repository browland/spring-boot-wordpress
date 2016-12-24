package net.benrowland.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "wp_posts")
public class Article {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(nullable = false, name = "post_status")
    private String status;

    @Column(nullable = false, name = "post_title")
    private String title;

    @Column(nullable = false, name = "post_content")
    private String content;

    @Column(nullable = false, name = "post_date_gmt")
    private LocalDateTime postDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
