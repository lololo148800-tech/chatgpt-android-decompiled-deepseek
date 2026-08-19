package p1156zj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;

/* JADX INFO: renamed from: zj.U0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22126U0 implements Parcelable {
    public static final Parcelable.Creator<C22126U0> CREATOR = new C21006a(29);

    /* JADX INFO: renamed from: Y */
    public final boolean f69941Y;

    /* JADX INFO: renamed from: Z */
    public final long f69942Z;

    public C22126U0(boolean z6, long j10) {
        this.f69941Y = z6;
        this.f69942Z = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22126U0)) {
            return false;
        }
        C22126U0 c22126u0 = (C22126U0) obj;
        return this.f69941Y == c22126u0.f69941Y && this.f69942Z == c22126u0.f69942Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z6 = this.f69941Y;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        long j10 = this.f69942Z;
        return (r6 * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "ManualCaptureConfig(isEnabled=" + this.f69941Y + ", delayMs=" + this.f69942Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f69941Y ? 1 : 0);
        out.writeLong(this.f69942Z);
    }
}
