package string;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "Barabai";

        System.out.println(kota);

        char[] uniskaChar = { 'U','N','S','I','K','A' };
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(0,4));
    }
}
