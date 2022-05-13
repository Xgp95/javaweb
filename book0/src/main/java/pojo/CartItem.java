package pojo;

import java.math.BigDecimal;

/**
 * @author: Xugp
 * @date: 2022/2/19 14:22
 * @description:
 */
public class CartItem {
    private Integer id;
    private String name;
    private Integer count;
    private BigDecimal price;
    private BigDecimal totalPrice;

    public CartItem() {
    }

    public CartItem(Integer id, String name, Integer count, BigDecimal price, BigDecimal priceTotal) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
        this.totalPrice = priceTotal;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", priceTotal=" + totalPrice +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceTotal() {
        return totalPrice;
    }

    public void setPriceTotal(BigDecimal priceTotal) {
        this.totalPrice = priceTotal;
    }
}
