package p588Y2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import p531Vj.C8343M;

/* JADX INFO: renamed from: Y2.M */
/* JADX INFO: loaded from: classes.dex */
public final class C9609M implements Parcelable {
    public static final Parcelable.Creator<C9609M> CREATOR = new C8343M(11);

    /* JADX INFO: renamed from: Y */
    public final String f28914Y;

    /* JADX INFO: renamed from: Z */
    public final String f28915Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f28916o0;

    /* JADX INFO: renamed from: p0 */
    public final int f28917p0;

    /* JADX INFO: renamed from: q0 */
    public final int f28918q0;

    /* JADX INFO: renamed from: r0 */
    public final String f28919r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f28920s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f28921t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f28922u0;

    /* JADX INFO: renamed from: v0 */
    public final boolean f28923v0;

    /* JADX INFO: renamed from: w0 */
    public final int f28924w0;

    /* JADX INFO: renamed from: x0 */
    public final String f28925x0;

    /* JADX INFO: renamed from: y0 */
    public final int f28926y0;

    /* JADX INFO: renamed from: z0 */
    public final boolean f28927z0;

    public C9609M(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        this.f28914Y = abstractComponentCallbacksC11000a.getClass().getName();
        this.f28915Z = abstractComponentCallbacksC11000a.f33155q0;
        this.f28916o0 = abstractComponentCallbacksC11000a.f33163y0;
        this.f28917p0 = abstractComponentCallbacksC11000a.f33126H0;
        this.f28918q0 = abstractComponentCallbacksC11000a.f33127I0;
        this.f28919r0 = abstractComponentCallbacksC11000a.f33128J0;
        this.f28920s0 = abstractComponentCallbacksC11000a.f33131M0;
        this.f28921t0 = abstractComponentCallbacksC11000a.f33162x0;
        this.f28922u0 = abstractComponentCallbacksC11000a.f33130L0;
        this.f28923v0 = abstractComponentCallbacksC11000a.f33129K0;
        this.f28924w0 = abstractComponentCallbacksC11000a.f33142X0.ordinal();
        this.f28925x0 = abstractComponentCallbacksC11000a.f33158t0;
        this.f28926y0 = abstractComponentCallbacksC11000a.f33159u0;
        this.f28927z0 = abstractComponentCallbacksC11000a.f33137S0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f28914Y);
        sb2.append(" (");
        sb2.append(this.f28915Z);
        sb2.append(")}:");
        if (this.f28916o0) {
            sb2.append(" fromLayout");
        }
        int i10 = this.f28918q0;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f28919r0;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f28920s0) {
            sb2.append(" retainInstance");
        }
        if (this.f28921t0) {
            sb2.append(" removing");
        }
        if (this.f28922u0) {
            sb2.append(" detached");
        }
        if (this.f28923v0) {
            sb2.append(" hidden");
        }
        String str2 = this.f28925x0;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f28926y0);
        }
        if (this.f28927z0) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f28914Y);
        parcel.writeString(this.f28915Z);
        parcel.writeInt(this.f28916o0 ? 1 : 0);
        parcel.writeInt(this.f28917p0);
        parcel.writeInt(this.f28918q0);
        parcel.writeString(this.f28919r0);
        parcel.writeInt(this.f28920s0 ? 1 : 0);
        parcel.writeInt(this.f28921t0 ? 1 : 0);
        parcel.writeInt(this.f28922u0 ? 1 : 0);
        parcel.writeInt(this.f28923v0 ? 1 : 0);
        parcel.writeInt(this.f28924w0);
        parcel.writeString(this.f28925x0);
        parcel.writeInt(this.f28926y0);
        parcel.writeInt(this.f28927z0 ? 1 : 0);
    }

    public C9609M(Parcel parcel) {
        this.f28914Y = parcel.readString();
        this.f28915Z = parcel.readString();
        this.f28916o0 = parcel.readInt() != 0;
        this.f28917p0 = parcel.readInt();
        this.f28918q0 = parcel.readInt();
        this.f28919r0 = parcel.readString();
        this.f28920s0 = parcel.readInt() != 0;
        this.f28921t0 = parcel.readInt() != 0;
        this.f28922u0 = parcel.readInt() != 0;
        this.f28923v0 = parcel.readInt() != 0;
        this.f28924w0 = parcel.readInt();
        this.f28925x0 = parcel.readString();
        this.f28926y0 = parcel.readInt();
        this.f28927z0 = parcel.readInt() != 0;
    }
}
