package p903n9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: n9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C17535i extends AbstractC20851a {
    public static final Parcelable.Creator<C17535i> CREATOR = new C13280a(26);

    /* JADX INFO: renamed from: Y */
    public final PendingIntent f56088Y;

    public C17535i(PendingIntent pendingIntent) {
        AbstractC20502t.m21157h(pendingIntent);
        this.f56088Y = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17535i) {
            return AbstractC20502t.m21161l(this.f56088Y, ((C17535i) obj).f56088Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56088Y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 1, this.f56088Y, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
