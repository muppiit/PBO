package PBO.pertemuan_6.praktikum.percobaan_2;

public class classA {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void getNilai() {
        System.out.println("nilai x : " + x);
        System.out.println("nilai y : " + y);
    }
}
