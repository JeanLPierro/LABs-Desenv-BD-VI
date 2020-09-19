import sorteio.model.SorteioFun;;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.simple.RandomSource;

public class SorteioApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("Bem Vindo ao Sorteio!\n");
        SorteioFun sorteio = new SorteioFun();
        UniformRandomProvider rng = RandomSource.create(RandomSource.MT);
        int numPremiado = rng.nextInt(79);                                       // Gera um numero randomico de 0 a 79
        sorteio.setNumPremiado(numPremiado+1);                                      // Seta o numero randomico como numero premiado (+1 é para setar o range 1 - 80)
        //System.out.println(numPremiado);                                             Print do numero gerado aleatoriamente para teste
        System.out.println("Informe seu numero da sorte:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //Leitura do cupom do usuario
        String input = br.readLine();
        int num = Integer.parseInt(input);
        sorteio.setNum(num);                                                        // Seta o numero do cupom do usuario
        System.out.println("Seu Bilhete foi premiado?: " + sorteio.getResp());      // Retorna a resposta para o usuario
    }
}
