# Employee Salary System

Bu proje, **Java ile yazılmış bir çalışan maaş hesaplama sistemi**dir.  
Çalışanların maaşlarını, fazla mesai bonuslarını, vergilerini ve zamlarını hesaplar ve ekrana yazdırır.  

---

## ⚙️ Özellikler

- **Employee Sınıfı**
  - Çalışan adı, maaşı, haftalık çalışma saati ve işe başlama yılı bilgilerini tutar.
  - Vergi, fazla mesai ve maaş zammını hesaplayan metodlar içerir.
  - Çalışan bilgilerini ve toplam maaşı ekrana yazdırabilir.

- **Vergi Hesaplama (tax)**:
  - Maaş 1000 TL üzerinde ise %3 vergi uygulanır.

- **Fazla Mesai (bonus)**:
  - Haftalık 40 saati aşan çalışma saatleri için saat başına 30 TL bonus eklenir.

- **Maaş Zammı (raiseSalary)**:
  - Çalışma yılına göre:
    - <10 yıl → %5
    - 10–19 yıl → %10
    - ≥20 yıl → %15 zam uygulanır.

---

## 📝 Kullanım

1. Employee nesnesi oluşturulur:

```java
Employee emp1 = new Employee("Ahmet", 2000, 45, 2015);
