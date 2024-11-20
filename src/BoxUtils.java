import java.util.List;

public class BoxUtils {
    public static double findMaxValue(List<Box<? extends Number>> boxes) {
        double max = Double.NEGATIVE_INFINITY;

        for (Box<? extends Number> box : boxes) {
            if (!box.isEmpty().equals("да")) {
                double value = box.get().doubleValue();
                System.out.println("Значение из коробки: " + value);
                if (value > max) {
                    max = value; // Обновляем максимум
                }
            }
        }

        return max == Double.NEGATIVE_INFINITY ? 0 : max;
    }
}