package p437Rn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Rn.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C6957o extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C6957o f22254Y = new C6957o(1);

    /* JADX WARN: Type inference failed for: r3v2, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C6952j it = (C6952j) obj;
        AbstractC16544l.m18094g(it, "it");
        StringBuilder sb2 = new StringBuilder("position ");
        sb2.append(it.f22247a);
        sb2.append(": '");
        return AbstractC9306j0.m9892k(sb2, (String) it.f22248b.invoke(), '\'');
    }
}
