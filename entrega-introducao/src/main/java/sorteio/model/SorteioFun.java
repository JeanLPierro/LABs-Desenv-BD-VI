package sorteio.model;


public class SorteioFun implements Sorteio{
    private int num;
    private int numPremiado;
    private String resp;

    public SorteioFun() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumPremiado() {
        return numPremiado;
    }

    public void setNumPremiado(int numPremiado) {
        this.numPremiado = numPremiado;
    }

    @Override
    public String getResp() {                       //Metodo que gera a resposta ao usuario
        if (getNum() != getNumPremiado()){
            this.resp = "Nao";
        }else if (getNum() == getNumPremiado()){
            this.resp = "Sim";
        }
        return this.resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }
}
