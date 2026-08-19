package p571X9;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p492U1.C7548m;
import p492U1.C7549n;
import p919o8.C17927Q;

/* JADX INFO: renamed from: X9.D4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9119D4 {
    /* JADX INFO: renamed from: a */
    public static C17927Q m9648a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C17927Q(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ContainerView", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ContainerView", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ContainerView", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m9649b(double d10) {
        return m9652e((float) d10, 4294967296L);
    }

    /* JADX INFO: renamed from: c */
    public static final long m9650c(int i10) {
        return m9652e(i10, 4294967296L);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m9651d(long j10) {
        C7549n[] c7549nArr = C7548m.f23908b;
        return (j10 & 1095216660480L) == 0;
    }

    /* JADX INFO: renamed from: e */
    public static final long m9652e(float f10, long j10) {
        long jFloatToIntBits = j10 | (((long) Float.floatToIntBits(f10)) & 4294967295L);
        C7549n[] c7549nArr = C7548m.f23908b;
        return jFloatToIntBits;
    }
}
