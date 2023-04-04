package padroesestruturais_exercicios.decorator;
import org.junit.jupiter.api.Test;
import padroesestruturais.decorator.*;


import static org.junit.jupiter.api.Assertions.*;
public class BoloTest {

    @Test
    void deveRetornarValorBolo() {
        Bolo bolo = new BoloDecorado(100.0f);

        assertEquals(100.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComCobertura() {
        Bolo bolo = new Cobertura(new BoloDecorado(100.0f));

        assertEquals(110.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComRecheio() {
        Bolo bolo = new Recheio(new BoloDecorado(100.0f));

        assertEquals(110.0f, bolo.getValor());
    }
    @Test
    void deveRetornarValorBoloComDecoracao() {
        Bolo bolo = new Decoracao(new BoloDecorado(100.0f));

        assertEquals(110.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComRecheioMaisCobertura() {
        Bolo bolo = new Recheio(new Cobertura(new BoloDecorado(100.0f)));

        assertEquals(121.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComRecheioMaisDecoracao() {
        Bolo bolo = new Recheio(new Decoracao(new BoloDecorado(100.0f)));

        assertEquals(121.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComDecoracaoMaisCobertura() {
        Bolo bolo = new Decoracao(new Cobertura(new BoloDecorado(100.0f)));

        assertEquals(121.0f, bolo.getValor());
    }



    @Test
    void deveRetornarValorBoloComRecheioMaisCoberturaMaisDecoracao() {
        Bolo bolo = new Recheio(new Cobertura(new Decoracao(new BoloDecorado(100.0f))));

        assertEquals(133.1f, bolo.getValor());
    }

    @Test
    void deveRetornarEstruturaBolo() {
        Bolo bolo = new BoloDecorado();

        assertEquals("Decorado", bolo.getEstrutura());
    }
    @Test
    void deveRetornarEstruturaBoloComRecheio() {
        Bolo bolo = new Recheio(new BoloDecorado());

        assertEquals("Decorado/Recheio", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComCobertura() {
        Bolo bolo = new Cobertura(new BoloDecorado());

        assertEquals("Decorado/Cobertura", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComDecoracao() {
        Bolo bolo = new Decoracao(new BoloDecorado());

        assertEquals("Decorado/Decoracao", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComCoberturaMaisRecheio() {
        Bolo bolo = new Cobertura(new Recheio (new BoloDecorado()));

        assertEquals("Decorado/Recheio/Cobertura", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComCoberturaMaisDecoracao() {
        Bolo bolo = new Cobertura(new Decoracao (new BoloDecorado()));

        assertEquals("Decorado/Decoracao/Cobertura", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComDecoracaoMaisRecheio() {
        Bolo bolo = new Decoracao(new Recheio (new BoloDecorado()));

        assertEquals("Decorado/Recheio/Decoracao", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComRecheioMaisCoberturaMaisDecoracao() {
        Bolo bolo = new Recheio (new Cobertura(new Decoracao (new BoloDecorado())));

        assertEquals("Decorado/Decoracao/Cobertura/Recheio", bolo.getEstrutura());
    }
}
