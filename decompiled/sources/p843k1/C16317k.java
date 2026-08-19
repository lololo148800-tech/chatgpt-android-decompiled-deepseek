package p843k1;

import android.graphics.Outline;
import p774h1.C14353i;
import p774h1.InterfaceC14333K;

/* JADX INFO: renamed from: k1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C16317k {

    /* JADX INFO: renamed from: a */
    public static final C16317k f50620a = new C16317k();

    /* JADX INFO: renamed from: a */
    public final void m17911a(Outline outline, InterfaceC14333K interfaceC14333K) {
        if (!(interfaceC14333K instanceof C14353i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C14353i) interfaceC14333K).f45039a);
    }
}
