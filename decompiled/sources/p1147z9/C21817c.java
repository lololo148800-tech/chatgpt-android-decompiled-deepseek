package p1147z9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p1088wk.C21006a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: z9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21817c extends AbstractC20851a {
    public static final Parcelable.Creator<C21817c> CREATOR = new C21006a(7);

    /* JADX INFO: renamed from: Y */
    public final int f69189Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f69190Z;

    public C21817c(int i10, boolean z6) {
        this.f69189Y = i10;
        this.f69190Z = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f69189Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f69190Z ? 1 : 0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
