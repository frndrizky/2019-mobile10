package id.ac.polinema.skorbasket.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class SharedScore extends AndroidViewModel {

    private MutableLiveData<Integer> scoreHome;
    private MutableLiveData<Integer> scoreVisitor;
    private MutableLiveData<Boolean> winner;

    public SharedScore(@NonNull Application application) {
        super(application);
        scoreHome = new MutableLiveData<>();
        scoreVisitor = new MutableLiveData<>();
        winner = new MutableLiveData<>();
    }

    public LiveData<Integer> getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(Integer score) {
        this.scoreHome.setValue(score);
    }

    public LiveData<Integer> getScoreVisitor() {
        return scoreVisitor;
    }

    public void setScoreVisitor(Integer score) {
        this.scoreVisitor.setValue(score);
    }

    public LiveData<Boolean> getWinner() {
        return winner;
    }

    public void setWinner(Boolean result) {
        this.winner.setValue(result);
    }
}