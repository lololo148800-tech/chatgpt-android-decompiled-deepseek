package p949pj;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.utils.p651oZ.HhJS;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: pj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18461e implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58902a;

    public /* synthetic */ C18461e(int i10) {
        this.f58902a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f58902a) {
            case 0:
                return new C18463f[i10];
            case 1:
                return new C18465g[i10];
            case 2:
                return new C18467h[i10];
            case 3:
                return new C18469i[i10];
            case 4:
                return new C18471j[i10];
            case 5:
                return new C18475l[i10];
            case 6:
                return new C18428A[i10];
            case 7:
                return new C18434G[i10];
            case 8:
                return new C18439L[i10];
            default:
                return new C18440M[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f58902a) {
            case 0:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C18463f(parcel.readInt() != 0);
            case 1:
                AbstractC16544l.m18094g(parcel, HhJS.HTJXhGgTmhKpB);
                return new C18465g(parcel.readInt() != 0);
            case 2:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C18467h(parcel.readInt() != 0);
            case 3:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C18469i(parcel.readInt() != 0);
            case 4:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C18471j(parcel.readInt() != 0);
            case 5:
                AbstractC16544l.m18094g(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                int iM19530m = 0;
                while (iM19530m != i10) {
                    iM19530m = AbstractC17792x.m19530m(C18475l.class, parcel, arrayList, iM19530m, 1);
                }
                return new C18475l(arrayList);
            case 6:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C18428A(parcel.readString(), EnumC18495z.valueOf(parcel.readString()), parcel.readSize(), parcel.readInt());
            case 7:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C18434G((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
            case 8:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C18439L(parcel.readString());
            default:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C18440M(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt());
        }
    }
}
