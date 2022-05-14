package chap14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        FileInputStream fis ;
        try {
            fis = new FileInputStream("a.txt");
            if (fis != null){
             try {
                 fis.close();
             } catch (IOException  e){
                 e.printStackTrace();
             }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("여기도 수행됩니다.");




//        내가 샘플로 만든 예제
//        int[] arr = new int[5];
//
//        String fileName = "a";
//
//        for (int i = 0; i < arr.length; i++) {
//            try {
//                FileInputStream fileInputStream = new FileInputStream(fileName + i);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//                System.out.println("파일이 없어요");
//            }
//            System.out.println("i : " + i);
//        }

    }
}
