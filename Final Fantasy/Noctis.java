public class Noctis extends FinalFantasy {

    private String Rei;
    String Teleporte;
    String Arsenal;

    public Noctis(){
        super();
    }

    public Noctis(String personagem, String summons, String jogo, String Rei, String Teleporte, String Arsenal) {
        super(personagem, summons, jogo);

        this.Rei = Rei;
        this.Teleporte = Teleporte;
        this.Arsenal = Arsenal;
    }

        @Override
    public String getsummons() {
        return super.summons;
    }

    @Override
    public String getjogo() {
        return super.jogo;
    }
    
    @Override
    public String getpersonagem() {
        return super.personagem;
    }
    
    
    public String getRei() {
        return Rei;
    }
    
    
    public String getTeleporte() {
        return Teleporte;
    }

    public String getArsenal() {
        return Arsenal;
    }

    public void setPersonagem(String personagem){
    this.personagem = personagem;
    }

    public void  setSummons(String Summons){
    this.summons = Summons;
    }

    public void setJogo(String jogo){
        this.jogo = jogo;
    }

    public void  setRei(String Rei){
    this.Rei = Rei;
    }
    
    public void setColt(String Teleporte){
        this.Teleporte = Teleporte;
    }

    public void setJaqueta(String Arsenal){
        this.Arsenal = Arsenal;
    }
}
