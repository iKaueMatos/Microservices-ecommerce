package com.ikauedev.proxyclient.business.favourite.model.response;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;

import com.ikauedev.proxyclient.business.favourite.model.FavouriteDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FavouriteFavouriteServiceCollectionDtoResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Collection<FavouriteDto> collection;

}