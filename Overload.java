public class Overload
{
    double volume(double r)
    {
        double v=4.0/3*22/7*Math.pow(r,3);
        return v;
    }
    double volume(double h, double r)
    {
        double v=22.0/7*r*r*h;;
        return v;
    }
    double volume(double l, double b, double h)
    {
        double v=l*b*h;
        return v;
    }
}

    