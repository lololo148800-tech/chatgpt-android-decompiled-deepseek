package p903n9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: n9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17532f extends AbstractC20851a {
    public static final Parcelable.Creator<C17532f> CREATOR = new C13280a(19);

    /* JADX INFO: renamed from: Y */
    public final PendingIntent f56078Y;

    public C17532f(PendingIntent pendingIntent) {
        AbstractC20502t.m21157h(pendingIntent);
        this.f56078Y = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 1, this.f56078Y, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
