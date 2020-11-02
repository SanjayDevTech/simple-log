package com.sanjaydevtech.log;

import android.util.Log;

public final class Cout {

    private static boolean isEnabled = false;
    private static final TagBuilder tagBuilder = new TagBuilder();
    public static final int NO_OUTPUT = -1;

    private Cout() {
    }

    public static void init(boolean isEnabled) {
        Cout.isEnabled = isEnabled;
    }

    public static int w(String msg) {
        if (isEnabled) {
            StackTraceElement stackTraceElement = tagBuilder.stackTrace();
            return Log.w(tagBuilder.tag(stackTraceElement), msg);
        }
        return NO_OUTPUT;
    }

    public static int w(String msg, Throwable tr) {
        if (isEnabled) {
            StackTraceElement stackTraceElement = tagBuilder.stackTrace();
            return Log.w(tagBuilder.tag(stackTraceElement), msg, tr);
        }
        return NO_OUTPUT;
    }

    public static int d(String msg) {
        if (isEnabled) {
            StackTraceElement stackTraceElement = tagBuilder.stackTrace();
            return Log.d(tagBuilder.tag(stackTraceElement), msg);
        }

        return NO_OUTPUT;
    }

    public static int d(String msg, Throwable tr) {
        if (isEnabled) {
            StackTraceElement stackTraceElement = tagBuilder.stackTrace();
            return Log.d(tagBuilder.tag(stackTraceElement), msg, tr);
        }
        return NO_OUTPUT;
    }

    public static int i(String msg) {
        if (isEnabled) {
            StackTraceElement stackTraceElement = tagBuilder.stackTrace();
            return Log.i(tagBuilder.tag(stackTraceElement), msg);
        }
        return NO_OUTPUT;
    }

    public static int i(String msg, Throwable tr) {
        if (isEnabled) {
            StackTraceElement stackTraceElement = tagBuilder.stackTrace();
            return Log.i(tagBuilder.tag(stackTraceElement), msg, tr);
        }
        return NO_OUTPUT;
    }

    public static int e(String msg) {
        if (isEnabled) {
            StackTraceElement stackTraceElement = tagBuilder.stackTrace();
            return Log.e(tagBuilder.tag(stackTraceElement), msg);
        }
        return NO_OUTPUT;
    }

    public static int e(String msg, Throwable tr) {
        if (isEnabled) {
            StackTraceElement stackTraceElement = tagBuilder.stackTrace();
            return Log.e(tagBuilder.tag(stackTraceElement), msg, tr);
        }
        return NO_OUTPUT;
    }

    public static int v(String msg) {
        if (isEnabled) {
            StackTraceElement stackTraceElement = tagBuilder.stackTrace();
            return Log.v(tagBuilder.tag(stackTraceElement), msg);
        }
        return NO_OUTPUT;
    }

    public static int v(String msg, Throwable tr) {
        if (isEnabled) {
            StackTraceElement stackTraceElement = tagBuilder.stackTrace();
            return Log.v(tagBuilder.tag(stackTraceElement), msg, tr);
        }
        return NO_OUTPUT;
    }

}
