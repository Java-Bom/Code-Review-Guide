package com.javabom.sample.review3;

public class JavaBom {
    private static final String ALIAS = "Javabom"; // 클래스변수, 상수변수

    private static String name = "InitialName";  // 클래스 변수
    private String contents = "InitialContents"; // 인스턴스 변수

    public static void printMessage() {
        System.out.println(name);
//        System.out.println(contents); 컴파일에러 !!
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        JavaBom.name = name;
    }

    public void printName() {
        System.out.println(name);
        System.out.println(contents);
    }

    public void hello() {
        String javabom = "Hello, Javabom!"; // 지역변수
        System.out.println(javabom);
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

}
