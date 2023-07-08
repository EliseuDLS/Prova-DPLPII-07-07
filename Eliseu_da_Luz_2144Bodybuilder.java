//nao ta funcionando 100% mas foi o que eu consegui :)
import java.util.Scanner;
public class Eliseu_da_Luz_2144Bodybuilder{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){

        int w1 = 0;
        int w2 = 0;
        int r = 0;

        int media = 0;
        String bordao = "";

        while (true){
            w1 = lerW1(w1);
            w2 = lerW2(w2);
            r = lerR(r);

            if (w1 == 0 && w2 == 0 && r == 0){
                break;
            }

            media = calcularMedia(w1, w2, r);
            bordao = determinarBordao(media);
            imprimirBordao(bordao);
        }
    }

    public static int lerW1(int w1){
        do {
            w1 = LER.nextInt();
        } while (w1 < 1 || w1 > 60);

        return w1;
    }

    public static int lerW2(int w2){
        do {
            w2 = LER.nextInt();
        } while (w2 < 1 || w2 > 100);

        return w2;
    }

    public static int lerR(int r){
        do {
            r = LER.nextInt();
        } while (r < 0 || r > 12);

        return r;
    }

    public static int calcularMedia(int w1, int w2, int r){
        int media = ((w1 + w2) / 2) * (1 + r / 30);

        return media;
    }

    public static String determinarBordao(int media){
        String bordao = "";

        if (media >= 1 && media < 13) {
            bordao = "Nao vai da nao";
        } else if (media >= 13 && media < 14) {
            bordao = "E 13";
        } else if (media >= 14 && media < 40) {
            bordao = "Bora, hora do show! BIIR!";
        } else if (media >= 40 && media <= 60) {
            bordao = "Ta saindo da jaula o monstro!";
        } else if (media > 60) {
            bordao = "AQUI E BODYBUILDER!!";
        }

        return bordao;
    }

    public static void imprimirBordao(String bordao){
        System.out.println(bordao);
    }
}