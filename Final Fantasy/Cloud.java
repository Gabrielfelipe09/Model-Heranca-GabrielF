public class Cloud extends FinalFantasy {

    String Bustersword;
    private String Soldier;
    String OutroCorpo;

    public Cloud(){
        super();
    }

    public Cloud(String personagem, String summons, String jogo, String Bustersword, String Soldier, String OutroCorpo) {
        super(personagem, summons, jogo);

        this.Bustersword = Bustersword;
        this.Soldier = Soldier;
        this.OutroCorpo = OutroCorpo;
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
    
    
    public String getBustersword() {
        return Bustersword;
    }
    
    
    public String getSoldier() {
        return Soldier;
    }

    public String getOutroCorpo() {
        return OutroCorpo;
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

    public void  setBustersword(String Bustersword){
    this.Bustersword = Bustersword;
    }
    
    public void setSoldier(String Soldier){
        this.Soldier = Soldier;
    }

    public void setOutroCorpo(String OutroCorpo){
        this.OutroCorpo = OutroCorpo;
    }
}
