/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.recurly.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.joda.time.DateTime;
import com.google.common.base.Objects;

import java.util.List;

/**
 * Class that represents the Concept of a Coupon within the Recurly API.
 */
@XmlRootElement(name = "coupon")
public class Coupon extends RecurlyObject {

    @XmlTransient
    public static final String COUPON_RESOURCE = "/coupons";

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "coupon_code")
    private String couponCode;

    /**
     * Last date to redeem the coupon, defaults to no date
     */
    @XmlElement(name = "redeem_by_date")
    private DateTime redeemByDate;

    /**
     * Number of months after redemption that the coupon is valid, defaults to no date
     */
    @XmlElement(name = "applies_for_months")
    private Integer appliesForMonths;

    /**
     * Maximum number of accounts that may use the coupon before it can no longer be redeemed
     */
    @XmlElement(name = "max_redemptions")
    private Integer maxRedemptions;

    /**
     * The coupon is valid for all plans if true, defaults to true
     */
    @XmlElement(name = "applies_to_all_plans")
    private Boolean appliesToAllPlans;

    /**
     * If true, the coupon applies to the first invoice only
     */
    @XmlElement(name = "single_use")
    private Boolean singleUse;

    /**
     * "percent" or "dollars"
     */
    @XmlElement(name = "discount_type")
    private String discountType;

    /**
     * "day" or "week" or "month"
     */
    @XmlElement(name = "free_trial_unit")
    private String freeTrialUnit;

    @XmlElement(name = "free_trial_amount")
    private Integer freeTrialAmount;

    /**
     * Discount percentage if discount_type is "percent"
     */
    @XmlElement(name = "discount_percent")
    private Integer discountPercent;

    @XmlElement(name = "discount_in_cents")
    private RecurlyUnitCurrency discountInCents;

    @XmlElement(name = "state")
    private String state;

    @XmlElement(name = "created_at")
    private DateTime createdAt;

    @XmlElement(name = "updated_at")
    private DateTime updatedAt;

    public List<String> getPlanCodes() {
        return planCodes;
    }

    public void setPlanCodes(List<String> planCodes) {
        this.planCodes = planCodes;
    }

    @XmlElement( name="plan_code" )
    @XmlElementWrapper( name="plan_codes" )
    private List<String> planCodes;

    public String getState() {
        return state;
    }

    public void setState(final Object state) {
        this.state = stringOrNull(state);
    }

    /**
     * Gets the name of the {@link Coupon}
     *
     * @return The {@link Coupon} name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the {@link Coupon}
     *
     * @param name The Name that is to be given to the {@link Coupon}
     */
    public void setName(final Object name) {
        this.name = stringOrNull(name);
    }

    /**
     * Gets the coupon code for a {@link Coupon}
     *
     * @return The coupon code for the {@link Coupon}
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Sets the coupon code for the {@link Coupon}
     *
     * @param couponCode The coupon code
     */
    public void setCouponCode(final Object couponCode) {
        this.couponCode = stringOrNull(couponCode);
    }

    /**
     * Sets the discount type for a {@link Coupon}
     *
     * @param discountType A String of: 'percent'; 'dollars';
     */
    public void setDiscountType(final Object discountType) {
        this.discountType = stringOrNull(discountType);
    }

    /**
     * Gets the discount type associated with the {@link Coupon}
     *
     * @return A String defining the discount type: 'percent' or 'dollars'.
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Gets the percentage discount for a coupon
     *
     * @return The percentage
     */
    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(final Object discountPercent) {
        this.discountPercent = integerOrNull(discountPercent);
    }

    public DateTime getRedeemByDate() {
        return redeemByDate;
    }

    public void setRedeemByDate(final Object redeemByDate) {
        this.redeemByDate = dateTimeOrNull(redeemByDate);
    }

    public Integer getAppliesForMonths() {
        return appliesForMonths;
    }

    public void setAppliesForMonths(final Object appliesForMonths) {
        this.appliesForMonths = integerOrNull(appliesForMonths);
    }

    public Integer getMaxRedemptions() {
        return maxRedemptions;
    }

    public void setMaxRedemptions(final Object maxRedemptions) {
        this.maxRedemptions = integerOrNull(maxRedemptions);
    }

    public Boolean getSingleUse() {
        return singleUse;
    }

    public void setSingleUse(final Object singleUse) {
        this.singleUse = booleanOrNull(singleUse);
    }

    public RecurlyUnitCurrency getDiscountInCents() {
        return discountInCents;
    }

    public void setDiscountInCents(final Object discountInCents) {
        this.discountInCents = RecurlyUnitCurrency.build(discountInCents);
    }

    public Boolean getAppliesToAllPlans() {
        return appliesToAllPlans;
    }

    public void setAppliesToAllPlans(final Object appliesToAllPlans) {
        this.appliesToAllPlans = booleanOrNull(appliesToAllPlans);
    }

    public String getFreeTrialUnit() {
        return freeTrialUnit;
    }

    public void setFreeTrialUnit(final String freeTrialUnit) {
        this.freeTrialUnit = stringOrNull(freeTrialUnit);
    }

    public Integer getFreeTrialAmount() {
        return freeTrialAmount;
    }

    public void setFreeTrialAmount(final Object freeTrialAmount) {
        this.freeTrialAmount = integerOrNull(freeTrialAmount);
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final Object createdAt) {
        this.createdAt = dateTimeOrNull(createdAt);
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(final Object updatedAt) {
        this.updatedAt = dateTimeOrNull(updatedAt);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Coupon");
        sb.append("{name='").append(name).append('\'');
        sb.append(", couponCode='").append(couponCode).append('\'');
        sb.append(", discountType='").append(discountType).append('\'');
        sb.append(", discountPercent='").append(discountPercent).append('\'');
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Coupon coupon = (Coupon) o;

        if (appliesForMonths != null ? !appliesForMonths.equals(coupon.appliesForMonths) : coupon.appliesForMonths != null) {
            return false;
        }
        if (appliesToAllPlans != null ? !appliesToAllPlans.equals(coupon.appliesToAllPlans) : coupon.appliesToAllPlans != null) {
            return false;
        }
        if (couponCode != null ? !couponCode.equals(coupon.couponCode) : coupon.couponCode != null) {
            return false;
        }
        if (createdAt != null ? createdAt.compareTo(coupon.createdAt) != 0 : coupon.createdAt != null) {
            return false;
        }
        if (discountInCents != null ? !discountInCents.equals(coupon.discountInCents) : coupon.discountInCents != null) {
            return false;
        }
        if (discountPercent != null ? !discountPercent.equals(coupon.discountPercent) : coupon.discountPercent != null) {
            return false;
        }
        if (discountType != null ? !discountType.equals(coupon.discountType) : coupon.discountType != null) {
            return false;
        }
        if (maxRedemptions != null ? !maxRedemptions.equals(coupon.maxRedemptions) : coupon.maxRedemptions != null) {
            return false;
        }
        if (name != null ? !name.equals(coupon.name) : coupon.name != null) {
            return false;
        }
        if (redeemByDate != null ? redeemByDate.compareTo(coupon.redeemByDate) != 0 : coupon.redeemByDate != null) {
            return false;
        }
        if (singleUse != null ? singleUse.compareTo(coupon.singleUse) != 0 : coupon.singleUse != null) {
            return false;
        }
        if (freeTrialUnit != null ? !freeTrialUnit.equals(coupon.freeTrialUnit) : coupon.freeTrialUnit != null) {
            return false;
        }
        if (freeTrialAmount != null ? !freeTrialAmount.equals(coupon.freeTrialAmount) : coupon.freeTrialAmount != null) {
            return false;
        }
        if (updatedAt != null ? updatedAt.compareTo(coupon.updatedAt) != 0 : coupon.updatedAt != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
                name,
                couponCode,
                discountType,
                discountPercent,
                discountInCents,
                redeemByDate,
                singleUse,
                appliesForMonths,
                appliesToAllPlans,
                maxRedemptions,
                freeTrialUnit,
                freeTrialAmount,
                createdAt,
                updatedAt
        );
    }
}
