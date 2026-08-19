package p467T1;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: T1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7203m extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22869Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC7204n f22870Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7203m(InterfaceC7204n interfaceC7204n, int i10) {
        super(0);
        this.f22869Y = i10;
        this.f22870Z = interfaceC7204n;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f22869Y) {
            case 0:
                return Float.valueOf(this.f22870Z.mo7587a());
            default:
                return this.f22870Z;
        }
    }
}
