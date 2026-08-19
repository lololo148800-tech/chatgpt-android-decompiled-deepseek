package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17972g0;

/* JADX INFO: renamed from: Y9.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9800S {
    /* JADX INFO: renamed from: a */
    public static C17972g0 m10423a(C3676s c3676s) {
        try {
            String testId = c3676s.m4395w("test_id").mo4384r();
            String resultId = c3676s.m4395w("result_id").mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("injected");
            Boolean boolValueOf = abstractC3673pM4395w != null ? Boolean.valueOf(abstractC3673pM4395w.mo4380f()) : null;
            AbstractC16544l.m18093f(testId, "testId");
            AbstractC16544l.m18093f(resultId, "resultId");
            return new C17972g0(testId, resultId, boolValueOf);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Synthetics", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Synthetics", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Synthetics", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10424b(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i11, "at index "));
            }
        }
    }
}
