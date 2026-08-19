package p594Y9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import p1113xn.AbstractC21329w;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p774h1.AbstractC14334L;
import p919o8.C17904I0;

/* JADX INFO: renamed from: Y9.R2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9797R2 {
    /* JADX INFO: renamed from: a */
    public static C17904I0 m10413a(C3676s c3676s) {
        try {
            ArrayList arrayList = c3676s.m4395w(ParameterNames.f31999ID).m4389j().f11172Y;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AbstractC3673p) it.next()).mo4384r());
            }
            return new C17904I0(arrayList2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Action", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Action", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Action", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m10414b(long j10, String str) {
        if (str == null) {
            return j10;
        }
        try {
            return AbstractC14334L.m15625c(Color.parseColor(Separators.POUND.concat(AbstractC21329w.m21731r(str, Separators.POUND, ""))));
        } catch (NumberFormatException unused) {
            return j10;
        }
    }
}
