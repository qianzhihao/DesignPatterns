package principles.openClosed;

public class NovelBook implements IBook {
    //书籍名称
    private String name;
    //书籍售价
    private int price;
    //书籍作者
    private String author;
    //通过构造函数传递书籍数据
    public NovelBook(String _name, int _price, String _author) {
        this.name = _name;
        this.price = _price;
        this.author = _author;
    }
    //书籍名称
    public String getName(){
        return this.name;
    }
    //获得书籍价格
    public int getPrice(){
        return this.price;
    }
    //获得作者是谁
    public String getAuthor(){
        return this.author;
    }
}
