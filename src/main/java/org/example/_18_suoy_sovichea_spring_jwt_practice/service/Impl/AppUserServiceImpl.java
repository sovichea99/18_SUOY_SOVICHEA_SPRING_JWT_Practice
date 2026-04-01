package org.example._18_suoy_sovichea_spring_jwt_practice.service.Impl;

import lombok.RequiredArgsConstructor;
import org.example._18_suoy_sovichea_spring_jwt_practice.repository.AppUserRepository;
import org.example._18_suoy_sovichea_spring_jwt_practice.service.AppUserService;
import org.jspecify.annotations.NullMarked;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository appUserRepository;

    public AppUserServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
//    private final PasswordEncoder passwordEncoder;
//    private final ModelMapper modelMapper;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return appUserRepository.getUserByEmail(email);
    }

//    @Override
//    public AppUserResponse register(AppUserRequest request) {
//        request.setPassword(passwordEncoder.encode(request.getPassword()));
//        AppUser appUser = appUserRepository.register(request);
//        for (String role : request.getRoles()){
//            if (role.equals("ROLE_USER")){
//                appUserRepository.insertUserIdAndRoleId(1L, appUser.getUserId());
//            }
//            if (role.equals("ROLE_ADMIN")){
//                appUserRepository.insertUserIdAndRoleId(2L, appUser.getUserId());
//            }
//        }
//        return modelMapper.map(appUserRepository.getUserById(appUser.getUserId()), AppUserResponse.class);
//    }
}
