package test1;

public class Input {
    private int nVitkov = 0;
    private double diamProv = 0;
    private double innerDiam = 0;

    public Input(int nVitkov, double diamProv, double innerDiam) {
        this.nVitkov = nVitkov;
        this.diamProv = diamProv;
        this.innerDiam = innerDiam;
    }

    public Input() {
    }

    public int getnVitkov() {
        return nVitkov;
    }

    public void setnVitkov(int nVitkov) {
        this.nVitkov = nVitkov;
    }

    public double getDiamProv() {
        return diamProv;
    }

    public void setDiamProv(double diamProv) {
        this.diamProv = diamProv;
    }

    public double getInnerDiam() {
        return innerDiam;
    }

    public void setInnerDiam(double innerDiam) {
        this.innerDiam = innerDiam;
    }
}
