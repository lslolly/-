package com.example.administrator.mymaterialdesigndemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by ${lishu} on 2016/11/15.
 * 内存缓存和磁盘缓存的实现
 */

public class ImageLoader {
    private final String DISK_CACHE_SIZE="ddd";
    private LruCache<String,Bitmap> mMemoryCache;
    private DiskLruCache mDiskLruCache;
    private  Context mContext;


}
