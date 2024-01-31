package org.smileyoung.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 链表结构
 * @author wenxiyang
 * @date 2024-02-01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListNode<T> {
    private T data;
    private ListNode<T> next;
}
