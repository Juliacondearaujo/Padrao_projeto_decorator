package padroesestruturais_exercicios.decorator;

public class Recheio extends BoloDecorator{


    public Recheio(Bolo bolo) {
        super(bolo);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Recheio";
    }
}
