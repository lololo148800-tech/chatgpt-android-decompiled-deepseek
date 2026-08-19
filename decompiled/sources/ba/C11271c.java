package ba;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p647ak.C10707i0;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: ba.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11271c extends AbstractC20851a {
    public static final Parcelable.Creator<C11271c> CREATOR = new C10707i0(5);

    /* JADX INFO: renamed from: Y */
    public final ArrayList f34144Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f34145Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f34146o0;

    public C11271c(ArrayList arrayList, boolean z6, boolean z10) {
        this.f34144Y = arrayList;
        this.f34145Z = z6;
        this.f34146o0 = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8810i(parcel, 1, DesugarCollections.unmodifiableList(this.f34144Y));
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f34145Z ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f34146o0 ? 1 : 0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
