package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17987l0;

/* JADX INFO: renamed from: Y9.W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9824W {
    /* JADX INFO: renamed from: a */
    public static C17987l0 m10466a(C3676s c3676s) {
        try {
            ArrayList arrayList = c3676s.m4395w(ParameterNames.f31999ID).m4389j().f11172Y;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AbstractC3673p) it.next()).mo4384r());
            }
            return new C17987l0(arrayList2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Action", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Action", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Action", e12);
        }
    }
}
