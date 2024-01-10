
    public class dowhile1 {
    public static void main(String[] args) {
        int tempoTotal = 1; // tempo em minutos
        int minutoContado = 0;
        int segundoContado = 0;
        while (minutoContado < tempoTotal) {
            try {
                System.out.println("Assistindo filme. Se passaram " + minutoContado + " minuto(s) e " + segundoContado + " segundo(s)");
                Thread.sleep(1000); // contador de tempo a cada 1 segundo (1000 milissegundos)
                segundoContado++;
                if (segundoContado == 60) {
                    minutoContado++;
                    segundoContado = 0;
                }
            } catch (Exception e) {
                System.out.println("Ops! Ocorreu o erro " + e);
            }
        }
        System.out.println("Filme encerrado");
    }
}

