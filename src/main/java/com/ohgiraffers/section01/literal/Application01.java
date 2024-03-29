package com.ohgiraffers.section01.literal;

public class Application01 {

    public static void main(String[] args) {
        System.out.println();

        /*수업목표. 여러 가지 값의 형태를 출력할 수 있다.*/

        /* 목차. 1. 숫자형태의 값 */
        System.out.println(123);

        /*목차 1-1 실수 형태의 값 출력*/
        System.out.println(1.23);

        /*목차 2. 문자 형태의 값 출력*/
        System.out.println('a');      // 문자의 형태의 값은 홀따음표(single - quotation)으로 감싸주어야 한다.
 //       System.out.println('ab');   // 두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
        //    System.out.println(''); // 아무 문자도 기록되지 않는 경우도 에러가 발생한다.
        System.out.println('1');      // 숫자 값 이지만 홀따음표로 감싸져 있는 경우는 문다 '1'이라고 판단한다.

        /*목차. 3. 문자열 형태의 값 출력*/
        System.out.println("안녕하세요 이도아 입니다.");
        // 문자열은 문자 여러 개가 난열 된 형태를 말하며 쌍따음표(double-quotation)으로 감싸주어야 한다.
        System.out.println("123"); // 정수 이지만 쌍따음표로 감싸져있기 때문에 문자열로 보아야 한다.
        System.out.println("");    // 아무 값도 없는 빈 쌍따음표도 문자열로 취급을 한다.
        System.out.println("a"); // 한 개의 문자도 쌍따음표로 감싸면 문자열이다. (문자 a와는 다른다.)


        /* 목차. 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println(false); // true 혹은 false 값을 논리형이라고 한다.

        /*;써야지 한문장이 끝났다 라는 뜻*/

        //       System.out.println('');
    }
}

// shift+f6 -> 이름 바꾸기
// shift+enter -> 줄바꿈
// shift+end -> 커서가 마지막으로 이동