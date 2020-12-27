package com.appsdeveloperblog.photoapp.api.users.data;

import com.appsdeveloperblog.photoapp.api.albums.ui.model.AlbumResponseModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@FeignClient(name="albums-ws", fallback=AlbumsFallback.class)
public interface AlbumsServiceClient {

    @GetMapping(path="/users/{id}/albums")
    List<AlbumResponseModel> getAlbums(@PathVariable("id") String id);
}

@Component
class AlbumsFallback implements AlbumsServiceClient {

    @Override
    public List<AlbumResponseModel> getAlbums(String id) {
        return new ArrayList<>();
    }
}
