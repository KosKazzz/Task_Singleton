import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int limiterF;

    public Filter(int f) {
        this.limiterF = f;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = list.stream()
                .peek(c -> {
                    if (c <= limiterF) {
                        logger.log("Элемент " + c + " проходит");
                    } else {
                        logger.log("Элемент " + c + " не проходит");
                    }
                })
                .filter(c -> c <= limiterF)
                .collect(Collectors.toList());
        logger.log("Прошло фильтр " + result.size() + " элемента(ов) из " + list.size());
        return result;
    }
}
