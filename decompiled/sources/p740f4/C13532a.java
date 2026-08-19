package p740f4;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import p1073w3.AbstractC20817s;
import p718e4.C13280a;

/* JADX INFO: renamed from: f4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13532a extends AbstractC13533b {
    public static final Parcelable.Creator<C13532a> CREATOR = new C13280a(4);

    /* JADX INFO: renamed from: Y */
    public final long f42826Y;

    /* JADX INFO: renamed from: Z */
    public final long f42827Z;

    /* JADX INFO: renamed from: o0 */
    public final byte[] f42828o0;

    public C13532a(long j10, byte[] bArr, long j11) {
        this.f42826Y = j11;
        this.f42827Z = j10;
        this.f42828o0 = bArr;
    }

    @Override // p740f4.AbstractC13533b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f42826Y);
        sb2.append(", identifier= ");
        return AbstractC10763a.m11050h(this.f42827Z, " }", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f42826Y);
        parcel.writeLong(this.f42827Z);
        parcel.writeByteArray(this.f42828o0);
    }

    public C13532a(Parcel parcel) {
        this.f42826Y = parcel.readLong();
        this.f42827Z = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i10 = AbstractC20817s.f66106a;
        this.f42828o0 = bArrCreateByteArray;
    }
}
