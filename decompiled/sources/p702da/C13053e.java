package p702da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import p1022t9.InterfaceC19827l;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p647ak.C10707i0;

/* JADX INFO: renamed from: da.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13053e extends AbstractC20851a implements InterfaceC19827l {
    public static final Parcelable.Creator<C13053e> CREATOR = new C10707i0(27);

    /* JADX INFO: renamed from: Y */
    public final ArrayList f41478Y;

    /* JADX INFO: renamed from: Z */
    public final String f41479Z;

    public C13053e(String str, ArrayList arrayList) {
        this.f41478Y = arrayList;
        this.f41479Z = str;
    }

    @Override // p1022t9.InterfaceC19827l
    /* JADX INFO: renamed from: a */
    public final Status mo12680a() {
        return this.f41479Z != null ? Status.f36047q0 : Status.f36051u0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        ArrayList arrayList = this.f41478Y;
        if (arrayList != null) {
            int iM8811j2 = AbstractC8199t5.m8811j(parcel, 1);
            parcel.writeStringList(arrayList);
            AbstractC8199t5.m8812k(parcel, iM8811j2);
        }
        AbstractC8199t5.m8807f(parcel, 2, this.f41479Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
