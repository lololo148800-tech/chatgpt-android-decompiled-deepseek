package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
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
import p572Xa.C9422p;
import p909nm.AbstractC17678l;
import p919o8.C17934S1;

/* JADX INFO: renamed from: Y9.m4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9931m4 {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m10591a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9422p c9422p = (C9422p) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", c9422p.f28402a);
            bundle.putLong("event_timestamp", c9422p.f28403b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static C17934S1 m10592b(C3676s c3676s) {
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
                if (!AbstractC17678l.m19298e(c4621nM5364a.getKey(), C17934S1.f57159e)) {
                    Object key = c4621nM5364a.getKey();
                    AbstractC16544l.m18093f(key, "entry.key");
                    linkedHashMap.put(key, c4621nM5364a.getValue());
                }
            }
            return new C17934S1(strMo4384r, strMo4384r2, strMo4384r3, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Usr", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Usr", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Usr", e12);
        }
    }
}
