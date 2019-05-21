package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Author author=new Author(105,"Test");
        Article article=new Article(1,"test header", "test text",author);
        Author author1=new Author(105,"Test");
        Article article1=new Article(1,"test header", "test text",author);
        Author author2=new Author(105,"Test");
        Article article2=new Article(1,"test header", "test text",author);



        int[] d={5,3,6};
        System.out.println(d.length);
        List arrayList = new ArrayList();
        arrayList.add("sd");
        arrayList.add(author);
        System.out.println(arrayList);
        List<Integer> list = new ArrayList<Integer>();
    }
}
