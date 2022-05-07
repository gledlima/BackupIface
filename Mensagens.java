public class Mensagens {
    
    private String dono;
    private String remetente;
    private String mensagem;
    private int indicador; 

    public Mensagens(String dono, String remetente, String mensagem, int indicador)
    {
        this.dono = dono;
        this.remetente = remetente;
        this.mensagem = mensagem;
        this.indicador = indicador;
    }
    public void printMensagem()
    {
        System.out.println(remetente + "lhe enviou a seguinte mensagem:");
        System.out.println(mensagem);        
    }
    public int getIndicador(){
        return indicador;
    }
    public String getDono()
    {
        return dono;
    }
    public String getMensagem()
    {
        return mensagem;
    }
    public String getRemetente()
    {
        return remetente;
    }
}
