package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: o8.A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17881A1 {

    /* JADX INFO: renamed from: a */
    public final EnumC17917M1 f56988a;

    /* JADX INFO: renamed from: b */
    public final int f56989b;

    public C17881A1(EnumC17917M1 enumC17917M1, int i10) {
        this.f56988a = enumC17917M1;
        this.f56989b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17881A1)) {
            return false;
        }
        C17881A1 c17881a1 = (C17881A1) obj;
        return this.f56988a == c17881a1.f56988a && this.f56989b == c17881a1.f56989b;
    }

    public final int hashCode() {
        EnumC17917M1 enumC17917M1 = this.f56988a;
        int iHashCode = (enumC17917M1 == null ? 0 : enumC17917M1.hashCode()) * 31;
        int i10 = this.f56989b;
        return iHashCode + (i10 != 0 ? AbstractC0010F.m24h(i10) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DdSession(plan=");
        sb2.append(this.f56988a);
        sb2.append(", sessionPrecondition=");
        switch (this.f56989b) {
            case 1:
                str = "USER_APP_LAUNCH";
                break;
            case 2:
                str = "INACTIVITY_TIMEOUT";
                break;
            case 3:
                str = "MAX_DURATION";
                break;
            case 4:
                str = "BACKGROUND_LAUNCH";
                break;
            case 5:
                str = "PREWARM";
                break;
            case 6:
                str = "FROM_NON_INTERACTIVE_SESSION";
                break;
            case 7:
                str = "EXPLICIT_STOP";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
