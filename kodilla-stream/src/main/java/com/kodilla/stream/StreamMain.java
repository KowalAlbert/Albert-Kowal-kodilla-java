package com.kodilla.stream;

import java.util.Map;
import java.util.stream.Collectors;
import com.kodilla.stream.forumuser.*;

public class StreamMain {

    public static void main(String[] args) {
         Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(forumuser -> forumuser.getGender() == 'M')
                .filter(forumuser -> forumuser.getBirthDate().getYear() < 2003)
                .filter(forumuser -> forumuser.getPostAmount() > 0)
                .collect(Collectors.toMap(ForumUser::getIdentificator, forumuser -> forumuser));

        System.out.println("Existing elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}