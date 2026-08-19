package p985r9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: r9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18891a extends AbstractC20851a {
    public static final Parcelable.Creator<C18891a> CREATOR = new C18893c(0);

    /* JADX INFO: renamed from: Y */
    public final Intent f60227Y;

    public C18891a(Intent intent) {
        this.f60227Y = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 1, this.f60227Y, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
