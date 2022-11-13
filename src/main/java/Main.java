import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка : ");
        int inputSize = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int inputMax = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> integerList = new ArrayList<>(inputSize);
        for (int i = 0; i < inputSize; i++) {
            int x = (int) (Math.random() * inputMax);
            integerList.add(x);
        }
        System.out.println("Вот случайный список: " + integerList);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int limiter = scanner.nextInt();
        Filter filter = new Filter(limiter);
        logger.log("Запускаем фильтрацию");
        List<Integer> result = filter.filterOut(integerList);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}
