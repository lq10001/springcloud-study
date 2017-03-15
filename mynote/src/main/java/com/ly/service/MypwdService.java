package com.ly.service;


import com.github.kevinsawicki.http.HttpRequest;
import org.springframework.stereotype.Service;

@Service
public class MypwdService {

    public String mypwd_list(){
        String response = HttpRequest.get("http://127.0.0.1:9000/mypwd?token=90b342e22b70ede27521bc8ab5b46915").body();
        return response;
    }


}
