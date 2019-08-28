package com.rahulhegde.conneqtyou.core.users.add;

import android.content.Context;

import com.google.firebase.auth.FirebaseUser;

/*
    Created by Rahul Hegde
                            -- Conneqt You :)
*/

public interface AddUserContract {
    interface View {
        void onAddUserSuccess(String message);

        void onAddUserFailure(String message);
    }

    interface Presenter {
        void addUser(Context context, FirebaseUser firebaseUser);
    }

    interface Interactor {
        void addUserToDatabase(Context context, FirebaseUser firebaseUser);
    }

    interface OnUserDatabaseListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}
