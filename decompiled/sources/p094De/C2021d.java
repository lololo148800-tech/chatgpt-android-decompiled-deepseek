package p094De;

import gd.C13883P0;
import gd.C13964m1;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: De.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2021d extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6198Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC13849E f6199Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2021d(InterfaceC13849E interfaceC13849E, int i10) {
        super(0);
        this.f6198Y = i10;
        this.f6199Z = interfaceC13849E;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f6198Y) {
            case 0:
                return Boolean.valueOf(((C14005w2) this.f6199Z).m15481a(C13883P0.f43922c));
            default:
                return Boolean.valueOf(((C14005w2) this.f6199Z).m15481a(C13964m1.f44016c));
        }
    }
}
