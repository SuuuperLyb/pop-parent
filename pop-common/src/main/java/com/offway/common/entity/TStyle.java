package com.offway.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 商品风格表(style)
 * </p>
 *
 * @author LYB
 * @since 2020-06-23
 */
public class TStyle extends Model<TStyle> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品风格id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品风格名称
     */
    private String styleName;

    /**
     * 商品风格热度
     */
    private String styleHeat;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 明星id
     */
    private Integer starId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }
    public String getStyleHeat() {
        return styleHeat;
    }

    public void setStyleHeat(String styleHeat) {
        this.styleHeat = styleHeat;
    }
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    public Integer getStarId() {
        return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TStyle{" +
            "id=" + id +
            ", styleName=" + styleName +
            ", styleHeat=" + styleHeat +
            ", goodsId=" + goodsId +
            ", starId=" + starId +
        "}";
    }
}
