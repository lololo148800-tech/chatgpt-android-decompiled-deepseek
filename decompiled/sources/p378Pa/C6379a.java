package p378Pa;

import android.gov.nist.core.Separators;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import p1022t9.C19819d;
import p400Qa.AbstractC6583a;

/* JADX INFO: renamed from: Pa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6379a extends C19819d {
    /* JADX WARN: Code duplicated, block: B:8:0x0045  */
    /* JADX WARN: Illegal instructions before constructor call */
    public C6379a(int i10) {
        String str;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = AbstractC6583a.f21269a;
        Integer numValueOf2 = Integer.valueOf(i10);
        if (map.containsKey(numValueOf2)) {
            HashMap map2 = AbstractC6583a.f21270b;
            if (map2.containsKey(numValueOf2)) {
                str = ((String) map.get(numValueOf2)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String) map2.get(numValueOf2)) + Separators.RPAREN;
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        super(new Status(i10, String.format(locale, "Install Error(%d): %s", numValueOf, str), null, null));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
