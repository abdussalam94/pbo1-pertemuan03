package percabangan;

public class PercabanaganSwitchChar {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terimakasih pak\"");
                System.out.println("Dosen : \"Selamat ya\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, pak?\"");
                System.out.println("Dosen : \"!@@##$\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Tapi bisalah manjawab ujian?\"");
                System.out.println("Mhs   : \"Hihihihihi\"");
                break;
            default:
                System.out.println("Mhs   : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kah\"");
                System.out.println("Dosen : \"Memeriksa berkas");
                System.out.println("Dosen : \"Melenceng\"");
                System.out.println("Mhs   : \"Kaburrr......\"");
                break;
        }
    }
}
