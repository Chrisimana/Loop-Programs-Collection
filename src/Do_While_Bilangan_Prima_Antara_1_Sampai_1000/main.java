package Do_While_Bilangan_Prima_Antara_1_Sampai_1000;

class PrimaWhile {
    public static void main(String[] args) {

        System.out.println("Bilangan prima antara 1-1000 : ");
        int i = 2;

        while (i <= 1000) {
            boolean isPrima = true;
            int j = 2;

            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
                j++;
            }

            if (isPrima) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}