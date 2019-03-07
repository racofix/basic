package com.dintech.architecture.http;

public interface CallbackEvent<T> {

    void done(T body);

    void fail(String message);
}
