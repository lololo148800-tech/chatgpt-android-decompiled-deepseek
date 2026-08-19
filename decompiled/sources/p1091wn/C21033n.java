package p1091wn;

import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: wn.n */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C21033n extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C21033n f66912Y = new C21033n(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Iterable p10 = (Iterable) obj;
        AbstractC16544l.m18094g(p10, "p0");
        return p10.iterator();
    }
}
