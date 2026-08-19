package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p647ak.C10707i0;
import p817j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12037b implements Parcelable {
    public static final Parcelable.Creator<C12037b> CREATOR = new C10707i0(12);

    /* JADX INFO: renamed from: Y */
    public final C12052q f36552Y;

    /* JADX INFO: renamed from: Z */
    public final C12052q f36553Z;

    /* JADX INFO: renamed from: o0 */
    public final C12040e f36554o0;

    /* JADX INFO: renamed from: p0 */
    public final C12052q f36555p0;

    /* JADX INFO: renamed from: q0 */
    public final int f36556q0;

    /* JADX INFO: renamed from: r0 */
    public final int f36557r0;

    /* JADX INFO: renamed from: s0 */
    public final int f36558s0;

    public C12037b(C12052q c12052q, C12052q c12052q2, C12040e c12040e, C12052q c12052q3, int i10) {
        Objects.requireNonNull(c12052q, "start cannot be null");
        Objects.requireNonNull(c12052q2, "end cannot be null");
        Objects.requireNonNull(c12040e, "validator cannot be null");
        this.f36552Y = c12052q;
        this.f36553Z = c12052q2;
        this.f36555p0 = c12052q3;
        this.f36556q0 = i10;
        this.f36554o0 = c12040e;
        if (c12052q3 != null && c12052q.f36614Y.compareTo(c12052q3.f36614Y) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c12052q3 != null && c12052q3.f36614Y.compareTo(c12052q2.f36614Y) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > AbstractC12060y.m13640c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f36558s0 = c12052q.m13634d(c12052q2) + 1;
        this.f36557r0 = (c12052q2.f36616o0 - c12052q.f36616o0) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12037b)) {
            return false;
        }
        C12037b c12037b = (C12037b) obj;
        return this.f36552Y.equals(c12037b.f36552Y) && this.f36553Z.equals(c12037b.f36553Z) && Objects.equals(this.f36555p0, c12037b.f36555p0) && this.f36556q0 == c12037b.f36556q0 && this.f36554o0.equals(c12037b.f36554o0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36552Y, this.f36553Z, this.f36555p0, Integer.valueOf(this.f36556q0), this.f36554o0});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f36552Y, 0);
        parcel.writeParcelable(this.f36553Z, 0);
        parcel.writeParcelable(this.f36555p0, 0);
        parcel.writeParcelable(this.f36554o0, 0);
        parcel.writeInt(this.f36556q0);
    }
}
