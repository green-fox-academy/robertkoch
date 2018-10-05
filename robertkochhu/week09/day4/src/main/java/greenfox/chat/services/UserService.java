package greenfox.chat.services;


import greenfox.chat.models.User;

public interface UserService {
    public void save(String username);
    public void update(String updateName);
    public boolean isThereAnyone();
    public User userFinder();

}
