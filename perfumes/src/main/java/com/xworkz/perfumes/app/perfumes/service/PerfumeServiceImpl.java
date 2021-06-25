package com.xworkz.perfumes.app.perfumes.service;

import com.xworkz.perfumes.app.perfumes.dao.PerfumeDAO;
import com.xworkz.perfumes.app.perfumes.dao.PerfumeDAOImpl;
import com.xworkz.perfumes.app.perfumes.dto.PerfumeDTO;

public class PerfumeServiceImpl implements PerfumeService {
	
	private PerfumeDAO pDAO;
	
	public PerfumeServiceImpl() {
		pDAO = new PerfumeDAOImpl();
		
	}

	public void validateAndSave(PerfumeDTO pDTO) {

		if(pDTO!=null) {
			
			pDAO.save(pDTO);
			
		}
	}

}
