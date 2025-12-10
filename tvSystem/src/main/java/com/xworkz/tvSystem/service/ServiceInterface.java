package com.xworkz.tvSystem.service;

import com.xworkz.tvSystem.dto.AddTvDTO;
import com.xworkz.tvSystem.dto.SearchTVDTO;

import java.util.List;
import java.util.Optional;

public interface ServiceInterface {

     boolean validateTvAndSave(AddTvDTO addTvDTO);

     boolean validateTvAndUpdate(AddTvDTO addTvDTO);

Optional<AddTvDTO> validForSearch(SearchTVDTO searchTVDTO);

    default List<AddTvDTO> validForBrand(SearchTVDTO searchTVDTO) {
        return null;
    }
}
