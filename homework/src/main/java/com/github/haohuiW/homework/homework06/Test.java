package com.github.haohuiW.homework.homework06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Haohui
 */
public class Test {
    static Map<String, Set<User>> stringSetHashMap;
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User(0,"张三","哈尔滨"));
        users.add(new User(1,"李四","哈尔滨"));
        users.add(new User(2,"王五","华盛顿"));
        users.add(new User(3,"赵六","北京"));
        users.add(new User(4,"小白","北京"));
        users.add(new User(5,"小红","上海"));
        users.add(new User(6,"小绿","上海"));
        users.add(new User(7,"小黑","哈尔滨"));
        users.add(new User(8,"June","伦敦"));
        users.add(new User(9,"Mark","土耳其"));
        users.add(new User(10,"Will","华盛顿"));
        users.add(new User(11,"江户川柯南","东京"));
        users.add(new User(12,"工藤新一","东京"));
        toMap(users);
        stringSetHashMap.forEach((x,y)->{
            System.out.println(x+":");
            for (User user : y) {
                System.out.println("\t"+user.getId() + " " + user.getName());
            }
        });
    }
    private static void toMap(Set<User> users) {
        stringSetHashMap = new HashMap<>(100);
        for (User user : users) {
            stringSetHashMap.putIfAbsent(user.getCity(),new HashSet<>());
            stringSetHashMap.get(user.getCity()).add(user);
        }
    }
}
