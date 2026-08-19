package nc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1442q;
import p156G1.AbstractC2965l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9212T2;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p923oc.C18064t;
import p946pc.C18320E;
import p988rc.C18918f;

/* JADX INFO: renamed from: nc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C17561h extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56193Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18064t f56194Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1442q f56195o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18918f f56196p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f56197q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17561h(C18064t c18064t, InterfaceC1442q interfaceC1442q, C18918f c18918f, InterfaceC5985X interfaceC5985X, int i10) {
        super(3);
        this.f56193Y = i10;
        this.f56194Z = c18064t;
        this.f56195o0 = interfaceC1442q;
        this.f56196p0 = c18918f;
        this.f56197q0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f56193Y) {
            case 0:
                C18320E Heading = (C18320E) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Heading, "$this$Heading");
                if ((iIntValue & 14) == 0) {
                    iIntValue |= c6021p.m6542f(Heading) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM3789a = AbstractC2965l.m3789a(C10456n.f30959Y, false, C17557d.f56168p0);
                    C18918f c18918f = C18918f.f60363j;
                    AbstractC9212T2.m9777a(Heading, this.f56194Z, this.f56195o0, this.f56196p0, this.f56197q0, interfaceC10459qM3789a, c6021p, (iIntValue & 14) | 4096, 0);
                }
                break;
            case 1:
                C18320E cell = (C18320E) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(cell, "$this$cell");
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= c6021p2.m6542f(cell) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C18918f c18918f2 = C18918f.f60363j;
                    AbstractC9212T2.m9777a(cell, this.f56194Z, this.f56195o0, this.f56196p0, this.f56197q0, null, c6021p2, (iIntValue2 & 14) | 4096, 16);
                }
                break;
            default:
                C18320E cell2 = (C18320E) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(cell2, "$this$cell");
                if ((iIntValue3 & 14) == 0) {
                    iIntValue3 |= c6021p3.m6542f(cell2) ? 4 : 2;
                }
                if ((iIntValue3 & 91) == 18 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C18918f c18918f3 = C18918f.f60363j;
                    AbstractC9212T2.m9777a(cell2, this.f56194Z, this.f56195o0, this.f56196p0, this.f56197q0, null, c6021p3, (iIntValue3 & 14) | 4096, 16);
                }
                break;
        }
        return c17296c;
    }
}
