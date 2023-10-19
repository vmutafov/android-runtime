package org.nativescript;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tns.embedding.CallbacksStore;
import com.tns.embedding.EmbeddableFragmentCallbacks;

public class NativeScriptFragment extends Fragment {

    private final EmbeddableFragmentCallbacks callbacks = CallbacksStore.getFragmentCallbacks();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        callbacks.setFragment(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.main_fragment, container, false);

        try {
            View nsView = callbacks.onCreateView(inflater, container, savedInstanceState);
            System.out.println(nsView);
            return nsView;
        } catch (Exception e) {
            throw e;
        }

//        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        callbacks.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        try {
            callbacks.onDestroyView();
        } finally {
            super.onDestroyView();
        }
    }
}
