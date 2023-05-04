public class Main{
public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Taylor Swift", 19, "Computer Science"); //Objek adalah sesuatu yang dihasilkan oleh class. mhs1 adalah objek
        mhs1.setGpaAndSemester(10.5, 3);
        mhs1.calculateIpk();
        System.out.println("");

        Mahasiswa mhs2 = new Mahasiswa("Lee Jeno", 20, "Electrical Engineering", 24.0, 6); //mhs2 juga merupakan objek
        mhs2.calculateIpk(6);
        }
}