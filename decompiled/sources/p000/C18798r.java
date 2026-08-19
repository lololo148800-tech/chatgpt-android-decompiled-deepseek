package p000;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: classes.dex */
public final class C18798r extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59757Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f59758Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f59759o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18798r(String str, int i10, int i11) {
        super(0);
        this.f59757Y = i11;
        this.f59758Z = str;
        this.f59759o0 = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f59757Y) {
            case 0:
                return AbstractC21322p.m21669C(this.f59759o0, this.f59758Z);
            default:
                return AbstractC21322p.m21670D(this.f59759o0, this.f59758Z);
        }
    }
}
