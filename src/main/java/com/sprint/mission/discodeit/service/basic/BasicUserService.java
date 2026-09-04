package com.sprint.mission.discodeit.service.basic;

import com.sprint.mission.discodeit.entity.NitroLevel;
import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.repository.UserRepository;
import com.sprint.mission.discodeit.service.UserService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

public class BasicUserService implements UserService {
    private final UserRepository userRepository;

    public BasicUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User create(String email, String password, String name, NitroLevel nitroLevel) {
        User user = new User(email,password,name,nitroLevel);
        return userRepository.save(user);
    }

    @Override
    public User read(UUID id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("유저 id 없음 : " + id));
    }

    @Override
    public List<User> readAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(UUID id, String email, String password, String name, NitroLevel nitroLevel) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("유저 id 없음 : " + id));
        user.update(email, password, name, nitroLevel);
        return userRepository.save(user);
    }

    @Override
    public void delete(UUID id) {
        if (!userRepository.existsById(id)) {
            throw new NoSuchElementException("유저 id 없음 : " + id);
        }
        userRepository.deleteById(id);
    }
}
