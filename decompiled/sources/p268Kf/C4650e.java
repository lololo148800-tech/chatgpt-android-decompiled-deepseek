package p268Kf;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1155zi.C21984a1;
import p479Td.C7351f0;

/* JADX INFO: renamed from: Kf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4650e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C4650e f15118Y = new C4650e(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17309l it = (C17309l) obj;
        AbstractC16544l.m18094g(it, "it");
        C7351f0 c7351f0 = (C7351f0) it.f55137Z;
        String str = c7351f0 != null ? c7351f0.f23286a : null;
        if (str != null) {
            return new C21984a1(str);
        }
        return null;
    }
}
