package p1106xf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p403Qd.AbstractC6659u;
import p523V9.AbstractC7886F5;
import p537W0.C8410b;

/* JADX INFO: renamed from: xf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C21198f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67399Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC6659u f67400Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8410b f67401o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f67402p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21198f(AbstractC6659u abstractC6659u, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f67399Y = i11;
        this.f67400Z = abstractC6659u;
        this.f67401o0 = c8410b;
        this.f67402p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f67399Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f67402p0 | 1);
                AbstractC7886F5.m8178a(this.f67400Z, this.f67401o0, c6021p, iM6447d0);
                break;
            case 1:
                int iM6447d1 = C5997d.m6447d0(this.f67402p0 | 1);
                AbstractC7886F5.m8178a(this.f67400Z, this.f67401o0, c6021p, iM6447d1);
                break;
            default:
                int iM6447d2 = C5997d.m6447d0(this.f67402p0 | 1);
                AbstractC7886F5.m8178a(this.f67400Z, this.f67401o0, c6021p, iM6447d2);
                break;
        }
        return C17296C.f55119a;
    }
}
