package com.sbs.repositories;

import com.sbs.models.Bet;
import com.sbs.models.Coupon;
import com.sbs.models.Match;

import java.util.*;

public interface CouponRepository {
    Coupon addBet(Coupon coupon, Bet bet);

    Coupon removeBet(String betName);

    Coupon addCoupon(Coupon coupon);

    Coupon sendCoupon(Coupon coupon);

    List<Coupon> getCoupons();

    Coupon findById(Long id);

}
