package com.carl;

import com.carl.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SteamTest {

    public List<User> buildUsers() {
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 2; i++) {
            User user = new User();
            user.setId((long) i);
            user.setName("carl" + i);
            user.setAge(18);
            users.add(user);
        }
        return users;
    }

    @Test
    public void listToMap() {
        List<User> users = buildUsers();
        Map<Long, User> map = users.stream().collect(Collectors.toMap(User::getId, Function.identity()));
        map.entrySet().forEach(System.out::println);
    }
}
