package com.example.theme_market.repository;


import com.example.theme_market.entity.ItemImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemImgRepository extends JpaRepository<ItemImg, Long> {

    List<ItemImg> findByItemIdOrderByIdAsc(Long itemId);

    ItemImg findByItemIdAndRepImgYn(Long itemId, String repImgYn);

    //상품 삭제
    @Modifying
    @Query("delete from ItemImg i where i = :itemImg")
    void delete(ItemImg itemImg);


}
