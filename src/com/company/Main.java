package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(fillTheSigns(6,3,2, 250, 1, 30,300));
        //in case there is no solution found, it returns null
    }

    //-------------------------------------------6 digits------------------------------------------
    private static String fillTheSigns(int n1, int n2, int n3, int n4, int n5, int n6, int result) {
        String sign;
        String temp = null;

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0: {
                    temp = fillTheSigns(n1 + n2, n3, n4, n5, n6, result);
                    if(temp==null)
                        continue;

                    sign = "+";
                    String t1 = String.valueOf(n1+n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
                case 1: {
                    temp = fillTheSigns(n1 - n2, n3, n4, n5, n6, result);
                    if(temp==null)
                        continue;

                    sign = "-";
                    String t1 = String.valueOf(n1-n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
                case 2: {
                    temp = fillTheSigns(n1 * n2, n3, n4, n5, n6, result);
                    if(temp==null)
                        continue;

                    sign = "*";
                    String t1 = String.valueOf(n1*n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
                case 3: {
                    if(n2 != 0) {
                        temp = fillTheSigns(n1 / n2, n3, n4, n5, n6, result);
                    }
                    if(temp==null)
                        continue;


                    sign = "/";
                    if(n2==0) continue;
                    String t1 = String.valueOf(n1/n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
            }
        }
        return temp;
    }


    //--------------------------------------5 digits------------------------------------
    private static String fillTheSigns(int n1, int n2, int n3, int n4, int n5, int result) {
        String sign;
        String temp = null;

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0: {
                    temp = fillTheSigns(n1 + n2, n3, n4, n5, result);
                    if(temp==null)
                        continue;

                    sign = "+";
                    String t1 = String.valueOf(n1+n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
                case 1: {
                    temp = fillTheSigns(n1 - n2, n3, n4, n5, result);
                    if(temp==null)
                        continue;

                    sign = "-";
                    String t1 = String.valueOf(n1-n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
                case 2: {
                    temp = fillTheSigns(n1 * n2, n3, n4, n5, result);
                    if(temp==null)
                        continue;

                    sign = "*";
                    String t1 = String.valueOf(n1*n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
                case 3: {
                    if(n2 != 0) {
                        temp = fillTheSigns(n1 / n2, n3, n4, n5, result);
                    }
                    if(temp==null)
                        continue;


                    sign = "/";
                    if(n2==0) continue;
                    String t1 = String.valueOf(n1/n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
            }
        }
        return temp;
    }



    //-------------------------4 digits---------------------------
    private static String fillTheSigns(int n1, int n2, int n3, int n4, int result) {
        String sign;
        String temp = null;

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0: {
                    temp = fillTheSigns(n1 + n2, n3, n4, result);
                    if(temp==null)
                        continue;

                    sign = "+";
                    String t1 = String.valueOf(n1+n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
                case 1: {
                    temp = fillTheSigns(n1 - n2, n3, n4, result);
                    if(temp==null)
                        continue;

                    sign = "-";
                    String t1 = String.valueOf(n1-n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
                case 2: {
                    temp = fillTheSigns(n1 * n2, n3, n4, result);
                    if(temp==null)
                        continue;

                    sign = "*";
                    String t1 = String.valueOf(n1*n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
                case 3: {
                    if(n2 != 0) {
                        temp = fillTheSigns(n1 / n2, n3, n4, result);
                    }
                    if(temp==null)
                        continue;


                    sign = "/";
                    if(n2==0) continue;
                    String t1 = String.valueOf(n1/n2);
                    return temp.replaceFirst(t1, n1 + " " + sign + " " +  n2);
                }
            }
        }
        return temp;
    }

    //-----------------------------3 digits--------------------------------
    private static String fillTheSigns(int n1, int n2, int n3, int result) {
        String temp = "";
        out: for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0: {
                    temp = fillTheSigns(n1+n2, n3, result);
                    if(temp == null)
                        continue;
                    temp = n1 + " + " + n2 + temp.substring(temp.indexOf(' '));
                    break out;
                }
                case 1: {
                    temp = fillTheSigns(n1-n2, n3, result);
                    if(temp == null)
                        continue;
                    temp = n1 + " - " + n2 + temp.substring(temp.indexOf(' '));
                    break out;
                }
                case 2: {
                    temp = fillTheSigns(n1*n2, n3, result);
                    if(temp == null)
                        continue;
                    temp = n1 + " * " + n2 + temp.substring(temp.indexOf(' '));
                    break out;
                }
                case 3: {
                    if (n2 == 0)
                        continue ;

                    temp = fillTheSigns(n1/n2, n3, result);
                    if(temp == null)
                        continue;
                    temp = n1 + " / " + n2 + temp.substring(temp.indexOf(' '));
                    break out;
                }
            }
        }

        return temp;
    }


    //------------------------2 digits-------------------------------
    private static String fillTheSigns(int n1, int n2, int result) {
        if (n1 + n2 == result)
            return n1 + " + " + n2 + " = " + result;
        else if (n1 - n2 == result)
            return n1 + " - " + n2 + " = " + result;
        else if (n1 * n2 == result)
            return n1 + " * " + n2 + " = " + result;
        else if (n2 != 0 && n1 / n2 == result)
            return n1 + " / " + n2 + " = " + result;

        return null;
    }
}
