package sta.demo01;

public class student {
    int id;
    private String name;
    private int age;
    private static int num =220704001;

    {
        this.id = num++;
    }

    public student() {
//        this.id = num++;
    }

    public student( String name, int age) {
//        this.id = num++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String print(){
        return id + "=" + name +age;
    }
}
