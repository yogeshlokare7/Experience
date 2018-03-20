package com.experience.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Rolepermission;

@Service
public interface RolePermissionService {


	public Integer saveRolepermission(Rolepermission Rolepermission) throws Exception;

	public Rolepermission updateRolepermission(Rolepermission Rolepermission) throws Exception;

	public void deleteRolepermission(Rolepermission Rolepermission) throws Exception;

	public Rolepermission getRolepermission(Integer RolepermissionId) throws Exception;

	public List<Rolepermission> getRolepermissionList() throws Exception;
	
}
