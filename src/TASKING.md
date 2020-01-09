## FizzBuzz Tasking

1. given 报数仅报1-9的单个数字

   1. when 输入非3/5/7的单个数字
      then 输出数字本身

   2. when 输入3

      then 输出Fizz

   3. when 输入5

      then 输出Buzz

   4. when 输入7

      then 输出Whizz

2. given 报数数字范围限定在[10-120]，

   1. 倍数情况

      1. when 输入非3/5/7的倍数

         then  输出数字本身

      2. when 输入非5/7仅3的倍数

         then 输出Fizz

      3. when 输入非3/7仅5的倍数

         then 输出Buzz

      4. when 输入非3/5仅7的倍数

         then 输出Whizz

      5. when 输入非7仅3、5倍数

         then 输出FizzBuzz

      6. when 输入非5仅3、7倍数

         then 输出FizzWhizz

      7. when 输入非3仅3、5倍数

         then 输出BuzzWhizz

      8. when 输入3、5、7共同倍数

         then 输出FizzBuzzWhizz

   2. 数字包含3/5/7情况

      1. given 非3/5/7倍数包含3/5/7

         1. 包含3或7

            1. when 输入13

               then 输出Fizz

            2. when 输入17

               then 输入Whizz

          2. 包含两个数字

             1. when 输入37

                then 输出FizzWhizz

            3. when 输入53

               then 输出FizzBuzz

      2. given 3/5/7倍数包含3/5/7

         1. 仅包含3

            when 输入30

            then 输出Fizz

         2. 包含5

            when 输入35

            then 输出BuzzWhizz

         3. 包含7

            when 输入75

            then 输出Fizz
