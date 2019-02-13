package principles.openClosed;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
    //static静态模块初始化数据，实际项目中一般是由持久化完成
    static{
        bookList.add(new NovelBook("天龙八部",3200,"金庸"));
        bookList.add(new NovelBook("巴黎圣母院",5600,"雨果"));
        bookList.add(new OffNovelBook("悲惨世界",3500,"雨果"));
        bookList.add(new OffNovelBook("红楼梦",4300,"曹雪芹"));
        bookList.add(new ComputerBook("Think in Java",4300,"Bruce Eckel", "编程语言"));
    }
    //模拟书店买书
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        formatter.setMaximumFractionDigits(2);
        System.out.println("------书店卖出去的书籍如下：------");
        for (IBook book:bookList) {
            System.out.println("书籍名称：" + book.getName() + "\t书籍作者："+ book.getAuthor() + "\t书籍价格:" + formatter.format(book.getPrice() / 100.0) + "元");
        }
    }

}
