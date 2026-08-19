package nc;

import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1441p;
import p1053v3.p1054lN.IGDwkYw;
import p349O0.C6021p;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9206S2;
import p594Y9.AbstractC9961r4;
import p635a1.C10456n;
import p923oc.C18056l;
import p923oc.C18058n;

/* JADX INFO: renamed from: nc.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C17562i extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56198Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC9961r4 f56199Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17562i(AbstractC9961r4 abstractC9961r4, int i10) {
        super(4);
        this.f56198Y = i10;
        this.f56199Z = abstractC9961r4;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f56198Y) {
            case 0:
                InterfaceC7537b $receiver = (InterfaceC7537b) obj;
                C6021p c6021p = (C6021p) obj3;
                int iIntValue = ((Number) obj4).intValue();
                AbstractC16544l.m18094g($receiver, "$this$$receiver");
                AbstractC16544l.m18094g((String) obj2, IGDwkYw.cnQZRFdFSIB);
                if ((iIntValue & 641) == 128 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC9206S2.m9770a(((C18056l) this.f56199Z).f57609a, c6021p, 0);
                }
                break;
            default:
                InterfaceC7537b $receiver2 = (InterfaceC7537b) obj;
                String it = (String) obj2;
                C6021p c6021p2 = (C6021p) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                AbstractC16544l.m18094g($receiver2, "$this$$receiver");
                AbstractC16544l.m18094g(it, "it");
                if ((iIntValue2 & 641) == 128 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C18058n c18058n = (C18058n) this.f56199Z;
                    AbstractC17566m.m19217a(c18058n.f57612b, c18058n.f57611a, AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), c6021p2, 3456);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
