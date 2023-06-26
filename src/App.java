import java.util.ArrayList;

import model.Mahasiswa;

public class App {
    static ArrayList<Mahasiswa> mahasiswa= new ArrayList<Mahasiswa>();
    public static void main(String[] args) throws Exception {
       init();
        cetakDataMahasiswa();
    }
    public static void cetakDataMahasiswa(){
        for(int i =0;i<mahasiswa.size();i++){
            if(mahasiswa.get(i)!=null)
                System.out.println(mahasiswa.get(i));
        }
        for (Mahasiswa mahasiswa2 : mahasiswa) {
            if(mahasiswa2!=null)
                System.out.println(mahasiswa2);            
        }
    }
    public static void init(){
        Mahasiswa[] mhs = new Mahasiswa[20];
        mahasiswa.add(new Mahasiswa("Owen","030081211",
                    "Jl.jl Medan","Sistem Informasi"));
         mahasiswa.add(new Mahasiswa("Jerry","030081211",
                    "Jl.jl Medan","Sistem Informasi"));
         mahasiswa.add(new Mahasiswa("Vannessa","030081211",
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
