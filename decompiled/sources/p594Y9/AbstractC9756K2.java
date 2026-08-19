package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import hm.InterfaceC14538c;
import java.math.BigInteger;
import p1113xn.AbstractC21322p;
import p164G8.C3008b;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C18029z0;

/* JADX INFO: renamed from: Y9.K2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9756K2 {
    /* JADX INFO: renamed from: a */
    public static C18029z0 m10356a(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(ParameterNames.f31999ID);
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            long jMo4382p = c3676s.m4395w("duration").mo4382p();
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("is_frozen_frame");
            return new C18029z0(strMo4384r, jMo4382p, abstractC3673pM4395w2 != null ? Boolean.valueOf(abstractC3673pM4395w2.mo4380f()) : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type LongTask", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type LongTask", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type LongTask", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m10357b(InterfaceC14538c interfaceC14538c) {
        BigInteger bigInteger;
        String string;
        String strM21686T;
        C3008b c3008b = interfaceC14538c instanceof C3008b ? (C3008b) interfaceC14538c : null;
        return (c3008b == null || (bigInteger = c3008b.f9041d) == null || (string = bigInteger.toString(16)) == null || (strM21686T = AbstractC21322p.m21686T(32, string)) == null) ? "" : strM21686T;
    }
}
