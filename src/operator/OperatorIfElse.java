package operator;

public class OperatorIfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }else {
            System.out.println("Uang cukup, selamat menikmati");
        }
    }
}
