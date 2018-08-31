package com.aliya.permission.abs;

import com.aliya.permission.PermissionCallback;

import java.util.List;

/**
 * PermissionCallback 的抽象实现类
 *
 * @author a_liYa
 * @date 2018/8/17 15:59.
 */
public abstract class AbsPermissionCallback implements PermissionCallback {

    @Override
    public void onGranted(boolean isAlready) {
    }

    @Override
    public void onDenied(List<String> neverAskPermissions) {
    }

    @Override
    public void onElse(List<String> deniedPermissions, List<String> neverAskPermissions) {
    }

}
