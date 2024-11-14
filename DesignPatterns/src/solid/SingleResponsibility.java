/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

/**
 *
 * @author fawad
 */
class User{
    
}
class UserRepository {
    public void saveUser(User user) {
        
    }
}

class UserController1 {
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.saveUser(user);
    }
}
