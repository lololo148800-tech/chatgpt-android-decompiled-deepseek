package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.L */
/* JADX INFO: loaded from: classes.dex */
public final class C4565L extends AbstractC20851a {
    public static final Parcelable.Creator<C4565L> CREATOR = new C4409T0(23);

    /* JADX INFO: renamed from: Y */
    public final ArrayList f14905Y;

    public C4565L(ArrayList arrayList) {
        this.f14905Y = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final JSONArray m5326b() {
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f14905Y;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    C4566M c4566m = (C4566M) arrayList.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) c4566m.f14908o0);
                    jSONArray2.put((int) c4566m.f14907Z);
                    jSONArray2.put((int) c4566m.f14908o0);
                    jSONArray.put(i10, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        ArrayList arrayList;
        if (!(obj instanceof C4565L)) {
            return false;
        }
        C4565L c4565l = (C4565L) obj;
        ArrayList arrayList2 = this.f14905Y;
        return (arrayList2 == null && c4565l.f14905Y == null) || (arrayList2 != null && (arrayList = c4565l.f14905Y) != null && arrayList2.containsAll(arrayList) && c4565l.f14905Y.containsAll(arrayList2));
    }

    public final int hashCode() {
        ArrayList arrayList = this.f14905Y;
        return Arrays.hashCode(new Object[]{arrayList == null ? null : new HashSet(arrayList)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8810i(parcel, 1, this.f14905Y);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
