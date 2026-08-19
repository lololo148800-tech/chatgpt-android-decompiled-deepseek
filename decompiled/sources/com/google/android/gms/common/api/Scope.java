package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC20851a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C18658l(10);

    /* JADX INFO: renamed from: Y */
    public final int f36045Y;

    /* JADX INFO: renamed from: Z */
    public final String f36046Z;

    public Scope(int i10, String str) {
        AbstractC20502t.m21154e(str, "scopeUri must not be null or empty");
        this.f36045Y = i10;
        this.f36046Z = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f36046Z.equals(((Scope) obj).f36046Z);
    }

    public final int hashCode() {
        return this.f36046Z.hashCode();
    }

    public final String toString() {
        return this.f36046Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f36045Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f36046Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
