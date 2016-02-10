package lesson.eight;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import com.sun.org.apache.xpath.internal.operations.String;
import org.jetbrains.annotations.Contract;

import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public  List<String> f() {
        return null;
    }

    @Contract(pure = true)
    public static Optional<Integer> rer() {
        return Optional.empty();
    }

    public static void main(String[] args) {
       Optional<Integer> f = Optional.of(234);
       Optional<Integer> ff = Optional.of(234);
        

    }

}

