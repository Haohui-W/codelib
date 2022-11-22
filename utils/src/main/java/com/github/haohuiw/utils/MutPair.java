package com.github.haohuiw.utils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Haohui
 * create at 2022/9/29/15:58
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class MutPair<T1, T2>{
    private T1 first;
    private T2 second;
}