package p547Wc;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17680n;
import p936p0.C18273m;
import p936p0.C18280t;

/* JADX INFO: renamed from: Wc.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C8767K extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26738Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18280t f26739Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8767K(C18280t c18280t, int i10) {
        super(0);
        this.f26738Y = i10;
        this.f26739Z = c18280t;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f26738Y) {
            case 0:
                C18280t c18280t = this.f26739Z;
                return Boolean.valueOf(c18280t.mo5258d() || c18280t.mo5257c());
            default:
                C18280t c18280t2 = this.f26739Z;
                C18273m c18273m = (C18273m) AbstractC17680n.m19353c0(c18280t2.m19824g().f58296j);
                return Boolean.valueOf((c18273m != null ? c18273m.f58304a : 0) >= c18280t2.m19824g().f58299m - 1);
        }
    }
}
