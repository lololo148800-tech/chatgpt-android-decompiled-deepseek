package p178H;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.hardware.camera2.CameraCharacteristics;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.WebrtcBuildVersion;
import p028B.C0710q;
import p523V9.AbstractC8160o6;
import p624Zg.AbstractC10345O;
import p624Zg.AbstractC10357a0;
import p624Zg.C10339I;
import p624Zg.C10340J;
import p624Zg.C10343M;
import p624Zg.C10344N;
import p624Zg.C10349T;
import p624Zg.C10350U;
import p624Zg.C10352W;
import p624Zg.C10354Y;
import p624Zg.C10355Z;
import p950po.AbstractC18527a;
import p950po.C18529c;
import p950po.C18530d;

/* JADX INFO: renamed from: H.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3137c {
    /* JADX INFO: renamed from: a */
    public static final void m3978a(AbstractC18527a abstractC18527a, C18529c c18529c, String str) {
        C18530d.f59040i.fine(c18529c.f59034b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC18527a.f59027a);
    }

    /* JADX INFO: renamed from: b */
    public static String m3979b(C0710q c0710q, Integer num, List list) {
        if (num == null || !list.contains(WebrtcBuildVersion.maint_version) || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) c0710q.m1481b(WebrtcBuildVersion.maint_version).m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) c0710q.m1481b("1").m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return WebrtcBuildVersion.maint_version;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final String m3980c(long j10) {
        String strM11050h;
        if (j10 <= -999500000) {
            strM11050h = AbstractC10763a.m11050h((j10 - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j10 <= -999500) {
            strM11050h = AbstractC10763a.m11050h((j10 - ((long) 500000)) / ((long) UtilsKt.MICROS_MULTIPLIER), " ms", new StringBuilder());
        } else if (j10 <= 0) {
            strM11050h = AbstractC10763a.m11050h((j10 - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j10 < 999500) {
            strM11050h = AbstractC10763a.m11050h((j10 + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else {
            strM11050h = j10 < 999500000 ? AbstractC10763a.m11050h((j10 + ((long) 500000)) / ((long) UtilsKt.MICROS_MULTIPLIER), " ms", new StringBuilder()) : AbstractC10763a.m11050h((j10 + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strM11050h}, 1));
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC10357a0 m3981d(AbstractC10345O purchaseManagerError) {
        AbstractC16544l.m18094g(purchaseManagerError, "purchaseManagerError");
        if (purchaseManagerError instanceof C10344N) {
            AbstractC8160o6.m8727b(AbstractC10357a0.f30702o0, "Purchase failed because receipt is already in use", purchaseManagerError, 4);
            return new C10355Z(purchaseManagerError);
        }
        if (purchaseManagerError instanceof C10343M) {
            return new C10352W(purchaseManagerError);
        }
        if (purchaseManagerError instanceof C10339I) {
            return new C10349T(purchaseManagerError);
        }
        if (purchaseManagerError instanceof C10340J) {
            return C10350U.f30692p0;
        }
        AbstractC8160o6.m8727b(AbstractC10357a0.f30702o0, "Purchase failed", purchaseManagerError, 4);
        return new C10354Y(purchaseManagerError);
    }
}
