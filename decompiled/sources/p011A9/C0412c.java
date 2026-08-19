package p011A9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1009s9.C19501d;
import p523V9.AbstractC8191s5;

/* JADX INFO: renamed from: A9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0412c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM8789q = AbstractC8191s5.m8789q(parcel);
        ArrayList arrayListM8779g = null;
        String strM8776d = null;
        boolean zM8782j = false;
        String strM8776d2 = null;
        while (parcel.dataPosition() < iM8789q) {
            int i10 = parcel.readInt();
            char c9 = (char) i10;
            if (c9 == 1) {
                arrayListM8779g = AbstractC8191s5.m8779g(parcel, i10, C19501d.CREATOR);
            } else if (c9 == 2) {
                zM8782j = AbstractC8191s5.m8782j(parcel, i10);
            } else if (c9 == 3) {
                strM8776d2 = AbstractC8191s5.m8776d(parcel, i10);
            } else if (c9 != 4) {
                AbstractC8191s5.m8788p(parcel, i10);
            } else {
                strM8776d = AbstractC8191s5.m8776d(parcel, i10);
            }
        }
        AbstractC8191s5.m8781i(parcel, iM8789q);
        return new C0410a(arrayListM8779g, zM8782j, strM8776d2, strM8776d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0410a[i10];
    }
}
