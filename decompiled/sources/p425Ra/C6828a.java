package p425Ra;

import android.gov.nist.core.Separators;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import p1022t9.C19819d;
import p450Sa.AbstractC7101a;

/* JADX INFO: renamed from: Ra.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6828a extends C19819d {

    /* JADX INFO: renamed from: Z */
    public final Exception f21908Z;

    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    /* JADX WARN: Illegal instructions before constructor call */
    public C6828a(int i10, Exception exc) {
        String str;
        Locale locale = Locale.ROOT;
        HashMap map = AbstractC7101a.f22597a;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = AbstractC7101a.f22598b;
            if (map2.containsKey(numValueOf)) {
                str = ((String) map.get(numValueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#" + ((String) map2.get(numValueOf)) + Separators.RPAREN;
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        super(new Status(i10, "Standard Integrity API error (" + i10 + "): " + str + Separators.DOT, null, null));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f21908Z = exc;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f21908Z;
    }
}
