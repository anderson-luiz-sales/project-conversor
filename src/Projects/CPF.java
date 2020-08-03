package Projects;

public class CPF {

    public static void main(String[] args) {

        String original = "682.476.660-73";
        String novo = original.replaceAll("[^0-9]", "");
        System.out.println("Novo: " + novo);
    }
}
