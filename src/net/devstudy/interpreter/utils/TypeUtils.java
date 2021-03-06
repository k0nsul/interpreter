package net.devstudy.interpreter.utils;

public class TypeUtils {

    public static String getType(Object value) {
        return value == null ? "null" : value.getClass().getSimpleName().toLowerCase();
    }
}
