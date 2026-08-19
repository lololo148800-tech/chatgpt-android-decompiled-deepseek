package p1095x1;

import kotlin.jvm.internal.AbstractC16541i;
import p049Bm.InterfaceC1439n;
import p102Dm.AbstractC2119a;

/* JADX INFO: renamed from: x1.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21072a extends AbstractC16541i implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C21072a f66989Y = new C21072a(2, AbstractC2119a.class, "min", "min(II)I", 1);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
