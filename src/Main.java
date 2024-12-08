import view.Viewer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //region the standard task

//        Напишите программу, которая использует Stream API
//        для обработки списка чисел. Программа должна вывести
//        на экран среднее значение всех четных чисел в списке.

        List<Integer> listOfNumbers = Arrays.asList(21, 11, 6, 7, 13, 15, 2, 10);
        System.out.println(listOfNumbers.stream().filter(num -> (num % 2) == 0)
                .reduce(0, Integer::sum) /
                listOfNumbers.stream().filter(num -> (num % 2) == 0).count());

        //endregion

        //region the seminar task

/*
  Задача: Техническое задание на разработку информационной системы UMarket
  Вам доверено спроектировать и реализовать классы предметной области,
  которые позволят в дальнейшем вести разработку ИС со следующим функционалом:

  1. Осуществлять учет продовольственных и непродовольственных товаров, которыми торгует UMarket

  2. Предоставлять покупателям возможность фильтрации продовольственных товаров по следующим видам:
    * Снеки;
    * Полуфабрикаты;
    * Продукты для приготовления;
    * Все продовольственные товары.

  3. Формировать онлайн корзину из продовольственных товаров.

  4. Осуществлять балансировку онлайн корзин с целью получения такого набора продуктов питания,
       который включает все основные питательные элементы.


  Особенности бизнес-логики сервиса UMarket.

  Модуль онлайн покупок должен осуществлять контроль за попадающими в покупательскую корзину продуктами, а именно:
    * в онлайн корзину можно добавить только продовольственные товары;
    * в зависимости от желания покупателя, в онлайн корзине могут находиться как все присутствующие в UMarket
        продовольственные товары, так и исключительно товары той категории,
        которую выбрал покупатель посредством настроек фильтрации (фильтрация по видам продовольственных товаров).

  Необходимо предусмотреть типобезопасность онлайн корзины, так как в момент "автоматической балансировки" она
  должна пополняться продовольственными товарами из списка товаров U-Market СФУ.
  Необходимо учесть, что в случае формирования онлайн корзины конкретного вида продовольственных товаров,
  дополнять корзину необходимо товарами именно из выбранной покупателем категории продовольственных товаров.

  С целью упрощения алгоритма балансировки онлайн корзины, будем считать, что каждый продовольственный
  продукт содержит всего лишь один питательный элемент: белки / жиры / углеводы.
  Следовательно, есть вероятность, что все выбранные товары будут представителями
  одного и того же питательного элемента (например, углеводными).
  В свою очередь, балансировка делает так, чтобы в корзине были представлены все питательные элементы.

 */

        Viewer.start();

        //endregion

    }
}