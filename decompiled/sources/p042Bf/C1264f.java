package p042Bf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p594Y9.AbstractC9704B4;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Bf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3351Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f3352Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f3353o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f3354p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f3355q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1264f(List list, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f3351Y = i11;
        this.f3352Z = list;
        this.f3353o0 = interfaceC1436k;
        this.f3354p0 = interfaceC10459q;
        this.f3355q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f3351Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC1270l.m1984c(this.f3352Z, this.f3353o0, this.f3354p0, c6021p, C5997d.m6447d0(this.f3355q0 | 1));
                break;
            default:
                int iM6447d0 = C5997d.m6447d0(this.f3355q0 | 1);
                AbstractC9704B4.m10298a(this.f3352Z, this.f3353o0, this.f3354p0, c6021p, iM6447d0);
                break;
        }
        return C17296C.f55119a;
    }
}
