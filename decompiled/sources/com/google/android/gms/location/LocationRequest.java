package com.google.android.gms.location;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import ba.AbstractC11275g;
import com.google.android.gms.common.internal.ReflectedParcelable;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Method;
import java.util.Arrays;
import p063C9.AbstractC1618d;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p475T9.AbstractC7283f;
import p475T9.C7282e;
import p523V9.AbstractC8199t5;
import p571X9.AbstractC9306j0;
import p647ak.C10707i0;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends AbstractC20851a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C10707i0(4);

    /* JADX INFO: renamed from: Y */
    public final int f36369Y;

    /* JADX INFO: renamed from: Z */
    public final long f36370Z;

    /* JADX INFO: renamed from: o0 */
    public final long f36371o0;

    /* JADX INFO: renamed from: p0 */
    public final long f36372p0;

    /* JADX INFO: renamed from: q0 */
    public final long f36373q0;

    /* JADX INFO: renamed from: r0 */
    public final int f36374r0;

    /* JADX INFO: renamed from: s0 */
    public final float f36375s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f36376t0;

    /* JADX INFO: renamed from: u0 */
    public final long f36377u0;

    /* JADX INFO: renamed from: v0 */
    public final int f36378v0;

    /* JADX INFO: renamed from: w0 */
    public final int f36379w0;

    /* JADX INFO: renamed from: x0 */
    public final boolean f36380x0;

    /* JADX INFO: renamed from: y0 */
    public final WorkSource f36381y0;

    /* JADX INFO: renamed from: z0 */
    public final C7282e f36382z0;

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z6, long j15, int i12, int i13, boolean z10, WorkSource workSource, C7282e c7282e) {
        long j16;
        this.f36369Y = i10;
        if (i10 == 105) {
            this.f36370Z = Long.MAX_VALUE;
            j16 = j10;
        } else {
            j16 = j10;
            this.f36370Z = j16;
        }
        this.f36371o0 = j11;
        this.f36372p0 = j12;
        this.f36373q0 = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f36374r0 = i11;
        this.f36375s0 = f10;
        this.f36376t0 = z6;
        this.f36377u0 = j15 != -1 ? j15 : j16;
        this.f36378v0 = i12;
        this.f36379w0 = i13;
        this.f36380x0 = z10;
        this.f36381y0 = workSource;
        this.f36382z0 = c7282e;
    }

    /* JADX INFO: renamed from: c */
    public static String m13564c(long j10) {
        String string;
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = AbstractC7283f.f23083a;
        synchronized (sb2) {
            sb2.setLength(0);
            AbstractC7283f.m7734a(j10, sb2);
            string = sb2.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13565b() {
        long j10 = this.f36372p0;
        return j10 > 0 && (j10 >> 1) >= this.f36370Z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            int i10 = locationRequest.f36369Y;
            int i11 = this.f36369Y;
            if (i11 == i10 && ((i11 == 105 || this.f36370Z == locationRequest.f36370Z) && this.f36371o0 == locationRequest.f36371o0 && m13565b() == locationRequest.m13565b() && ((!m13565b() || this.f36372p0 == locationRequest.f36372p0) && this.f36373q0 == locationRequest.f36373q0 && this.f36374r0 == locationRequest.f36374r0 && this.f36375s0 == locationRequest.f36375s0 && this.f36376t0 == locationRequest.f36376t0 && this.f36378v0 == locationRequest.f36378v0 && this.f36379w0 == locationRequest.f36379w0 && this.f36380x0 == locationRequest.f36380x0 && this.f36381y0.equals(locationRequest.f36381y0) && AbstractC20502t.m21161l(this.f36382z0, locationRequest.f36382z0)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36369Y), Long.valueOf(this.f36370Z), Long.valueOf(this.f36371o0), this.f36381y0});
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0145  */
    /* JADX WARN: Code duplicated, block: B:90:0x0148  */
    /* JADX WARN: Code duplicated, block: B:98:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final String toString() {
        Method method;
        int iIntValue;
        String str;
        String str2;
        StringBuilder sbM9893l = AbstractC9306j0.m9893l("Request[");
        int i10 = this.f36369Y;
        boolean zBooleanValue = false;
        boolean z6 = i10 == 105;
        long j10 = this.f36372p0;
        long j11 = this.f36370Z;
        if (z6) {
            sbM9893l.append(AbstractC11275g.m12681a(i10));
            if (j10 > 0) {
                sbM9893l.append(Separators.SLASH);
                AbstractC7283f.m7734a(j10, sbM9893l);
            }
        } else {
            sbM9893l.append(Separators.f31989AT);
            if (m13565b()) {
                AbstractC7283f.m7734a(j11, sbM9893l);
                sbM9893l.append(Separators.SLASH);
                AbstractC7283f.m7734a(j10, sbM9893l);
            } else {
                AbstractC7283f.m7734a(j11, sbM9893l);
            }
            sbM9893l.append(Separators.f31991SP);
            sbM9893l.append(AbstractC11275g.m12681a(i10));
        }
        boolean z10 = this.f36369Y == 105;
        long j12 = this.f36371o0;
        if (z10 || j12 != j11) {
            sbM9893l.append(", minUpdateInterval=");
            sbM9893l.append(m13564c(j12));
        }
        float f10 = this.f36375s0;
        if (f10 > 0.0d) {
            sbM9893l.append(", minUpdateDistance=");
            sbM9893l.append(f10);
        }
        boolean z11 = this.f36369Y == 105;
        long j13 = this.f36377u0;
        if (!z11 ? j13 != j11 : j13 != Long.MAX_VALUE) {
            sbM9893l.append(", maxUpdateAge=");
            sbM9893l.append(m13564c(j13));
        }
        long j14 = this.f36373q0;
        if (j14 != Long.MAX_VALUE) {
            sbM9893l.append(", duration=");
            AbstractC7283f.m7734a(j14, sbM9893l);
        }
        int i11 = this.f36374r0;
        if (i11 != Integer.MAX_VALUE) {
            sbM9893l.append(", maxUpdates=");
            sbM9893l.append(i11);
        }
        int i12 = this.f36379w0;
        if (i12 != 0) {
            sbM9893l.append(", ");
            if (i12 == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i12 == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else {
                if (i12 != 2) {
                    throw new IllegalArgumentException();
                }
                str2 = "THROTTLE_NEVER";
            }
            sbM9893l.append(str2);
        }
        int i13 = this.f36378v0;
        if (i13 != 0) {
            sbM9893l.append(", ");
            if (i13 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i13 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sbM9893l.append(str);
        }
        if (this.f36376t0) {
            sbM9893l.append(", waitForAccurateLocation");
        }
        if (this.f36380x0) {
            sbM9893l.append(", bypass");
        }
        Method method2 = AbstractC1618d.f4580d;
        WorkSource workSource = this.f36381y0;
        if (method2 != null) {
            try {
                Object objInvoke = method2.invoke(workSource, null);
                AbstractC20502t.m21157h(objInvoke);
                zBooleanValue = ((Boolean) objInvoke).booleanValue();
            } catch (Exception e10) {
                AbstractC15256t.m16466d("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
                method = AbstractC1618d.f4579c;
                if (method != null) {
                    try {
                        Object objInvoke2 = method.invoke(workSource, null);
                        AbstractC20502t.m21157h(objInvoke2);
                        iIntValue = ((Integer) objInvoke2).intValue();
                    } catch (Exception e11) {
                        AbstractC15256t.m16485w("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
                if (iIntValue == 0) {
                    zBooleanValue = true;
                }
            }
        } else {
            method = AbstractC1618d.f4579c;
            if (method != null) {
                Object objInvoke3 = method.invoke(workSource, null);
                AbstractC20502t.m21157h(objInvoke3);
                iIntValue = ((Integer) objInvoke3).intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                zBooleanValue = true;
            }
        }
        if (!zBooleanValue) {
            sbM9893l.append(", ");
            sbM9893l.append(workSource);
        }
        C7282e c7282e = this.f36382z0;
        if (c7282e != null) {
            sbM9893l.append(", impersonation=");
            sbM9893l.append(c7282e);
        }
        sbM9893l.append(']');
        return sbM9893l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f36369Y);
        AbstractC8199t5.m8813l(parcel, 2, 8);
        parcel.writeLong(this.f36370Z);
        AbstractC8199t5.m8813l(parcel, 3, 8);
        parcel.writeLong(this.f36371o0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeInt(this.f36374r0);
        AbstractC8199t5.m8813l(parcel, 7, 4);
        parcel.writeFloat(this.f36375s0);
        AbstractC8199t5.m8813l(parcel, 8, 8);
        parcel.writeLong(this.f36372p0);
        AbstractC8199t5.m8813l(parcel, 9, 4);
        parcel.writeInt(this.f36376t0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 10, 8);
        parcel.writeLong(this.f36373q0);
        AbstractC8199t5.m8813l(parcel, 11, 8);
        parcel.writeLong(this.f36377u0);
        AbstractC8199t5.m8813l(parcel, 12, 4);
        parcel.writeInt(this.f36378v0);
        AbstractC8199t5.m8813l(parcel, 13, 4);
        parcel.writeInt(this.f36379w0);
        AbstractC8199t5.m8813l(parcel, 15, 4);
        parcel.writeInt(this.f36380x0 ? 1 : 0);
        AbstractC8199t5.m8806e(parcel, 16, this.f36381y0, i10);
        AbstractC8199t5.m8806e(parcel, 17, this.f36382z0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
