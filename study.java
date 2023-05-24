public class Main {
    public static void main(String[] args) {

        int nota = 10;
        String graduacao = null;

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80) {
            graduacao = "B";
        } else if (nota <= 60) {
            graduacao = "C";
        } else if (nota < 50) {
            graduacao = "D";
        } else {graduacao = null;
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
                System.out.println("Por pouco!");
                break;
            case "D":
                System.out.println("Graduação Invalida");

        }
    }

}