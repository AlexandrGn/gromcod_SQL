package lesson6;

public class Demo {
    public static void main(String[] args) {
        Author author=new Author(105,"Test");
        Article article=new Article(1,"test header", "test text",author);
        Author author1=new Author(105,"Test");
        Article article1=new Article(1,"test header", "test text",author);
        Author author2=new Author(105,"Test");
        Article article2=new Article(1,"test header", "test text",author);
    }
}
