package fraction;

/**
 * 设计一个表示分数的类Fraction。这个类用两个int类型的变量分别表示分子和分母。
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }
}

class Fraction{
    int numerator;
    int denominator;

    /**
     * 构造一个a/b的分数。
     * @param numerator 分子
     * @param denominator 分母
     */
    Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * 将分数转换为double。
     * @return 分数的double值
     */
    double toDouble()
    {
        return 1.0*numerator/denominator;
    }

    /**
     * 将自己的分数和r的分数相加，产生一个新的Fraction的对象。
     * @param r 分数r
     * @return new Fraction
     */
    Fraction plus(Fraction r)
    {
        int numerator;
        int denominator;
        if ( r.denominator != this.denominator)
        {
            denominator = r.denominator * this.denominator;
            numerator = r.numerator *this.denominator + r.denominator*this.numerator;
        }
        else
        {
            denominator = r.denominator;
            numerator = r.numerator + this.numerator;
        }
        return new Fraction(numerator,denominator);
    }

    /**
     * 将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
     * @param r 分数r
     * @return new Fraction
     */
    Fraction multiply(Fraction r)
    {
        int numerator;
        int denominator;
        numerator = this.numerator * r.numerator;
        denominator = this.denominator * r.denominator;
        return new Fraction(numerator,denominator);
    }

    /**
     * 将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。
     * 当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。
     */
    void print()
    {
        for ( int i = gcd(numerator, denominator); i > 1; i--)
        {
            if (denominator%i == 0 && numerator%i == 0)
            {
                    denominator = denominator / i;
                    numerator = numerator / i;
            }
        }
        if ( denominator == 1 ) System.out.println(numerator);
        else System.out.println(numerator+"/"+denominator);
    }

    /**
     * 求a, b的最大公约数
     * @param a 第一个数，也就是分子
     * @param b 第二个数，也就是分母
     * @return gcd( b % a, a) 递归之后返回a, b最大公约数
     */
    int gcd(int a,int b)
    {
        if ( a == 0 )
            return b;
        return gcd(b % a, a);
    }
}