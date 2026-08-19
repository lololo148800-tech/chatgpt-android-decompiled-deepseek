package p571X9;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0566C0;
import p025An.C0569E;
import p025An.C0583L;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.InterfaceC0627n0;
import p077Cn.C1756x;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p485Tk.AbstractC7499h;
import p485Tk.C7492a;
import p485Tk.C7493b;
import p485Tk.C7500i;
import p509Uk.C7713f;
import p754fl.C13694d;
import p909nm.AbstractC17678l;
import p919o8.C17891E;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: X9.q4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9352q4 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [Tk.c, Uk.f] */
    /* JADX WARN: Type inference failed for: r8v1, types: [An.F, Tk.c] */
    /* JADX WARN: Type inference failed for: r8v3, types: [Tk.c] */
    /* JADX INFO: renamed from: a */
    public static final Object m9944a(C7713f c7713f, C13694d c13694d, AbstractC19687c abstractC19687c) {
        C7492a c7492a;
        if (abstractC19687c instanceof C7492a) {
            c7492a = (C7492a) abstractC19687c;
            int i10 = c7492a.f23790p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7492a.f23790p0 = i10 - Integer.MIN_VALUE;
            } else {
                c7492a = new C7492a(abstractC19687c);
            }
        } else {
            c7492a = new C7492a(abstractC19687c);
        }
        Object objPlus = c7492a.f23789o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7492a.f23790p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c13694d = c7492a.f23788Z;
                c7713f = c7492a.f23787Y;
                AbstractC9233X.m9807c(objPlus);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objPlus);
            }
            return objPlus;
        }
        AbstractC9233X.m9807c(objPlus);
        C0566C0 c0566c0 = c13694d.f43205e;
        c7492a.f23787Y = c7713f;
        c7492a.f23788Z = c13694d;
        c7492a.f23790p0 = 1;
        C0569E c0569e = AbstractC7499h.f23800a;
        C0631p0 c0631p0 = new C0631p0(c0566c0);
        objPlus = c7713f.f24306s0.plus(c0631p0).plus(AbstractC7499h.f23800a);
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) c7492a.getContext().get(C0625m0.f1875Y);
        if (interfaceC0627n0 != null) {
            c0631p0.mo1271H0(new C1756x(interfaceC0627n0.mo1270E(true, true, new C1756x(c0631p0, 7)), 6));
        }
        if (objPlus == enumC19250a) {
            return enumC19250a;
        }
        InterfaceC18776i interfaceC18776i = (InterfaceC18776i) objPlus;
        C0583L c0583lM1177f = AbstractC0575H.m1177f(c7713f, interfaceC18776i.plus(new C7500i(interfaceC18776i)), new C7493b(c7713f, c13694d, null), 2);
        c7492a.f23787Y = null;
        c7492a.f23788Z = null;
        c7492a.f23790p0 = 2;
        objPlus = c0583lM1177f.m1309u(c7492a);
        if (objPlus == enumC19250a) {
            return enumC19250a;
        }
        return objPlus;
    }

    /* JADX INFO: renamed from: b */
    public static C17891E m9945b(C3676s c3676s) {
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
                if (!AbstractC17678l.m19298e(c4621nM5364a.getKey(), C17891E.f57015e)) {
                    Object key = c4621nM5364a.getKey();
                    AbstractC16544l.m18093f(key, "entry.key");
                    linkedHashMap.put(key, c4621nM5364a.getValue());
                }
            }
            return new C17891E(strMo4384r, strMo4384r2, strMo4384r3, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Usr", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Usr", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Usr", e12);
        }
    }
}
