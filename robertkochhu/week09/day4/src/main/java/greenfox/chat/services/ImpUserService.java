package greenfox.chat.services;

import greenfox.chat.models.User;
import greenfox.chat.repositories.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpUserService implements UserService {
    UserRepository userRepository;

    public ImpUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(String username) {
        userRepository.save(new User(username));
    }

    @Override
    public void update(String updateName) {
        User user = userRepository.findById((long) 1).orElseThrow(IllegalAccessError::new);
        user.setUsername(updateName);
        userRepository.save(user);
    }

    @Override
    public boolean isThereAnyone() {
        if (userRepository.findById(1L).isPresent()){
            return true;
        }
        return false;
    }

    @Override
    public User userFinder() {
        return userRepository.findById(1L).orElse(null);
    }
}
