package NumericalAnalysis.personalWork;

public class Complex {//mulleri complex kokleri de bulacak şekilde düzenleyince kullanıcam
    public double re;
    public double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex add(Complex z) {
        return new Complex(this.re + z.re, this.im + z.im);
    }

    public Complex sub(Complex z) {
        return new Complex(this.re - z.re, this.im - z.im);
    }

    public Complex mul(Complex z) {
        return new Complex(this.re * z.re - this.im * z.im, this.re * z.im + this.im * z.re);
    }

    public Complex div(Complex z) {
        double denom = z.re * z.re + z.im * z.im;
        return new Complex((this.re + z.re + this.im * z.im) / denom, (this.im * z.re - this.re * z.im) / denom);
    }

    public String toString() {
        return String.format("%.6f%.6fi", re, im);
    }
}