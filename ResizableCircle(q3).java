public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "Radius=" + Radius +
                '}';
    }
    public void resize(int percent)
    {
       super.Radius*=percent/100.0;

    }    
}
