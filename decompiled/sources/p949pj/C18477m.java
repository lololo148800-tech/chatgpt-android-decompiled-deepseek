package p949pj;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C18477m extends AbstractC18481o {

    /* JADX INFO: renamed from: a */
    public final String f58918a;

    /* JADX INFO: renamed from: b */
    public final String f58919b;

    /* JADX INFO: renamed from: c */
    public final Date f58920c;

    /* JADX INFO: renamed from: d */
    public final Date f58921d;

    public C18477m(String extractionRawPayload, String str, Date date, Date date2) {
        AbstractC16544l.m18094g(extractionRawPayload, "extractionRawPayload");
        this.f58918a = extractionRawPayload;
        this.f58919b = str;
        this.f58920c = date;
        this.f58921d = date2;
    }

    @Override // p949pj.AbstractC18481o
    /* JADX INFO: renamed from: a */
    public final String mo19878a() {
        return this.f58918a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18477m)) {
            return false;
        }
        C18477m c18477m = (C18477m) obj;
        return AbstractC16544l.m18089b(this.f58918a, c18477m.f58918a) && AbstractC16544l.m18089b(this.f58919b, c18477m.f58919b) && AbstractC16544l.m18089b(this.f58920c, c18477m.f58920c) && AbstractC16544l.m18089b(this.f58921d, c18477m.f58921d);
    }

    public final int hashCode() {
        int iHashCode = this.f58918a.hashCode() * 31;
        String str = this.f58919b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.f58920c;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f58921d;
        return iHashCode3 + (date2 != null ? date2.hashCode() : 0);
    }

    public final String toString() {
        return "MrzBarcodeInfo(extractionRawPayload=" + this.f58918a + ", identificationNumber=" + this.f58919b + ", birthdate=" + this.f58920c + ", expirationDate=" + this.f58921d + Separators.RPAREN;
    }
}
