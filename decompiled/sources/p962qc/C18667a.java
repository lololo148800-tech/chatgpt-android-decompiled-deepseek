package p962qc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p204I1.C3582M;
import p228J.AbstractC3794B0;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p229J0.C4023b;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p774h1.C14365u;

/* JADX INFO: renamed from: qc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18667a extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Z */
    public static final C18667a f59419Z = new C18667a(4, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18667a f59420o0 = new C18667a(4, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59421Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18667a(int i10, int i11) {
        super(i10);
        this.f59421Y = i11;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        switch (this.f59421Y) {
            case 0:
                C3582M textStyle = (C3582M) obj;
                InterfaceC1439n content = (InterfaceC1439n) obj2;
                C6021p c6021p = (C6021p) obj3;
                int iIntValue = ((Number) obj4).intValue();
                AbstractC16544l.m18094g(textStyle, "textStyle");
                AbstractC16544l.m18094g(content, "content");
                if ((iIntValue & 14) == 0) {
                    i10 = (c6021p.m6542f(textStyle) ? 4 : 2) | iIntValue;
                } else {
                    i10 = iIntValue;
                }
                if ((iIntValue & 112) == 0) {
                    i10 |= c6021p.m6545h(content) ? 32 : 16;
                }
                if ((i10 & 731) == 146 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4767a(textStyle, content, c6021p, i10 & 126);
                }
                break;
            default:
                long j10 = ((C14365u) obj).f45062a;
                InterfaceC1439n content2 = (InterfaceC1439n) obj2;
                C6021p c6021p2 = (C6021p) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                AbstractC16544l.m18094g(content2, "content");
                if ((iIntValue2 & 14) == 0) {
                    i11 = (c6021p2.m6540e(j10) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 112) == 0) {
                    i11 |= c6021p2.m6545h(content2) ? 32 : 16;
                }
                if ((i11 & 731) == 146 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C5997d.m6440a(AbstractC3794B0.m4494s(j10, AbstractC4025b1.f12649a), AbstractC8411c.m8968b(-363713855, c6021p2, new C4023b(content2, 9)), c6021p2, 56);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
