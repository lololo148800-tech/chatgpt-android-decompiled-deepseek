package p842k0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import io.sentry.android.replay.C15298l;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p017Af.C0470a;
import p017Af.C0492w;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1051v0.AbstractC20417e;
import p1071w0.AbstractC20740b0;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2550w0;
import p204I1.C3582M;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8103h5;
import p530Vi.AbstractC8301I;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p587Y1.AbstractC9582h;
import p587Y1.C9596v;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17790w;
import p911o0.C17794y;

/* JADX INFO: renamed from: k0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16306o {

    /* JADX INFO: renamed from: a */
    public static final C9596v f50514a = new C9596v(true, 14);

    /* JADX INFO: renamed from: b */
    public static final C16293b f50515b;

    static {
        long j10 = C14365u.f45055e;
        long j11 = C14365u.f45052b;
        f50515b = new C16293b(j10, j11, j11, C14365u.m15774b(0.38f, j11), C14365u.m15774b(0.38f, j11));
    }

    /* JADX INFO: renamed from: a */
    public static final void m17827a(C16293b c16293b, InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-921259293);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c16293b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(AbstractC10842a.m11235m(AbstractC10842a.m11239q(AbstractC10833a.m11207b(AbstractC8103h5.m8581b(interfaceC10459q, AbstractC16301j.f50500d, AbstractC20417e.m21079a(AbstractC16301j.f50501e), false, 28), c16293b.f50474a, AbstractC14334L.f44973a), 2), 0.0f, AbstractC16301j.f50505i, 1), AbstractC8479G.m9124e(c6021p), 14);
            int i12 = (i11 << 3) & 7168;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c8410b.invoke(C17794y.f56777a, c6021p, Integer.valueOf(((i12 >> 6) & 112) | 6));
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a((Object) c16293b, (Object) interfaceC10459q, c8410b, i10, 15);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m17828b(String str, boolean z6, C16293b c16293b, InterfaceC10459q interfaceC10459q, InterfaceC1440o interfaceC1440o, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        int i11;
        boolean z10;
        c6021p.m6526U(791018367);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(c16293b) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1440o) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C10450h c10450h = AbstractC16301j.f50502f;
            C17756f c17756f = AbstractC17770m.f56724a;
            float f10 = AbstractC16301j.f50504h;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(f10);
            boolean z11 = ((i11 & 112) == 32) | ((458752 & i11) == 131072);
            Object objM6514H = c6021p.m6514H();
            if (z11 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2550w0(z6, interfaceC1426a);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10833a.m11209d(interfaceC10459q, z6, str, (InterfaceC1426a) objM6514H, 4), 1.0f);
            float f11 = AbstractC16301j.f50497a;
            float f12 = AbstractC16301j.f50498b;
            float f13 = AbstractC16301j.f50499c;
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11254n(interfaceC10459qM11244d, f11, f13, f12, f13), f10, 0.0f, 2);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, c10450h, c6021p, 54);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11235m);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            if (interfaceC1440o == null) {
                c6021p.m6524S(554568909);
                z10 = false;
            } else {
                c6021p.m6524S(554568910);
                float f14 = AbstractC16301j.f50506j;
                InterfaceC10459q interfaceC10459qM11251k = AbstractC10844c.m11251k(c10456n, f14, 0.0f, f14, f14, 2);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i13 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11251k);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
                C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
                }
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                z10 = false;
                interfaceC1440o.invoke(new C14365u(z6 ? c16293b.f50476c : c16293b.f50478e), c6021p, 0);
                c6021p.m6553p(true);
            }
            c6021p.m6553p(z10);
            C3582M c3582m = new C3582M(z6 ? c16293b.f50475b : c16293b.f50477d, AbstractC16301j.f50507k, AbstractC16301j.f50508l, AbstractC16301j.f50510n, AbstractC16301j.f50503g, AbstractC16301j.f50509m, 16613240);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            AbstractC20740b0.m21261b(str, new LayoutWeightElement(AbstractC8301I.m8917h(1.0f, Float.MAX_VALUE), true), c3582m, null, 0, false, 1, 0, null, c6021p, (i11 & 14) | 1572864, 440);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0470a(str, z6, c16293b, interfaceC10459q, interfaceC1440o, interfaceC1426a, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m17829c(C16298g c16298g, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(712057293);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c16298g) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zM6542f = c6021p.m6542f((Configuration) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32824a)) | c6021p.m6542f(context);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                C16293b c16293b = f50515b;
                long jM15625c = c16293b.f50474a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iM15617F = AbstractC14334L.m15617F(jM15625c);
                int color = typedArrayObtainStyledAttributes.getColor(0, iM15617F);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iM15617F) {
                    jM15625c = AbstractC14334L.m15625c(color);
                }
                long j10 = jM15625c;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jM15625c2 = c16293b.f50475b;
                int iM15617F2 = AbstractC14334L.m15617F(jM15625c2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iM15617F2)) : null;
                if (numValueOf != null && numValueOf.intValue() != iM15617F2) {
                    jM15625c2 = AbstractC14334L.m15625c(numValueOf.intValue());
                }
                long j11 = jM15625c2;
                long jM15625c3 = c16293b.f50477d;
                int iM15617F3 = AbstractC14334L.m15617F(jM15625c3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iM15617F3)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iM15617F3) {
                    jM15625c3 = AbstractC14334L.m15625c(numValueOf2.intValue());
                }
                long j12 = jM15625c3;
                objM6514H = new C16293b(j10, j11, j11, j12, j12);
                c6021p.m6537c0(objM6514H);
            }
            m17830d(c16298g, interfaceC1426a, interfaceC10459q, (C16293b) objM6514H, interfaceC1436k, c6021p, (i11 & 1022) | ((i11 << 3) & 57344));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(c16298g, interfaceC1426a, interfaceC10459q, interfaceC1436k, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m17830d(C16298g c16298g, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C16293b c16293b, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1447189339);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c16298g) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(c16293b) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9582h.m10129a(c16298g, interfaceC1426a, f50514a, AbstractC8411c.m8969c(795909757, c6021p, new C15298l(c16293b, interfaceC10459q, interfaceC1436k)), c6021p, (i11 & 14) | 3456 | (i11 & 112), 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(c16298g, interfaceC1426a, interfaceC10459q, c16293b, interfaceC1436k, i10);
        }
    }
}
