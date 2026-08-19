package p588Y2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import java.util.ArrayList;
import p531Vj.C8343M;

/* JADX INFO: renamed from: Y2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9618b implements Parcelable {
    public static final Parcelable.Creator<C9618b> CREATOR = new C8343M(7);

    /* JADX INFO: renamed from: Y */
    public final int[] f28975Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f28976Z;

    /* JADX INFO: renamed from: o0 */
    public final int[] f28977o0;

    /* JADX INFO: renamed from: p0 */
    public final int[] f28978p0;

    /* JADX INFO: renamed from: q0 */
    public final int f28979q0;

    /* JADX INFO: renamed from: r0 */
    public final String f28980r0;

    /* JADX INFO: renamed from: s0 */
    public final int f28981s0;

    /* JADX INFO: renamed from: t0 */
    public final int f28982t0;

    /* JADX INFO: renamed from: u0 */
    public final CharSequence f28983u0;

    /* JADX INFO: renamed from: v0 */
    public final int f28984v0;

    /* JADX INFO: renamed from: w0 */
    public final CharSequence f28985w0;

    /* JADX INFO: renamed from: x0 */
    public final ArrayList f28986x0;

    /* JADX INFO: renamed from: y0 */
    public final ArrayList f28987y0;

    /* JADX INFO: renamed from: z0 */
    public final boolean f28988z0;

    public C9618b(C9617a c9617a) {
        int size = c9617a.f28957a.size();
        this.f28975Y = new int[size * 6];
        if (!c9617a.f28963g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f28976Z = new ArrayList(size);
        this.f28977o0 = new int[size];
        this.f28978p0 = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C9610N c9610n = (C9610N) c9617a.f28957a.get(i11);
            int i12 = i10 + 1;
            this.f28975Y[i10] = c9610n.f28928a;
            ArrayList arrayList = this.f28976Z;
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c9610n.f28929b;
            arrayList.add(abstractComponentCallbacksC11000a != null ? abstractComponentCallbacksC11000a.f33155q0 : null);
            int[] iArr = this.f28975Y;
            iArr[i12] = c9610n.f28930c ? 1 : 0;
            iArr[i10 + 2] = c9610n.f28931d;
            iArr[i10 + 3] = c9610n.f28932e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = c9610n.f28933f;
            i10 += 6;
            iArr[i13] = c9610n.f28934g;
            this.f28977o0[i11] = c9610n.f28935h.ordinal();
            this.f28978p0[i11] = c9610n.f28936i.ordinal();
        }
        this.f28979q0 = c9617a.f28962f;
        this.f28980r0 = c9617a.f28964h;
        this.f28981s0 = c9617a.f28974r;
        this.f28982t0 = c9617a.f28965i;
        this.f28983u0 = c9617a.f28966j;
        this.f28984v0 = c9617a.f28967k;
        this.f28985w0 = c9617a.f28968l;
        this.f28986x0 = c9617a.f28969m;
        this.f28987y0 = c9617a.f28970n;
        this.f28988z0 = c9617a.f28971o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f28975Y);
        parcel.writeStringList(this.f28976Z);
        parcel.writeIntArray(this.f28977o0);
        parcel.writeIntArray(this.f28978p0);
        parcel.writeInt(this.f28979q0);
        parcel.writeString(this.f28980r0);
        parcel.writeInt(this.f28981s0);
        parcel.writeInt(this.f28982t0);
        TextUtils.writeToParcel(this.f28983u0, parcel, 0);
        parcel.writeInt(this.f28984v0);
        TextUtils.writeToParcel(this.f28985w0, parcel, 0);
        parcel.writeStringList(this.f28986x0);
        parcel.writeStringList(this.f28987y0);
        parcel.writeInt(this.f28988z0 ? 1 : 0);
    }

    public C9618b(Parcel parcel) {
        this.f28975Y = parcel.createIntArray();
        this.f28976Z = parcel.createStringArrayList();
        this.f28977o0 = parcel.createIntArray();
        this.f28978p0 = parcel.createIntArray();
        this.f28979q0 = parcel.readInt();
        this.f28980r0 = parcel.readString();
        this.f28981s0 = parcel.readInt();
        this.f28982t0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f28983u0 = (CharSequence) creator.createFromParcel(parcel);
        this.f28984v0 = parcel.readInt();
        this.f28985w0 = (CharSequence) creator.createFromParcel(parcel);
        this.f28986x0 = parcel.createStringArrayList();
        this.f28987y0 = parcel.createStringArrayList();
        this.f28988z0 = parcel.readInt() != 0;
    }
}
