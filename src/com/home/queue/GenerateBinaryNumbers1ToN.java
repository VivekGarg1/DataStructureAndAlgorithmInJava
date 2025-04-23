package com.home.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class GenerateBinaryNumbers1ToN {

    public String[] generateBinaryNumbers(int n){
        String[] result = new String[n];
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for (int i = 0 ; i< n ; i++){
            result[i] = queue.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            queue.offer(n1);
            queue.offer(n2);
        }
        return result;
    }

    public String[] generateBinaryNumbersUsingCustomQueue(int n){
        String[] result = new String[n];
        ImplementationOfQueue<String> queue = new ImplementationOfQueue<>();
        queue.enqueue("1");
        for (int i = 0 ; i< n ; i++){
            result[i] = queue.dequeue();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            queue.enqueue(n1);
            queue.enqueue(n2);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] result = new GenerateBinaryNumbers1ToN().generateBinaryNumbers(5);
        Stream<String> stream = Arrays.stream(result);
        stream.forEach(System.out::println);

        System.out.println("--------------------------------------");

        String[] resultFromCustomQueue = new GenerateBinaryNumbers1ToN().generateBinaryNumbersUsingCustomQueue(5);
        Stream<String> streamCustomResult = Arrays.stream(resultFromCustomQueue);
        streamCustomResult.forEach(System.out::println);
    }
}
