package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p1009s9.C19499b;
import p1022t9.InterfaceC19827l;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;
import sk.C19665d;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC20851a implements InterfaceC19827l, ReflectedParcelable {

    /* JADX INFO: renamed from: Y */
    public final int f36052Y;

    /* JADX INFO: renamed from: Z */
    public final String f36053Z;

    /* JADX INFO: renamed from: o0 */
    public final PendingIntent f36054o0;

    /* JADX INFO: renamed from: p0 */
    public final C19499b f36055p0;

    /* JADX INFO: renamed from: q0 */
    public static final Status f36047q0 = new Status(0, null, null, null);

    /* JADX INFO: renamed from: r0 */
    public static final Status f36048r0 = new Status(14, null, null, null);

    /* JADX INFO: renamed from: s0 */
    public static final Status f36049s0 = new Status(8, null, null, null);

    /* JADX INFO: renamed from: t0 */
    public static final Status f36050t0 = new Status(15, null, null, null);

    /* JADX INFO: renamed from: u0 */
    public static final Status f36051u0 = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new C18658l(11);

    public Status(int i10, String str, PendingIntent pendingIntent, C19499b c19499b) {
        this.f36052Y = i10;
        this.f36053Z = str;
        this.f36054o0 = pendingIntent;
        this.f36055p0 = c19499b;
    }

    @Override // p1022t9.InterfaceC19827l
    /* JADX INFO: renamed from: a */
    public final Status mo12680a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13182b() {
        return this.f36052Y <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f36052Y == status.f36052Y && AbstractC20502t.m21161l(this.f36053Z, status.f36053Z) && AbstractC20502t.m21161l(this.f36054o0, status.f36054o0) && AbstractC20502t.m21161l(this.f36055p0, status.f36055p0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36052Y), this.f36053Z, this.f36054o0, this.f36055p0});
    }

    public final String toString() {
        C19665d c19665d = new C19665d(this);
        String strM11048f = this.f36053Z;
        if (strM11048f == null) {
            int i10 = this.f36052Y;
            switch (i10) {
                case -1:
                    strM11048f = "SUCCESS_CACHE";
                    break;
                case 0:
                    strM11048f = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strM11048f = AbstractC10763a.m11048f(i10, "unknown status code: ");
                    break;
                case 2:
                    strM11048f = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strM11048f = "SERVICE_DISABLED";
                    break;
                case 4:
                    strM11048f = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strM11048f = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strM11048f = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strM11048f = "NETWORK_ERROR";
                    break;
                case 8:
                    strM11048f = "INTERNAL_ERROR";
                    break;
                case 10:
                    strM11048f = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strM11048f = "ERROR";
                    break;
                case 14:
                    strM11048f = "INTERRUPTED";
                    break;
                case 15:
                    strM11048f = "TIMEOUT";
                    break;
                case 16:
                    strM11048f = "CANCELED";
                    break;
                case 17:
                    strM11048f = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strM11048f = "DEAD_CLIENT";
                    break;
                case 19:
                    strM11048f = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strM11048f = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strM11048f = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strM11048f = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        c19665d.m20639a(strM11048f, "statusCode");
        c19665d.m20639a(this.f36054o0, "resolution");
        return c19665d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f36052Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f36053Z);
        AbstractC8199t5.m8806e(parcel, 3, this.f36054o0, i10);
        AbstractC8199t5.m8806e(parcel, 4, this.f36055p0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
