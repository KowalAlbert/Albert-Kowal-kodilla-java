package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int identificator;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int postAmount;

    public ForumUser(final int identificator, final String userName, final char gender, final LocalDate birthDate, final int postAmount) {
        this.identificator = identificator;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.postAmount = postAmount;
    }

    public int getIdentificator() {
        return identificator;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostAmount() {
        return postAmount;
    }

    @Override
    public String toString() {
        return "Forum User {" +
                "identificator = " + identificator +
                ", user name = '" + userName + '\'' +
                ", gender = '" + gender + '\'' +
                ", date of birth = " + birthDate +
                ", amount of posts = " + postAmount +
                '}';
    }
}
