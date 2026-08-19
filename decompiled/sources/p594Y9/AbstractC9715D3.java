package p594Y9;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.material3.MinimumInteractiveModifier;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2535p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3884B1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7846A5;
import p523V9.AbstractC8239y5;
import p547Wc.C8794g;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p895n1.C17429i;
import p895n1.C17432l;
import p895n1.C17433m;
import p895n1.C17440t;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17756f;
import p911o0.C17781r0;
import p919o8.C17991m1;

/* JADX INFO: renamed from: Y9.D3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9715D3 {
    /* JADX INFO: renamed from: a */
    public static final void m10307a(String text, boolean z6, InterfaceC1426a onClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C17425e c17425eM19122b;
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(417569926);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(text) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(interfaceC10459q, 1.0f);
            c6021p.m6524S(1952762375);
            boolean z10 = (i11 & 896) == 256;
            Object objM6514H = c6021p.m6514H();
            if (z10 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2535p(25, onClick);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10833a.m11209d(interfaceC10459qM11244d, false, null, (InterfaceC1426a) objM6514H, 7), AbstractC7313q.f23201f, 0.0f, 2);
            C5984W0 c5984w0 = AbstractC3884B1.f11770a;
            InterfaceC10459q interfaceC10459qMo428M = interfaceC10459qM11235m.mo428M(MinimumInteractiveModifier.f32651Y);
            C17756f c17756f = AbstractC17770m.f56724a;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30943v0, c6021p, 6);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC4124r4.m4768b(text, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j, c6021p, i11 & 14, 0, 65534);
            if (z6) {
                c17425eM19122b = AbstractC7846A5.f24738a;
                if (c17425eM19122b == null) {
                    C17424d c17424d = new C17424d("Outlined.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i13 = AbstractC17418F.f55636a;
                    C14341T c14341t = new C14341T(C14365u.f45052b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new C17433m(7.41f, 15.41f));
                    arrayList.add(new C17432l(12.0f, 10.83f));
                    arrayList.add(new C17440t(4.59f, 4.58f));
                    arrayList.add(new C17432l(18.0f, 14.0f));
                    arrayList.add(new C17440t(-6.0f, -6.0f));
                    arrayList.add(new C17440t(-6.0f, 6.0f));
                    arrayList.add(new C17440t(1.41f, 1.41f));
                    arrayList.add(C17429i.f55733c);
                    C17424d.m19121a(c17424d, arrayList, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                    c17425eM19122b = c17424d.m19122b();
                    AbstractC7846A5.f24738a = c17425eM19122b;
                }
            } else {
                c17425eM19122b = AbstractC8239y5.f25715a;
                if (c17425eM19122b == null) {
                    C17424d c17424d2 = new C17424d("Outlined.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i14 = AbstractC17418F.f55636a;
                    C14341T c14341t2 = new C14341T(C14365u.f45052b);
                    ArrayList arrayList2 = new ArrayList(32);
                    arrayList2.add(new C17433m(7.41f, 8.59f));
                    arrayList2.add(new C17432l(12.0f, 13.17f));
                    arrayList2.add(new C17440t(4.59f, -4.58f));
                    arrayList2.add(new C17432l(18.0f, 10.0f));
                    arrayList2.add(new C17440t(-6.0f, 6.0f));
                    arrayList2.add(new C17440t(-6.0f, -6.0f));
                    arrayList2.add(new C17440t(1.41f, -1.41f));
                    arrayList2.add(C17429i.f55733c);
                    C17424d.m19121a(c17424d2, arrayList2, 0, c14341t2, null, 1.0f, 0, 2, 1.0f);
                    c17425eM19122b = c17424d2.m19122b();
                    AbstractC8239y5.f25715a = c17425eM19122b;
                }
            }
            AbstractC3878A1.m4597b(c17425eM19122b, "", AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23186c), 0L, c6021p, 432, 8);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8794g(i10, 0, onClick, interfaceC10459q, text, z6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17991m1 m10308b(C3676s c3676s) {
        try {
            Number width = c3676s.m4395w("width").mo4383q();
            Number height = c3676s.m4395w("height").mo4383q();
            AbstractC16544l.m18093f(width, "width");
            AbstractC16544l.m18093f(height, "height");
            return new C17991m1(width, height);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Viewport", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Viewport", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Viewport", e12);
        }
    }
}
