public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Author author = new Author("Ime1");
        Referat re = new Referat(author, "theme", 34);



        Referat re2 = (Referat) re.clone();
        re2.getAuthor().setName("new Name");
        Referat re3 = (Referat) re.clone();
        re3.getAuthor().setName("new Name2");
        Referat re4 = (Referat) re.clone();
        re4.getAuthor().setName("new Name3");


      re2.submit();
      re3.submit();
      re4.submit();

    }
}
