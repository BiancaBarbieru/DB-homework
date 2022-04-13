package com.example.tema8.service;

import com.example.tema8.model.User;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {
    public List<User>  filterByAge(List<User> users){
        Stream<User> stream = users.stream();
        return stream.filter((x) -> x.getAge() <18).collect(Collectors.toList());
    }

    public List<User> doubleTheAge(List<User> users){
        Stream<User> stream = users.stream();
        return stream.map((x) -> { x.setAge(x.getAge() * 2);
            return x;}).collect(Collectors.toList());
    }

    public User lastElement(List<User> users){
        Stream<User> stream = users.stream();
        return stream.reduce((first, second) -> second).get();
    }

    public List<User> sortAgeAsc(List<User> users){
        Stream<User> stream = users.stream();
        return stream.sorted(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        }).collect(Collectors.toList());
    }

    public User getTheYoungest(List<User> users){
        return sortAgeAsc(users).stream().findFirst().get();
    }

    public User getTheOldest(List<User> users){
        return sortAgeAsc(users).stream().reduce((first, second) -> second).get();
    }

    public List<User> removeDuplicates(List<User> users){
        return users.stream().distinct().collect(Collectors.toList());
    }

    public List<User> filterUsers(List<User> users){
        return sortAgeAsc(users.stream().filter((x) -> x.getAge() > 30).map((x) -> {x.setName(x.getName().toUpperCase());
            return x;}).collect(Collectors.toList()));
    }
}
