package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0187M0;
import p003A1.InterfaceC0161D1;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: D0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1796c extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC0161D1 f5147Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f5148Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f5149o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f5150p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1818n f5151q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1796c(InterfaceC0161D1 interfaceC0161D1, long j10, boolean z6, InterfaceC10459q interfaceC10459q, InterfaceC1818n interfaceC1818n) {
        super(2);
        this.f5147Y = interfaceC0161D1;
        this.f5148Z = j10;
        this.f5149o0 = z6;
        this.f5150p0 = interfaceC10459q;
        this.f5151q0 = interfaceC1818n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5997d.m6440a(AbstractC0187M0.f715q.mo6405a(this.f5147Y), AbstractC8411c.m8969c(-1426434671, c6021p, new C1794b(this.f5148Z, this.f5149o0, this.f5150p0, this.f5151q0)), c6021p, 56);
        }
        return C17296C.f55119a;
    }
}
