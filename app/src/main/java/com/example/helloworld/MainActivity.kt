package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("---------Hello world")
        println("-------f(x) = x + 1, f(3) = " + f(3))  // 4
        println("-------sum(3, 4) = " + sum(3, 4))  // 7
        println("-------printSum(7, 8) = " + printSum(sum(3, 4), 8))  // 15

        val a: Int = 1  // 선언과 즉시 할당
        val b = 2   // Int 타입으로 자동으로 추론론
        val c: Int  // 초기화를 하지 않을 때는 타입을 반드시 선언
        c = 3       // 나중에 할당 가능

        println("a=$a, b=$b, c=$c") // a=1, b=2, c=3

        var x = 5
        x += 1

        println("x=$x") // 6

        //val y = 6
        //y += 1

        var aa = 1
        // 템플릿에 들어간 간단한 형태
        val s1 = "aa is $aa"

        aa = 2
        // 임의로 만든 템플릿 형태, 코드가 동작함
        val s2 = "${s1.replace("is", "was")}, but now is $aa"
        println(s2);

        println("-------maxOf(3, 4) = " + maxOf(3, 4))  // 4
        println("-------maxOf(7, 5) = " + maxOf(7, 5))  // 7

        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }

        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }

    private fun f(x: Int): Int {
        return x + 1
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

}