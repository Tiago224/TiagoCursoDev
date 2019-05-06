package Interfaces;

public class Retangulo implements ICalcGeometria {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcPerimetro() {
        return (this.base+this.altura)*2;
    }

    @Override
    public double calcArea() {
        return (this.altura*this.base);
    }
}
