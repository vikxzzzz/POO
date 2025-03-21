public class Programa {
    public static void main(String[] args) {

        String nome1 = "Maria";
        String nome2 = nome1;
        nome1 = "Jóse";

        int a = 5 * 4/6 + 7;
        float b = 5 * 4/ 6 + 7; // So utilizando valores inteiro irá retornar inteiro
        double c = 5 * 4.0/ 6 + 7;
        float d = 5 * 4.0f / 6 + 7;
        float e = 5 * 4 / (float) 6 + 7; // Não posso colocar float dentro de uma variável INT

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // Para comparar o conteúdo as strings é preciso usar equals()
        if(nome1.equals("Jóse")){
            System.out.println("Olá, Maria");
        }else{
            System.out.println("Seja bem-vindo");
        }

        /*if (nome1 == "Maria"){
            System.out.println("Olá, Maria");

        } else {
            System.out.println("Seja bem-vindo");
        }*/

    }
}
