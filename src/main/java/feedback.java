public class feedback {

    private int id;
    private String title;
    private int positive;
    private String body;
    private String name;

    public feedback(){}
    public feedback(String title, int positive, String body, String name) {
        this.title = title;
        this.positive = positive;
        this.body = body;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
       this.id = id;
    }

    public int getPositive() {
       return positive;
    }

    public void setPositive(int positive) {
       this.positive = positive;
    }

    public String getTitle() {
       return title;
    }

    public void setTitle(String title) {
       this.title = title;
    }

    public String getBody() {
       return body;
    }

    public void setBody(String body) {
       this.body = body;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
       this.name = name;
    }
}