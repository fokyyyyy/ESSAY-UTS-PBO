public class MahasiswaS1 extends Mahasiswa {
    private double ipk;

    public MahasiswaS1(String nama, String nim, String jurusan, double ipk) {
        super(nama, nim, jurusan);
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    @Override
    public double hitungIPK() {
        return ipk;
    }

    @Override
    public String toString() {
        return super.toString() + ", ipk=" + ipk;
    }
}
