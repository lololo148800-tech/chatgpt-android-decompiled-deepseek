package p988rc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p153Fn.C2925c;
import p349O0.C5996c0;
import p349O0.InterfaceC5985X;
import p586Y0.C9569u;
import sc.C19530l;

/* JADX INFO: renamed from: rc.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C18911A extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC5985X f60339Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f60340Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5996c0 f60341o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9569u f60342p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C2925c f60343q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean f60344r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC5985X f60345s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C18918f f60346t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18911A(InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, C5996c0 c5996c0, C9569u c9569u, C2925c c2925c, boolean z6, InterfaceC5985X interfaceC5985X3, C18918f c18918f) {
        super(0);
        this.f60339Y = interfaceC5985X;
        this.f60340Z = interfaceC5985X2;
        this.f60341o0 = c5996c0;
        this.f60342p0 = c9569u;
        this.f60343q0 = c2925c;
        this.f60344r0 = z6;
        this.f60345s0 = interfaceC5985X3;
        this.f60346t0 = c18918f;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C5996c0 c5996c0;
        C19530l c19530l = (C19530l) this.f60339Y.getValue();
        List list = c19530l.f62042b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c5996c0 = this.f60341o0;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (((Number) next).intValue() > c5996c0.m6412g()) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            C18931s c18931s = new C18931s(iIntValue, 0.0f);
            C9569u c9569u = this.f60342p0;
            c9569u.put(numValueOf, c18931s);
            c5996c0.m6413h(iIntValue);
            C18918f c18918f = this.f60346t0;
            AbstractC0575H.m1156D(this.f60343q0, null, null, new C18938z(this.f60340Z, this.f60339Y, this.f60344r0, this.f60345s0, c18918f, c9569u, iIntValue, null), 3);
        }
        if (c19530l.f62043c) {
            this.f60340Z.setValue(c19530l.f62041a);
        }
        return C17296C.f55119a;
    }
}
