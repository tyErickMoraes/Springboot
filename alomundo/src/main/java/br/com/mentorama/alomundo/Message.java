package br.com.mentorama.alomundo;

public class Message {

    private Integer Id;
    private  String message;

    public Message(Integer id, String message) {
        Id = id;
        this.message = message;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
