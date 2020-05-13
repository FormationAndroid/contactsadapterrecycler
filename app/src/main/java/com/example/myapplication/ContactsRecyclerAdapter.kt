package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_contact.view.*

class ContactsRecyclerAdapter(private val contacts: List<Contact>)
    : RecyclerView.Adapter<ContactViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ContactViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(contactViewHolder: ContactViewHolder, position: Int) {
        contactViewHolder.bind(contacts[position])
    }

    override fun getItemCount() = contacts.size

}

class ContactViewHolder(inflater: LayoutInflater, parent: ViewGroup)
    : RecyclerView.ViewHolder(inflater.inflate(R.layout.item_contact, parent, false)){

    fun bind(contact: Contact){
        itemView.apply {
            textName.text = contact.name
            textAge.text = contact.age.toString()
            layoutUser.alpha = if (contact.isValid) 1f else 0.5f
            imgPhoto.setImageDrawable(ContextCompat.getDrawable(context, contact.photo))
        }
    }

}