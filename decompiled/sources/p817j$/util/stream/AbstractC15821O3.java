package p817j$.util.stream;

import java.security.AccessController;

/* JADX INFO: renamed from: j$.util.stream.O3 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15821O3 {

    /* JADX INFO: renamed from: a */
    static final boolean f49141a = ((Boolean) AccessController.doPrivileged(new C15816N3())).booleanValue();

    /* JADX INFO: renamed from: a */
    static void m17414a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
