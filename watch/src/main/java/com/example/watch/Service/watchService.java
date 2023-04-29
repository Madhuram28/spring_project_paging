package com.example.watch.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;



import com.example.watch.Model.watch;
import com.example.watch.Repository.watchRepository;

@Service
public class watchService {
    @Autowired
    
    watchRepository watchrepository;
	
	public List<watch> getAllwatch()
	{
		List<watch>watchList=watchrepository.findAll();
		return watchList;
	}
	public watch savewatch(watch s) {
		return watchrepository.save(s);
	}
	public watch updatewatch(watch s) {
		return watchrepository.save(s);
	}
	public void deletewatch(int modelNo) {
		 watchrepository.deleteById(modelNo);
	}
	
	//sorting
	public List<watch> sortwatch(String field)
	 {
		//ascending findAll(sort sort) and no change in controller method for both//
		 return watchrepository.findAll(Sort.by(field));
		 
		 //descending findAll(Sort.by(Direction,field))
		 //return watchrepository .findAll(Sort.by(Direction.DESC, field));
	 }
	 
	 
	 //pagination
	 
	 public List<watch> pagingwatch(int offset,int pageSize)
	 {
		 Pageable paging=PageRequest.of(offset,pageSize);
		 Page<watch> studData=watchrepository.findAll(paging);
		 List<watch>studList=studData.getContent();
		 return studList;
	 }
	 //paging and sorting
	 public List<watch> pagingAndSortingwatch(int offset,int pageSize,String field) {
			Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
				Page<watch> stud=watchrepository.findAll(paging);
				return stud.getContent();
			}
}
