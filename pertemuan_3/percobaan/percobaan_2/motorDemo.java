package PBO.pertemuan_3.percobaan.percobaan_2;

public class motorDemo {
    public static void main(String[] args) {
        motor motor = new motor();
        // motor.printStatus();
        // motor.kecepatan = 50;
        // motor.printStatus();

        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}
