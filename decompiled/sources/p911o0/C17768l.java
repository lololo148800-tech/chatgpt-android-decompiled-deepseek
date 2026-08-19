package p911o0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: o0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C17768l extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C17768l f56722Y = new C17768l(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.round((1 + (((EnumC7546k) obj2) != EnumC7546k.f23904Y ? (-1.0f) * (-1) : -1.0f)) * (((Number) obj).intValue() / 2.0f)));
    }
}
