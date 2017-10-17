package com.example.korisnik.models;

/**
 * Created by jovanazivkovic on 11/10/2017.
 */

public class Features {

    int id;
    String name;
    int order;
    int vehicle_feature_type_id;

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

    public int getVehicle_feature_type_id() {
        return vehicle_feature_type_id;
    }

    public void setVehicle_feature_type_id(int vehicle_feature_type_id) {
        this.vehicle_feature_type_id = vehicle_feature_type_id;
    }


}
