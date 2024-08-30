package com.ikauedev.favouriteservice.repository;

import com.ikauedev.favouriteservice.entity.Favourite;
import com.ikauedev.favouriteservice.entity.id.FavouriteId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FavouriteRepository extends JpaRepository<Favourite, FavouriteId> {

}
