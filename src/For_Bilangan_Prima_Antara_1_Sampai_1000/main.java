package For_Bilangan_Prima_Antara_1_Sampai_1000;

class PrimaFor {
    public static void main(String[] args) {

        System.out.println("Bilangan prima antara 1-1000 : ");

        for (int i = 2; i <= 1000; i++) {
            boolean isPrima = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }

            if (isPrima) {
                System.out.print(i + " ");
            }
        }
    }
}