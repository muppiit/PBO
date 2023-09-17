package PBO.pertemuan_3.percobaan.percobaan_1;

public class motorDemo {
    public static void main(String[] args) {
        motorEncapsulation motor = new motorEncapsulation();
        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}
