public class nepjt {
    public static void printFigure(int w) {
        // Верхняя строка из дефисов
        for (int i = 0; i < w; i++) {
            System.out.print("- ");
        }
        System.out.println();

        // 2. Основной цикл: i — количество "!" в текущей строке (кол-во W)
        for (int i = w; i >= 1; i--) {
            // Определяем номер строки с "!" (1, 2, 3 и тд)
            int numstk = w - i + 1;
            // Смещение начинается только с 3-й строки и чередуется.
            boolean zdvig = false;
            if (numstk >= 3) {
                // (numstk - 3) чётное -> вправо, нечётное -> влево
                zdvig = ((numstk - 3) % 2 == 0);
            }
            // Если нужно сместить вправо, печатаем пробелы.
            if (zdvig) {
                for (int j = 0; j < (w - i) * 2; j++) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print("! ");
            }
            System.out.println();
            for (int j = 0; j < w; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printFigure(8);}
}