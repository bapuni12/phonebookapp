package com.nt.service;

import java.util.List;

import com.nt.domain.SsaWebDomain;

public interface SsaWebMgmtService {
	int savessaweb(SsaWebDomain domain);
	List<String> allstate();
}
