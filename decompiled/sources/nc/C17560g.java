package nc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1441p;
import p049Bm.InterfaceC1442q;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p923oc.C18064t;
import p946pc.C18320E;
import p988rc.C18918f;

/* JADX INFO: renamed from: nc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C17560g extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56188Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1441p f56189Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1442q f56190o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18918f f56191p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f56192q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17560g(InterfaceC1441p interfaceC1441p, InterfaceC1442q interfaceC1442q, C18918f c18918f, InterfaceC5985X interfaceC5985X, int i10) {
        super(4);
        this.f56188Y = i10;
        this.f56189Z = interfaceC1441p;
        this.f56190o0 = interfaceC1442q;
        this.f56191p0 = c18918f;
        this.f56192q0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f56188Y) {
            case 0:
                C18320E FormattedList = (C18320E) obj;
                C18064t it = (C18064t) obj2;
                C6021p c6021p = (C6021p) obj3;
                int iIntValue = ((Number) obj4).intValue();
                AbstractC16544l.m18094g(FormattedList, "$this$FormattedList");
                AbstractC16544l.m18094g(it, "it");
                int i10 = (iIntValue & 14) == 0 ? (c6021p.m6542f(FormattedList) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 112) == 0) {
                    i10 |= c6021p.m6542f(it) ? 32 : 16;
                }
                if ((i10 & 731) == 146 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C18918f c18918f = C18918f.f60363j;
                    AbstractC17563j.m19216d(FormattedList, it, this.f56189Z, this.f56190o0, this.f56191p0, this.f56192q0, c6021p, (i10 & 126) | 32768);
                }
                break;
            default:
                C18320E FormattedList2 = (C18320E) obj;
                C18064t astListItem = (C18064t) obj2;
                C6021p c6021p2 = (C6021p) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                AbstractC16544l.m18094g(FormattedList2, "$this$FormattedList");
                AbstractC16544l.m18094g(astListItem, "astListItem");
                int i11 = (iIntValue2 & 14) == 0 ? (c6021p2.m6542f(FormattedList2) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 112) == 0) {
                    i11 |= c6021p2.m6542f(astListItem) ? 32 : 16;
                }
                if ((i11 & 731) == 146 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C18918f c18918f2 = C18918f.f60363j;
                    AbstractC17563j.m19216d(FormattedList2, astListItem, this.f56189Z, this.f56190o0, this.f56191p0, this.f56192q0, c6021p2, (i11 & 126) | 32768);
                }
                break;
        }
        return c17296c;
    }
}
