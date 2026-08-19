package p1016t3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p1073w3.AbstractC20817s;
import p523V9.AbstractC8143m5;
import p960q9.C18658l;

/* JADX INFO: renamed from: t3.C */
/* JADX INFO: loaded from: classes.dex */
public final class C19753C implements Parcelable {
    public static final Parcelable.Creator<C19753C> CREATOR = new C18658l(9);

    /* JADX INFO: renamed from: Y */
    public final InterfaceC19752B[] f62555Y;

    /* JADX INFO: renamed from: Z */
    public final long f62556Z;

    public C19753C(InterfaceC19752B... interfaceC19752BArr) {
        this(-9223372036854775807L, interfaceC19752BArr);
    }

    /* JADX INFO: renamed from: a */
    public final C19753C m20701a(InterfaceC19752B... interfaceC19752BArr) {
        if (interfaceC19752BArr.length == 0) {
            return this;
        }
        int i10 = AbstractC20817s.f66106a;
        InterfaceC19752B[] interfaceC19752BArr2 = this.f62555Y;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC19752BArr2, interfaceC19752BArr2.length + interfaceC19752BArr.length);
        System.arraycopy(interfaceC19752BArr, 0, objArrCopyOf, interfaceC19752BArr2.length, interfaceC19752BArr.length);
        return new C19753C(this.f62556Z, (InterfaceC19752B[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: b */
    public final C19753C m20702b(C19753C c19753c) {
        return c19753c == null ? this : m20701a(c19753c.f62555Y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19753C.class != obj.getClass()) {
            return false;
        }
        C19753C c19753c = (C19753C) obj;
        return Arrays.equals(this.f62555Y, c19753c.f62555Y) && this.f62556Z == c19753c.f62556Z;
    }

    public final int hashCode() {
        return AbstractC8143m5.m8679c(this.f62556Z) + (Arrays.hashCode(this.f62555Y) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f62555Y));
        long j10 = this.f62556Z;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        InterfaceC19752B[] interfaceC19752BArr = this.f62555Y;
        parcel.writeInt(interfaceC19752BArr.length);
        for (InterfaceC19752B interfaceC19752B : interfaceC19752BArr) {
            parcel.writeParcelable(interfaceC19752B, 0);
        }
        parcel.writeLong(this.f62556Z);
    }

    public C19753C(long j10, InterfaceC19752B... interfaceC19752BArr) {
        this.f62556Z = j10;
        this.f62555Y = interfaceC19752BArr;
    }

    public C19753C(List list) {
        this((InterfaceC19752B[]) list.toArray(new InterfaceC19752B[0]));
    }

    public C19753C(Parcel parcel) {
        this.f62555Y = new InterfaceC19752B[parcel.readInt()];
        int i10 = 0;
        while (true) {
            InterfaceC19752B[] interfaceC19752BArr = this.f62555Y;
            if (i10 < interfaceC19752BArr.length) {
                interfaceC19752BArr[i10] = (InterfaceC19752B) parcel.readParcelable(InterfaceC19752B.class.getClassLoader());
                i10++;
            } else {
                this.f62556Z = parcel.readLong();
                return;
            }
        }
    }
}
