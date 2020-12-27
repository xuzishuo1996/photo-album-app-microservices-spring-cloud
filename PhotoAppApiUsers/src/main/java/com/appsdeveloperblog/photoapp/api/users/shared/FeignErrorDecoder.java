package com.appsdeveloperblog.photoapp.api.users.shared;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

/* centralized Feign error decoder */
@Component
public class FeignErrorDecoder implements ErrorDecoder {

    private final Environment environment;

    @Autowired
    public FeignErrorDecoder(Environment environment) {
        this.environment = environment;
    }

    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()) {
            case 400: {
                // do something
                // return new BadRequestException();   // customized exception
                break;
            }
            case 404: {
                // do something
                if (methodKey.contains("getAlbums")) {  // methodKey = AlbumsServiceClient#getAlbums(String)
                    // Spring provides this exception
                    // return new ResponseStatusException(HttpStatus.valueOf(response.status()), "Users albums are not found!");
                    // store the property in the local config server
                    return new ResponseStatusException(HttpStatus.valueOf(response.status()), environment.getProperty("albums.exceptions.albums-not-found"));
                }
                break;
            }
            default: {
                return new Exception(response.reason());
            }
        }
        return null;
    }
}
