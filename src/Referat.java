public class Referat extends Document implements Cloneable{
   Author author = new Author();
   String theme;
   int pages;

    @Override
    public String toString() {
        return "Referat{" +
                "author=" + author +
                ", theme='" + theme + '\'' +
                ", pages=" + pages +
                '}';
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }



    public Referat(Author author, String theme, int pages) {
        this.author = author;
        this.theme = theme;
        this.pages = pages;
    }
    public Referat() {
        this.author = new Author();
        this.theme = "";
        this.pages = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Referat r = (Referat) super.clone();
        r.setAuthor((Author) this.author.clone());

        return r;
    }

    @Override
    void submit() {
        System.out.println("The referat is submited");
    }
}
