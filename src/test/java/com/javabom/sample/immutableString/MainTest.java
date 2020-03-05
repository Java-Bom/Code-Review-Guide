package com.javabom.sample.immutableString;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jyami on 2020/03/04
 */
class MainTest {

    @Test
    @DisplayName("a의 주소값이 같을까?")
    void hashCodePrint() {
        String a = "a";
        String b = "b";

        System.out.printf("String a : hashcode = %d\n", a.hashCode());
        System.out.printf("String b : hashcode = %d\n", b.hashCode());

        a = a + b;
        System.out.printf("String a : hashcode = %d\n", a.hashCode());
        System.out.printf("String b : hashcode = %d\n", b.hashCode());
    }

    @Test
    @DisplayName("stringBuilder의 string 생성시간이 더 작다")
    void stringBuilder() {

        long stringAddStart = System.nanoTime();
        String test1 = "";
        for(int i =0; i<100 ; i++){
            test1 += "javabom";
        }
        long stringAddTotalTime = System.nanoTime() - stringAddStart;

        long stringBuilderStart = System.nanoTime();
        StringBuilder test2 = new StringBuilder();
        for(int i =0; i<100 ; i++){
            test2.append("javabom");
        }
        long stringBuilderTotalTime = System.nanoTime() - stringBuilderStart;

        System.out.printf("string + operation time %d\n", stringAddTotalTime);
        System.out.printf("stringBuilder operation time %d\n", stringBuilderTotalTime);

        assertThat(test1).isEqualTo(test2.toString());
        assertThat(stringAddTotalTime > stringBuilderTotalTime).isTrue();
    }
}