package com.google.protobuf;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.u1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12197u1 implements PrivilegedExceptionAction {
    /* JADX INFO: renamed from: a */
    public static Unsafe m14152a() throws IllegalAccessException {
        for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        return m14152a();
    }
}
