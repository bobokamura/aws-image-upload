package com.learn.awsimageupload.service;

import com.learn.awsimageupload.profile.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileDataAccessService userProfileDataAccessService;

    List<UserProfile> getUserProfiles() {
        return userProfileDataAccessService.getUserProfiles();
    }
}
