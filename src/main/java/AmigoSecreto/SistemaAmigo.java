package AmigoSecreto;

import java.util.*;

public class SistemaAmigo {
    private List<Amigo> listaAmigos;
    private List<Mensagem> mensagens;

    public SistemaAmigo() {
        listaAmigos = new ArrayList<>();
        mensagens = new ArrayList<>();
    }

    public void cadastraAmigo(String nome, String email) {
        listaAmigos.add(new Amigo(nome, email));
    }

    public Amigo pesquisaAmigo(String email) {
        for (Amigo a : listaAmigos) {
            if (a.getEmail().equals(email)) {
                return a;
            }
        }
        return null;
    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        Amigo remetente = pesquisaAmigo(emailDaPessoa);
        if (remetente == null) throw new AmigoInexistenteException("Amigo não encontrado: " + emailDaPessoa);
        remetente.setEmailAmigoSecreto(emailAmigoSorteado);
    }

    public void enviarMensagemParaAlguem(String s, String mail, boolean b, String mail1) {
        return;
    }


    public String pesquisaMensagensAnonimas() {
        return "";
    }

    public void enviarMensagemParaTodos(String s, String mail, boolean b) {
    }

    public String pesquisaAmigoSecretoDe(String mail) {
        return mail;
    }
}