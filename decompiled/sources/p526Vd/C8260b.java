package p526Vd;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p690cp.AbstractC12935u;
import p690cp.C12912C;

/* JADX INFO: renamed from: Vd.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8260b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C8260b f25758Z = new C8260b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C8260b f25759o0 = new C8260b(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25760Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8260b(int i10, int i11) {
        super(i10);
        this.f25760Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f25760Y) {
            case 0:
                AbstractC12935u it = (AbstractC12935u) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.f41096e;
            default:
                C12912C it2 = (C12912C) obj;
                AbstractC16544l.m18094g(it2, "it");
                return it2.f41068g;
        }
    }
}
