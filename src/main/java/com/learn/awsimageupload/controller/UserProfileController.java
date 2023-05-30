package com.learn.awsimageupload.controller;

import com.learn.awsimageupload.profile.UserProfile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/vi/user-profile")
public class UserProfileController {

    public List<UserProfile> getUserProfiles() {
        return null;
    }
}
