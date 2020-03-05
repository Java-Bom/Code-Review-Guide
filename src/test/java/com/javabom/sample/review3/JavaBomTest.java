package com.javabom.sample.review3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JavaBomTest {

    @DisplayName("인스턴스 변수는 인스턴스별로 할당된다")
    @Test
    void instance() {
        JavaBom javaBom1 = new JavaBom();
        JavaBom javaBom2 = new JavaBom();

        javaBom1.setContents("javabomSet1");
        javaBom2.setContents("javabomSet2");

        assertThat(javaBom1.getContents()).isNotEqualTo(javaBom2.getContents());
    }

    @DisplayName("클래스변수는 모든 인스턴스가 공유한다.")
    @Test
    void classValue() {
        JavaBom javaBom1 = new JavaBom();
        JavaBom javaBom2 = new JavaBom();

        javaBom1.setName("javabom1");
        javaBom1.setName("javabom2");

        assertThat(javaBom1.getName()).isEqualTo(javaBom2.getName());
        assertThat(javaBom1.getName()).isEqualTo("javabom2");
    }

    @Test
    void test() {
        JavaBom javaBom = new JavaBom();
        javaBom.printName();

        JavaBom.printMessage();
    }


}
