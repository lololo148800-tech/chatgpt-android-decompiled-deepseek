package af;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p000.C19281s;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3582M;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8050b0;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p527Ve.C8269f;
import p594Y9.AbstractC9740H4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;

/* JADX INFO: renamed from: af.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C10587o extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31436Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f31437Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10587o(int i10, List list) {
        super(3);
        this.f31436Y = i10;
        this.f31437Z = list;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6021p c6021p;
        boolean z6;
        boolean z10;
        int i10;
        int i11;
        float f10 = 0.0f;
        C17296C c17296c = C17296C.f55119a;
        int i12 = 2;
        boolean z11 = false;
        List list = this.f31437Z;
        switch (this.f31436Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC8050b0.m8443d(0, c6021p2, null, list);
                }
                break;
            case 1:
                C10845a item2 = (C10845a) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23198c);
                    C10456n c10456n = C10456n.f30959Y;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, C10444b.f30946y0, c6021p3, 0);
                    int i13 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p3, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p3, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i13))) {
                        AbstractC0168G.m537z(i13, c6021p3, i13, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d);
                    c6021p3.m6524S(223432881);
                    int size = list.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i14 = size - 1;
                            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23201f, f10, i12);
                            C17756f c17756f2 = AbstractC17770m.f56724a;
                            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30944w0, c6021p3, 48);
                            int i15 = c6021p3.f19564P;
                            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p3.m6550m();
                            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11235m);
                            InterfaceC21700k.f68875m0.getClass();
                            C21696i c21696i2 = C21698j.f68869b;
                            c6021p3.m6528W();
                            if (c6021p3.f19563O) {
                                c6021p3.m6549l(c21696i2);
                            } else {
                                c6021p3.m6543f0();
                            }
                            C21694h c21694h2 = C21698j.f68873f;
                            C5997d.m6439Z(c21694h2, c6021p3, c17781r0M19506b);
                            C21694h c21694h3 = C21698j.f68872e;
                            C5997d.m6439Z(c21694h3, c6021p3, interfaceC6008i0M6550m2);
                            C21694h c21694h4 = C21698j.f68874g;
                            if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i15))) {
                                AbstractC0168G.m537z(i15, c6021p3, i15, c21694h4);
                            }
                            C21694h c21694h5 = C21698j.f68871d;
                            C5997d.m6439Z(c21694h5, c6021p3, interfaceC10459qM10923d2);
                            C17785t0 c17785t0 = C17785t0.f56761a;
                            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30938q0, z11);
                            int i16 = c6021p3.f19564P;
                            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p3.m6550m();
                            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p3, c10456n);
                            c6021p3.m6528W();
                            if (c6021p3.f19563O) {
                                c6021p3.m6549l(c21696i2);
                            } else {
                                c6021p3.m6543f0();
                            }
                            C5997d.m6439Z(c21694h2, c6021p3, interfaceC21057KM19511e);
                            C5997d.m6439Z(c21694h3, c6021p3, interfaceC6008i0M6550m3);
                            if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i16))) {
                                AbstractC0168G.m537z(i16, c6021p3, i16, c21694h4);
                            }
                            C5997d.m6439Z(c21694h5, c6021p3, interfaceC10459qM10923d3);
                            c6021p3.m6524S(-688095296);
                            float fMo7870w = ((InterfaceC7537b) c6021p3.m6548k(AbstractC0187M0.f704f)).mo7870w(((C3582M) c6021p3.m6548k(AbstractC4124r4.f13310a)).f10910a.f10860b);
                            c6021p3.m6553p(false);
                            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.star_filled, c6021p3, 0);
                            C5984W0 c5984w0 = AbstractC3959O0.f12302a;
                            C6021p c6021p4 = c6021p3;
                            AbstractC3878A1.m4596a(abstractC17140aM8631b, null, AbstractC10844c.m11252l(c10456n, 1.5f * fMo7870w), ((C3949M0) c6021p3.m6548k(c5984w0)).f12239u, c6021p3, 48, 0);
                            if (size != 0) {
                                z10 = true;
                                if (size == 1) {
                                    i10 = R.string.gizmo_2_star;
                                } else if (size != 2) {
                                    i10 = size != 3 ? R.string.gizmo_5_star : R.string.gizmo_4_star;
                                } else {
                                    i10 = R.string.gizmo_3_star;
                                }
                            } else {
                                z10 = true;
                                i10 = R.string.gizmo_1_star;
                            }
                            String strM8676d = AbstractC8142m4.m8676d(i10, c6021p4);
                            long j10 = ((C3949M0) c6021p4.m6548k(c5984w0)).f12240v;
                            boolean z12 = z10;
                            c6021p = c6021p4;
                            z6 = z12;
                            AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11237o(c10456n, 0.0f, 0.1f * fMo7870w, 0.0f, 0.0f, 13), j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131064);
                            c6021p.m6553p(z6);
                            c10456n = c10456n;
                            InterfaceC10459q interfaceC10459qM19513a = c17785t0.m19513a(c10456n, 1.0f, z6);
                            float f11 = 0;
                            long j11 = ((C3949M0) c6021p.m6548k(c5984w0)).f12239u;
                            c6021p.m6524S(13228178);
                            boolean zM6545h = c6021p.m6545h(list) | c6021p.m6538d(size);
                            Object objM6514H = c6021p.m6514H();
                            if (zM6545h || objM6514H == C6013l.f19514a) {
                                i11 = 2;
                                objM6514H = new C19281s(list, size, 2);
                                c6021p.m6537c0(objM6514H);
                            } else {
                                i11 = 2;
                            }
                            c6021p.m6553p(false);
                            AbstractC3980S2.m4669c((InterfaceC1426a) objM6514H, interfaceC10459qM19513a, j11, 0L, 0, f11, C10588p.f31438Y, c6021p, 1769472, 8);
                            c6021p.m6553p(z6);
                            if (i14 >= 0) {
                                i12 = i11;
                                c6021p3 = c6021p;
                                size = i14;
                                f10 = 0.0f;
                                z11 = false;
                            }
                        }
                    } else {
                        c6021p = c6021p3;
                        z6 = true;
                    }
                    c6021p.m6553p(false);
                    c6021p.m6553p(z6);
                }
                break;
            default:
                C10845a item3 = (C10845a) obj;
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item3, "$this$item");
                if ((iIntValue3 & 17) == 16 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    c6021p5.m6524S(-704499518);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC8142m4.m8676d(((C8269f) it.next()).f25777a, c6021p5));
                    }
                    c6021p5.m6553p(false);
                    AbstractC4124r4.m4769c(AbstractC9740H4.m10330e(arrayList), AbstractC10842a.m11235m(C10456n.f30959Y, AbstractC7313q.f23201f, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p5, 0, 0, 262140);
                }
                break;
        }
        return c17296c;
    }
}
