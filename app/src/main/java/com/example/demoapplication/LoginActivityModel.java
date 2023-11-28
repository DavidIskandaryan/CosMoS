package com.example.demoapplication;

import android.util.Log;

import com.example.demoapplication.baseClasses.UserData;
import com.example.demoapplication.baseClasses.UserType;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

public class LoginActivityModel extends AuthModel {
    public LoginActivityModel() {super();}
    public void createNewUser(String email, String password, OnCompleteListener<AuthResult> listener) {
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(listener);
    }

    public void createNewUserData(FirebaseUser user, UserType userType) {
        String uid = user.getUid();
        UserData userData = new UserData(uid, userType);
        DatabaseReference target = UserData.parentRef.child(uid);
        setRef(target, userData);
    }

    public void signIn(String email, String password, OnCompleteListener<AuthResult> listener) {
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(listener);
    }
}
