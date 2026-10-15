package kz.kaznu.aiym.second;

public class Box {
    private final int width;
    private final int height;
    private final int depth;

    private String color;
    private boolean isOpen;
    private String item;

    public Box(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = false;
        this.item = null;
    }

    public void open() {
        if (isOpen) {
            System.out.println("Коробка уже открыта.");
        } else {
            isOpen = true;
            System.out.println("Коробка открыта.");
        }
    }

    public void close() {
        if (!isOpen) {
            System.out.println("Коробка уже закрыта.");
        } else {
            isOpen = false;
            System.out.println("Коробка закрыта.");
        }
    }

    public void repaint(String newColor) {
        color = newColor;
        System.out.println("Коробка перекрашена в цвет: " + color);
    }

    public void putItem(String newItem) {
        if (!isOpen) {
            System.out.println("Нельзя положить предмет: коробка закрыта!");
            return;
        }
        if (item != null) {
            System.out.println("В коробке уже есть предмет: " + item + ". Сначала вытащите его.");
            return;
        }
        item = newItem;
        System.out.println("В коробку положили предмет: " + item);
    }

    public void removeItem() {
        if (!isOpen) {
            System.out.println("Нельзя вытащить предмет: коробка закрыта!");
            return;
        }
        if (item == null) {
            System.out.println("В коробке и так пусто, нечего вытаскивать.");
            return;
        }
        System.out.println("Из коробки выкинули предмет: " + item);
        item = null;
    }

    public void printInfo() {
        System.out.println(" Информация о коробке");
        System.out.println("Размеры: " + width + "x" + height + "x" + depth);
        System.out.println("Цвет: " + color);
        System.out.println("Состояние: " + (isOpen ? "Открыта" : "Закрыта"));
        System.out.println("Предмет внутри: " + (item != null ? item : "пусто"));
    }
}
