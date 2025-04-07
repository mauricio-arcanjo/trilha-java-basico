import java.util.Scanner;
import Exception.ParametrosInvalidosException;

public class Contador {

        public static void main(String[] args) {

            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            terminal.nextLine();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            terminal.nextLine();

            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            }catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println("ParâmetroDois deve ser maior que ParâmetroUm!");
            } finally {
                terminal.close();
            }

        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if (parametroDois < parametroUm){
                throw new ParametrosInvalidosException();
            }

            int contagem = 1;
            //realizar o for para imprimir os números com base na variável contagem

                for (int i = parametroUm; i < parametroDois; i++) {
                    System.out.println("Imprimindo o número " + contagem + ": " + i);
                    contagem++;
                }
            }
        }

