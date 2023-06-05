import model.Mahasiswa;

public class App {
    public static void main(String[] args) throws Exception {
       init();
        String namaMahasiswa = "Farrel";
        String namaKuliah ="Matematika Diskrit";
        int semester =1;
        String nilaiMatakuliah = "D";

        Mahasiswa farrel=new Mahasiswa();
        System.out.println(farrel);
        farrel = new Mahasiswa("Farrel", "Jl. Medan");
        System.out.println(farrel);
        Mahasiswa jerry = new Mahasiswa("Jerry","030081211",
                    "Jl.jl Medan","Sistem Informasi");
        System.out.println(jerry);
    }
    public static void init(){
        Mahasiswa jerry = new Mahasiswa("Jerry","030081211",
                    "Jl.jl Medan","Sistem Informasi");
        Mahasiswa vanessa = new Mahasiswa("Vannessa","030081211",
                    "Jl.jl Medan","Sistem Informasi");
        Mahasiswa salim = new Mahasiswa("Salim","030081211",
                    "Jl.jl Medan","Sistem Informasi");
    }
    public static void cetakMahasiswa(Mahasiswa x){
        System.out.println(x.getNama() + " "+ x.getAlamat());
    }
    public void hitungIPK(){}
    public void retake(){}
}
