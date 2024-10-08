package com.atguigu01.use.exer1;

/**
 * ClassName: MyDate
 * Package: com.atguigu01.use.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 15:11
 * @Version 1.0
 */
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }


    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "年" +
                month + "月" +
                day + "日";
    }

    @Override
    public int compareTo(MyDate o) {
        int yearDistinct = this.getYear() - o.getYear();
        if (yearDistinct != 0){
            return yearDistinct;
        }

        int monthDistinct = this.getMonth()-o.getMonth();
        if (monthDistinct !=0){
            return monthDistinct;
        }

        int dayDistinct = this.getDay()-o.getDay();
        if(dayDistinct!= 0){
            return dayDistinct;
        }
        return 0;
    }
}
