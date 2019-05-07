package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(fillTheSigns(100, 4,2,2, 184));
    }

    private static String fillTheSigns(int n1, int n2, int n3, int n4, int result) {
        char sign = 'x';

        String x = null;

        int index = 0;
        while (x == null || index < 12) {
            switch (index) {
                case 0: {
                    x = fillTheSigns(n1, n2 + n3, n4, result);
                    sign = '+';
                    break;
                }
                case 1: {
                    x = fillTheSigns(n1, n2 - n3, n4, result);
                    sign = '-';
                    break;
                }
                case 2: {
                    x = fillTheSigns(n1, n2 * n3, n4, result);
                    sign = '*';
                    break;
                }
                case 3: {
                    x = fillTheSigns(n1, n2 / n3, n4, result);
                    sign = '/';
                    break;
                }


                case 4: {
                    x = fillTheSigns(n1, n2, n3 + n4, result);
                    sign = '+';
                    break;
                }
                case 5: {
                    x = fillTheSigns(n1, n2, n3 - n4, result);
                    sign = '-';
                    break;
                }
                case 6: {
                    x = fillTheSigns(n1, n2, n3 * n4, result);
                    sign = '*';
                    break;
                }
                case 7: {
                    x = fillTheSigns(n1, n2, n3 / n4, result);
                    sign = '/';
                    break;
                }

                case 8: {
                    x = fillTheSigns(n1 + n2, n3, n4, result);
                    sign = '+';
                    break;
                }
                case 9: {
                    x = fillTheSigns(n1 - n2, n3, n4, result);
                    sign = '-';
                    break;
                }
                case 10: {
                    x = fillTheSigns(n1 * n2, n3, n4, result);
                    sign = '*';
                    break;
                }
                case 11: {
                    if(n2 != 0) {
                        x = fillTheSigns(n1 / n2, n3, n4, result);
                        sign = '/';
                    }
                    break;
                }
            }
            index++;
        }
        return x;
    }


    //2 digits
    private static String fillTheSigns(int n1, int n2, int result) {
        if (n1 + n2 == result)
            return n1 + " + " + n2 + " = " + result;
        else if (n1 - n2 == result)
            return n1 + " - " + n2 + " = " + result;
        else if (n1 * n2 == result)
            return n1 + " * " + n2 + " = " + result;
        else if (n1 / n2 == result)
            return n1 + " / " + n2 + " = " + result;

        return null;
    }

    //three digits
    private static String fillTheSigns(int n1, int n2, int n3, int result) {
        String temp = "";

        out: for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0: {
                    temp = fillTheSigns(n1+n2, n3, result);
                    System.out.println(temp);
                    if(temp == null)
                        continue;
                    temp = n1 + " + " + n2 + temp.substring(temp.indexOf(' '));
                    break out;
                }
                case 1: {
                    temp = fillTheSigns(n1-n2, n3, result);System.out.println(temp);
                    if(temp == null)
                        continue;
                    temp = n1 + " - " + n2 + temp.substring(temp.indexOf(' '));
                    break out;
                }
                case 2: {
                    temp = fillTheSigns(n1*n2, n3, result);System.out.println(temp);
                    if(temp == null)
                        continue;
                    temp = n1 + " * " + n2 + temp.substring(temp.indexOf(' '));System.out.println(temp);
                    break out;
                }
                case 3: {
                    if (n2 == 0)
                        continue ;

                    temp = fillTheSigns(n1/n2, n3, result);System.out.println(temp);
                    if(temp == null)
                        continue;
                    temp = n1 + " / " + n2 + temp.substring(temp.indexOf(' '));
                    break out;
                }

                case 4: {
                    temp = fillTheSigns(n1, n2 + n3, result);System.out.println(temp);
                    if(temp == null)
                        continue;
                    temp = temp.substring(0,temp.lastIndexOf(' ')) + n2 + " + " + n3;
                    break out;
                }
                case 5: {
                    temp = fillTheSigns(n1, n2 - n3, result);System.out.println(temp);
                    if(temp == null)
                        continue;
                    temp = temp.substring(0,temp.lastIndexOf(' ')) + n2 + " - " + n3;
                    break out;
                }
                case 6: {
                    temp = fillTheSigns(n1, n2 * n3, result);System.out.println(temp);
                    if(temp == null)
                        continue;
                    temp = temp.substring(0,temp.lastIndexOf(' ')) + n2 + " * " + n3;
                    break out;
                }
                case 7: {
                    if (n3 == 0)
                        continue;

                    temp = fillTheSigns(n1, n2 / n3, result);System.out.println(temp);
                    if(temp == null)
                        continue;
                    temp = temp.substring(0,temp.lastIndexOf(' ')) + n2 + " / " + n3;
                    break out;
                }
            }


        }

        return temp;
    }


}
