package com.hpw.myapp.ui.home.model;

import com.hpw.myapp.DataServer;
import com.hpw.myapp.ui.home.contract.QuickContract;

import java.util.List;

/**
 * Created by hpw on 16/11/1.
 */

public class QuickModel implements QuickContract.Model {
    @Override
    public List<Status> getData() {
        return DataServer.getSampleData(6);
    }
}