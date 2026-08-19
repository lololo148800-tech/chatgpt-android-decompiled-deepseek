package p1147z9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p1088wk.C21006a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: z9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21816b extends AbstractC20851a {
    public static final Parcelable.Creator<C21816b> CREATOR = new C21006a(6);

    /* JADX INFO: renamed from: Y */
    public final PendingIntent f69188Y;

    public C21816b(PendingIntent pendingIntent) {
        this.f69188Y = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 1, this.f69188Y, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
