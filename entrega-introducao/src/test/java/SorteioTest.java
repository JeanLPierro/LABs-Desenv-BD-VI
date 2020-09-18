import org.junit.Test;
import org.junit.Assert;
import sorteio.model.Sorteio;
import sorteio.model.SorteioFun;

public class SorteioTest {

    @Test
    public void deveRetornarRespostaPositiva(){
        Sorteio sorteio = new SorteioFun();

        Assert.assertEquals("Sim", sorteio.getResp(80,80));
    }

    @Test
    public void deveRetornarRespostaNegativa(){
        Sorteio sorteio = new SorteioFun();

        Assert.assertEquals("Nao", sorteio.getResp(35,42));
    }
}
