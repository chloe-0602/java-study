package com.chloe.java.project01;

public class Account {
    public static void main(String[] args) {

        boolean isFlag = true;

        int balance = 10000;
        String info = "";

        while (isFlag){
            System.out.print("""
-----------------谷粒记账软件-----------------

                   1 收支明细
                   2 登记收入
                   3 登记支出
                   4 退    出

                   请选择(1-4)：""");

            char selection = Utility.readMenuSelection();

            switch (selection){
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println("收支\t账户金额\t收支金额\t说    明");
                    System.out.println(info);
                    break;
                case '2':
                    System.out.print("\n本次收入金额：");
                    int income = Utility.readNumber();
                    balance += income;
                    System.out.print("本次收入说明：");
                    String detail = Utility.readString();
                    info += "收入" + "\t" + balance + "\t"+ income + "\t\t" + detail + "\n";
                    break;
                case '3':
                    System.out.print("\n本次支出金额：");
                    int outcome = Utility.readNumber();
                    balance -= outcome;
                    System.out.print("本次支出说明：");
                    String det = Utility.readString();
                    info += "支出" + "\t" + balance + "\t"+ outcome + "\t\t" + det + "\n";
                    break;
                case '4':
                    System.out.print("\n确认是否退出(Y/N)：");
                    char confirmSelection = Utility.readConfirmSelection();
                    if (confirmSelection == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }
    }
}
