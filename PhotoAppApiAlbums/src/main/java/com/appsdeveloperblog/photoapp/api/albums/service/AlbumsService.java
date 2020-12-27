package com.appsdeveloperblog.photoapp.api.albums.service;

import com.appsdeveloperblog.photoapp.api.albums.data.AlbumEntity;
import java.util.List;

public interface AlbumsService {
    List<AlbumEntity> getAlbums(String userId);
}
