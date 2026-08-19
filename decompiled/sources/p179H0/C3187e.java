package p179H0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: H0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3187e extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9605Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3196n f9606Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3187e(C3196n c3196n, int i10) {
        super(0);
        this.f9605Y = i10;
        this.f9606Z = c3196n;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f9605Y) {
            case 0:
                C3196n c3196n = this.f9606Z;
                return Float.valueOf(c3196n.m4042a() / c3196n.f9644g.m6409g() < 1.0f ? 0.3f : 1.0f);
            default:
                return Float.valueOf(this.f9606Z.f9643f.m6409g() * 0.5f);
        }
    }
}
