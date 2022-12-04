package main.java.day01;

import java.math.BigDecimal;

public class Invoice {
  //attributes
  private Long idItem;
  private String descriptionItem;
  private int quantityItem;
  private BigDecimal itemPrice;

  //constructor method
  public Invoice(Long idItem, String descriptionItem, int quantityItem, BigDecimal itemPrice) {
    this.idItem = idItem;
    this.descriptionItem = descriptionItem;
    this.quantityItem = quantityItem;
    this.itemPrice = itemPrice;
  }

  //methods
  public BigDecimal getInvoiceAmount() {
    return this.getItemPrice().multiply(BigDecimal.valueOf(this.quantityItem));
  }
  public Long getIdItem() {
    return idItem;
  }

  public void setIdItem(Long idItem) {
    this.idItem = idItem;
  }

  public String getDescriptionItem() {
    return descriptionItem;
  }

  public void setDescriptionItem(String descriptionItem) {
    this.descriptionItem = descriptionItem;
  }

  public int getQuantityItem() {
    return quantityItem;
  }

  public void setQuantityItem(int quantityItem) {
    this.quantityItem = quantityItem;
  }

  public BigDecimal getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(BigDecimal itemPrice) {
    this.itemPrice = itemPrice;
  }
}
