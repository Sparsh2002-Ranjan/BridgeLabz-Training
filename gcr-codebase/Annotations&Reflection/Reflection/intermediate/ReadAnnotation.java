public class ReadAnnotation {
    public static void main(String[] args) {
        Author a = Book.class.getAnnotation(Author.class);
        System.out.println(a.name());
    }
}