package PBO.pertemuan_3.tugas;

public class encapDemo {
    private String name;
    private int age;

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
        // if (age > 30) {
        // this.age = 30;
        // } else {
        // this.age = age;
        // }
        if (age <= 18 || age >= 30) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

}
