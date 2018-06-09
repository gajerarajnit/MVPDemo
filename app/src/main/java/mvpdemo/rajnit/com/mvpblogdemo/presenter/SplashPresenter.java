package mvpdemo.rajnit.com.mvpblogdemo.presenter;

import mvpdemo.rajnit.com.mvpblogdemo.view.activities.views.SplashActivityView;

/**
 * Created by MVPBlogDemo on 05/06/18.
 */

public class SplashPresenter extends AbstractPresenter {

    private SplashActivityView mView;

    public SplashPresenter(SplashActivityView mView) {
        this.mView = mView;
    }


    public void startLoginActivity() {
        mView.showLoginActivity();
    }
}
