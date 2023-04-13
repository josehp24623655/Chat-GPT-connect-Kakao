package com.example.chatbot.kakao;

import java.util.Map;

public class UserRequest {
    private String timezone;
    private Map<String, Object> params;
    private Block block;
    private String utterance;
    private String lang;
    private User user;

    @Override
    public String toString() {
        return "UserRequest{" +
                "timezone='" + timezone + '\'' +
                ", params=" + params +
                ", block=" + block +
                ", utterance='" + utterance + '\'' +
                ", lang='" + lang + '\'' +
                ", user=" + user +
                '}';
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public String getUtterance() {
        return utterance;
    }

    public void setUtterance(String utterance) {
        this.utterance = utterance;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}