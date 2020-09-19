import org.junit.Test;
import org.junit.Assert;
import sorteio.model.Sorteio;
import sorteio.model.SorteioFun;

public class SorteioTest {

    @Test
    public void deveRetornarRespostaPositiva(){
        SorteioFun sorteio = new SorteioFun();
        sorteio.setNum(8);              //Seta numero do cupom do usuario
        sorteio.setNumPremiado(8);      //Seta numero premiado

        Assert.assertEquals("Sim", sorteio.getResp()); // Resultado esperado
    }

    @Test
    public void deveRetornarRespostaNegativa(){
        SorteioFun sorteio = new SorteioFun();
        sorteio.setNum(5);              //Seta numero do cupom do usuario
        sorteio.setNumPremiado(2);      //Seta numero premiado

        Assert.assertEquals("Nao", sorteio.getResp()); // Resultado esperado
    }
}
