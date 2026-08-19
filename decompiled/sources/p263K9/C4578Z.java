package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C4578Z extends AbstractC20851a {
    public static final Parcelable.Creator<C4578Z> CREATOR = new C4576X(6);

    /* JADX INFO: renamed from: Y */
    public final ArrayList f14928Y;

    public C4578Z(ArrayList arrayList) {
        AbstractC20502t.m21157h(arrayList);
        this.f14928Y = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4578Z)) {
            return false;
        }
        C4578Z c4578z = (C4578Z) obj;
        ArrayList arrayList = c4578z.f14928Y;
        ArrayList arrayList2 = this.f14928Y;
        return arrayList2.containsAll(arrayList) && c4578z.f14928Y.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f14928Y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8810i(parcel, 1, this.f14928Y);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
