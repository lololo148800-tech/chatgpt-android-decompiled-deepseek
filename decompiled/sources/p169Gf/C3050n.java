package p169Gf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p403Qd.C6651p0;
import p403Qd.EnumC6606L;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Gf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C3050n extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9203Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EnumC6606L f9204Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6651p0 f9205o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f9206p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f9207q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3050n(EnumC6606L enumC6606L, C6651p0 c6651p0, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f9203Y = i11;
        this.f9204Z = enumC6606L;
        this.f9205o0 = c6651p0;
        this.f9206p0 = interfaceC10459q;
        this.f9207q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9203Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f9207q0 | 1);
                AbstractC3051o.m3925c(this.f9204Z, this.f9205o0, this.f9206p0, c6021p, iM6447d0);
                break;
            default:
                int iM6447d1 = C5997d.m6447d0(this.f9207q0 | 1);
                AbstractC3051o.m3925c(this.f9204Z, this.f9205o0, this.f9206p0, c6021p, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
