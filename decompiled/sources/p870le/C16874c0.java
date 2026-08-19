package p870le;

import androidx.compose.foundation.lazy.C10845a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p1082wd.C20909b;
import p269Kh.C4688o;
import p349O0.C6013l;
import p349O0.C6021p;
import p544W9.AbstractC8741x4;

/* JADX INFO: renamed from: le.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16874c0 extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54156Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f54157Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20909b f54158o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f54159p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1426a f54160q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean f54161r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16874c0(List list, C20909b c20909b, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, boolean z6, int i10) {
        super(4);
        this.f54156Y = i10;
        this.f54157Z = list;
        this.f54158o0 = c20909b;
        this.f54159p0 = interfaceC1436k;
        this.f54160q0 = interfaceC1426a;
        this.f54161r0 = z6;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        switch (this.f54156Y) {
            case 0:
                C10845a c10845a = (C10845a) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6021p c6021p = (C6021p) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i10 = (c6021p.m6542f(c10845a) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= c6021p.m6538d(iIntValue) ? 32 : 16;
                }
                if ((i10 & 147) == 146 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C4688o c4688o = (C4688o) this.f54157Z.get(iIntValue);
                    c6021p.m6524S(1545491293);
                    String str = this.f54158o0.m21453a().f15253b;
                    c6021p.m6524S(326955222);
                    InterfaceC1436k interfaceC1436k = this.f54159p0;
                    boolean zM6542f = c6021p.m6542f(interfaceC1436k);
                    InterfaceC1426a interfaceC1426a = this.f54160q0;
                    boolean zM6542f2 = zM6542f | c6021p.m6542f(interfaceC1426a);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f2 || objM6514H == C6013l.f19514a) {
                        objM6514H = new C16872b0(interfaceC1436k, interfaceC1426a, 0);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC8741x4.m9479c(c4688o, str, (InterfaceC1436k) objM6514H, null, this.f54161r0, null, null, c6021p, 0, 104);
                    c6021p.m6553p(false);
                }
                break;
            default:
                C10845a c10845a2 = (C10845a) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6021p c6021p2 = (C6021p) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i11 = (c6021p2.m6542f(c10845a2) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i11 |= c6021p2.m6538d(iIntValue3) ? 32 : 16;
                }
                if ((i11 & 147) == 146 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C4688o c4688o2 = (C4688o) this.f54157Z.get(iIntValue3);
                    c6021p2.m6524S(-688251181);
                    String str2 = this.f54158o0.m21453a().f15253b;
                    c6021p2.m6524S(-992027340);
                    InterfaceC1436k interfaceC1436k2 = this.f54159p0;
                    boolean zM6542f3 = c6021p2.m6542f(interfaceC1436k2);
                    InterfaceC1426a interfaceC1426a2 = this.f54160q0;
                    boolean zM6542f4 = zM6542f3 | c6021p2.m6542f(interfaceC1426a2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f4 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C16872b0(interfaceC1436k2, interfaceC1426a2, 1);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC8741x4.m9479c(c4688o2, str2, (InterfaceC1436k) objM6514H2, null, this.f54161r0, null, null, c6021p2, 0, 104);
                    c6021p2.m6553p(false);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
