package com.task3;

public interface MailBox<T> {
    String getTo();
    String getFrom();
    T getContent();
}
