package nc;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1442q;
import p1091wn.AbstractC21031l;
import p1091wn.C21025f;
import p349O0.InterfaceC5985X;
import p537W0.C8410b;
import p571X9.AbstractC9224V2;
import p909nm.AbstractC17680n;
import p923oc.C18064t;
import p946pc.C18325J;
import p946pc.C18327L;
import p946pc.C18332Q;
import p988rc.C18918f;

/* JADX INFO: renamed from: nc.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C17567n extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56206Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18064t f56207Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1442q f56208o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18918f f56209p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f56210q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17567n(C18064t c18064t, InterfaceC1442q interfaceC1442q, C18918f c18918f, InterfaceC5985X interfaceC5985X, int i10) {
        super(1);
        this.f56206Y = i10;
        this.f56207Z = c18064t;
        this.f56208o0 = interfaceC1442q;
        this.f56209p0 = c18918f;
        this.f56210q0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C18064t c18064t;
        switch (this.f56206Y) {
            case 0:
                C18325J Table = (C18325J) obj;
                AbstractC16544l.m18094g(Table, "$this$Table");
                C18064t c18064t2 = (C18064t) AbstractC21031l.m21489m(AbstractC9224V2.m9792b(this.f56207Z, C17557d.f56170r0));
                if (c18064t2 != null && (c18064t = (C18064t) AbstractC21031l.m21489m(AbstractC9224V2.m9792b(c18064t2, C17557d.f56171s0))) != null) {
                    C21025f c21025f = new C21025f(AbstractC9224V2.m9792b(c18064t, C17557d.f56172t0));
                    while (c21025f.hasNext()) {
                        Table.f58496a = new C18332Q(AbstractC17680n.m19362l0((Collection) Table.f58496a.f58518a, new C8410b(new C17561h((C18064t) c21025f.next(), this.f56208o0, this.f56209p0, this.f56210q0, 1), true, -2074631802)));
                    }
                }
                break;
            case 1:
                C18325J row = (C18325J) obj;
                AbstractC16544l.m18094g(row, "$this$row");
                C21025f c21025f2 = new C21025f(AbstractC9224V2.m9792b(this.f56207Z, C17557d.f56173u0));
                while (c21025f2.hasNext()) {
                    row.f58496a = new C18332Q(AbstractC17680n.m19362l0((Collection) row.f58496a.f58518a, new C8410b(new C17561h((C18064t) c21025f2.next(), this.f56208o0, this.f56209p0, this.f56210q0, 2), true, 117143058)));
                }
                break;
            default:
                C18327L Table2 = (C18327L) obj;
                AbstractC16544l.m18094g(Table2, "$this$Table");
                C18064t c18064t3 = (C18064t) AbstractC21031l.m21489m(AbstractC9224V2.m9792b(this.f56207Z, C17557d.f56174v0));
                if (c18064t3 != null) {
                    C21025f c21025f3 = new C21025f(AbstractC9224V2.m9792b(c18064t3, C17557d.f56175w0));
                    while (c21025f3.hasNext()) {
                        C17567n c17567n = new C17567n((C18064t) c21025f3.next(), this.f56208o0, this.f56209p0, this.f56210q0, 1);
                        ArrayList arrayList = Table2.f58505a;
                        C18325J c18325j = new C18325J();
                        c17567n.invoke(c18325j);
                        arrayList.add(c18325j);
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }
}
