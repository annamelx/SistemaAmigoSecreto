package AmigoSecreto;

import static org.junit.jupiter.api.Assertions.*;

public class TestaSistemaAmigo {
    public static void main(String[] args) {
        SistemaAmigo sistema = new SistemaAmigo();

        // a) Cadastrar amigos
        sistema.cadastraAmigo("José", "jose@email.com");
        sistema.cadastraAmigo("Maria", "maria@email.com");

        // b) Configurar amigos secretos
        try {
            sistema.configuraAmigoSecretoDe("jose@email.com", "maria@email.com");
            sistema.configuraAmigoSecretoDe("maria@email.com", "jose@email.com");
        } catch (AmigoInexistenteException e) {
            System.out.println("Erro ao configurar amigo secreto: " + e.getMessage());
        }

        // c) Enviar mensagem anônima de Maria para José
        sistema.enviarMensagemParaAlguem("Oi José, feliz amigo secreto!", "maria@email.com", true, "jose@email.com");

        // d) Enviar mensagem anônima de Maria para todos
        sistema.enviarMensagemParaTodos("Oi gente! Que comece a brincadeira!", "maria@email.com", true);

        // e) Pesquisar mensagens anônimas
        System.out.println("Mensagens anônimas:");
        for (Mensagem m : sistema.pesquisaMensagensAnonimas()) {
            System.out.println(m.getTextoCompletoAExibir());
        }

        // f) Pesquisar amigo secreto de José
        try {
            String amigoSecreto = sistema.pesquisaAmigoSecretoDe("jose@email.com");
            if (amigoSecreto.equals("maria@email.com")) {
                System.out.println("Ok");
            } else {
                System.out.println("Erro: Amigo secreto incorreto.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar amigo secreto: " + e.getMessage());
        }
    }
}