package com.experience.dao;

import java.util.List;

import com.experience.entity.Rolepermission;

public interface RolePermissionDao {

	public Integer saveRolepermission(Rolepermission Rolepermission) throws Exception;

	public Rolepermission updateRolepermission(Rolepermission Rolepermission) throws Exception;

	public void deleteRolepermission(Rolepermission Rolepermission) throws Exception;

	public Rolepermission getRolepermission(Integer RolepermissionId) throws Exception;

	public List<Rolepermission> getRolepermissionList() throws Exception;
}
