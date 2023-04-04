package padroesestruturais_exercicios.decorator;


public class Cobertura extends BoloDecorator {

    public Cobertura(Bolo bolo) {
        super(bolo);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Cobertura";
    }

}
