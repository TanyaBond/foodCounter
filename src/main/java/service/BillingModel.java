package service;

import com.google.inject.Binder;
import com.google.inject.Module;
import service.Impl.DishServiceImpl;

public class BillingModel implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(DishService.class).to(DishServiceImpl.class);
    }
}
