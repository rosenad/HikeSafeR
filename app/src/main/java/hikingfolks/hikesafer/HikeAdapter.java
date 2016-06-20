package hikingfolks.hikesafer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by adirosen on 6/19/16.
 */


public class HikeAdapter extends BaseExpandableListAdapter {
    private Context context;
    private HashMap<String, List<String>> hikeMap;
    private List<String> region;

    public HikeAdapter(Context context, HashMap<String, List<String>> hashMap, List<String> list){
        this.context = context;
        hikeMap = hashMap;
        region = list;

    }


    @Override
    public int getChildrenCount(int groupPosition) {
        return this.hikeMap.get(this.region.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.region.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.hikeMap.get(this.region.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public int getGroupCount() {
        return this.region.size();
    }



    @Override
    public View getGroupView(int groupPostition, boolean isExpanded, View convertView, ViewGroup parent){
        String groupTitle = (String) getGroup(groupPostition);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.region_list_header, parent, false);
        }
        TextView parentTextView = (TextView) convertView.findViewById(R.id.listHeader);
        parentTextView.setText(groupTitle);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String childTitle = (String) getChild(groupPosition, childPosition);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.region_item, parent, false);
        }
        TextView parentTextView = (TextView) convertView.findViewById(R.id.item_text);
        parentTextView.setText(childTitle);
        return convertView;
    }

}
