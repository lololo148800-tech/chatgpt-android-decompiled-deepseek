package p017Af;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C1197y0;
import p040Bd.C1203z0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p909nm.AbstractC17682p;
import p926of.C18146I;
import p926of.C18173j;
import p926of.C18174k;

/* JADX INFO: renamed from: Af.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C0487r extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1439n f1583Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1203z0 f1584Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f1585o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ArrayList f1586p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f1587q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ String f1588r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC5985X f1589s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0487r(InterfaceC1439n interfaceC1439n, C1203z0 c1203z0, int i10, ArrayList arrayList, InterfaceC1436k interfaceC1436k, String str, InterfaceC5985X interfaceC5985X) {
        super(0);
        this.f1583Y = interfaceC1439n;
        this.f1584Z = c1203z0;
        this.f1585o0 = i10;
        this.f1586p0 = arrayList;
        this.f1587q0 = interfaceC1436k;
        this.f1588r0 = str;
        this.f1589s0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int i10 = this.f1585o0;
        Integer numValueOf = Integer.valueOf(i10);
        InterfaceC1439n interfaceC1439n = this.f1583Y;
        C1203z0 c1203z0 = this.f1584Z;
        interfaceC1439n.invoke(c1203z0, numValueOf);
        C1197y0 c1197y0 = (C1197y0) c1203z0.f3165c.get(i10);
        ArrayList arrayList = this.f1586p0;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((C18174k) it.next()).f57980c;
            String str2 = c1197y0.f3154c;
            float f10 = AbstractC0490u.f1600a;
            arrayList2.add(new C18173j(str, null, null, this.f1588r0, null, null, str2, c1197y0.f3152a, (String) ((Map) this.f1589s0.getValue()).get(c1197y0.f3152a), 54));
        }
        this.f1587q0.invoke(new C18146I(arrayList2, i10, 4));
        return C17296C.f55119a;
    }
}
