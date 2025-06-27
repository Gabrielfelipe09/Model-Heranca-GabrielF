//3 protagonistas da franquia Final Fantasy

public class FinalFantasy {
    String personagem;
    String summons;
    String jogo;

    public FinalFantasy(){}

    public FinalFantasy (String personagem, String summons, String jogo){
        this.personagem = personagem;
        this.summons = summons;
        this.jogo = jogo;
    }

    public String getpersonagem() {
        return personagem;
    }

    public String getsummons() {
        return summons;
    }

    public String getjogo() {
        return jogo;
    }

    public void setPersonagem(String personagem){
        this.personagem = personagem;
    }

    public void setSummons(String summons){
        this.summons = summons;
    }

    public void setJogo(String jogo){
        this.jogo = jogo;
    }
}
