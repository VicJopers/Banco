package VicJopers.Projeto.Java;

public class Account{
    private static final int MAX_LENGTH = 12;
    private String ag;
    private String cc;
    private String name;
    private double balance;
    private Log logger;


    public Account(String ag, String cc, String name){
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();
    }
    public void setName(String name){
        if(name.length() > MAX_LENGTH){
            this.name= name.substring(0,MAX_LENGTH);
        }else{
            this.name = name;
        }

    }
    public void deposit(double value){

        balance += value;
        logger.out("DEPÓSITO: "+value +"\n - Valor em conta agora é de: "+balance);
    }
    public boolean sacar(double value){
        if(balance<value){
            logger.out("NÃO PERMITIDO \n- Valor em conta é de: "+balance);
            return false;
        }
        logger.out("VALOR SOLICITADO: "+value +"PODE SACAR - Valor em conta agora é de: "+balance);
        balance -= value;
        return true;
    }

    @Override
    public String toString() {
        String result = "A conta "+ this.name + " " + this.ag + " " + this.cc + " possui R$: " +balance;
        return result;
    }
}
