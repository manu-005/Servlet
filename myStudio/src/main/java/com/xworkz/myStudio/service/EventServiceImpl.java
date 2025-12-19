package com.xworkz.myStudio.service;

import com.xworkz.myStudio.dao.EventDAO;
import com.xworkz.myStudio.dao.EventDAOImpl;
import com.xworkz.myStudio.dto.EventDTO;
import com.xworkz.myStudio.dto.SearchOwnerNameDTO;

import java.util.List;
import java.util.Optional;

public class EventServiceImpl implements EventService {


    @Override
    public boolean checkAndSave(EventDTO eventDTO) {
boolean save = false;
        if (eventDTO !=null){

            if (eventDTO.getEventName().trim().isEmpty()){
                System.out.println("event name is not valid..");
            }else if (eventDTO.getDays() <= 0 || eventDTO.getDays() >=10){
                System.out.println("days must be more then zero or less than 10");
            }else if (eventDTO.getDate() == null ){
                System.out.println("date is not be null");
            }else if (eventDTO.getMobile() == 0 ){
                System.out.println("number must be valid");
            }else if (eventDTO.getOwnerName().trim().isEmpty()){
                System.out.println("name is not null");

            }else{

                EventDAO eventDAO = new EventDAOImpl();
             boolean saved =  eventDAO.save(eventDTO);

             if (saved){
                 System.out.println("saved succefully...");
                 save=true;
             }else{
                 System.out.println("not saved in service");
             }

            }
        }else {
            System.out.println("event dto null...");
        }

        if (save){
            return save;
        }else {

        return save;}


    }

    @Override
    public Optional<EventDTO> searchOwner(SearchOwnerNameDTO searchOwnerNameDTO) {

        if(searchOwnerNameDTO != null){

            if (searchOwnerNameDTO.getOName().trim().isEmpty()){

                System.out.println("Invalid name");
            }else {
                // call dao
                System.out.println("dao called");
                EventDAO eventDAO = new EventDAOImpl();
//
                Optional<EventDTO> fetched = eventDAO.searchByOwner(searchOwnerNameDTO);
                System.out.println("dao returned");

                if (fetched.isPresent()) {
                    return fetched;
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public List<EventDTO> updateByEvent(SearchOwnerNameDTO searchOwnerNameDTO) {
        if(searchOwnerNameDTO != null){

            if (searchOwnerNameDTO.getEvent().trim().isEmpty()){

                System.out.println("Invalid name");
            }else {
                // call dao
                System.out.println("dao called");
                EventDAO eventDAO = new EventDAOImpl();
//
                List<EventDTO> fetched = eventDAO.update(searchOwnerNameDTO);
                System.out.println("dao returned");

                if (fetched.isPresent()) {
                    return fetched;
                }
            }
        }
        return Optional.empty();



        return List.of();
    }


}


