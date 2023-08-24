package com.Husky.spring6.Service;
import com.Husky.spring6.Dao.customerDao;
import com.Husky.spring6.Dao.vipDao;

public class userService {
    private customerDao ud;
    private vipDao vd;
    public void setCustomerDao(customerDao ud){
        this.ud=ud;
    }
    public userService() {
    }
    public userService(vipDao vd) {
        this.vd = vd;
    }
    public void saveCustomerDao(){
        ud.insert();
        vd.insert();
    }
}
