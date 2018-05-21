package com.platform.cache;

import com.platform.dao.SysDictDao;
import com.platform.entity.SysDictEntity;
import com.platform.utils.SpringContextUtils;
import org.springframework.beans.factory.InitializingBean;

import java.util.HashMap;
import java.util.List;

/**
 * 内存缓存 <br>
 *
 * @author lipengjun
 * @date 2017年11月18日 下午13:13:23
 */
public class CacheUtil implements InitializingBean {

    public static List<SysDictEntity> sysDictEntityList;
    public static SysDictDao sysDictDao;

    public static void init() {
        sysDictDao = SpringContextUtils.getBean(SysDictDao.class);
        if (null != sysDictDao) {
            sysDictEntityList = sysDictDao.queryList(new HashMap<String, Object>());
        }
    }

    /**
     * 重新加载数据字典缓存
     */
    public static void reloadDict() {
        sysDictEntityList = sysDictDao.queryList(new HashMap<String, Object>());
    }

    /**
     * 根据 groupCode，dictKey获取字典对应名称
     *
     * @param groupCode
     * @param dictKey
     * @return
     */
    public static String getDictValue(String groupCode, String dictKey) {
        if (sysDictEntityList != null && sysDictEntityList.size() != 0) {
            for (SysDictEntity item : sysDictEntityList) {
                if (groupCode.equals(item.getGroupCode()) && dictKey.equals(item.getDictKey())) {
                    return item.getDictValue();
                }
            }
        }
        return "-";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        init();
    }

}