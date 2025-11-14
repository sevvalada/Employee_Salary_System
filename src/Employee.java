public class Employee {
    String name;
    double salary;
    double workHours;
    double hireYear;

    Employee(String name, double salary, double workHours, double hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesapla
    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03; // %3 vergi
        } else {
            return 0;
        }
    }

    // Fazla mesai bonusu
    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30; // fazla saat başına 30 TL
        } else {
            return 0;
        }
    }

    // Maaş zammı
    double raiseSalary() {
        int yearsWorked = 2021 - (int)this.hireYear;
        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    // Çalışan bilgilerini yazdır
    void printEmployee() {
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raise = raiseSalary();
        double totalSalary = this.salary - taxAmount + bonusAmount + raise;

        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + taxAmount);
        System.out.println("Bonus: " + bonusAmount);
        System.out.println("RaiseSalary: " + raise);
        System.out.println("Total Salary: " + totalSalary);
    }
}
