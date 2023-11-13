package dev.rhc.post.post;

import java.util.Objects;

public final class Post {
    private final Integer id;
    private final Integer userId;
    private final String title;
    private final String body;

    private final String version;

    public Post(Integer id, Integer userId, String title, String body, String version) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
        this.version = version;
    }

    public Integer id() {
        return id;
    }

    public Integer userId() {
        return userId;
    }

    public String title() {
        return title;
    }

    public String body() {
        return body;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Post) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.userId, that.userId) &&
                Objects.equals(this.title, that.title) &&
                Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, title, body);
    }

    @Override
    public String toString() {
        return "Post[" +
                "id=" + id + ", " +
                "userId=" + userId + ", " +
                "title=" + title + ", " +
                "body=" + body + ']';
    }


}