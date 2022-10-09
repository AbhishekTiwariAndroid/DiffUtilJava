package dev.abhishektiwari.diffjava.apputil;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

import java.util.ArrayList;

import dev.abhishektiwari.diffjava.Contact;

public class MyDiffUtilCallbacks extends DiffUtil.Callback {

    ArrayList<Contact> oldContacts = new ArrayList<>( );
    ArrayList<Contact> newContacts = new ArrayList<>( );

    public MyDiffUtilCallbacks(ArrayList<Contact> oldContacts, ArrayList<Contact> newContacts) {
        this.oldContacts = oldContacts;
        this.newContacts = newContacts;
    }

    @Override
    public int getOldListSize() {
        return oldContacts != null ? oldContacts.size( ) : 0;
    }

    @Override
    public int getNewListSize() {
        return newContacts != null ? newContacts.size( ) : 0;
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        int result = newContacts.get(newItemPosition).compareTo(oldContacts.get(oldItemPosition));
        if (result == 0)

            return true;

        return false;
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {


        Contact newContact = newContacts.get(newItemPosition);
        Contact oldContact = oldContacts.get(oldItemPosition);


        Bundle bundle = new Bundle( );

        if (!newContact.getName( ).equals(oldContact.getName( ))) {
            bundle.putString("name", newContact.getName( ));
        }

        if (!newContact.getPhone( ).equals(oldContact.getPhone( ))) {
            bundle.putString("phone", newContact.getPhone( ));
        }

        if (bundle.size( ) == 0)
            return null;


        return bundle;
    }
}
