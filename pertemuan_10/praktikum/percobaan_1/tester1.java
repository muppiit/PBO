package PBO.pertemuan_10.praktikum.percobaan_1;

public class tester1 {
    public static void main(String[] args) {
        permanentEmployee pEmp = new permanentEmployee("Dedik", 500);
        internshipEmployee iEmp = new internshipEmployee("Sunarto", 5);
        electricityBill eBill = new electricityBill(5, "A-1");
        employee e;
        payable p;

        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
