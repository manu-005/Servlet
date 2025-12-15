package com.xworkz.myStudio.service;

import com.xworkz.myStudio.dto.EventDTO;
import com.xworkz.myStudio.dto.SearchOwnerNameDTO;

import java.util.Optional;

public interface EventService {

     boolean checkAndSave(EventDTO eventDTO);

    Optional<EventDTO> searchOwner(SearchOwnerNameDTO searchOwnerNameDTO);
}
