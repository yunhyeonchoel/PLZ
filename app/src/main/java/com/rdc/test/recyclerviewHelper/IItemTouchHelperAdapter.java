package com.rdc.test.recyclerviewHelper;


public interface IItemTouchHelperAdapter {

    void onItemMove(int fromPosition, int toPosition);


    void onItemDismiss(int position);
}
