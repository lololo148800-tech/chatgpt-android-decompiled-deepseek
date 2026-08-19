package p718e4;

import android.os.Parcel;
import android.os.Parcelable;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p523V9.AbstractC8143m5;

/* JADX INFO: renamed from: e4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13281b implements InterfaceC19752B {
    public static final Parcelable.Creator<C13281b> CREATOR = new C13280a(0);

    /* JADX INFO: renamed from: Y */
    public final long f41979Y;

    /* JADX INFO: renamed from: Z */
    public final long f41980Z;

    /* JADX INFO: renamed from: o0 */
    public final long f41981o0;

    /* JADX INFO: renamed from: p0 */
    public final long f41982p0;

    /* JADX INFO: renamed from: q0 */
    public final long f41983q0;

    public C13281b(long j10, long j11, long j12, long j13, long j14) {
        this.f41979Y = j10;
        this.f41980Z = j11;
        this.f41981o0 = j12;
        this.f41982p0 = j13;
        this.f41983q0 = j14;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void mo10752S(C19799z c19799z) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13281b.class != obj.getClass()) {
            return false;
        }
        C13281b c13281b = (C13281b) obj;
        return this.f41979Y == c13281b.f41979Y && this.f41980Z == c13281b.f41980Z && this.f41981o0 == c13281b.f41981o0 && this.f41982p0 == c13281b.f41982p0 && this.f41983q0 == c13281b.f41983q0;
    }

    public final int hashCode() {
        return AbstractC8143m5.m8679c(this.f41983q0) + ((AbstractC8143m5.m8679c(this.f41982p0) + ((AbstractC8143m5.m8679c(this.f41981o0) + ((AbstractC8143m5.m8679c(this.f41980Z) + ((AbstractC8143m5.m8679c(this.f41979Y) + 527) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C19788o mo10753k() {
        return null;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ byte[] mo10754r0() {
        return null;
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f41979Y + ", photoSize=" + this.f41980Z + ", photoPresentationTimestampUs=" + this.f41981o0 + ", videoStartPosition=" + this.f41982p0 + ", videoSize=" + this.f41983q0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f41979Y);
        parcel.writeLong(this.f41980Z);
        parcel.writeLong(this.f41981o0);
        parcel.writeLong(this.f41982p0);
        parcel.writeLong(this.f41983q0);
    }

    public C13281b(Parcel parcel) {
        this.f41979Y = parcel.readLong();
        this.f41980Z = parcel.readLong();
        this.f41981o0 = parcel.readLong();
        this.f41982p0 = parcel.readLong();
        this.f41983q0 = parcel.readLong();
    }
}
