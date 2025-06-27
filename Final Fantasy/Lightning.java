public class Lightning extends FinalFantasy {

    String Armadura;
    String Magias;
    private String General;

    public Lightning(){
        super();
    }

    public Lightning(String personagem, String summons, String jogo, String Armadura, String Magias, String General) {
        super(personagem, summons, jogo);

        this.General = Armadura;
        this.Magias = Magias;
        this.General = General;
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
    
    
    public String getArmadura() {
        return Armadura;
    }
    
    
    public String getMagias() {
        return Magias;
    }

    public String getGeneral() {
        return General;
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

    public void  setRei(String Armadura){
    this.Armadura = Armadura;
    }
    
    public void setColt(String Magias){
        this.Magias = Magias;
    }

    public void setGeneral(String General){
        this.General = General;
    }
}
