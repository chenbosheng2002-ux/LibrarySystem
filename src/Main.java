import java.util.ArrayList;
import java.util.Scanner;

// 图书类
class Book {
    private String id;
    private String title;
    private boolean isBorrowed;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isBorrowed() { return isBorrowed; }
    public void setBorrowed(boolean borrowed) { isBorrowed = borrowed; }

    @Override
    public String toString() {
        return "编号: " + id + ", 书名: " + title + ", 状态: " + (isBorrowed ? "已借出" : "可借阅");
    }
}

// 主运行与管理类
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // 初始添加一本书
        library.add(new Book("001", "Java面向对象程序设计"));

        while (true) {
            System.out.println("\n--- 简易图书管理系统 ---");
            System.out.println("1. 查看所有图书");
            System.out.println("2. 添加图书");
            System.out.println("3. 退出系统");
            System.out.print("请选择操作编号: ");
            
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("--- 图书列表 ---");
                for (Book b : library) {
                    System.out.println(b);
                }
            } else if (choice == 2) {
                System.out.print("输入图书编号: ");
                String id = scanner.next();
                System.out.print("输入图书书名: ");
                String title = scanner.next();
                library.add(new Book(id, title));
                System.out.println("图书添加成功！");
            } else {
                System.out.println("系统已退出。");
                break;
            }
        }
        scanner.close();
    }
}