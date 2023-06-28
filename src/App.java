import java.util.ArrayList;
import java.util.Scanner;

import model.Dosen;
import model.Mahasiswa;

public class App {
    static ArrayList<Mahasiswa> mahasiswa= new ArrayList<Mahasiswa>();
    static ArrayList<Dosen> dosen= new ArrayList<Dosen>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       init();

        System.out.println("setelah init");
        cetakDataMahasiswa();
        //inputDataMahasiswa();
        inputDataDosen();
        System.out.println("setelah input data");
        //cetakDataMahasiswa();
        cetakDataDosen();
    }
    public static void inputDataDosen(){
        String nama, nik, studentid;
        System.out.print("Nama \t:");
        nama = input.nextLine();
        System.out.print("NIK \t:");
        nik=   input.nextLine();
        Dosen tmpDosen = new Dosen(nama, nik);
        int pilihan= 0;
        do{
            System.out.println("Tambahkan Data Mahasiswa \t:");
            System.out.print("StudentID \t:");
            studentid=   input.nextLine();
            tmpDosen.tambahMahasiswa(cariMahasiswa(studentid));
            System.out.print("Apakah ingin menambah mahasiswa lagi (Y=1, N=0): \t:");
            pilihan=   input.nextInt();
        }while(pilihan==1);

        dosen.add(tmpDosen);
    }
    public static void cetakDataDosen(){
        for (Dosen dosen2 : dosen) {
            System.out.println(dosen2);
        }
    }
    public static Mahasiswa cariMahasiswa(String studentID){
        for (Mahasiswa mahasiswa2 : mahasiswa) {
            if(mahasiswa2.getStudentId().equals(studentID)){
                return mahasiswa2;
            }            
        }
        return null;

    }
    public static void inputDataMahasiswa(){
        String nama, programStudi,alamat,studentID;
        System.out.print("Nama \t:");
        nama = input.nextLine();
        System.out.print("Student ID \t:");
        studentID=   input.nextLine();
        System.out.print("Program Studi \t:");
        programStudi = input.nextLine();
        System.out.print("Alamat \t:");
        alamat  = input.nextLine();
        mahasiswa.add(new Mahasiswa(nama,studentID, alamat,programStudi));
        mahasiswa.remove(4);
    }

    public static void cetakDataMahasiswa(){
        // for(int i =0;i<mahasiswa.size();i++){
        //     if(mahasiswa.get(i)!=null)
        //         System.out.println(mahasiswa.get(i));
        // }
        for (Mahasiswa mahasiswa2 : mahasiswa) {
            if(mahasiswa2!=null)
                System.out.println(mahasiswa2);            
        }
    }
    public static void init(){
        Mahasiswa[] mhs = new Mahasiswa[20];
        mahasiswa.add(new Mahasiswa("Owen","030081211",
                    "Jl.jl Medan","Sistem Informasi"));
         mahasiswa.add(new Mahasiswa("Jerry","030081212",
                    "Jl.jl Medan","Sistem Informasi"));
         mahasiswa.add(new Mahasiswa("Vannessa","030081213",
                    "Jl.jl Medan","Sistem Informasi"));
         mahasiswa.add(new Mahasiswa("Salim","030081211",
                    "Jl.jl Medan","Sistem Informasi"));
         mahasiswa.add(new Mahasiswa("Tyne Theodora","030081211",
                    "Jl.jl Medan","Sistem Informasi"));
       // mahasiswa.add(mhs[0]);
    }
    public static void cetakMahasiswa(Mahasiswa x){
        System.out.println(x.getNama() + " "+ x.getAlamat());
    }
    public void hitungIPK(){}
    public void retake(){}
}
