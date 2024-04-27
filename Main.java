public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new MahasiswaS1("Fauzi", "20220040184", "Teknik Informatika", 3.5);
        Mahasiswa mhs2 = new MahasiswaDiploma("Zaky", "20220040180", "Teknik Informatika", 85);

        System.out.println("Data Mahasiswa S1:");
        System.out.println(mhs1);
        System.out.println("IPK: " + mhs1.hitungIPK());

        System.out.println("\nData Mahasiswa Diploma:");
        System.out.println(mhs2);
        System.out.println("IPK: " + mhs2.hitungIPK());
    }
}