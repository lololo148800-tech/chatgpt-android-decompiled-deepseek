package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p909nm.AbstractC17678l;
import p919o8.C17895F0;

/* JADX INFO: renamed from: Y9.P2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9786P2 {
    /* JADX INFO: renamed from: a */
    public static C17895F0 m10399a(C3676s c3676s) {
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
                if (!AbstractC17678l.m19298e(c4621nM5364a.getKey(), C17895F0.f57029e)) {
                    Object key = c4621nM5364a.getKey();
                    AbstractC16544l.m18093f(key, "entry.key");
                    linkedHashMap.put(key, c4621nM5364a.getValue());
                }
            }
            return new C17895F0(strMo4384r, strMo4384r2, strMo4384r3, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Usr", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Usr", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Usr", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10400b(Object obj) {
        return (int) (((long) Integer.rotateLeft((int) (((long) (obj == null ? 0 : obj.hashCode())) * (-862048943)), 15)) * 461845907);
    }
}
