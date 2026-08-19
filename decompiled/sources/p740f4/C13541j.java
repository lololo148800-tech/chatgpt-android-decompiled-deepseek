package p740f4;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import p1073w3.C20811m;
import p718e4.C13280a;

/* JADX INFO: renamed from: f4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C13541j extends AbstractC13533b {
    public static final Parcelable.Creator<C13541j> CREATOR = new C13280a(8);

    /* JADX INFO: renamed from: Y */
    public final long f42862Y;

    /* JADX INFO: renamed from: Z */
    public final long f42863Z;

    public C13541j(long j10, long j11) {
        this.f42862Y = j10;
        this.f42863Z = j11;
    }

    /* JADX INFO: renamed from: a */
    public static long m15085a(long j10, C20811m c20811m) {
        long jM21365t = c20811m.m21365t();
        if ((128 & jM21365t) != 0) {
            return 8589934591L & ((((jM21365t & 1) << 32) | c20811m.m21367v()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // p740f4.AbstractC13533b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f42862Y);
        sb2.append(", playbackPositionUs= ");
        return AbstractC10763a.m11050h(this.f42863Z, " }", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f42862Y);
        parcel.writeLong(this.f42863Z);
    }
}
