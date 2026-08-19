package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC11992p0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m13516a(Unsafe unsafe, AbstractC11984n0 abstractC11984n0, long j10, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC11984n0, j10, obj, obj2)) {
            if (unsafe.getObject(abstractC11984n0, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
