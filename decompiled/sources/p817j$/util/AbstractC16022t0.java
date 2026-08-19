package p817j$.util;

import java.security.AccessController;

/* JADX INFO: renamed from: j$.util.t0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC16022t0 {

    /* JADX INFO: renamed from: a */
    static final boolean f49459a = ((Boolean) AccessController.doPrivileged(new C15746s0())).booleanValue();

    /* JADX INFO: renamed from: a */
    static void m17579a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
