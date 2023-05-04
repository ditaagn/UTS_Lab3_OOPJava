public class Mahasiswa { //Class adalah template atau blueprint dari objek. Mahasiswa adalah class
    private String name;
    private int age;
    private String major;
    private double totalGpa;
    private int totalSemester;
    //Constructor adalah sebuah metode yang digunakan untuk menginisialisasi objek yang baru dibuat
    //Contoh constructor
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
    //Method setter getter adalah metode yang digunakan untuk mengakses dan mengubah nilai variabel dalam sebuah class
    //Contoh method setter getter
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
        this.totalGpa = totalGpa;
        this.totalSemester = totalSemester;
    }
    //Contoh method overloading
    //Overloading adalah keadaan dimana satu class memiliki method dengan nama yang sama namun parameter yang berbeda
    public void calculateIpk() {
        double ipk = totalGpa / totalSemester;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
        System.out.println("IPK: " + ipk);
    }

    public void calculateIpk(int totalSemester) {
        double ipk = totalGpa / totalSemester;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
        System.out.println("IPK: " + ipk);
        System.out.println("Total Semester : " + totalSemester);
    }
}
