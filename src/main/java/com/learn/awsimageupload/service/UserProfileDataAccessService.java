package com.learn.awsimageupload.service;

import com.learn.awsimageupload.datastore.FakeUserProfileDataStore;
import com.learn.awsimageupload.profile.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    @Autowired
    private FakeUserProfileDataStore fakeUserProfileDataStore;

    List<UserProfile> getUserProfiles() {
        return fakeUserProfileDataStore.getUserProfiles();
    }
}
