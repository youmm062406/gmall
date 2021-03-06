package com.atguigu.gmall.cart.service;

import com.atguigu.gmall.cart.vo.CartItem;
import com.atguigu.gmall.cart.vo.CartResponse;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * 购物车服务
 */
public interface CartService {

    /**
     * 添加商品区购物车
     * @param skuId
     * @param cartKey
     * @param accessToken
     * @return
     */
    CartResponse addToCart(Long skuId,Integer num ,String cartKey, String accessToken) throws ExecutionException, InterruptedException;

    /**
     * 修改购物项数量
     * @param skuId
     * @param num
     * @param cartKey
     * @param accessToken
     * @return
     */
    CartResponse updateCartItem(Long skuId, Integer num, String cartKey, String accessToken);

    /**
     * 获取购物车的所有数据
     * @param cartKey
     * @param accessToken
     * @return
     */
    CartResponse listCart(String cartKey, String accessToken);

    /**
     * 删除购物项
     * @param skuId
     * @param cartKey
     * @param accessToken
     * @return
     */
    CartResponse delCartItem(Long skuId, String cartKey, String accessToken);

    /**
     * 清空购物车
     * @param cartKey
     * @param accessToken
     * @return
     */
    CartResponse clearCart(String cartKey, String accessToken);

    /**
     * 选中/不选中某些商品
     * @param skuIds
     * @param ops
     * @param cartKey
     * @param accessToken
     * @return
     */
    CartResponse checkCartItems(String skuIds, Integer ops, String cartKey, String accessToken);

    /**
     * 获取某个用户的购物车中选中的商品
     * @param accessToken
     * @return
     */
    List<CartItem> getCartItemForOrder(String accessToken);

    /**
     * 清除购物车下单商品
     * @param accessToken
     * @param skuIds
     */
    void removeCartItem(String accessToken, List<Long> skuIds);
}
