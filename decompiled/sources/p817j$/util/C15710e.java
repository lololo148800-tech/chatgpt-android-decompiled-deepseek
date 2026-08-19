package p817j$.util;

import java.io.Serializable;

/* JADX INFO: renamed from: j$.util.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C15710e extends RuntimeException {
    /* JADX INFO: renamed from: a */
    public static void m17336a(String str, Serializable serializable) {
        throw new C15710e("Unsupported " + str + " :" + serializable);
    }
}
