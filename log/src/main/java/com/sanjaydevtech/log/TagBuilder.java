package com.sanjaydevtech.log;


public final class TagBuilder {

    StackTraceElement stackTrace() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        if (stackTraceElements.length < 3) {
            return null;
        }
        return stackTraceElements[2];
    }

    String tag(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();

        String[] packages = stackTraceElement.getClassName().split("\\.");
        String className = packages[packages.length-1];

        stringBuilder.append(className);

        return stringBuilder.toString();
    }
}
