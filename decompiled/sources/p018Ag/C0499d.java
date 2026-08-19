package p018Ag;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p544W9.AbstractC8681n4;
import p857kl.C16447N;

/* JADX INFO: renamed from: Ag.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C0499d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C0499d f1627Y = new C0499d(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C16447N url = (C16447N) obj;
        C16447N it = (C16447N) obj2;
        AbstractC16544l.m18094g(url, "$this$url");
        AbstractC16544l.m18094g(it, "it");
        AbstractC8681n4.m9374c(url, new String[]{"mobile", "server_status/v1"});
        return C17296C.f55119a;
    }
}
