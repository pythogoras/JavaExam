# JavaExam

## Компіляція та запуск програми

Для компіляції використовуємо команду _javac_
**>>> javac namefile.java**

> щоб вжити цю команду треба перейти в терміналі до теки, яка в собі містить файли, які будемо компілювати

Якщо маємо декілька файлів в одній теці
**>>> javac namefile1.java namefile2.java namefile3.java**

Після вдалої компіляції повинні зявитися в тій самій теці однойменні файли із розширенням .class

Для запуску програми використовуємо команду _java_
**>>> java -classpath C:\..\..\JavaExam com.src.task1.Main**

*C:\..\..\JavaExam* - шлях до теки проекту JavaExam 
*com.src.task1.Main* - шлях та пакет(визначений в коді як ```package com.src.task1;```) до кореневого файлу Main

Кореневий файл це файл який містить клас з функцією ```public static void main(String[] args)```
З кореневого файлу компілятор починає читати нашу програму
Імя кореневого файлу може мати будь яке імя, головне щоб в ньому була функція ```public static void main(String[] args)```
Імя файлу повинно буто однойменно з іменем класу в цьому файлі

### Приклад на основі завдання task1

**>>> javac Main.java MutateText.java**
**>>> java -classpath C:\..\..\JavaExam com.src.task1.Main**
> замість C:\..\..\JavaExam може бути ваш шлях наприклад C:\sser\student\javaproject\JavaExam
