package p1097x3;

import android.os.Parcel;
import android.os.Parcelable;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p1088wk.C21006a;
import p523V9.AbstractC8143m5;

/* JADX INFO: renamed from: x3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21117c implements InterfaceC19752B {
    public static final Parcelable.Creator<C21117c> CREATOR = new C21006a(3);

    /* JADX INFO: renamed from: Y */
    public final long f67075Y;

    /* JADX INFO: renamed from: Z */
    public final long f67076Z;

    /* JADX INFO: renamed from: o0 */
    public final long f67077o0;

    public C21117c(long j10, long j11, long j12) {
        this.f67075Y = j10;
        this.f67076Z = j11;
        this.f67077o0 = j12;
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
        if (!(obj instanceof C21117c)) {
            return false;
        }
        C21117c c21117c = (C21117c) obj;
        return this.f67075Y == c21117c.f67075Y && this.f67076Z == c21117c.f67076Z && this.f67077o0 == c21117c.f67077o0;
    }

    public final int hashCode() {
        return AbstractC8143m5.m8679c(this.f67077o0) + ((AbstractC8143m5.m8679c(this.f67076Z) + ((AbstractC8143m5.m8679c(this.f67075Y) + 527) * 31)) * 31);
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
        return "Mp4Timestamp: creation time=" + this.f67075Y + ", modification time=" + this.f67076Z + ", timescale=" + this.f67077o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f67075Y);
        parcel.writeLong(this.f67076Z);
        parcel.writeLong(this.f67077o0);
    }

    public C21117c(Parcel parcel) {
        this.f67075Y = parcel.readLong();
        this.f67076Z = parcel.readLong();
        this.f67077o0 = parcel.readLong();
    }
}
