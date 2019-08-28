package com.rahulhegde.conneqtyou.core.logout;

/*
    Created by Rahul Hegde
                            -- Conneqt You :)
*/

public interface LogoutContract {
    interface View {
        void onLogoutSuccess(String message);

        void onLogoutFailure(String message);
    }

    interface Presenter {
        void logout();
    }

    interface Interactor {
        void performFirebaseLogout();
    }

    interface OnLogoutListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}
