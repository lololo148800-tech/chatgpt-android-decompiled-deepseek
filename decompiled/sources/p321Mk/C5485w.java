package p321Mk;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p658b5.C11238i;

/* JADX INFO: renamed from: Mk.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C5485w extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17910Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11238i f17911Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5485w(C11238i c11238i, int i10) {
        super(0);
        this.f17910Y = i10;
        this.f17911Z = c11238i;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f17910Y) {
            case 0:
                return (Float) this.f17911Z.m12567m0().m15224e();
            default:
                return (Float) this.f17911Z.m12568n0().m15224e();
        }
    }
}
