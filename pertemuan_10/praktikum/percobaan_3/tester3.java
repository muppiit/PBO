package PBO.pertemuan_10.praktikum.percobaan_3;

import PBO.pertemuan_10.praktikum.percobaan_1.electricityBill;
import PBO.pertemuan_10.praktikum.percobaan_1.employee;
import PBO.pertemuan_10.praktikum.percobaan_1.internshipEmployee;
import PBO.pertemuan_10.praktikum.percobaan_1.payable;
import PBO.pertemuan_10.praktikum.percobaan_1.permanentEmployee;

public class tester3 {
    permanentEmployee pEmp = new permanentEmployee("Dedik", 500);
    internshipEmployee iEmp = new internshipEmployee("Sunarto", 5);
    electricityBill eBill = new electricityBill(5, "A-1");
    employee e[] = { pEmp, iEmp };
    payable p[] = { pEmp, eBill };
}
