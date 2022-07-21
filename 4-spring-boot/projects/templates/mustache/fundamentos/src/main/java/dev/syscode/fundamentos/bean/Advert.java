package dev.syscode.fundamentos.bean;

public class Advert {

    private long id;
    private String name;
    private String subject;
    private String comment;

    public Advert() {
    }

    public Advert(long id, String name, String subject, String comment) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
