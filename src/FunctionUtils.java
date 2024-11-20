import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionUtils {

    public static <T, P> List<P> map(List<T> list, MyFunction<T, P> function) {
        List<P> result = new ArrayList<>();
        for (T item : list) {
            result.add(function.apply(item));
        }
        return result;
    }
    public static <T> List<T> filter(List<T> values, TestFunction<T> testFunction) {
        List<T> result = new ArrayList<>();
        for (T value : values) {
            if (testFunction.test(value)) {
                result.add(value);
            }
        }
        return result;
    }

    public static <T> T reduce(List<T> values, T identity, ReduceFunction<T> reduceFunction) {
        T result = identity;
        for (T value : values) {
            result = reduceFunction.reduce(result, value);
        }
        return result;
    }

    public static <T, P extends Collection<T>> P collect(List<T> source, Supplier<P> collectionFactory, Function<T, Boolean> filter) {
        P result = collectionFactory.get();
        for (T item : source) {
            if (filter.apply(item)) {
                result.add(item);
            }
        }
        return result;
    }

}
