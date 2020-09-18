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
    public String getResp(int num, int numPremiado) {
        if (num != numPremiado){
            this.resp = "Nao";
        }else if (num == numPremiado){
            this.resp = "Sim";
        }
        return this.resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }
}
