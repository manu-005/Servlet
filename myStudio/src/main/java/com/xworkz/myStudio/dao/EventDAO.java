package com.xworkz.myStudio.dao;

import com.xworkz.myStudio.dto.EventDTO;
import com.xworkz.myStudio.dto.SearchOwnerNameDTO;

import java.util.List;
import java.util.Optional;

public interface EventDAO {

    boolean save(EventDTO eventDTO);

    Optional<EventDTO> searchByOwner(SearchOwnerNameDTO searchOwnerNameDTO);

//    List<EventDTO> update(SearchOwnerNameDTO searchOwnerNameDTO);
}
