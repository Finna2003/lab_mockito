import java.util.Arrays;

public class ArgumentProvider implements IArgumentProvider {
    private double[] arguments;
    private int index;

    public ArgumentProvider() {
        index = 0;
        arguments = new double[11];
        Arrays.setAll(arguments, p -> p * 0.1 + 1.0);
    }


    public double nextArg() {
        double arg = arguments[index];
        index = (index + 1) % 10;
        return arg;
    }
    public double getArg(int id) {
        return (id<10&&id>=0)?arguments[id]:0;
    }
}
