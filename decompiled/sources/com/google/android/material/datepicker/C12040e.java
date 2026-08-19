package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p647ak.C10707i0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12040e implements Parcelable {
    public static final Parcelable.Creator<C12040e> CREATOR = new C10707i0(13);

    /* JADX INFO: renamed from: Y */
    public final long f36561Y;

    public C12040e(long j10) {
        this.f36561Y = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12040e) && this.f36561Y == ((C12040e) obj).f36561Y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f36561Y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f36561Y);
    }
}
