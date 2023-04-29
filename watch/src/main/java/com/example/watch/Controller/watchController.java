package com.example.watch.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.watch.Model.watch;
import com.example.watch.Service.watchService;

@RestController
public class watchController {

	@Autowired
	watchService watchservice;
	 
	 @GetMapping(value="/fetchwatch")
	 public List<watch> getAllwatch(      )
	 {
		 List<watch> watchList=watchservice.getAllwatch();
		 return watchList;
	 }



	 @PostMapping(value="/savewatch")
	 public watch savewatch(@RequestBody watch s)
	 {
		 return watchservice.savewatch(s);
	 }
	 @PutMapping(value="/updatewatch")
	 public watch updatewatch(@RequestBody watch s)
	 {
		 return watchservice.updatewatch(s);
	 }
	 @DeleteMapping(value="/deletewatch/{ModelNo}")
	 public void deletewatch(@PathVariable("ModelNo") int modelNo )
	 {
		 watchservice.deletewatch(modelNo);
	 }
	//sorting
	 
	 @GetMapping("/sortwatch/{field}")
	 public List<watch>sortwatch(@PathVariable String field)
	 {
	 	return watchservice.sortwatch(field);
	 }

	 ///pagination

//	      http://localhost:8080/pageStudents/0/1

	 @GetMapping("/pagingwatch/{offset}/{pageSize}")
	 public List<watch> pagingwatch(@PathVariable int offset,@PathVariable int pageSize)
	 {
	 	return watchservice.pagingwatch(offset,pageSize);
	 }
	 
	 //paging and sorting
	 
	 @GetMapping("/pagingAndSortingwatch/{offset}/{pageSize}/{field}")

	 public List<watch> pagingAndSortingwatch(@PathVariable int offset,
	 		@PathVariable int pageSize,
	 		@PathVariable String field) 
	 {
	 	return watchservice .pagingAndSortingwatch(offset, pageSize, field);
	 }
	 }

