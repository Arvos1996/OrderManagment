package de.santax.ordermanagement.order;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "dryingorder")
public class DryingOrder extends Order {


    public Long dryingOrderId;
    public Date createDateOrder;
    public String userAuthor;
    public String settlement;
    public String streetName;
    public Long postalCode;
    public String orderPlace;
    @Enumerated(EnumType.STRING)
    public TypeOfOrder typeOfOrder;
    public Date createDateOrderType;
    @Enumerated(EnumType.STRING)
    public EntranceType entranceType;
    @Enumerated(EnumType.STRING)
    public DamageType damageType;
    public String damageNumber;
    public String insuranceNumber;
    public boolean releasedOrder;
    public boolean closedOrder;
    @ManyToOne
    @JoinColumn(name = "orderId" , insertable = false, updatable = false)
    public Order order;

    public DryingOrder() {

    }

    public DryingOrder(Long dryingOrderId, Date createDateOrder, String userAuthor, String settlement, String streetName, Long postalCode, String orderPlace, TypeOfOrder typeOfOrder, Date createDateOrderType, EntranceType entranceType, DamageType damageType, String damageNumber, String insuranceNumber, boolean releasedOrder, boolean closedOrder) {
        this.dryingOrderId = dryingOrderId;
        this.createDateOrder = createDateOrder;
        this.userAuthor = userAuthor;
        this.settlement = settlement;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.orderPlace = orderPlace;
        this.typeOfOrder = typeOfOrder;
        this.createDateOrderType = createDateOrderType;
        this.entranceType = entranceType;
        this.damageType = damageType;
        this.damageNumber = damageNumber;
        this.insuranceNumber = insuranceNumber;
        this.releasedOrder = releasedOrder;
        this.closedOrder = closedOrder;
    }

    public DryingOrder(Date createDateOrder, String userAuthor, String settlement, String streetName, Long postalCode, String orderPlace, TypeOfOrder typeOfOrder, Date createDateOrderType, EntranceType entranceType, DamageType damageType, String damageNumber, String insuranceNumber, boolean releasedOrder, boolean closedOrder) {
        this.createDateOrder = createDateOrder;
        this.userAuthor = userAuthor;
        this.settlement = settlement;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.orderPlace = orderPlace;
        this.typeOfOrder = typeOfOrder;
        this.createDateOrderType = createDateOrderType;
        this.entranceType = entranceType;
        this.damageType = damageType;
        this.damageNumber = damageNumber;
        this.insuranceNumber = insuranceNumber;
        this.releasedOrder = releasedOrder;
        this.closedOrder = closedOrder;
    }

    public Long getDryingOrderId() {
        return dryingOrderId;
    }

    public void setDryingOrderId(Long dryingOrderId) {
        this.dryingOrderId = dryingOrderId;
    }

    public Date getCreateDateOrder() {
        return createDateOrder;
    }

    public void setCreateDateOrder(Date createDateOrder) {
        this.createDateOrder = createDateOrder;
    }

    public String getUserAuthor() {
        return userAuthor;
    }

    public void setUserAuthor(String userAuthor) {
        this.userAuthor = userAuthor;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public String getOrderPlace() {
        return orderPlace;
    }

    public void setOrderPlace(String orderPlace) {
        this.orderPlace = orderPlace;
    }

    public TypeOfOrder getTypeOfOrder() {
        return typeOfOrder;
    }

    public void setTypeOfOrder(TypeOfOrder typeOfOrder) {
        this.typeOfOrder = typeOfOrder;
    }

    public Date getCreateDateOrderType() {
        return createDateOrderType;
    }

    public void setCreateDateOrderType(Date createDateOrderType) {
        this.createDateOrderType = createDateOrderType;
    }

    public EntranceType getEntranceType() {
        return entranceType;
    }

    public void setEntranceType(EntranceType entranceType) {
        this.entranceType = entranceType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public String getDamageNumber() {
        return damageNumber;
    }

    public void setDamageNumber(String damageNumber) {
        this.damageNumber = damageNumber;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public boolean isReleasedOrder() {
        return releasedOrder;
    }

    public void setReleasedOrder(boolean releasedOrder) {
        this.releasedOrder = releasedOrder;
    }

    public boolean isClosedOrder() {
        return closedOrder;
    }

    public void setClosedOrder(boolean closedOrder) {
        this.closedOrder = closedOrder;
    }

    @Override
    public String toString() {
        return "DryingOrder{" +
                "id=" + orderId +
                ", createDateOrder=" + createDateOrder +
                ", userAuthor='" + userAuthor + '\'' +
                ", settlement='" + settlement + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                ", orderPlace='" + orderPlace + '\'' +
                ", typeOfOrder=" + typeOfOrder +
                ", createDateOrderType=" + createDateOrderType +
                ", entranceType=" + entranceType +
                ", damageType=" + damageType +
                ", damageNumber='" + damageNumber + '\'' +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", releasedOrder=" + releasedOrder +
                ", closedOrder=" + closedOrder +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DryingOrder that = (DryingOrder) o;
        return releasedOrder == that.releasedOrder && closedOrder == that.closedOrder && Objects.equals(orderId, that.orderId) && Objects.equals(createDateOrder, that.createDateOrder) && Objects.equals(userAuthor, that.userAuthor) && Objects.equals(settlement, that.settlement) && Objects.equals(streetName, that.streetName) && Objects.equals(postalCode, that.postalCode) && Objects.equals(orderPlace, that.orderPlace) && typeOfOrder == that.typeOfOrder && Objects.equals(createDateOrderType, that.createDateOrderType) && entranceType == that.entranceType && damageType == that.damageType && Objects.equals(damageNumber, that.damageNumber) && Objects.equals(insuranceNumber, that.insuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, createDateOrder, userAuthor, settlement, streetName, postalCode, orderPlace, typeOfOrder, createDateOrderType, entranceType, damageType, damageNumber, insuranceNumber, releasedOrder, closedOrder);
    }
}
