package org.gfg.UserCreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private WalletClient walletClient;

//    @Autowired
//    private RestTemplate restTemplate;

    public UserService(WalletClient walletClient){
        this.walletClient = walletClient;
    }


    public UserDTO addUser(UserDTO userDTO, String requestId) {

        User user = new User(userDTO.getUserName(), userDTO.getRollNo());
        user = userRepository.save(user);
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("requestId",requestId);
//        HttpEntity<WalletDTO> httpEntity = new HttpEntity<>(walletDTO, httpHeaders);
//        restTemplate.postForEntity("http://localhost:8082/addWallet", httpEntity, WalletDTO.class).getBody();
        WalletDTO walletDTO = new WalletDTO(UUID.randomUUID().toString(), 50, user.getId());
        walletDTO = walletClient.addWallet(walletDTO, requestId);
        return new UserDTO(user.getName(), user.getRollNo());
    }
}
