
    public class main {

        private static final int MAX_ELEMENOS = 500;
        private static final long[] elementosFatorial = new long[MAX_ELEMENOS];

        public static void main(String[] args) {
            System.out.println(fatorial(20));
            System.out.println(calcularFatoriarlPD(8));
        }

        private static long fatorial(int numero){
            if(numero <= 1){
                return numero;
            }
            return fatorial(numero - 1) * numero;
        }

        private static long fatorialPD(int numero){
            if (numero == 0 || numero == 1) {
                return 1;
            }

            if (elementosFatorial[numero] != -1) {
                return elementosFatorial[numero];
            }

            elementosFatorial[numero] = numero * fatorialPD(numero - 1);
            return elementosFatorial[numero];
        }

        private static long calcularFatoriarlPD(int numero){
            for (int i = 0; i < MAX_ELEMENOS; i++) {
                elementosFatorial[i] = -1;
            }
            return fatorialPD(numero);
        }
    }