package org.gfg.UserCreation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

//@FeignClient(name = "wallet-service", url = "http://localhost:8082")
@FeignClient(name = "WALLETCREATION")
public interface WalletClient {

    @PostMapping("/addWallet")
    WalletDTO addWallet(@RequestBody WalletDTO dto, @RequestHeader String requestId);
}

