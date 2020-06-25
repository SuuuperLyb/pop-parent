package com.offway.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LYB
 * @since 2020-06-25
 */
public class TStylePhotos extends Model<TStylePhotos> {

    private static final long serialVersionUID = 1L;

    /**
     * 图的id
     */
    @TableId(value = "photo_id", type = IdType.AUTO)
    private Integer photoId;

    /**
     * 创建时间
     */
    private LocalDate createTime;

    /**
     * 对应的明星风格id
     */
    private Integer statStyleId;
    /**
     * 明星style图片url
     */
    private String starimgUrl;

    public String getStarimgUrl() {
        return starimgUrl;
    }

    public void setStarimgUrl(String starimgUrl) {
        this.starimgUrl = starimgUrl;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }
    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }
    public Integer getStatStyleId() {
        return statStyleId;
    }

    public void setStatStyleId(Integer statStyleId) {
        this.statStyleId = statStyleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.photoId;
    }

    @Override
    public String toString() {
        return "TStylePhotos{" +
            "photoId=" + photoId +
            ", createTime=" + createTime +
            ", statStyleId=" + statStyleId +
        "}";
    }
}
