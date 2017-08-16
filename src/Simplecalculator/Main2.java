package Simplecalculator;

/**
 * Created by Caffrey on 2017/8/11.
 */
import java.io.*;
import java.util.*;

public class Main2 {
    public static void calculateOnce(Stack<Integer> operands,
                                     Stack<Character> operators) {
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] priorityMap = new int[256];
        priorityMap['+'] = 1;
        priorityMap['-'] = 1;
        priorityMap['*'] = 2;
        priorityMap['/'] = 2;
        priorityMap['^'] = 3;
        while (sc.hasNextLine()) {
            String formula = sc.nextLine();
            Stack<Integer> operands = new Stack<Integer>();
            Stack<Character> operators = new Stack<Character>();
            char[] chs = new char[formula.length() + 1];
            System.arraycopy(formula.toCharArray(), 0, chs, 0, formula.length());
            chs[formula.length()] = '=';
            int num = 0;
            for (char c : chs) {
                switch (c) {
                    case '(':
                        operators.push(c);
                        continue;
                    case ')':
                        operands.push(num);
                        while (operators.peek() != '(') {
                            calculateOnce(operands, operators);
                        }
                        operators.pop();
                        num = operands.pop();
                        continue;
                    case '^':
                    case '*':
                    case '/':
                    case '+':
                    case '-':
                    case '=':
                        operands.push(num);
                        num = 0;
                        break;
                    default:
                        num *= 10;
                        num += c - '0';
                        continue;
                }
                while (!operators.isEmpty()
                        && priorityMap[c] <= priorityMap[operators.peek()])
                    calculateOnce(operands, operators);
                operators.push(c);
            }
            System.out.println(operands.peek());
        }
    }
}