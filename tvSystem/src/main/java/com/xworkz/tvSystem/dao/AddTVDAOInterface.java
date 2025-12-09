package com.xworkz.tvSystem.dao;

import com.xworkz.tvSystem.dto.AddTvDTO;
import com.xworkz.tvSystem.dto.SearchTVDTO;

import java.util.Optional;

public interface AddTVDAOInterface {

    boolean save(AddTvDTO addTvDTO);

    boolean update(AddTvDTO addTvDTO);

   Optional<AddTvDTO> fetchByName(SearchTVDTO searchTVDTO);
}
