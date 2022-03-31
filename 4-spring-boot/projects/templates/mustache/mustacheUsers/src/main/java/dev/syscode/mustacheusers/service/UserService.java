package dev.syscode.mustacheusers.service;

import dev.syscode.mustacheusers.bean.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    public long getCount() {
        List<User> users = new ArrayList<>();
        return users.size();
    }
}
