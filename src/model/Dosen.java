package model;

import java.util.ArrayList;

public class Dosen {
    private String nama;
    private String nik;
    private ArrayList<Mahasiswa> mahasiswas = 
        new ArrayList<Mahasiswa>();

    public Dosen() {
    }

    public Dosen(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    public Dosen(String nama, String nik, ArrayList<Mahasiswa> mahasiswas) {
        this.nama = nama;
        this.nik = nik;
        this.mahasiswas = mahasiswas;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa){
        mahasiswas.add(mahasiswa);
    }
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return this.nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public ArrayList<Mahasiswa> getMahasiswas() {
        return this.mahasiswas;
    }

    public void setMahasiswas(ArrayList<Mahasiswa> mahasiswas) {
        this.mahasiswas = mahasiswas;
    }

    @Override
    public String toString() {
        return "{" +
            " nama='" + getNama() + "'" +
            ", nik='" + getNik() + "'" +
            ", mahasiswas='" + getMahasiswas() + "'" +
            "}";
    }
    
}
