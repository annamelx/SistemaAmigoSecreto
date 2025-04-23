package AmigoSecreto;

public class MensagemParaAlguem extends Mensagem {
    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente, boolean anonima, String emailDestinatario) {
        super(texto, emailRemetente, anonima);
        this.emailDestinatario = emailDestinatario;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    @Override
    public String getTextoCompletoAExibir() {
        if (anonima) {
            return "Mensagem para " + emailDestinatario + ". Texto: " + texto;
        } else {
            return "Mensagem de: " + emailRemetente + " para " + emailDestinatario + ". Texto: " + texto;
        }
    }
}