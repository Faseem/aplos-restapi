package com.aplos.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aux072 on 06/05/2018.
 */
@Entity
@Table(name = "rating")
public class Rating  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rating_id")
    private Long ratingId;

    @Column(name = "rating_name")
    private String ratingName;

    @Column(name = "rating_description")
    private String ratingDescription;

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public String getRatingName() {
        return ratingName;
    }

    public void setRatingName(String ratingName) {
        this.ratingName = ratingName;
    }

    public String getRatingDescription() {
        return ratingDescription;
    }

    public void setRatingDescription(String ratingDescription) {
        this.ratingDescription = ratingDescription;
    }
}
