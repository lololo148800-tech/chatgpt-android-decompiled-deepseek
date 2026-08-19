package p1016t3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import p1073w3.AbstractC20817s;
import p960q9.C18658l;

/* JADX INFO: renamed from: t3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C19785l implements Comparator, Parcelable {
    public static final Parcelable.Creator<C19785l> CREATOR = new C18658l(7);

    /* JADX INFO: renamed from: Y */
    public final C19784k[] f62689Y;

    /* JADX INFO: renamed from: Z */
    public int f62690Z;

    /* JADX INFO: renamed from: o0 */
    public final String f62691o0;

    /* JADX INFO: renamed from: p0 */
    public final int f62692p0;

    public C19785l(String str, boolean z6, C19784k... c19784kArr) {
        this.f62691o0 = str;
        c19784kArr = z6 ? (C19784k[]) c19784kArr.clone() : c19784kArr;
        this.f62689Y = c19784kArr;
        this.f62692p0 = c19784kArr.length;
        Arrays.sort(c19784kArr, this);
    }

    /* JADX INFO: renamed from: a */
    public final C19785l m20744a(String str) {
        return AbstractC20817s.m21400a(this.f62691o0, str) ? this : new C19785l(str, false, this.f62689Y);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C19784k c19784k = (C19784k) obj;
        C19784k c19784k2 = (C19784k) obj2;
        UUID uuid = AbstractC19780g.f62669a;
        if (uuid.equals(c19784k.f62685Z)) {
            return uuid.equals(c19784k2.f62685Z) ? 0 : 1;
        }
        return c19784k.f62685Z.compareTo(c19784k2.f62685Z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19785l.class != obj.getClass()) {
            return false;
        }
        C19785l c19785l = (C19785l) obj;
        return AbstractC20817s.m21400a(this.f62691o0, c19785l.f62691o0) && Arrays.equals(this.f62689Y, c19785l.f62689Y);
    }

    public final int hashCode() {
        if (this.f62690Z == 0) {
            String str = this.f62691o0;
            this.f62690Z = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f62689Y);
        }
        return this.f62690Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f62691o0);
        parcel.writeTypedArray(this.f62689Y, 0);
    }

    public C19785l(Parcel parcel) {
        this.f62691o0 = parcel.readString();
        C19784k[] c19784kArr = (C19784k[]) parcel.createTypedArray(C19784k.CREATOR);
        int i10 = AbstractC20817s.f66106a;
        this.f62689Y = c19784kArr;
        this.f62692p0 = c19784kArr.length;
    }
}
