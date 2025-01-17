package org.example;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class Main {


  /**
   * 例外処理を行って、Java.txtもしくは、AWS.txtを作成する
   *
   * @param args
   * @author あっきー
   * @verson 2025/01/28
   */
  public static void main(String[] args) {

    try {
      // Java.txtのファイル作成
      Path path = Path.of("Java.txt");
      // ファイルが存在するか確認(例外を防ぐ)
//      if (!Files.exists(path)) {
//        Files.createFile(path);
//      } else {
//        System.out.println("ファイルは存在します");
//      }

      //　ファイルの作成時の最初の内容
      //Files.writeString(path, "Javaコース");

      // ファイルの内容を追加する
      Files.writeString(path, "Javaコースへようこそ", StandardOpenOption.APPEND);

      //　ファイルの内容を読み込んで、コンソールに表示する
      System.out.println(Files.readString(path));

    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("例外発生");
      try {
        // AWS.txtのファイルの作成
        Path newPath = Path.of("AWS.txt");

        // ファイルの内容を書き込み
        Files.writeString(newPath, "AWSコースへようこそ");

        //　ファイルの内容を読み込んで、コンソールに表示する
        System.out.println(Files.readString(newPath));

      } catch (IOException o) {
        o.printStackTrace();
        System.out.println("例外発生");
      }
    }


  }
}

