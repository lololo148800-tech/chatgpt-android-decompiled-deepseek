package p594Y9;

import androidx.compose.foundation.layout.AbstractC10842a;
import kotlin.jvm.internal.AbstractC16544l;
import p124Ei.C2441A0;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6018n0;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p919o8.C17985k1;

/* JADX INFO: renamed from: Y9.B3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9703B3 {
    /* JADX INFO: renamed from: a */
    public static final void m10296a(String text, InterfaceC10459q interfaceC10459q, long j10, C6021p c6021p, int i10) {
        int i11;
        long j11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(text, "text");
        c6021p.m6526U(606759851);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(text) ? 4 : 2);
        } else {
            i11 = i10;
        }
        int i12 = i11 | 432;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            j11 = j10;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            long j12 = C14365u.f45060j;
            AbstractC4124r4.m4768b(text, AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23198c), j12, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12152h, c6021p, i12 & 910, 0, 65528);
            j11 = j12;
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2441A0(text, interfaceC10459q2, j11, i10, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17985k1 m10297b(C3676s c3676s) {
        try {
            String testId = c3676s.m4395w("test_id").mo4384r();
            String resultId = c3676s.m4395w("result_id").mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("injected");
            Boolean boolValueOf = abstractC3673pM4395w != null ? Boolean.valueOf(abstractC3673pM4395w.mo4380f()) : null;
            AbstractC16544l.m18093f(testId, "testId");
            AbstractC16544l.m18093f(resultId, "resultId");
            return new C17985k1(testId, resultId, boolValueOf);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Synthetics", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Synthetics", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Synthetics", e12);
        }
    }
}
