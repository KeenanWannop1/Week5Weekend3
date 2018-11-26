package com.example.admin.week5weekend.utils;

import com.example.admin.week5weekend.model.data.LocationResponse;

public interface LatLngCallback {

    void onSuccess(LocationResponse locationResponse);

    void onFailure(String error);
}
