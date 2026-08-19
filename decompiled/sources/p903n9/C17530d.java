package p903n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: n9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17530d extends AbstractC20851a {
    public static final Parcelable.Creator<C17530d> CREATOR = new C13280a(24);

    /* JADX INFO: renamed from: Y */
    public final boolean f56069Y;

    public C17530d(boolean z6) {
        this.f56069Y = z6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17530d) && this.f56069Y == ((C17530d) obj).f56069Y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f56069Y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f56069Y ? 1 : 0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
