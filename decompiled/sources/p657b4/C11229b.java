package p657b4;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import p003A1.AbstractC0168G;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20817s;
import p479Td.AbstractC7360k;
import p647ak.C10707i0;

/* JADX INFO: renamed from: b4.b */
/* JADX INFO: loaded from: classes.dex */
public class C11229b implements InterfaceC19752B {
    public static final Parcelable.Creator<C11229b> CREATOR = new C10707i0(2);

    /* JADX INFO: renamed from: Y */
    public final String f33991Y;

    /* JADX INFO: renamed from: Z */
    public final String f33992Z;

    public C11229b(String str, String str2) {
        this.f33991Y = AbstractC7360k.m7788e(str);
        this.f33992Z = str2;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final void mo10752S(C19799z c19799z) {
        String str = this.f33991Y;
        str.getClass();
        String str2 = this.f33992Z;
        switch (str) {
            case "ALBUM":
                c19799z.f62795c = str2;
                break;
            case "TITLE":
                c19799z.f62793a = str2;
                break;
            case "DESCRIPTION":
                c19799z.f62797e = str2;
                break;
            case "ALBUMARTIST":
                c19799z.f62796d = str2;
                break;
            case "ARTIST":
                c19799z.f62794b = str2;
                break;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11229b c11229b = (C11229b) obj;
        return this.f33991Y.equals(c11229b.f33991Y) && this.f33992Z.equals(c11229b.f33992Z);
    }

    public final int hashCode() {
        return this.f33992Z.hashCode() + AbstractC0168G.m527p(527, 31, this.f33991Y);
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C19788o mo10753k() {
        return null;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ byte[] mo10754r0() {
        return null;
    }

    public final String toString() {
        return "VC: " + this.f33991Y + Separators.EQUALS + this.f33992Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f33991Y);
        parcel.writeString(this.f33992Z);
    }

    public C11229b(Parcel parcel) {
        String string = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f33991Y = string;
        this.f33992Z = parcel.readString();
    }
}
