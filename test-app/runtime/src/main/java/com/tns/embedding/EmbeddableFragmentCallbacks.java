package com.tns.embedding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public abstract class EmbeddableFragmentCallbacks {

    private Fragment fragment;

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public abstract View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    );

    public abstract void onViewCreated(
            View view,
            Bundle savedInstanceState
    );

    public abstract void onDestroyView();

//    public java.lang.String toString();
//
//    public void onHiddenChanged(boolean param_0);
//
//    public android.animation.Animator onCreateAnimator(int param_0, boolean param_1, int param_2);
//
//    public void onCreate(android.os.Bundle param_0);
//
//    public android.view.View onCreateView(
//            android.view.LayoutInflater param_0,
//            android.view.ViewGroup param_1,
//            android.os.Bundle param_2);
//
//    public void onResume();
//
//    public void onSaveInstanceState(android.os.Bundle param_0);
//
//    public void onPause();
//
//    public void onStop();
//
//    public void onDestroyView();
//
//    public void onDestroy();
}
