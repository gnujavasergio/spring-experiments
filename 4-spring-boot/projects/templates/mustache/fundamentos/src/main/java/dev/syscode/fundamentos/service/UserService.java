package dev.syscode.fundamentos.service;

import dev.syscode.fundamentos.bean.User;
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
