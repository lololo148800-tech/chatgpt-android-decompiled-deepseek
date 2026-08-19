package p547Wc;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import androidx.compose.material3.MinimumInteractiveModifier;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1441p;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3884B1;
import p229J0.AbstractC3995V2;
import p229J0.AbstractC4124r4;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p571X9.AbstractC9262b4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17756f;
import p911o0.C17781r0;

/* JADX INFO: renamed from: Wc.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C8762F extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f26703Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f26704Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f26705o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC16546n f26706p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f26707q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8762F(List list, List list2, InterfaceC5985X interfaceC5985X, InterfaceC1440o interfaceC1440o, int i10) {
        super(4);
        this.f26703Y = list;
        this.f26704Z = list2;
        this.f26705o0 = interfaceC5985X;
        this.f26706p0 = (AbstractC16546n) interfaceC1440o;
        this.f26707q0 = i10;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [Bm.o, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
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
            Object obj5 = this.f26703Y.get(iIntValue);
            c6021p.m6524S(457184066);
            InterfaceC5985X interfaceC5985X = this.f26705o0;
            boolean zM18089b = AbstractC16544l.m18089b(obj5, interfaceC5985X.getValue());
            List list = this.f26704Z;
            boolean zContains = list.contains(obj5);
            c6021p.m6524S(14759025);
            InterfaceC10459q interfaceC10459qM9836a = AbstractC9262b4.m9836a(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), zContains);
            if (!list.contains(obj5)) {
                c6021p.m6524S(-945569001);
                boolean zM6545h = c6021p.m6545h(obj5);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == C6013l.f19514a) {
                    objM6514H = new C8816z(obj5, interfaceC5985X, false, 1);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                interfaceC10459qM9836a = AbstractC10833a.m11209d(interfaceC10459qM9836a, false, null, (InterfaceC1426a) objM6514H, 7);
            }
            c6021p.m6553p(false);
            C5984W0 c5984w0 = AbstractC3884B1.f11770a;
            InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(interfaceC10459qM9836a.mo428M(MinimumInteractiveModifier.f32651Y), AbstractC7313q.f23202g - 2, AbstractC7313q.f23199d);
            C17756f c17756f = AbstractC17770m.f56724a;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23201f), C10444b.f30944w0, c6021p, 54);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11234l);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC3995V2.m4711a(zM18089b, null, !zContains, null, null, c6021p, 48, 52);
            AbstractC4124r4.m4768b((String) this.f26706p0.invoke(obj5, c6021p, Integer.valueOf((this.f26707q0 >> 6) & 8)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
            c6021p.m6553p(true);
            c6021p.m6553p(false);
        }
        return C17296C.f55119a;
    }
}
