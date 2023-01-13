public class Main {

/**Напишите небольшой библиотечный справочник, где хранится информация о книгах.

 Рекомендуем создать отдельный класс, например с именем Main или App — в нем объявить метод main и в нем протестировать работу вашего кода.

 Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги. Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
 Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
 Напишите конструкторы для обоих классов, заполняющие все поля.
 Создайте геттеры для всех полей автора и всех полей книги.
 Создайте сеттер для поля «Год публикации» у книги.
 В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
 Метод main не должен находиться в классах Book и Author.

 Создайте отдельный класс для запуска приложения и объявите метод main в нем.

 В том же методе main измените год публикации одной из книг с помощью сеттера*/

    public static void Book() {
        System.out.println("Задание № 1");

        Author author = new Author("Алекс", "Лесли");
        Book book = new Book("Жизнь без трсуов", author, 2010);
        System.out.println("book.getAge() = " + book.getAge());
        book.setAge(1000);
        System.out.println("book.getAge() = " + book.getAge());


        Author rizov = new Author("Игорь","Рызов" );
        Book kremlinSchoolOfNegotiations = new Book("Кремлевская школа переговоров", rizov, 2000);
        System.out.println("kremlinSchoolOfNegotiations.getAge() = " + kremlinSchoolOfNegotiations.getAge());
        kremlinSchoolOfNegotiations.setAge(2020);
        System.out.println("kremlinSchoolOfNegotiations.getAge() = " + kremlinSchoolOfNegotiations.getAge());
        System.out.println("author.getNameAuthor() = " + rizov.getNameAuthor());
    }


    public static void main(String[] args) {

    }

}