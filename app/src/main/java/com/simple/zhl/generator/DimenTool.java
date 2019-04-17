package com.simple.zhl.generator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DimenTool {
    public static void gen() {
        //以此文件夹下的dimens.xml文件内容为初始值参照
        File file = new File("./app/src/main/res/values/dimens.xml");

        BufferedReader reader = null;
        StringBuilder sw240 = new StringBuilder();
        StringBuilder sw300 = new StringBuilder();
        StringBuilder sw320 = new StringBuilder();
        StringBuilder sw340 = new StringBuilder();
        StringBuilder sw360 = new StringBuilder();
        StringBuilder sw380 = new StringBuilder();
        StringBuilder sw390 = new StringBuilder();
        StringBuilder sw411 = new StringBuilder();
        StringBuilder sw430 = new StringBuilder();
        StringBuilder sw450 = new StringBuilder();
        StringBuilder sw470 = new StringBuilder();
        StringBuilder sw480 = new StringBuilder();
        try {

            System.out.println("生成不同分辨率：");

            reader = new BufferedReader(new FileReader(file));

            String tempString;

            int line = 1;

            // 一次读入一行，直到读入null为文件结束

            while ((tempString = reader.readLine()) != null) {


                if (tempString.contains("</dimen>")) {

                    //tempString = tempString.replaceAll(" ", "");

                    String start = tempString.substring(0, tempString.indexOf(">") + 1);

                    String end = tempString.substring(tempString.lastIndexOf("<") - 2);
                    //截取<dimen></dimen>标签内的内容，从>右括号开始，到左括号减2，取得配置的数字
                    Double num = Double.parseDouble
                            (tempString.substring(tempString.indexOf(">") + 1,
                                    tempString.indexOf("</dimen>") - 2));

                    //根据不同的尺寸，计算新的值，拼接新的字符串，并且结尾处换行。
//                    sw240.append(start).append( num * 0.75).append(end).append("\r\n");
//                    sw320.append(start).append( num * 1).append(end).append("\r\n");
//                    sw360.append(start).append( num * 1.125).append(end).append("\r\n");
//                    sw480.append(start).append(num * 1.5).append(end).append("\r\n");
//                    sw600.append(start).append(num * 1.87).append(end).append("\r\n");
//                    sw720.append(start).append(num * 2.25).append(end).append("\r\n");
//                    sw800.append(start).append(num * 2.5).append(end).append("\r\n");
//                    w820.append(start).append(num * 2.56).append(end).append("\r\n");

                    sw240.append(start).append(String.format("%.2f", num * 0.75 / 1.125)).append(end).append("\r\n");
                    // TODO: 2019/4/17 300
                    sw300.append(start).append(String.format("%.2f", num * 300 / 360)).append(end).append("\r\n");
                    sw320.append(start).append(String.format("%.2f", num * 1 / 1.125)).append(end).append("\r\n");
                    // TODO: 2019/4/17 340
                    sw340.append(start).append(String.format("%.2f", num * 340 / 360)).append(end).append("\r\n");
                    sw360.append(start).append(String.format("%.2f", num)).append(end).append("\r\n");
                    // TODO: 2019/4/17 380
                    sw380.append(start).append(String.format("%.2f", num * 380 / 360)).append(end).append("\r\n");
                    // TODO: 2019/4/17 390
                    sw390.append(start).append(String.format("%.2f", num * 390 / 360)).append(end).append("\r\n");
                    // TODO: 2019/4/17 411
                    sw411.append(start).append(String.format("%.2f", num * 410 / 360)).append(end).append("\r\n");
                    // TODO: 2019/4/17 430
                    sw430.append(start).append(String.format("%.2f", num * 430 / 360)).append(end).append("\r\n");
                    // TODO: 2019/4/17 450
                    sw450.append(start).append(String.format("%.2f", num * 450 / 360)).append(end).append("\r\n");
                    // TODO: 2019/4/17 470
                    sw470.append(start).append(String.format("%.2f", num * 470 / 360)).append(end).append("\r\n");
                    sw480.append(start).append(String.format("%.2f", num * 1.5 / 1.125)).append(end).append("\r\n");


                } else {
                    sw240.append(tempString).append("");
                    sw300.append(tempString).append("");
                    sw320.append(tempString).append("");
                    sw340.append(tempString).append("");
                    sw360.append(tempString).append("");
                    sw380.append(tempString).append("");
                    sw390.append(tempString).append("");
                    sw411.append(tempString).append("");
                    sw430.append(tempString).append("");
                    sw450.append(tempString).append("");
                    sw470.append(tempString).append("");
                    sw480.append(tempString).append("");
                }

                line++;

            }

            reader.close();

            String sw240file = "./app/src/main/res/values-sw240dp/dimens.xml";
            String sw300file = "./app/src/main/res/values-sw300dp/dimens.xml";
            String sw320file = "./app/src/main/res/values-sw320dp/dimens.xml";
            String sw340file = "./app/src/main/res/values-sw340dp/dimens.xml";
            String sw360file = "./app/src/main/res/values-sw360dp/dimens.xml";
            String sw380file = "./app/src/main/res/values-sw380dp/dimens.xml";
            String sw390file = "./app/src/main/res/values-sw390dp/dimens.xml";
            String sw411file = "./app/src/main/res/values-sw411dp/dimens.xml";
            String sw430file = "./app/src/main/res/values-sw430dp/dimens.xml";
            String sw450file = "./app/src/main/res/values-sw450dp/dimens.xml";
            String sw470file = "./app/src/main/res/values-sw470dp/dimens.xml";
            String sw480file = "./app/src/main/res/values-sw480dp/dimens.xml";
            //将新的内容，写入到指定的文件中去
            //writeFile(sw240file, sw240.toString());
            writeFile(sw300file, sw300.toString());
            writeFile(sw320file, sw320.toString());
            writeFile(sw340file, sw340.toString());
            writeFile(sw360file, sw360.toString());
            writeFile(sw380file, sw380.toString());
            writeFile(sw390file, sw390.toString());
            writeFile(sw411file, sw411.toString());
            writeFile(sw430file, sw430.toString());
            writeFile(sw450file, sw450.toString());
            writeFile(sw470file, sw470.toString());
            writeFile(sw480file, sw480.toString());

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (reader != null) {

                try {

                    reader.close();

                } catch (IOException e1) {

                    e1.printStackTrace();

                }

            }

        }

    }


    /**
     * 写入方法
     */

    public static void writeFile(String file, String text) {

        PrintWriter out = null;

        try {

            out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

            out.println(text);

        } catch (IOException e) {

            e.printStackTrace();

        }


        out.close();

    }

    public static void main(String[] args) {

        gen();

    }
}
