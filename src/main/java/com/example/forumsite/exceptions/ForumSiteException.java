package com.example.forumsite.exceptions;

public class ForumSiteException extends RuntimeException {
    public ForumSiteException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public ForumSiteException(String exMessage) {
        super(exMessage);
    }
}