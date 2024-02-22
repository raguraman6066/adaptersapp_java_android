package com.example.adaptersapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
// 4 methods need to implement
public class MyCustomAdapter extends BaseAdapter {
    //context-bridget between application code and os , allow u to interact with system,access resources
    private Context context;
    //data source
    private String[] items;
//constructor
    public MyCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }


    //1.return number of items in data source, tell adapter to create how many items it should create views
    @Override
    public int getCount() {
        return items.length;
    }
    //2.get data item at specific position within our data source
    @Override
    public Object getItem(int position) {
        return items[position];
    }
    //3. returns a unique id for the item at the given position
    @Override
    public long getItemId(int position) {
        return position;
    }
    //4. displays the data at a position in the data set - creating and returning the view
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //convertview-is a recycled view that you can reuse to improve the performance of your list.
        ViewHolder holder;//static view holder class
        if(convertView==null){//create new view
           convertView= LayoutInflater.from(context).inflate(R.layout.my_list_item,parent,false);
           holder=new ViewHolder();
           holder.textView=convertView.findViewById(R.id.tv);
           convertView.setTag(holder);
        }else{
            //reuse the view
            holder=(ViewHolder) convertView.getTag();//gettag-get previous viewholder objects
        }
        holder.textView.setText(items[position]);
        return convertView;
    }

    static class ViewHolder{
        TextView textView;
    }
}
