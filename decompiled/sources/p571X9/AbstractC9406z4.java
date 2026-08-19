package p571X9;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p594Y9.AbstractC9753K;
import p594Y9.AbstractC9759L;
import p594Y9.AbstractC9765M;
import p594Y9.AbstractC9777O;
import p594Y9.AbstractC9800S;
import p594Y9.AbstractC9812U;
import p919o8.AbstractC17962d;
import p919o8.C17900H;
import p919o8.C17903I;
import p919o8.C17915M;
import p919o8.C17921O;
import p919o8.C17924P;
import p919o8.C17932S;
import p919o8.C17935T;
import p919o8.C17941V;
import p919o8.C17944W;
import p919o8.C17947X;
import p919o8.C17949Y;
import p919o8.C17951Z;
import p919o8.C17960c0;
import p919o8.C17972g0;
import p919o8.C17978i0;
import p919o8.C17984k0;

/* JADX INFO: renamed from: X9.z4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9406z4 {
    /* JADX INFO: renamed from: a */
    public static C17984k0 m9982a(C3676s jsonObject) {
        String str;
        String strMo4384r;
        String strMo4384r2;
        String str2 = "Unable to parse json into type ErrorEvent";
        AbstractC16544l.m18094g(jsonObject, "jsonObject");
        try {
            try {
                long jMo4382p = jsonObject.m4395w("date").mo4382p();
                C17903I c17903iM9952a = AbstractC9376u4.m9952a(jsonObject.m4395w(SIPServerTransaction.CONTENT_TYPE_APPLICATION).m4390m());
                AbstractC3673p abstractC3673pM4395w = jsonObject.m4395w(ReferencesHeader.SERVICE);
                if (abstractC3673pM4395w != null) {
                    try {
                        strMo4384r = abstractC3673pM4395w.mo4384r();
                    } catch (IllegalStateException e10) {
                        e = e10;
                        throw new C3677t(str2, e);
                    } catch (NumberFormatException e11) {
                        e = e11;
                        throw new C3677t(str2, e);
                    }
                } else {
                    strMo4384r = null;
                }
                AbstractC3673p abstractC3673pM4395w2 = jsonObject.m4395w("version");
                String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
                AbstractC3673p abstractC3673pM4395w3 = jsonObject.m4395w("build_version");
                String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
                AbstractC3673p abstractC3673pM4395w4 = jsonObject.m4395w("build_id");
                String strMo4384r5 = abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null;
                C17949Y c17949yM10362a = AbstractC9759L.m10362a(jsonObject.m4395w(ParameterNames.SESSION).m4390m());
                AbstractC3673p abstractC3673pM4395w5 = jsonObject.m4395w("source");
                int i10 = 0;
                if (abstractC3673pM4395w5 != null && (strMo4384r2 = abstractC3673pM4395w5.mo4384r()) != null) {
                    int[] iArrM27k = AbstractC0010F.m27k(8);
                    int length = iArrM27k.length;
                    while (true) {
                        if (i10 >= length) {
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        int i11 = iArrM27k[i10];
                        if (AbstractC17962d.m19638b(i11).equals(strMo4384r2)) {
                            i10 = i11;
                            break;
                        }
                        i10++;
                    }
                }
                C17951Z c17951zM10369b = AbstractC9765M.m10369b(jsonObject.m4395w("view").m4390m());
                AbstractC3673p abstractC3673pM4395w6 = jsonObject.m4395w("usr");
                C17978i0 c17978i0M10441b = abstractC3673pM4395w6 != null ? AbstractC9812U.m10441b(abstractC3673pM4395w6.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w7 = jsonObject.m4395w("connectivity");
                C17921O c17921oM9637a = abstractC3673pM4395w7 != null ? AbstractC9107B4.m9637a(abstractC3673pM4395w7.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w8 = jsonObject.m4395w("display");
                C17944W c17944wM9744c = abstractC3673pM4395w8 != null ? AbstractC9185O4.m9744c(abstractC3673pM4395w8.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w9 = jsonObject.m4395w("synthetics");
                C17972g0 c17972g0M10423a = abstractC3673pM4395w9 != null ? AbstractC9800S.m10423a(abstractC3673pM4395w9.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w10 = jsonObject.m4395w("ci_test");
                C17915M c17915mM9980c = abstractC3673pM4395w10 != null ? AbstractC9400y4.m9980c(abstractC3673pM4395w10.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w11 = jsonObject.m4395w("os");
                C17960c0 c17960c0M10383a = abstractC3673pM4395w11 != null ? AbstractC9777O.m10383a(abstractC3673pM4395w11.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w12 = jsonObject.m4395w("device");
                C17941V c17941vM9688b = abstractC3673pM4395w12 != null ? AbstractC9143H4.m9688b(abstractC3673pM4395w12.m4390m()) : null;
                C17935T c17935tM9672a = AbstractC9131F4.m9672a(jsonObject.m4395w("_dd").m4390m());
                AbstractC3673p abstractC3673pM4395w13 = jsonObject.m4395w("context");
                C17932S c17932sM9660b = abstractC3673pM4395w13 != null ? AbstractC9125E4.m9660b(abstractC3673pM4395w13.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w14 = jsonObject.m4395w("action");
                C17900H c17900hM9949a = abstractC3673pM4395w14 != null ? AbstractC9364s4.m9949a(abstractC3673pM4395w14.m4390m()) : null;
                AbstractC3673p abstractC3673pM4395w15 = jsonObject.m4395w("container");
                C17924P c17924pM9644b = abstractC3673pM4395w15 != null ? AbstractC9113C4.m9644b(abstractC3673pM4395w15.m4390m()) : null;
                String strMo4384r6 = jsonObject.m4395w("type").mo4384r();
                C17947X c17947xM10355b = AbstractC9753K.m10355b(jsonObject.m4395w("error").m4390m());
                str = "Unable to parse json into type ErrorEvent";
                try {
                    AbstractC3673p abstractC3673pM4395w16 = jsonObject.m4395w("feature_flags");
                    C17932S c17932sM9660b2 = abstractC3673pM4395w16 != null ? AbstractC9125E4.m9660b(abstractC3673pM4395w16.m4390m()) : null;
                    if (AbstractC16544l.m18089b(strMo4384r6, "error")) {
                        return new C17984k0(jMo4382p, c17903iM9952a, strMo4384r, strMo4384r3, strMo4384r4, strMo4384r5, c17949yM10362a, i10, c17951zM10369b, c17978i0M10441b, c17921oM9637a, c17944wM9744c, c17972g0M10423a, c17915mM9980c, c17960c0M10383a, c17941vM9688b, c17935tM9672a, c17932sM9660b, c17900hM9949a, c17924pM9644b, c17947xM10355b, c17932sM9660b2);
                    }
                    throw new IllegalStateException("Check failed.");
                } catch (IllegalStateException e12) {
                    e = e12;
                    str2 = str;
                    throw new C3677t(str2, e);
                } catch (NullPointerException e13) {
                    e = e13;
                    throw new C3677t(str, e);
                } catch (NumberFormatException e14) {
                    e = e14;
                    str2 = str;
                    throw new C3677t(str2, e);
                }
            } catch (NullPointerException e15) {
                e = e15;
                str = "Unable to parse json into type ErrorEvent";
            }
        } catch (IllegalStateException e16) {
            e = e16;
        } catch (NumberFormatException e17) {
            e = e17;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9983b(String str) {
        throw new IllegalArgumentException(str);
    }
}
