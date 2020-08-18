package search;

public class Person {
    private String first;
    private String last;
    private String email;

    Person(String first,String last,String email){
        this.first = first;
        this.last = last;
        this.email = email;
    }

    Person(String first, String last){
        this.first = first;
        this.last = last;
        this.email = "";
    }

    Person(String first){
        this.first = first;
        this.last = "";
        this.email = "";
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.first+ " "+this.last+" "+this.email;
    }
}
