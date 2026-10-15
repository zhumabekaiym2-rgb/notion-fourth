package kz.kaznu.aiym.first;

public class User {
    public String surname;
    public String name;
    public String patronymic;
    public int birthyear;
    public String email;

    public User(String surname, String name, String patronymic, int birthyear, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthyear = birthyear;
        this.email = email;
    }
            public void userInfo() {
            System.out.println("ФИО:" + surname + " " + name + " " + patronymic);
            System.out.println("Год рождения:" + birthyear);
            System.out.println("email:" + email);
        }
        }

