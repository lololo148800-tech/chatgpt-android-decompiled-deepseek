package p868l9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: l9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16834b extends AbstractC20851a {
    public static final Parcelable.Creator<C16834b> CREATOR = new C13280a(13);

    /* JADX INFO: renamed from: Y */
    public final String f54006Y;

    /* JADX INFO: renamed from: Z */
    public final int f54007Z;

    public C16834b(String str, int i10) {
        this.f54006Y = str;
        this.f54007Z = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f54006Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f54007Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
