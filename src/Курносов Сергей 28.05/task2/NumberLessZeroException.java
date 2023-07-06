package task2;

import java.io.IOException;

public class NumberLessZeroException extends IOException {
    public NumberLessZeroException(String message) {
        super(message);
    }
}