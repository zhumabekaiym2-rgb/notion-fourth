package kz.kaznu.aiym.first;

public class MainApp {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Иванов", "Иван", "Иванович", 1975, "ivanov@mail.ru");
        users[1] = new User("Петров", "Петр", "Петрович", 1995, "petrov@mail.ru");
        users[2] = new User("Смирнов", "Алексей", "Сергеевич", 1980, "smirnov@mail.ru");
        users[3] = new User("Кузнецова", "Анна", "Владимировна", 2000, "kuznetsova@mail.ru");
        users[4] = new User("Попов", "Дмитрий", "Игоревич", 1970, "popov@mail.ru");
        users[5] = new User("Васильев", "Максим", "Олегович", 1992, "vasilyev@mail.ru");
        users[6] = new User("Соколова", "Елена", "Андреевна", 1982, "sokolova@mail.ru");
        users[7] = new User("Михайлов", "Андрей", "Николаевич", 2002, "mikhaylov@mail.ru");
        users[8] = new User("Федоров", "Сергей", "Павлович", 1965, "fedorov@mail.ru");
        users[9] = new User("Морозова", "Ольга", "Викторовна", 1998, "morozova@mail.ru");

        System.out.println("Пользователи старше 40 лет:");

        for (int i = 0; i < users.length; i++) {
            if (2026 - users[i].birthyear > 40) {
                users[i].userInfo();
            }
        }
    }
}