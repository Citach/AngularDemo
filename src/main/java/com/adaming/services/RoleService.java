package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Role;
import com.adaming.entities.Utilisateur;
import com.adaming.repositories.RoleRepository;

@Service
public class RoleService implements IRoleService {
@Autowired
RoleRepository roleRepository;

	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role findOne(Long id) {
		// TODO Auto-generated method stub
		return roleRepository.findOne(id);
	}

	@Override
	public Role save(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void delete(Long id) {
roleRepository.delete(id);		
	}


}
