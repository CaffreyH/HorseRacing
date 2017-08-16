package Simplecalculator;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Caffrey on 2017/8/11.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] num = line.split("[+-/;,?|*()^]");
        String[] operatand = line.split("[1234567890]");
        StringBuilder c = new StringBuilder();
        for(int i=0;i<operatand.length;i++)
        {
            System.out.println(operatand[i]);
        }

        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }

    }

    public static void calculateOnce(Stack<Integer> operands, Stack<Character> operators)
    {
        char operator = operators.pop();
        int operandB = operands.pop(), operandA = operands.pop();
        switch (operator) {
            case '+':
                operands.push(operandA + operandB);
                break;
            case '-':
                operands.push(operandA - operandB);
                break;
            case '*':
                operands.push(operandA * operandB);
                break;
            case '/':
                operands.push(operandA / operandB);
                break;
            case '^':
                int ret = 1;
                while (operandB-- > 0)
                    ret *= operandA;
                operands.push(ret);
                break;
        }
    }
}
