package com.example.recyclerviewdemo.repository;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.recyclerviewdemo.dao.FoodDao;
import com.example.recyclerviewdemo.db.AppDatabase;
import com.example.recyclerviewdemo.model.Food;

import java.util.List;

public class FoodRepository
{
  private  FoodDao foodDao;
  private LiveData<List<Food>> foodListLiveData;


    public FoodRepository(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        foodDao = db.foodDao();
        foodListLiveData = foodDao.getAllFood();
    }

    public LiveData<List<Food>> getAllFood() {
        return foodListLiveData;
    }

    public AsyncTask<Food, Void, Void> insert (Food food) {
      return  new insertAsyncTask(foodDao).execute(food);
    }

    private static class insertAsyncTask extends AsyncTask<Food, Void, Void> {

        private FoodDao mAsyncTaskDao;

        insertAsyncTask(FoodDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Food... params)
        {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
