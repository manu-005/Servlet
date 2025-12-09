package com.xworkz.tvSystem.service;

import com.xworkz.tvSystem.dao.AddTVDAOImpl;
import com.xworkz.tvSystem.dao.AddTVDAOInterface;
import com.xworkz.tvSystem.dto.AddTvDTO;
import com.xworkz.tvSystem.dto.SearchTVDTO;

import java.util.Optional;

public class ServiceImpl implements ServiceInterface {
    @Override
    public boolean validateTvAndSave(AddTvDTO addTvDTO) {
        boolean valid=false;
        if(addTvDTO !=null ) {

            if (addTvDTO.getId() <= 0) {
                System.out.println("id is invalid");
            } else if (addTvDTO.getName().trim().isEmpty()) {
                System.out.println("name is invalid");
            } else if (addTvDTO.getBrand().trim().isEmpty()) {
                System.out.println("brand is invalid");
            } else if (addTvDTO.getSize() <= 0) {
                System.out.println("size is invalid");
            } else {
                System.out.println("validation done and send to dao..");
//

         AddTVDAOInterface addTVDAOInterface = new AddTVDAOImpl();
          boolean saved = addTVDAOInterface.save(addTvDTO);
          if(saved){
              System.out.println("data saved in DB ..");
              valid = true;
          }else{
              System.out.println("data valid but not stored in DB");
          }

            }
        }
        return valid;
    }

    @Override
    public boolean validateTvAndUpdate(AddTvDTO addTvDTO) {


        boolean updated =false;
        if(addTvDTO !=null ) {

            if (addTvDTO.getId() <= 0) {
                System.out.println("id is invalid");
            } else if (addTvDTO.getName().trim().isEmpty()) {
                System.out.println("name is invalid");
            } else if (addTvDTO.getBrand().trim().isEmpty()) {
                System.out.println("brand is invalid");
            } else if (addTvDTO.getSize() <= 0) {
                System.out.println("size is invalid");
            } else {
                System.out.println("validation done and send to dao for update..");
//
                AddTVDAOInterface addTVDAOInterface = new AddTVDAOImpl();
                boolean update = addTVDAOInterface.update(addTvDTO);
                if(update){
                    System.out.println("data updated in DB ..");
                    updated = true;
                }else{
                    System.out.println("data valid but not updated in DB");
                }

            }
        }
        return updated;
    }

    @Override
    public Optional<AddTvDTO> validForSearch(SearchTVDTO searchTVDTO) {

        if(searchTVDTO.getName() != null){

            if (searchTVDTO.getName().trim().isEmpty() ){
                System.out.println("empty not allowed..");
            }else{
               AddTVDAOInterface fetch = new AddTVDAOImpl();

             Optional<AddTvDTO>    fetched =   fetch.fetchByName(searchTVDTO);
                System.out.println("valid and fetched data ..");
                System.out.println(fetched.isPresent());
                if (fetched.isPresent()){
                    return fetched;
                }

            }
        }else{
            System.out.println("name is not valid.. ");
        }


        return Optional.empty();
    }


}
