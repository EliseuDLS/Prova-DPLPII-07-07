import java.util.Scanner;
public class Eliseu_da_Luz_2630EscalaCinza{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){
        int i = 1;
        
        int p = 0;
        int t = 0;
        String opcao = "";

        int r = 0;
        int g = 0;
        int b = 0;

        t = lerT(t);

        for (i = 1; i <= t; i++){

            opcao = lerOpcao(opcao);
            r = lerR(r);
            g = lerG(g);
            b = lerB(b);

            if (opcao.equals("eye")){
                p = calcularEye(r, g, b);
            } else if (opcao.equals("mean")){
                p = calcularMean(r, g, b);
            } else if (opcao.equals("max")){
                p = calcularMax(r, g, b);
            } else if (opcao.equals("min")){
                p = calcularMin(r, g, b);
            }

            imprimirCasos(i, p);
        }
    }

    public static int lerT(int t){
        do {
            t = LER.nextInt();
        } while (t < 1 || t > 100);

        return t;
    }

    public static String lerOpcao(String opcao){
        opcao = LER.next();

        return opcao;
    }

    public static int lerR(int r){
        do {
            r = LER.nextInt();
        } while (r < 0 || r > 255);

        return r;
    }

    public static int lerG(int g){
        do {
            g = LER.nextInt();
        } while (g < 0 || g > 255);

        return g;
    }

    public static int lerB(int b){
        do {
            b = LER.nextInt();
        } while (b < 0 || b > 255);

        return b;
    }

    public static int calcularEye(int r, int g, int b){
        int p = 0;

        //nao lembrei como fazia para imprimir o double sem as casas decimais, entao botei o int ali
        p = (int) (0.30 * r + 0.59 * g + 0.11 * b);

        return p;
    }

    public static int calcularMean(int r, int g, int b){
        int p = 0;

        p = (r + g + b) / 3;

        return p;
    }

    public static int calcularMax(int r, int g, int b){
        int p = 0;

        //encontrei o método max da classe Math que descobre o maior valor entre as variáveis r, g e b
        p = Math.max(r, Math.max(g, b));

        return p;
    }

    public static int calcularMin(int r, int g, int b){
        int p = 0;

        //encontrei o método min da classe Math que descobre o menor valor entre as variáveis r, g e b
        p = Math.min(r, Math.min(g, b));

        return p;
    }

    public static void imprimirCasos(int i, int p){
        System.out.println("Caso #" + i + ": " + p);
    }
}