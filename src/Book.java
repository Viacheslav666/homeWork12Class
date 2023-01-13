public class Book {
    private String name;
    private Author Author;
    private int age;

    public Book(String name, Author Author, int age) {
        this.name = name;
        this.Author = Author;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.Author;

    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 1500 || age > 2500) {
            System.out.println("Ошибка год не может быть равен - " + age);
            return;
        } else {
            this.age = age;
        }
    }
}
