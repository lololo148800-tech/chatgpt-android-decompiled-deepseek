package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p1135yn.C21555b;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p635a1.C10444b;
import p635a1.InterfaceC10460r;
import p909nm.AbstractC17678l;
import p919o8.C17978i0;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Y9.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9812U {
    /* JADX INFO: renamed from: a */
    public static final Object m10440a(long j10, AbstractC19694j abstractC19694j) {
        float fM21835e = C21555b.m21835e(j10);
        InterfaceC18776i context = abstractC19694j.getContext();
        AbstractC16544l.m18094g(context, "<this>");
        InterfaceC10460r interfaceC10460r = (InterfaceC10460r) context.get(C10444b.f30933B0);
        Object objM1184m = AbstractC0575H.m1184m((long) ((interfaceC10460r != null ? interfaceC10460r.mo814W() : 1.0f) * fM21835e), abstractC19694j);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        C17296C c17296c = C17296C.f55119a;
        if (objM1184m != enumC19250a) {
            objM1184m = c17296c;
        }
        return objM1184m == enumC19250a ? objM1184m : c17296c;
    }

    /* JADX INFO: renamed from: b */
    public static C17978i0 m10441b(C3676s c3676s) {
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
                if (!AbstractC17678l.m19298e(c4621nM5364a.getKey(), C17978i0.f57385e)) {
                    Object key = c4621nM5364a.getKey();
                    AbstractC16544l.m18093f(key, "entry.key");
                    linkedHashMap.put(key, c4621nM5364a.getValue());
                }
            }
            return new C17978i0(strMo4384r, strMo4384r2, strMo4384r3, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Usr", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Usr", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Usr", e12);
        }
    }
}
