package com.example.potatos;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import static com.example.potatos.MainActivity.Group;
import static com.example.potatos.MainActivity.fdb;


public class ViewModelLiveData extends ViewModel {
        private static final FirebaseFirestore mDatabase = fdb;
        private final FirestoreQueryLiveData liveData = new FirestoreQueryLiveData(mDatabase.collection(Group));

        @NonNull
        public LiveData<QuerySnapshot> getdataSnapshotLiveData(){
            return liveData;
        }

}

