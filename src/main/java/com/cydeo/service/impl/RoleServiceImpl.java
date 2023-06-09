package com.cydeo.service.impl;

import com.cydeo.mapper.MapperUtil;
import com.cydeo.repository.RoleRepository;
import com.cydeo.service.RoleService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final MapperUtil mapperUtil;

    public RoleServiceImpl(RoleRepository roleRepository, MapperUtil mapperUtil) {
        this.roleRepository = roleRepository;
        this.mapperUtil = mapperUtil;

    }


//    @Override
//    public RoleDto findById(Long id) {
//        Optional<Role> role = roleRepository.findById(id);
//        return mapperUtil.convert(role, new RoleDto());
//    }
//
//    @Override
//    public List<RoleDto> listAllRoles() {
//        if (securityService.getLoggedInUser().getRole().getDescription().equals("Root User")) {
//            return roleRepository.findAll().stream()
//                    .filter(role -> role.getDescription().equals("Admin"))
//                    .map(role -> mapperUtil.convert(role, new RoleDto()))
//                    .collect(Collectors.toList());
//        } else {
//            return roleRepository.findAll().stream()
//                    .filter(role -> !role.getDescription().equals("Root User"))
//                    .map(role -> mapperUtil.convert(role, new RoleDto()))
//                    .collect(Collectors.toList());
//        }
//    }
}
