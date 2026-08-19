package p523V9;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1439n;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C6021p;
import p676c7.C11685d;
import sl.InterfaceC19682q;

/* JADX INFO: renamed from: V9.l4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8134l4 {
    /* JADX INFO: renamed from: a */
    public static void m8651a(InterfaceC19682q interfaceC19682q, InterfaceC1439n interfaceC1439n) {
        for (Map.Entry entry : interfaceC19682q.mo7977a()) {
            interfaceC1439n.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11685d m8652b(C3676s c3676s) {
        try {
            String strMo4384r = c3676s.m4395w("connectivity").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"connectivity\").asString");
            try {
                for (int i10 : AbstractC0010F.m27k(12)) {
                    if (AbstractC10763a.m11044b(i10).equals(strMo4384r)) {
                        AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("carrier_name");
                        String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
                        AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("carrier_id");
                        Long lValueOf = abstractC3673pM4395w2 != null ? Long.valueOf(abstractC3673pM4395w2.mo4382p()) : null;
                        AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("up_kbps");
                        Long lValueOf2 = abstractC3673pM4395w3 != null ? Long.valueOf(abstractC3673pM4395w3.mo4382p()) : null;
                        AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("down_kbps");
                        Long lValueOf3 = abstractC3673pM4395w4 != null ? Long.valueOf(abstractC3673pM4395w4.mo4382p()) : null;
                        AbstractC3673p abstractC3673pM4395w5 = c3676s.m4395w("strength");
                        Long lValueOf4 = abstractC3673pM4395w5 != null ? Long.valueOf(abstractC3673pM4395w5.mo4382p()) : null;
                        AbstractC3673p abstractC3673pM4395w6 = c3676s.m4395w("cellular_technology");
                        return new C11685d(i10, strMo4384r2, lValueOf, lValueOf2, lValueOf3, lValueOf4, abstractC3673pM4395w6 != null ? abstractC3673pM4395w6.mo4384r() : null);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (NoSuchElementException e10) {
                throw new C3677t("Unable to parse json into type NetworkInfo.Connectivity", e10);
            }
        } catch (IllegalStateException e11) {
            throw new C3677t("Unable to parse json into type NetworkInfo", e11);
        } catch (NullPointerException e12) {
            throw new C3677t("Unable to parse json into type NetworkInfo", e12);
        } catch (NumberFormatException e13) {
            throw new C3677t("Unable to parse json into type NetworkInfo", e13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Resources m8653c(C6021p c6021p) {
        c6021p.m6548k(AndroidCompositionLocals_androidKt.f32824a);
        return ((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources();
    }
}
