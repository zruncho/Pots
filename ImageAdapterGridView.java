package com.example.potatos;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.firestore.DocumentSnapshot;

import java.util.LinkedHashMap;
import java.util.Map;


public class ImageAdapterGridView extends BaseAdapter {
    private Context mContext;
    private Map<String,Map<String,Object>> mdev;
    private Integer[] imID1 = {R.drawable.mob, R.drawable.tab};

    public ImageAdapterGridView(Context gc, Map<String,Map<String,Object>> cmdev) {
        mContext = gc;
        this.mdev = cmdev;
        }

    public int getCount() {
        return mdev.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View cview, ViewGroup parent) {
        ImageView miv;
        TextView mtv;
        View v;

        if(cview==null){
            cview = View.inflate(mContext,R.layout.gric, null);

            String key = (String) mdev.keySet().toArray()[position];

            ImageView iv = (ImageView)cview.findViewById(R.id.simg);
            iv.setImageResource(imID1[(boolean) mdev.get(key).get("atype")? 1 : 0 ]);

            TextView tv = (TextView)cview.findViewById(R.id.sdata);
            tv.setText(key);

        }
        return cview;
    }
}
