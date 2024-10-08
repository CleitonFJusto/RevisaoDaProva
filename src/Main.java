import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int votosTaffe = 0;
        int votosRodrigo = 0;
        int votosLucas = 0;
        int votosAlessandro = 0;
        int votosInvalidos = 0;


        //Informar quantos usuarios vao votar
        System.out.println("Informe quantos eleitores:");
        //variavel que guarda o valor que o usuario deu
        int quantidadeEleitor = scanner.nextInt();

        for (int i = 0; i < quantidadeEleitor; i++) {
            int voto = 0;
            //faça isso
            do {
                System.out.println("Eleitor numero " + i);
                System.out.println("Os canditados da eleição são os seguintes: ");
                System.out.println("99-Taffe");
                System.out.println("88-Rodrigo");
                System.out.println("77-Lucas");
                System.out.println("66-Alessandro");
                System.out.println("Qual o seu voto? ");
                voto = scanner.nextInt();
                //enquanto isso
            } while (voto != 99 && voto != 88 && voto != 77 && voto != 66);
            //Contabiliza o total de votos
            if (voto == 99) {
                votosTaffe++;
            } else if (voto == 88) {
                votosRodrigo++;
            } else if (voto == 77) {
                votosLucas++;
            } else {
                votosAlessandro++;
            }

        }

        System.out.println("===Exibindo os votos====");
        System.out.println("Taffe teve: " + votosTaffe);
        System.out.println("Rodrigo teve: " + votosRodrigo);
        System.out.println("Lucas teve: " + votosLucas);
        System.out.println("Alessandro teve: " + votosAlessandro);

        if(votosTaffe > votosRodrigo && votosTaffe > votosAlessandro && votosTaffe > votosLucas){
            System.out.println("=O grande ganhador é o Taffe=");
        }else if (votosRodrigo > votosTaffe && votosRodrigo > votosAlessandro && votosRodrigo > votosLucas){
            System.out.println("=O grande ganhador é o Rodrigão=");
        }else if (votosLucas > votosTaffe && votosLucas > votosRodrigo && votosLucas > votosAlessandro){
            System.out.println("=O grande ganhador é o Lucas Galil=");
        }else if (votosAlessandro > votosTaffe && votosAlessandro > votosRodrigo && votosAlessandro > votosLucas){
            System.out.println("=O grande ganhador é  o Alessandro=");
        }





    }
}