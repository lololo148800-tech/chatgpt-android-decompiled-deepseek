package p817j$.util.concurrent;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: j$.util.concurrent.x */
/* JADX INFO: loaded from: classes4.dex */
final class C15705x implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
