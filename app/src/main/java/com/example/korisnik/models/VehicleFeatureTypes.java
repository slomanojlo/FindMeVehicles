package com.example.korisnik.models;

import java.util.List;

/**
 * Created by jovanazivkovic on 11/10/2017.
 */

public class VehicleFeatureTypes {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getVehicle_type_id() {
        return vehicle_type_id;
    }

    public void setVehicle_type_id(int vehicle_type_id) {
        this.vehicle_type_id = vehicle_type_id;
    }

    public boolean isMultiselectable() {
        return multiselectable;
    }

    public void setMultiselectable(boolean multiselectable) {
        this.multiselectable = multiselectable;
    }

    public boolean isSearchable() {
        return searchable;
    }

    public void setSearchable(boolean searchable) {
        this.searchable = searchable;
    }

    public boolean isExclusive_search() {
        return exclusive_search;
    }

    public void setExclusive_search(boolean exclusive_search) {
        this.exclusive_search = exclusive_search;
    }

    public boolean isIn_listing_key_spec() {
        return in_listing_key_spec;
    }

    public void setIn_listing_key_spec(boolean in_listing_key_spec) {
        this.in_listing_key_spec = in_listing_key_spec;
    }

    int id;
    String name;
    int order;
    int vehicle_type_id;
    boolean multiselectable;
    boolean searchable;
    boolean exclusive_search;
    boolean in_listing_key_spec;

    public List<Features> getFeaturesList() {
        return featuresList;
    }

    public void setFeaturesList(List<Features> featuresList) {
        this.featuresList = featuresList;
    }

    List<Features> featuresList;
}
