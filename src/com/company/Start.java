package com.company;

// Статический импорт:
import static javax.swing.JOptionPane.*;
class Demo{
    public static void main(String[] args){
// Текстовые переменные:
        String txt,str;
// Отображение окна с полем ввода:
        txt=showInputDialog("Введите текст:");
// Целочисленная переменная:
        int size=txt.length();
// Символьные переменные:
        char A=txt.charAt(0);
        char B=txt.charAt(size-1);
// Формируется значение текстовой переменной:
        str="Текст: "+txt+"\n";
        str+="Символов в тексте: "+size+"\n";
        str+="Первый символ: "+A+"\n";
        str+="Последний символ: "+B;
// Отображение диалогового окна:
        showMessageDialog(null,str);
    }
}