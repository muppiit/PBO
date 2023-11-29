package PBO.pertemuan_10.praktikum.percobaan_2;

import PBO.pertemuan_10.praktikum.percobaan_1.employee;
import PBO.pertemuan_10.praktikum.percobaan_1.permanentEmployee;

public class tester2 {
    public static void main(String[] args) {
        permanentEmployee pEmp = new permanentEmployee("Dedik", 500);
        employee e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("----------------------");
        System.out.println("" + pEmp.getEmployeeInfo());
    }
}
