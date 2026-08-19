package p740f4;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p718e4.C13280a;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: f4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13536e extends AbstractC13533b {
    public static final Parcelable.Creator<C13536e> CREATOR = new C13280a(5);

    /* JADX INFO: renamed from: Y */
    public final long f42835Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f42836Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f42837o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f42838p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f42839q0;

    /* JADX INFO: renamed from: r0 */
    public final long f42840r0;

    /* JADX INFO: renamed from: s0 */
    public final long f42841s0;

    /* JADX INFO: renamed from: t0 */
    public final List f42842t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f42843u0;

    /* JADX INFO: renamed from: v0 */
    public final long f42844v0;

    /* JADX INFO: renamed from: w0 */
    public final int f42845w0;

    /* JADX INFO: renamed from: x0 */
    public final int f42846x0;

    /* JADX INFO: renamed from: y0 */
    public final int f42847y0;

    public C13536e(long j10, boolean z6, boolean z10, boolean z11, boolean z12, long j11, long j12, List list, boolean z13, long j13, int i10, int i11, int i12) {
        this.f42835Y = j10;
        this.f42836Z = z6;
        this.f42837o0 = z10;
        this.f42838p0 = z11;
        this.f42839q0 = z12;
        this.f42840r0 = j11;
        this.f42841s0 = j12;
        this.f42842t0 = DesugarCollections.unmodifiableList(list);
        this.f42843u0 = z13;
        this.f42844v0 = j13;
        this.f42845w0 = i10;
        this.f42846x0 = i11;
        this.f42847y0 = i12;
    }

    @Override // p740f4.AbstractC13533b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f42840r0);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return AbstractC10763a.m11050h(this.f42841s0, " }", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f42835Y);
        parcel.writeByte(this.f42836Z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42837o0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42838p0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42839q0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f42840r0);
        parcel.writeLong(this.f42841s0);
        List list = this.f42842t0;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            C13535d c13535d = (C13535d) list.get(i11);
            parcel.writeInt(c13535d.f42832a);
            parcel.writeLong(c13535d.f42833b);
            parcel.writeLong(c13535d.f42834c);
        }
        parcel.writeByte(this.f42843u0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f42844v0);
        parcel.writeInt(this.f42845w0);
        parcel.writeInt(this.f42846x0);
        parcel.writeInt(this.f42847y0);
    }

    public C13536e(Parcel parcel) {
        this.f42835Y = parcel.readLong();
        this.f42836Z = parcel.readByte() == 1;
        this.f42837o0 = parcel.readByte() == 1;
        this.f42838p0 = parcel.readByte() == 1;
        this.f42839q0 = parcel.readByte() == 1;
        this.f42840r0 = parcel.readLong();
        this.f42841s0 = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new C13535d(parcel.readLong(), parcel.readInt(), parcel.readLong()));
        }
        this.f42842t0 = DesugarCollections.unmodifiableList(arrayList);
        this.f42843u0 = parcel.readByte() == 1;
        this.f42844v0 = parcel.readLong();
        this.f42845w0 = parcel.readInt();
        this.f42846x0 = parcel.readInt();
        this.f42847y0 = parcel.readInt();
    }
}
