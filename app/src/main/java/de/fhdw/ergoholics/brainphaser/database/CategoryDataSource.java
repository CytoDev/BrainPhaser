package de.fhdw.ergoholics.brainphaser.database;

import de.fhdw.ergoholics.brainphaser.model.Category;

import java.util.List;

/**
 * Created by funkv on 20.02.2016.
 */
public class CategoryDataSource {
    public static List<Category> getAll() {
        return DaoManager.getSession().getCategoryDao().loadAll();
    }

    public static long create(Category category) {
        return DaoManager.getSession().getCategoryDao().insert(category);
    }
}