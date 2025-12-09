package com.xworkz.tvSystem.service;

import com.xworkz.tvSystem.dto.AddTvDTO;
import com.xworkz.tvSystem.dto.SearchTVDTO;

import java.util.Optional;

public interface ServiceInterface {

     boolean validateTvAndSave(AddTvDTO addTvDTO);

Optional<AddTvDTO> validForSearch(SearchTVDTO searchTVDTO);
}
