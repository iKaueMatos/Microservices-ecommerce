package com.ikauedev.favouriteservice.helper;

import com.ikauedev.favouriteservice.dto.FavouriteDto;
import com.ikauedev.favouriteservice.dto.ProductDto;
import com.ikauedev.favouriteservice.dto.UserDto;
import com.ikauedev.favouriteservice.entity.Favourite;

public class FavouriteMappingHelper {

    public static FavouriteDto map(final Favourite favourite) {
        return FavouriteDto.builder()
                .userId(favourite.getUserId())
                .productId(favourite.getProductId())
                .likeDate(favourite.getLikeDate())
                .userDto(
                        UserDto.builder()
                                .userId(favourite.getUserId())
                                .build())
                .productDto(
                        ProductDto.builder()
                                .productId(favourite.getProductId())
                                .build())
                .build();
    }

    public static Favourite map(final FavouriteDto favouriteDto) {
        return Favourite.builder()
                .userId(favouriteDto.getUserId())
                .productId(favouriteDto.getProductId())
                .likeDate(favouriteDto.getLikeDate())
                .build();
    }

}


