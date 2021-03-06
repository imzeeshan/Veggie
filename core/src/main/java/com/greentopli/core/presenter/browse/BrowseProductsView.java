package com.greentopli.core.presenter.browse;

import com.greentopli.core.presenter.base.MvpView;
import com.greentopli.model.Product;

import java.util.List;

/**
 * Created by rnztx on 13/10/16.
 */

public interface BrowseProductsView extends MvpView {
	void showEmpty(boolean show);

	void showError(String message);

	void showProducts(List<Product> list);
}
