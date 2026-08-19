package p729ej;

import kotlin.jvm.internal.AbstractC16546n;
import p026Ao.C0678l;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: ej.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13419j extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42499Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13420k f42500Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13419j(C13420k c13420k, int i10) {
        super(0);
        this.f42499Y = i10;
        this.f42500Z = c13420k;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f42499Y) {
            case 0:
                return (C0678l) this.f42500Z.f42501a.invoke();
            default:
                C13420k c13420k = this.f42500Z;
                if (c13420k == null || c13420k.m14962a().mo1372d() == 0) {
                    return null;
                }
                return c13420k;
        }
    }
}
