package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p042Bf.C1276r;
import p204I1.C3582M;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6014l0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p478Tc.AbstractC7302f;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p537W0.C8410b;
import p547Wc.C8790e;
import p547Wc.EnumC8792f;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p909nm.AbstractC17678l;
import p919o8.C17988l1;

/* JADX INFO: renamed from: Y9.C3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9709C3 {
    /* JADX INFO: renamed from: a */
    public static final void m10300a(EnumC8792f enumC8792f, InterfaceC10459q interfaceC10459q, int i10, C8410b c8410b, C6021p c6021p, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        c6021p.m6526U(-2123410700);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(enumC8792f) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            i15 = i10;
        } else {
            c6021p.m6519N();
            if ((i11 & 1) == 0 || c6021p.m6561x()) {
                i13 = i12 & (-897);
                i14 = R.drawable.info;
            } else {
                c6021p.m6517L();
                i13 = i12 & (-897);
                i14 = i10;
            }
            c6021p.m6554q();
            C8790e c8790eM10302c = m10302c(enumC8792f, c6021p, i13 & 14);
            C6014l0 c6014l0M4494s = AbstractC3794B0.m4494s(c8790eM10302c.f26886a, AbstractC4025b1.f12649a);
            C6037x c6037x = AbstractC4124r4.f13310a;
            C5997d.m6442b(new C6014l0[]{c6014l0M4494s, c6037x.mo6405a(C3582M.m4274b((C3582M) c6021p.m6548k(c6037x), c8790eM10302c.f26886a, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 16777214))}, AbstractC8411c.m8969c(1808291764, c6021p, new C8409a(interfaceC10459q, c8790eM10302c, i14, c8410b)), c6021p, 56);
            i15 = i14;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(enumC8792f, interfaceC10459q, i15, c8410b, i11, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17988l1 m10301b(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(ParameterNames.f31999ID);
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("email");
            String strMo4384r3 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((C4619l) c3676s.f11174Y.entrySet()).iterator();
            while (((AbstractC4620m) it).hasNext()) {
                C4621n c4621nM5364a = ((C4618k) it).m5364a();
                if (!AbstractC17678l.m19298e(c4621nM5364a.getKey(), C17988l1.f57431e)) {
                    Object key = c4621nM5364a.getKey();
                    AbstractC16544l.m18093f(key, "entry.key");
                    linkedHashMap.put(key, c4621nM5364a.getValue());
                }
            }
            return new C17988l1(strMo4384r, strMo4384r2, strMo4384r3, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Usr", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Usr", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Usr", e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX INFO: renamed from: c */
    public static final C8790e m10302c(EnumC8792f enumC8792f, C6021p c6021p, int i10) {
        boolean z6;
        c6021p.m6524S(1866567297);
        long j10 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
        C3949M0 c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
        c6021p.m6524S(-318180131);
        if (((i10 & 14) ^ 6) > 4 && c6021p.m6542f(enumC8792f)) {
            z6 = true;
        } else if ((i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean zM6542f = z6 | c6021p.m6542f(c3949m0) | c6021p.m6540e(j10);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            int iOrdinal = enumC8792f.ordinal();
            if (iOrdinal == 0) {
                objM6514H = new C8790e(j10, c3949m0.f12234p, c3949m0.f12187A, null);
            } else if (iOrdinal == 1) {
                long j11 = AbstractC7302f.f23134j;
                objM6514H = new C8790e(j11, C14365u.m15774b(0.05f, j11), C14365u.m15774b(0.16f, j11), new C14365u(C14365u.m15774b(0.1f, C14365u.f45052b)));
            } else {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                long j12 = AbstractC7302f.f23133i;
                objM6514H = new C8790e(j12, C14365u.m15774b(0.05f, j12), C14365u.m15774b(0.16f, j12), new C14365u(C14365u.m15774b(0.1f, C14365u.f45052b)));
            }
            c6021p.m6537c0(objM6514H);
        }
        C8790e c8790e = (C8790e) objM6514H;
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        return c8790e;
    }
}
