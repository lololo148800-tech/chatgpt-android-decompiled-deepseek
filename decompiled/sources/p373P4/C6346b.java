package p373P4;

import android.os.Parcel;
import android.util.SparseIntArray;
import p571X9.AbstractC9306j0;
import p692d0.C12966e;

/* JADX INFO: renamed from: P4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6346b extends AbstractC6345a {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f20605d;

    /* JADX INFO: renamed from: e */
    public final Parcel f20606e;

    /* JADX INFO: renamed from: f */
    public final int f20607f;

    /* JADX INFO: renamed from: g */
    public final int f20608g;

    /* JADX INFO: renamed from: h */
    public final String f20609h;

    /* JADX INFO: renamed from: i */
    public int f20610i;

    /* JADX INFO: renamed from: j */
    public int f20611j;

    /* JADX INFO: renamed from: k */
    public int f20612k;

    public C6346b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C12966e(0), new C12966e(0), new C12966e(0));
    }

    @Override // p373P4.AbstractC6345a
    /* JADX INFO: renamed from: a */
    public final C6346b mo6960a() {
        Parcel parcel = this.f20606e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f20611j;
        if (i10 == this.f20607f) {
            i10 = this.f20608g;
        }
        return new C6346b(parcel, iDataPosition, i10, AbstractC9306j0.m9891j(this.f20609h, "  ", new StringBuilder()), this.f20602a, this.f20603b, this.f20604c);
    }

    @Override // p373P4.AbstractC6345a
    /* JADX INFO: renamed from: e */
    public final boolean mo6964e(int i10) {
        while (this.f20611j < this.f20608g) {
            int i11 = this.f20612k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f20611j;
            Parcel parcel = this.f20606e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f20612k = parcel.readInt();
            this.f20611j += i13;
        }
        return this.f20612k == i10;
    }

    @Override // p373P4.AbstractC6345a
    /* JADX INFO: renamed from: h */
    public final void mo6967h(int i10) {
        int i11 = this.f20610i;
        SparseIntArray sparseIntArray = this.f20605d;
        Parcel parcel = this.f20606e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f20610i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public C6346b(Parcel parcel, int i10, int i11, String str, C12966e c12966e, C12966e c12966e2, C12966e c12966e3) {
        super(c12966e, c12966e2, c12966e3);
        this.f20605d = new SparseIntArray();
        this.f20610i = -1;
        this.f20612k = -1;
        this.f20606e = parcel;
        this.f20607f = i10;
        this.f20608g = i11;
        this.f20611j = i10;
        this.f20609h = str;
    }
}
