import model.Mahasiswa;

public class App {
    static Mahasiswa mahasiswa[]= new Mahasiswa[20];
    public static void main(String[] args) throws Exception {
       init();
        cetakDataMahasiswa();
    }
    public static void cetakDataMahasiswa(){
        for(int i =0;i<20;i++){
            if(mahasiswa[i]!=null)
                System.out.println(mahasiswa[i]);
        }
    }
    public static void init(){
        Mahasiswa owen = new Mahasiswa("Owen","030081211",
                    "Jl.jl Medan","Sistem Informasi");
        Mahasiswa jerry = new Mahasiswa("Jerry","030081211",
                    "Jl.jl Medan","Sistem Informasi");
        Mahasiswa vanessa = new Mahasiswa("Vannessa","030081211",
                    "Jl.jl Medan","Sistem Informasi");
        Mahasiswa salim = new Mahasiswa("Salim","030081211",
                    "Jl.jl Medan","Sistem Informasi");

        Mahasiswa Tyne = new Mahasiswa("Tyne Theodora","030081211",
                    "Jl.jl Medan","Sistem Informasi");
        mahasiswa[0]=jerry;
        mahasiswa[1]= Tyne;
        mahasiswa[2]=vanessa;
        mahasiswa[3]=salim;
        mahasiswa[4]= owen;
    }
    public static void cetakMahasiswa(Mahasiswa x){
        System.out.println(x.getNama() + " "+ x.getAlamat());
    }
    public void hitungIPK(){}
    public void retake(){}
}
