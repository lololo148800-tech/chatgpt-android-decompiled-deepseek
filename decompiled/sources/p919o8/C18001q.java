package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.q */
/* JADX INFO: loaded from: classes.dex */
public final class C18001q {

    /* JADX INFO: renamed from: a */
    public final String f57475a;

    /* JADX INFO: renamed from: b */
    public final Long f57476b;

    /* JADX INFO: renamed from: c */
    public final Long f57477c;

    public C18001q(String str, Long l4, Long l10) {
        this.f57475a = str;
        this.f57476b = l4;
        this.f57477c = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18001q)) {
            return false;
        }
        C18001q c18001q = (C18001q) obj;
        return AbstractC16544l.m18089b(this.f57475a, c18001q.f57475a) && AbstractC16544l.m18089b(this.f57476b, c18001q.f57476b) && AbstractC16544l.m18089b(this.f57477c, c18001q.f57477c);
    }

    public final int hashCode() {
        String str = this.f57475a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l4 = this.f57476b;
        int iHashCode2 = (iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l10 = this.f57477c;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "DdActionTarget(selector=" + this.f57475a + ", width=" + this.f57476b + ", height=" + this.f57477c + Separators.RPAREN;
    }
}
