package p985r9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p523V9.AbstractC8191s5;

/* JADX INFO: renamed from: r9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18893c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60238a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f60238a) {
            case 0:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iM8789q) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        AbstractC8191s5.m8788p(parcel, i10);
                    } else {
                        intent = (Intent) AbstractC8191s5.m8775c(parcel, i10, Intent.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new C18891a(intent);
            default:
                return new C18897g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f60238a) {
            case 0:
                return new C18891a[i10];
            default:
                return new C18897g[i10];
        }
    }
}
