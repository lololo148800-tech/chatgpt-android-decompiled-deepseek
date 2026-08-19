package p039Bc;

import com.openai.feature.conversations.impl.variants.AbstractC12346a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p1143z4.C21778h;
import p229J0.AbstractC3918H;
import p243Jf.C4334d;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p553Wh.C8870f;
import p577Xf.AbstractC9512k;
import p577Xf.C9509h;
import p736f0.InterfaceC13499q;

/* JADX INFO: renamed from: Bc.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C0876j extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2571Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8870f f2572Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0876j(C8870f c8870f, int i10) {
        super(4);
        this.f2571Y = i10;
        this.f2572Z = c8870f;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f2571Y) {
            case 0:
                AbstractC0168G.m506A((Number) obj4, (InterfaceC13499q) obj, "$this$conversationComposable", (C21778h) obj2, "it");
                AbstractC12346a.m14272a(this.f2572Z, null, null, (C6021p) obj3, 8);
                break;
            default:
                C9509h anonymous$parameter$0$ = (C9509h) obj;
                InterfaceC1436k anonymous$parameter$1$ = (InterfaceC1436k) obj2;
                C6021p c6021p = (C6021p) obj3;
                int iIntValue = ((Number) obj4).intValue();
                AbstractC16544l.m18094g(anonymous$parameter$0$, "$anonymous$parameter$0$");
                AbstractC16544l.m18094g(anonymous$parameter$1$, "$anonymous$parameter$1$");
                if ((iIntValue & 129) == 128 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3918H.m4622d(AbstractC9512k.f28633a, null, AbstractC8411c.m8969c(1303127812, c6021p, new C4334d(this.f2572Z, 21)), null, 0.0f, null, null, null, c6021p, 390, 250);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
