package p870le;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3984T1;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8479G;
import p594Y9.AbstractC10009z4;
import p594Y9.AbstractC9746I4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.InterfaceC13499q;
import p758g0.C13775m0;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17786u;
import p911o0.C17794y;

/* JADX INFO: renamed from: le.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C16853J extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54066Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f54067Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f54068o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16853J(List list, InterfaceC1436k interfaceC1436k, int i10) {
        super(3);
        this.f54066Y = i10;
        this.f54067Z = list;
        this.f54068o0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C10456n c10456n = C10456n.f30959Y;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC1436k interfaceC1436k = this.f54068o0;
        List list = this.f54067Z;
        int i10 = 0;
        switch (this.f54066Y) {
            case 0:
                C17794y Card = (C17794y) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Card, "$this$Card");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(1861668944);
                    boolean zM6545h = c6021p.m6545h(list) | c6021p.m6542f(interfaceC1436k);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6545h || objM6514H == C6013l.f19514a) {
                        objM6514H = new C13775m0(list, 25, interfaceC1436k);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC9746I4.m10337a(null, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 0, 255);
                }
                break;
            case 1:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                AbstractC3984T1.m4687f(AbstractC10842a.m11235m(AbstractC10844c.m11244d(AbstractC10844c.m11247g(c10456n, 0.0f, AbstractC16854K.f54069a, 1), 1.0f), AbstractC7313q.f23201f, 0.0f, 2), null, null, null, null, AbstractC8411c.m8969c(-126875605, c6021p2, new C16853J(list, interfaceC1436k, i10)), c6021p2, 196608, 30);
                break;
            default:
                C17786u BoxWithConstraints = (C17786u) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p3.m6542f(BoxWithConstraints) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    float fM19514a = BoxWithConstraints.m19514a() - AbstractC7313q.f23205j;
                    InterfaceC10459q interfaceC10459qM9122c = AbstractC8479G.m9122c(AbstractC10842a.m11229g(AbstractC10844c.m11244d(c10456n, 1.0f), 1), AbstractC8479G.m9124e(c6021p3));
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23201f), C10444b.f30943v0, c6021p3, 0);
                    int i11 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM9122c);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p3, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p3, i11, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d);
                    AbstractC17758g.m19482b(c6021p3, c10456n);
                    c6021p3.m6524S(805764392);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC10009z4.m10648a((String) it.next(), interfaceC1436k, AbstractC10844c.m11257q(c10456n, 0.0f, fM19514a, 1), c6021p3, 0);
                    }
                    c6021p3.m6553p(false);
                    AbstractC17758g.m19482b(c6021p3, c10456n);
                    c6021p3.m6553p(true);
                }
                break;
        }
        return c17296c;
    }
}
