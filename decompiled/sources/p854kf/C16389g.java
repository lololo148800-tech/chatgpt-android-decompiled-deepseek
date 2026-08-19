package p854kf;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p148Fi.C2786R0;
import p324Mn.C5551u;
import p871lf.C16940x;

/* JADX INFO: renamed from: kf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C16389g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50897Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5551u f50898Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16389g(int i10, C5551u c5551u) {
        super(1);
        this.f50897Y = i10;
        this.f50898Z = c5551u;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f50897Y) {
            case 0:
                C16940x it = (C16940x) obj;
                AbstractC16544l.m18094g(it, "it");
                return C16940x.m18591a(it, null, this.f50898Z, 1);
            default:
                C2786R0 c2786r0 = (C2786R0) obj;
                if (c2786r0 != null) {
                    return C2786R0.m3709a(c2786r0, null, null, null, this.f50898Z, 15);
                }
                return null;
        }
    }
}
