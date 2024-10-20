package calculator;

import input.InputHandler;

public class Application {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        inputHandler.setInputString(); // 문자열 받는 메서드

        inputHandler.ensureCustomDelimiter();// 커스텀 구분자가 있는 지 확인
        inputHandler.extractNumbers();
        inputHandler.printResult();

    }
}
