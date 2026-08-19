package p718e4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: e4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13282c implements Parcelable {
    public static final Parcelable.Creator<C13282c> CREATOR = new C13280a(2);

    /* JADX INFO: renamed from: Y */
    public final long f41984Y;

    /* JADX INFO: renamed from: Z */
    public final long f41985Z;

    /* JADX INFO: renamed from: o0 */
    public final int f41986o0;

    public C13282c(long j10, int i10, long j11) {
        AbstractC20800b.m21316d(j10 < j11);
        this.f41984Y = j10;
        this.f41985Z = j11;
        this.f41986o0 = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13282c.class != obj.getClass()) {
            return false;
        }
        C13282c c13282c = (C13282c) obj;
        return this.f41984Y == c13282c.f41984Y && this.f41985Z == c13282c.f41985Z && this.f41986o0 == c13282c.f41986o0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f41984Y), Long.valueOf(this.f41985Z), Integer.valueOf(this.f41986o0)});
    }

    public final String toString() {
        int i10 = AbstractC20817s.f66106a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f41984Y + ", endTimeMs=" + this.f41985Z + ", speedDivisor=" + this.f41986o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f41984Y);
        parcel.writeLong(this.f41985Z);
        parcel.writeInt(this.f41986o0);
    }
}
