package p117Eb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p021Aj.C0516a;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p692d0.C12966e;

/* JADX INFO: renamed from: Eb.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2390t extends AbstractC20851a {
    public static final Parcelable.Creator<C2390t> CREATOR = new C0516a(28);

    /* JADX INFO: renamed from: Y */
    public final Bundle f7425Y;

    /* JADX INFO: renamed from: Z */
    public C12966e f7426Z;

    public C2390t(Bundle bundle) {
        this.f7425Y = bundle;
    }

    /* JADX INFO: renamed from: b */
    public final Map m3501b() {
        if (this.f7426Z == null) {
            C12966e c12966e = new C12966e(0);
            Bundle bundle = this.f7425Y;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c12966e.put(str, str2);
                    }
                }
            }
            this.f7426Z = c12966e;
        }
        return this.f7426Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8803b(parcel, 2, this.f7425Y);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
