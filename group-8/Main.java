package Sixth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu m=new Menu();
        m.menu();
    }
}
public class Menu {
    public void showMenu(){
        System.out.println("========图书管理系统========");
        System.out.println("1.------查看图书");
        System.out.println("2.------增加图书");
        System.out.println("3.------删除图书");
        System.out.println("4.------修改图书");
        System.out.println("5.------推荐图书");
        System.out.println("0.------结束");
        System.out.println("=============================================");
    }
    public void menu(){
        BookSystem sc=new BookSystem();
        Scanner aa=new Scanner(System.in);
        Menu m=new Menu();
        m.showMenu();
        System.out.print("请输入选择：");
        int n=aa.nextInt();
        if (n==1) {
            System.out.println("请输入作者名：");
            String name=aa.next();
            System.out.println("请输入书名：");
            String book=aa.next();
            System.out.println(sc.query(name,book));
            m.menu();
        }
        else if(n==2){
            System.out.println("请输入作者名：");
            String name=aa.next();
            System.out.println("请输入书名：");
            String book=aa.next();
            sc.insert(name,book);
            m.menu();
        }
        else if (n==3){
            System.out.println("请输入id号：");
            int id=aa.nextInt();
            sc.delete(id);
            m.menu();
        }
        else if (n==4){
            System.out.println("请输入id号：");
            int id=aa.nextInt();
            System.out.println("请输入作者名：");
            String name=aa.next();
            System.out.println("请输入书名：");
            String book=aa.next();
            sc.update(id,name,book);
            m.menu();
        }
        else if (n==5) {
            sc.Recommend();
            m.menu();
        }
        else if(n==0)
            System.out.println("结束");
        else {
            System.out.println("输入错误请重新输入");
            m.menu();
        }
    }
}

