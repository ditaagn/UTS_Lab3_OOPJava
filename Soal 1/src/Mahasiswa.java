public class Mahasiswa { // Class adalah template atau blueprint dari objek. Mahasiswa adalah class
    private String name;
    private int age;
    private String major;
    private double totalGpa;
    private int totalSemester;
    private double ipk;

    // Constructor adalah sebuah metode yang digunakan untuk menginisialisasi objek
    // yang baru dibuat
    // Contoh constructor
    public Mahasiswa(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public Mahasiswa(String name, int age, String major, double totalGpa, int totalSemester) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.totalGpa = totalGpa;
        this.totalSemester = totalSemester;
    }

    // Method setter getter adalah metode yang digunakan untuk mengakses dan
    // mengubah nilai variabel dalam sebuah class
    // Contoh method setter getter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpaAndSemester(double totalGpa, int totalSemester) {
        if (this.totalGpa >= 0) {
            this.totalGpa = totalGpa;
        } else {
            System.out.println("Input invalid");
        }
        if (this.totalSemester >= 0) {
            this.totalSemester = totalSemester;
        } else {
            System.out.println("Input invalid");
        }
    }

    // Contoh method overloading
    // Overloading adalah keadaan dimana satu class memiliki method dengan nama yang
    // sama namun parameter yang berbeda

    public void calculateIpk(int totalSemester) {
        if (totalSemester >= 0) {
            this.ipk = this.totalGpa / this.totalSemester;
            System.out.println(this.toString());
        } else {
            System.out.println("Input tidak valid");
        }
    }

    public void calculateIpk(double totalGpa) {
        if (totalGpa >= 0) {
            this.ipk = this.totalGpa / this.totalSemester;
            System.out.println(this.toString());
        } else {
            System.out.println("Input tidak valid");
        }
    }

    public String toString() {
        return "Name  : " + this.name + " | Age  : " + this.age + " | Major : " + this.major + " |  IPK : " + this.ipk;
    }

}
