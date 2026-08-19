package p084D4;

import android.os.Parcel;
import android.os.Parcelable;
import ma.C17202b;
import na.C17541b;
import p166Ga.C3028b;
import p213Ia.C3654a;
import p239Ja.C4297C;
import p280L2.AbstractC4913b;
import p862l2.C16808g;
import p999s.C19326W0;
import za.C21818a;

/* JADX INFO: renamed from: D4.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1917h0 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5610a;

    public /* synthetic */ C1917h0(int i10) {
        this.f5610a = i10;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f5610a) {
            case 0:
                return new C1919i0(parcel, classLoader);
            case 1:
                return new C3028b(parcel, classLoader);
            case 2:
                return new C3654a(parcel, classLoader);
            case 3:
                return new C4297C(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC4913b.f15999Z;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new C16808g(parcel, classLoader);
            case 6:
                return new C17202b(parcel, classLoader);
            case 7:
                return new C17541b(parcel, classLoader);
            case 8:
                return new C19326W0(parcel, classLoader);
            default:
                return new C21818a(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f5610a) {
            case 0:
                return new C1919i0[i10];
            case 1:
                return new C3028b[i10];
            case 2:
                return new C3654a[i10];
            case 3:
                return new C4297C[i10];
            case 4:
                return new AbstractC4913b[i10];
            case 5:
                return new C16808g[i10];
            case 6:
                return new C17202b[i10];
            case 7:
                return new C17541b[i10];
            case 8:
                return new C19326W0[i10];
            default:
                return new C21818a[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5610a) {
            case 0:
                return new C1919i0(parcel, null);
            case 1:
                return new C3028b(parcel, (ClassLoader) null);
            case 2:
                return new C3654a(parcel, null);
            case 3:
                return new C4297C(parcel, null);
            case 4:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC4913b.f15999Z;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new C16808g(parcel, null);
            case 6:
                return new C17202b(parcel, (ClassLoader) null);
            case 7:
                return new C17541b(parcel, null);
            case 8:
                return new C19326W0(parcel, null);
            default:
                return new C21818a(parcel, null);
        }
    }
}
