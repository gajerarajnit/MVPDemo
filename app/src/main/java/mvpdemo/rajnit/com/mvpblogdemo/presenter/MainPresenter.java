package mvpdemo.rajnit.com.mvpblogdemo.presenter;

import mvpdemo.rajnit.com.mvpblogdemo.view.activities.views.MainActivityView;

/**
 * Created by MVPBlogDemo on 05/06/18.
 */

public class MainPresenter extends AbstractPresenter {

    private MainActivityView mView;

    public MainPresenter(MainActivityView mView) {
        this.mView = mView;
    }


    public void startLoginActivity() {
        mView.showLoginActivity();
    }


}
