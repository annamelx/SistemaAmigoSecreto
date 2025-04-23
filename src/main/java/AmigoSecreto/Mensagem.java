package AmigoSecreto;
public abstract class Mensagem {
    protected String texto;
    protected String emailRemetente;
    protected boolean anonima;

    public Mensagem(String texto, String emailRemetente, boolean anonima) {
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;
    }

    public boolean ehAnonima() {
        return anonima;
    }

    public String getTexto() {
        return texto;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public abstract String getTextoCompletoAExibir();
}
