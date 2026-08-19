package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: J0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C3906F extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ float f11951Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f11952Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f11953o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3906F(float f10, float f11, float f12) {
        super(0);
        this.f11951Y = f10;
        this.f11952Z = f11;
        this.f11953o0 = f12;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return new C3935J4(this.f11951Y, this.f11952Z, this.f11953o0);
    }
}
