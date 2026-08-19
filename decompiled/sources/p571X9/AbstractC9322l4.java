package p571X9;

import androidx.compose.foundation.AbstractC10833a;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import gd.C13877N0;
import kotlin.jvm.internal.AbstractC16544l;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3914G1;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p363Og.C6207k;
import p482Tg.AbstractC7457n;
import p482Tg.C7449f;
import p523V9.AbstractC8086f4;
import p523V9.AbstractC8160o6;
import p537W0.C8410b;
import p594Y9.AbstractC9834X3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p919o8.C18025y;

/* JADX INFO: renamed from: X9.l4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9322l4 {
    /* JADX INFO: renamed from: a */
    public static final void m9912a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-394493928);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            if (!AbstractC8160o6.m8729d(C13877N0.f43915c, c6021p)) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 16);
                    return;
                }
                return;
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C7449f.f23578q0, c6021p, 3072, 6);
            c6021p.m6524S(1180699392);
            boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            Object obj = C6013l.f19514a;
            if (zBooleanValue) {
                c6021p.m6524S(1180701855);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C6207k(interfaceC5985X, 10);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC8086f4.m8514a(0, (InterfaceC1426a) objM6514H, c6021p, null);
            }
            c6021p.m6553p(false);
            C8410b c8410b = AbstractC7457n.f23671a;
            c6021p.m6524S(1180707806);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C6207k(interfaceC5985X, 11);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(c8410b, AbstractC10833a.m11209d(interfaceC10459q2, false, null, (InterfaceC1426a) objM6514H2, 7), null, null, AbstractC7457n.f23672b, null, null, 0.0f, 0.0f, c6021p, 24582, 492);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C1282x(interfaceC10459q2, i10, 17);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18025y m9913b(C3676s c3676s) {
        try {
            String name = c3676s.m4395w(DiagnosticsEntry.NAME_KEY).mo4384r();
            String version = c3676s.m4395w("version").mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("build");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            String versionMajor = c3676s.m4395w("version_major").mo4384r();
            AbstractC16544l.m18093f(name, "name");
            AbstractC16544l.m18093f(version, "version");
            AbstractC16544l.m18093f(versionMajor, "versionMajor");
            return new C18025y(name, version, strMo4384r, versionMajor);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Os", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Os", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Os", e12);
        }
    }
}
