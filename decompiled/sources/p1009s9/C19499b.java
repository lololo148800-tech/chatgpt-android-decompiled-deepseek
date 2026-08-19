package p1009s9;

import android.app.PendingIntent;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001A.AbstractC0010F;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;
import sk.C19665d;

/* JADX INFO: renamed from: s9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C19499b extends AbstractC20851a {

    /* JADX INFO: renamed from: Y */
    public final int f61939Y;

    /* JADX INFO: renamed from: Z */
    public final int f61940Z;

    /* JADX INFO: renamed from: o0 */
    public final PendingIntent f61941o0;

    /* JADX INFO: renamed from: p0 */
    public final String f61942p0;

    /* JADX INFO: renamed from: q0 */
    public static final C19499b f61938q0 = new C19499b(0);
    public static final Parcelable.Creator<C19499b> CREATOR = new C18658l(4);

    public C19499b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f61939Y = i10;
        this.f61940Z = i11;
        this.f61941o0 = pendingIntent;
        this.f61942p0 = str;
    }

    /* JADX INFO: renamed from: b */
    public static String m20593b(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return AbstractC0010F.m19c(i10, "UNKNOWN_ERROR_CODE(", Separators.RPAREN);
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19499b)) {
            return false;
        }
        C19499b c19499b = (C19499b) obj;
        return this.f61940Z == c19499b.f61940Z && AbstractC20502t.m21161l(this.f61941o0, c19499b.f61941o0) && AbstractC20502t.m21161l(this.f61942p0, c19499b.f61942p0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f61940Z), this.f61941o0, this.f61942p0});
    }

    public final String toString() {
        C19665d c19665d = new C19665d(this);
        c19665d.m20639a(m20593b(this.f61940Z), "statusCode");
        c19665d.m20639a(this.f61941o0, "resolution");
        c19665d.m20639a(this.f61942p0, "message");
        return c19665d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f61939Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f61940Z);
        AbstractC8199t5.m8806e(parcel, 3, this.f61941o0, i10);
        AbstractC8199t5.m8807f(parcel, 4, this.f61942p0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }

    public C19499b(int i10) {
        this(1, i10, null, null);
    }

    public C19499b(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
