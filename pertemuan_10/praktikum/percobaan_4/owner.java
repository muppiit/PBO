package PBO.pertemuan_10.praktikum.percobaan_4;

import PBO.pertemuan_10.praktikum.percobaan_1.electricityBill;
import PBO.pertemuan_10.praktikum.percobaan_1.employee;
import PBO.pertemuan_10.praktikum.percobaan_1.payable;
import PBO.pertemuan_10.praktikum.percobaan_1.permanentEmployee;

public class owner {
    public void pay(payable p) {
        System.out.println("Total payment = " + p.getPaymentAmount());
        if (p instanceof electricityBill) {
            electricityBill eb = (electricityBill) p;
            System.out.println("" + eb.getBillInfo());
        } else if (p instanceof permanentEmployee) {
            permanentEmployee pe = (permanentEmployee) p;
            pe.getEmployeeInfo();
            System.out.println("" + pe.getEmployeeInfo());
        }
    }

    public void showMyEmployee(employee e) {
        System.out.println("" + e.getEmployeeInfo());
        if (e instanceof permanentEmployee) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay her/him");
        }
    }
}
