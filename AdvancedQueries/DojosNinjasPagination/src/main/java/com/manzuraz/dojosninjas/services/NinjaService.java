package com.manzuraz.dojosninjas.services;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.manzuraz.dojosninjas.models.Ninja;
import com.manzuraz.dojosninjas.repositories.DojoRepo;
import com.manzuraz.dojosninjas.repositories.NinjaRepo;

@Service
@Transactional
public class NinjaService {
	    @Autowired 
	    NinjaRepo ninjaRepo;
	
	    // static variable to set the number of ninjas that we want per page
	    private static final int PAGE_SIZE = 1;
	    public Page<Object[]> dojoninjasPerPage(int pageNumber) {
	        // get all the ninjas page and sort them in ascending order the last name property
	        PageRequest pageRequest = new PageRequest(pageNumber, PAGE_SIZE, Sort.Direction.ASC, "dojo");
//	        Page<Ninja> ninjas = ninjaRepo.ninjaDojos(pageRequest);
	        return ninjaRepo.ninjaDojos(pageRequest);
	    }
	}
