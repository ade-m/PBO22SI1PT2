package model;
/*
 * name : adem
 * email : sda@gmailo.com
 */
public class Mahasiswa {
    /*
     * deskripsi nama, studentid, alamat, program studi
     */
    String nama;
    String studentId;
    String alamat;
    String programStudi;
    public Mahasiswa(){
    }

    public Mahasiswa(String nama, String studentId, String alamat, String programStudi) {
        this.nama = nama;
        this.studentId = studentId;
        this.alamat = alamat;
        this.programStudi = programStudi;
    }
    
    public Mahasiswa(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getProgramStudi() {
        return this.programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    @Override
    public String toString() {
        return "|" +
            " " + getNama() + "\t|" +
            " " + getStudentId() + "\t|" +
            " " + getAlamat() + "\t|" +
            " " + getProgramStudi() + "\t|" +
            "";
    }

}
