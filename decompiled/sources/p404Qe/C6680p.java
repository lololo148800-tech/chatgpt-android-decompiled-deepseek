package p404Qe;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p571X9.AbstractC9147I2;

/* JADX INFO: renamed from: Qe.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C6680p extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21479Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f21480Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f21481o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f21482p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f21483q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6680p(List list, int i10, InterfaceC1436k interfaceC1436k, int i11, int i12) {
        super(2);
        this.f21479Y = i12;
        this.f21480Z = list;
        this.f21481o0 = i10;
        this.f21482p0 = interfaceC1436k;
        this.f21483q0 = i11;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f21479Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC9147I2.m9695d(this.f21480Z, this.f21481o0, this.f21482p0, c6021p, C5997d.m6447d0(this.f21483q0 | 1));
                break;
            default:
                AbstractC9147I2.m9695d(this.f21480Z, this.f21481o0, this.f21482p0, c6021p, C5997d.m6447d0(this.f21483q0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
