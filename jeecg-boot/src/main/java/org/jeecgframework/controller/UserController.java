package org.jeecgframework.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    // 模拟用户数据
    private static final List<Map<String, Object>> users = new ArrayList<>();

    static {
        Map<String, Object> user1 = new HashMap<>();
        user1.put("id", "1");
        user1.put("username", "admin");
        user1.put("name", "管理员");
        user1.put("email", "admin@example.com");
        users.add(user1);

        Map<String, Object> user2 = new HashMap<>();
        user2.put("id", "2");
        user2.put("username", "user");
        user2.put("name", "普通用户");
        user2.put("email", "user@example.com");
        users.add(user2);
    }

    @GetMapping
    public Map<String, Object> getUserList() {
        Map<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("message", "success");
        response.put("data", users);
        return response;
    }

    @PostMapping
    public Map<String, Object> addUser(@RequestBody Map<String, Object> user) {
        user.put("id", String.valueOf(users.size() + 1));
        users.add(user);
        Map<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("message", "success");
        response.put("data", user);
        return response;
    }

    @PutMapping("/{id}")
    public Map<String, Object> updateUser(@PathVariable String id, @RequestBody Map<String, Object> userData) {
        for (Map<String, Object> user : users) {
            if (id.equals(user.get("id"))) {
                user.putAll(userData);
                Map<String, Object> response = new HashMap<>();
                response.put("code", 200);
                response.put("message", "success");
                response.put("data", user);
                return response;
            }
        }
        Map<String, Object> response = new HashMap<>();
        response.put("code", 404);
        response.put("message", "User not found");
        return response;
    }

    @DeleteMapping("/{id}")
    public Map<String, Object> deleteUser(@PathVariable String id) {
        users.removeIf(user -> id.equals(user.get("id")));
        Map<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("message", "success");
        return response;
    }
}