package com.dev.superior.DsList.projections;

import lombok.Data;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getshortDescription();
    Integer getposition();


}
