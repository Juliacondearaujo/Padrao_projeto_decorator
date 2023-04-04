package padroesestruturais_exercicios.decorator;

public class Decoracao extends BoloDecorator{

    public Decoracao(Bolo bolo) {
        super(bolo);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Decoracao";
    }
}
