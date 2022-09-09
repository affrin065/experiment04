/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expt04;

import java.util.Scanner;

/**
 *
 * @author affrin
 */
public class Expt04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        Scanner o=new Scanner(System.in);
        System.out.println("enter width");
        int width=o.nextInt();
        System.out.println("enter height");
        int height=o.nextInt();
        rectangle obj=new rectangle(4,width,height);
        triangle ob=new triangle(3,width,height);
        System.out.println("rectangle");
        System.out.println("no.of sides->"+obj.getmethod());
        obj.getarea();
        obj.getperimeter();
        System.out.println("triangle");
        System.out.println("no.of sides->"+ob.getmethod());
        ob.getarea();
        ob.getperimeter();
    }
   
}
abstract class shape
{
    int numsides;
    shape(int num)
    {
        numsides=num;
    }
    int getmethod()
    {
        return numsides;
    }
   
    abstract void getarea();
    abstract void getperimeter();
}
class rectangle extends shape
{
   int width;
   int height;
 
           rectangle(int n,int w,int h)
           {
               super(n);
               width=w;
               height=h;
           }
            @Override
   void getarea()
   {
     System.out.println("area->"+width*height);
   }
   @Override
   void getperimeter()
   {
       System.out.println("perimeter->"+2*(width+height));
   }
}
class triangle extends shape
{
    int width;
    int height;
    triangle(int n,int w,int h)
    {
        super(n);
        width=w;
        height=h;
    }
    @Override
    void getarea()
    {
      System.out.println("area->"+(width*height)/2);  
    }
    @Override
    void getperimeter()
    {
        System.out.println("perimeter->"+(width+height+numsides));
    }
}



   
