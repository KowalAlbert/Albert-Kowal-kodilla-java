package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(0001, "Andrzej Andrusiewicz",
                'M', LocalDate.of(1990, 01, 01), 0));
        theUserList.add(new ForumUser(0002, "Barbara Bydgoszcz",
                'F', LocalDate.of(2004, 01, 01), 1));
        theUserList.add(new ForumUser(0003, "Celina Cebula",
                'F', LocalDate.of(1997, 01, 01), 2));
        theUserList.add(new ForumUser(0004, "Dariusz Drzewo",
                'M', LocalDate.of(2006, 01, 01), 3));
        theUserList.add(new ForumUser(0005, "Eryk Ellon",
                'M', LocalDate.of(1998, 01, 01), 4));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
