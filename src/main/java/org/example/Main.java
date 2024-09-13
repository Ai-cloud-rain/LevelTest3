//Mainクラス
package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main{
  public static void main(String[] args) {
    // 正規表現パターン: 070, 080, 090から始まり、ハイフンで区切られた4桁-4桁の形式
    String regex = "^(070|080|090)-\\d{4}-\\d{4}$";
    Pattern pattern = Pattern.compile(regex);

    // ユーザーからの入力
    Scanner scanner = new Scanner(System.in);
    System.out.print("携帯電話番号を入力してください: ");
    String phoneNumber = scanner.nextLine();

    // 正規表現でのチェック
    Matcher matcher = pattern.matcher(phoneNumber);

    // 結果の表示
    if (matcher.matches()) {
      System.out.println(phoneNumber + " は有効な携帯電話番号です。");
    } else {
      System.out.println(phoneNumber + " は無効な携帯電話番号です。");
    }

    scanner.close();
  }
}