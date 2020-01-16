package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.domain.SsaWebDomain;
import com.nt.entity.SsaWebEntity;
import com.nt.repository.SsaWebRepo;
import com.nt.repository.StateRepository;
@Service
public class SsaWebMgmtServiceImpl implements SsaWebMgmtService {
	
     @Autowired
	private SsaWebRepo repo;
     @Autowired
     private StateRepository srepo;
	@Override
	public int savessaweb(SsaWebDomain domain) {
		SsaWebEntity entity=null;
		entity= new SsaWebEntity();
		BeanUtils.copyProperties(domain, entity);
		SsaWebEntity save= repo.save(entity);
		return save.getSsaid();
		
	}
	@Override
	public List<String> allstate() {
		// TODO Auto-generated method stub
		return srepo.all
	}
	
	 
}
