package io.zgc.samples.api.user;

/**
 * 示例服务，用户服务
 * @author admin
 * @date 2019-04-03
 */
public interface UserClient {

    /**
     * 用户注册
     * @param request
     * @return
     */
    UserRegisterResponse register(UserRegisterRequest request);
}
