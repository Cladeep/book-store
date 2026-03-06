public class Ebook extends Book {
    private int fileSize;

    public Ebook(String title, String author, String isbn, int fileSize){
        super(title,author,isbn);
        this.fileSize= fileSize;
    }

    public int getFileSize(){
        return fileSize;
    }

    public void setFileSize(int fileSize){
        this.fileSize = fileSize;
    }

}
