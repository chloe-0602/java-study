package com.atguigu02.selfdefine.exer1;

import java.util.*;

/**
 * ClassName: DAO
 * Package: com.atguigu02.selfdefine.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 19:26
 * @Version 1.0
 */
public class DAO<T> {
    Map<String, T> model = new HashMap();

    /**
     * 保存 T 类型的对象到 Map 成员变量中
     *
     * @param id
     * @param entity
     */
    public void save(String id, T entity) {
        if (!model.containsKey(id)) {
            model.put(id, entity);
        }
    }

    /**
     * 从 map 中获取 id 对应的对象
     * @param id
     * @return
     */
    public T get(String id){
        return model.get(id);
    }

    /**
     * 替换 map 中key为id的内容,改为 entity 对象
     * @param id
     * @param entity
     */
    public void update(String id,T entity){
        model.put(id, entity);
    }

    /**
     * 返回 map 中存放的所有 T 对象
     * @return
     */
    public List<T> list(){
        Collection<T> values = model.values();
        return new ArrayList<>(values);
    }

    /**
     * 删除指定 id 对象
     * @param id
     */
    public void delete(String id){
        model.remove(id);
    }
}
