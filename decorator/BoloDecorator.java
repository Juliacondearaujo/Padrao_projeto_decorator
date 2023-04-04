package padroesestruturais_exercicios.decorator;


public abstract class BoloDecorator implements Bolo {

    private Bolo bolo;
    public String estrutura;

    public BoloDecorator(Bolo bolo) {
        this.bolo = bolo;
    }

    public Bolo getBolo() {
        return bolo;
    }

    public void setBolo(Bolo bolo) {
        this.bolo = bolo;
    }

    public abstract float getPercentualValor();

    public float getValor() {
        return this.bolo.getValor() * (1 + (this.getPercentualValor() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.bolo.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}



