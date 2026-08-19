package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;
import p037B9.MeDP.MpoABj;

/* JADX INFO: renamed from: o8.T0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17936T0 {

    /* JADX INFO: renamed from: a */
    public final EnumC17961c1 f57167a;

    /* JADX INFO: renamed from: b */
    public final int f57168b;

    public C17936T0(EnumC17961c1 enumC17961c1, int i10) {
        this.f57167a = enumC17961c1;
        this.f57168b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17936T0)) {
            return false;
        }
        C17936T0 c17936t0 = (C17936T0) obj;
        return this.f57167a == c17936t0.f57167a && this.f57168b == c17936t0.f57168b;
    }

    public final int hashCode() {
        EnumC17961c1 enumC17961c1 = this.f57167a;
        int iHashCode = (enumC17961c1 == null ? 0 : enumC17961c1.hashCode()) * 31;
        int i10 = this.f57168b;
        return iHashCode + (i10 != 0 ? AbstractC0010F.m24h(i10) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DdSession(plan=");
        sb2.append(this.f57167a);
        sb2.append(", sessionPrecondition=");
        switch (this.f57168b) {
            case 1:
                str = "USER_APP_LAUNCH";
                break;
            case 2:
                str = MpoABj.FBHLPEyCHFYxYSW;
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
