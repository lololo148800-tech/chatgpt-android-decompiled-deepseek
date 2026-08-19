package p042Bf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17680n;
import pm.C18513a;

/* JADX INFO: renamed from: Bf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C1267i extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3362Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f3363Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1267i(int i10, List list) {
        super(0);
        this.f3362Y = i10;
        this.f3363Z = list;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f3362Y) {
            case 0:
                return Integer.valueOf(this.f3363Z.size());
            case 1:
                return Integer.valueOf(this.f3363Z.size());
            case 2:
                Object obj = this.f3363Z.get(2);
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            case 3:
                return Integer.valueOf(this.f3363Z.size());
            case 4:
                return AbstractC17680n.m19369s0(this.f3363Z);
            case 5:
                return AbstractC17680n.m19370t0(this.f3363Z, C18513a.f58996o0);
            case 6:
                return this.f3363Z;
            case 7:
                Object obj2 = this.f3363Z.get(2);
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj2;
            default:
                return Integer.valueOf(this.f3363Z.size());
        }
    }
}
