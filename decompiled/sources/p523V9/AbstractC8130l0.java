package p523V9;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.viewinterop.AbstractC10869a;
import ao.C11164g;
import bo.AbstractC11516d;
import bo.C11534v;
import com.segment.analytics.kotlin.core.AbstractC12774a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import p003A1.C0184L0;
import p017Af.C0467N;
import p017Af.C0468O;
import p017Af.C0469P;
import p017Af.C0481l;
import p017Af.C0491v;
import p040Bd.C0979P1;
import p040Bd.EnumC0973O1;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4141u3;
import p229J0.C4135t3;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p646aj.AbstractC10628h;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: V9.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8130l0 {
    /* JADX INFO: renamed from: a */
    public static final void m8646a(C0979P1 reference, InterfaceC1436k onLinkClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        Object obj;
        String str;
        AbstractC16544l.m18094g(reference, "reference");
        AbstractC16544l.m18094g(onLinkClick, "onLinkClick");
        c6021p.m6526U(414923973);
        if ((i10 & 6) == 0) {
            i11 = i10 | ((i10 & 8) == 0 ? c6021p.m6542f(reference) : c6021p.m6545h(reference) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onLinkClick) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            obj = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            EnumC0973O1 enumC0973O1 = EnumC0973O1.Youtube;
            C5975S c5975s = C6013l.f19514a;
            boolean z6 = true;
            if (reference.f2763d != enumC0973O1 || (str = reference.f2764e) == null) {
                c6021p.m6524S(2095837026);
                c6021p.m6524S(-2010601218);
                boolean z10 = (i12 & 112) == 32;
                if ((i12 & 14) != 4 && ((i12 & 8) == 0 || !c6021p.m6545h(reference))) {
                    z6 = false;
                }
                boolean z11 = z10 | z6;
                Object objM6514H = c6021p.m6514H();
                if (z11 || objM6514H == c5975s) {
                    objM6514H = new C0467N(onLinkClick, reference, 1);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, c10456n, false, null, null, null, null, null, null, AbstractC8411c.m8969c(-1374359975, c6021p, new C0468O(reference, 0)), c6021p, ((i12 >> 3) & 112) | 805306368, 508);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(2095674245);
                c6021p.m6524S(-2010605250);
                boolean z12 = (i12 & 112) == 32;
                if ((i12 & 14) != 4 && ((i12 & 8) == 0 || !c6021p.m6545h(reference))) {
                    z6 = false;
                }
                boolean z13 = z12 | z6;
                Object objM6514H2 = c6021p.m6514H();
                if (z13 || objM6514H2 == c5975s) {
                    objM6514H2 = new C0467N(onLinkClick, reference, 0);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                m8647b(i12 & 896, (InterfaceC1426a) objM6514H2, c6021p, c10456n, str);
                c6021p.m6553p(false);
            }
            obj = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(reference, onLinkClick, obj, i10, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8647b(int i10, InterfaceC1426a interfaceC1426a, C6021p c6021p, InterfaceC10459q interfaceC10459q, String str) {
        int i11;
        c6021p.m6526U(-2100401456);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(AbstractC8079e5.m8501a(AbstractC10842a.m11226d(AbstractC10844c.m11244d(AbstractC10864a.m11306b(interfaceC10459q, 0.0f, 0.0f, 0.99607843f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 126971), 1.0f), 1.7777778f), ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13380d), false, null, interfaceC1426a, 7);
            c6021p.m6524S(456990003);
            boolean z6 = (i11 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C0491v(str, 1);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC10869a.m11356b((InterfaceC1436k) objM6514H, interfaceC10459qM11209d, C0481l.f1563q0, c6021p, 384, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0469P(str, interfaceC1426a, interfaceC10459q, i10, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m8648c(InterfaceC19201o2 interfaceC19201o2) {
        return interfaceC19201o2.getConfig().getName();
    }

    /* JADX INFO: renamed from: d */
    public static final void m8649d(AbstractC12774a abstractC12774a, String str, AbstractC16643b jsonElement) {
        AbstractC16544l.m18094g(jsonElement, "jsonElement");
        C11534v c11534v = new C11534v(0);
        AbstractC10628h.m11000b(c11534v, abstractC12774a.mo14507d());
        c11534v.m12927c(str, jsonElement);
        abstractC12774a.mo14515l(c11534v.m12925a());
    }

    /* JADX INFO: renamed from: e */
    public static final void m8650e(AbstractC12774a abstractC12774a) {
        Boolean bool = Boolean.TRUE;
        AbstractC16643b abstractC16643bM12904c = AbstractC11516d.f34842d.m12904c(C11164g.f33804a, bool);
        C11534v c11534v = new C11534v(0);
        AbstractC10628h.m11000b(c11534v, abstractC12774a.mo14508e());
        c11534v.m12927c("Segment.io", abstractC16643bM12904c);
        abstractC12774a.mo14516m(c11534v.m12925a());
    }
}
