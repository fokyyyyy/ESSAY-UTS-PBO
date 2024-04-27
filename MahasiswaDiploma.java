public class MahasiswaDiploma extends Mahasiswa {
    private double nilaiAkhir;

    public MahasiswaDiploma(String nama, String nim, String jurusan, double nilaiAkhir) {
        super(nama, nim, jurusan);
        this.nilaiAkhir = nilaiAkhir;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    @Override
    public double hitungIPK() {
        
        double ipk = nilaiAkhir / 4;
        return ipk;
    }

    @Override
    public String toString() {
        return super.toString() + ", nilaiAkhir=" + nilaiAkhir;
    }
}
