package p708dh;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C21891A;

/* JADX INFO: renamed from: dh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13147a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C13147a f41738Y = new C13147a(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C21891A a10 = (C21891A) obj;
        AbstractC16544l.m18094g(a10, "a");
        String strM22322a = a10.m22322a();
        if (strM22322a == null) {
            strM22322a = null;
        }
        return strM22322a == null ? "" : strM22322a;
    }
}
