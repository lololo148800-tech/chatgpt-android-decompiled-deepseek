package p673c4;

import android.os.Parcel;
import android.os.Parcelable;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import java.util.List;
import java.util.Map;
import p003A1.AbstractC0168G;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;

/* JADX INFO: renamed from: c4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11646b implements InterfaceC19752B {
    public static final Parcelable.Creator<C11646b> CREATOR = new C10707i0(8);

    /* JADX INFO: renamed from: Y */
    public final int f35277Y;

    /* JADX INFO: renamed from: Z */
    public final String f35278Z;

    /* JADX INFO: renamed from: o0 */
    public final String f35279o0;

    /* JADX INFO: renamed from: p0 */
    public final String f35280p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f35281q0;

    /* JADX INFO: renamed from: r0 */
    public final int f35282r0;

    public C11646b(int i10, int i11, String str, String str2, String str3, boolean z6) {
        AbstractC20800b.m21316d(i11 == -1 || i11 > 0);
        this.f35277Y = i10;
        this.f35278Z = str;
        this.f35279o0 = str2;
        this.f35280p0 = str3;
        this.f35281q0 = z6;
        this.f35282r0 = i11;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final void mo10752S(C19799z c19799z) {
        String str = this.f35279o0;
        if (str != null) {
            c19799z.f62814v = str;
        }
        String str2 = this.f35278Z;
        if (str2 != null) {
            c19799z.f62813u = str2;
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
        if (obj == null || C11646b.class != obj.getClass()) {
            return false;
        }
        C11646b c11646b = (C11646b) obj;
        return this.f35277Y == c11646b.f35277Y && AbstractC20817s.m21400a(this.f35278Z, c11646b.f35278Z) && AbstractC20817s.m21400a(this.f35279o0, c11646b.f35279o0) && AbstractC20817s.m21400a(this.f35280p0, c11646b.f35280p0) && this.f35281q0 == c11646b.f35281q0 && this.f35282r0 == c11646b.f35282r0;
    }

    public final int hashCode() {
        int i10 = (527 + this.f35277Y) * 31;
        String str = this.f35278Z;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35279o0;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35280p0;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f35281q0 ? 1 : 0)) * 31) + this.f35282r0;
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
        return "IcyHeaders: name=\"" + this.f35279o0 + "\", genre=\"" + this.f35278Z + "\", bitrate=" + this.f35277Y + ", metadataInterval=" + this.f35282r0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f35277Y);
        parcel.writeString(this.f35278Z);
        parcel.writeString(this.f35279o0);
        parcel.writeString(this.f35280p0);
        int i11 = AbstractC20817s.f66106a;
        parcel.writeInt(this.f35281q0 ? 1 : 0);
        parcel.writeInt(this.f35282r0);
    }

    /* JADX INFO: renamed from: a */
    public static C11646b m13005a(Map map) {
        boolean z6;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List list = (List) map.get("icy-br");
        boolean z10 = true;
        int i12 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i11 = Integer.parseInt(str4) * 1000;
                if (i11 > 0) {
                    z6 = true;
                } else {
                    try {
                        AbstractC20800b.m21332t("IcyHeaders", "Invalid bitrate: " + str4);
                        z6 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC0168G.m508C("Invalid bitrate header: ", str4, "IcyHeaders");
                        z6 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z6 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z6 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z6 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z6 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get(qffLJgOYizGmMj.VFxw);
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z6 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        AbstractC20800b.m21332t("IcyHeaders", "Invalid metadata interval: " + str5);
                        z10 = z6;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        AbstractC0168G.m508C("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z6 = z10;
            } catch (NumberFormatException unused4) {
            }
        }
        int i14 = i12;
        if (z6) {
            return new C11646b(i10, i14, str, str2, str3, zEquals);
        }
        return null;
    }

    public C11646b(Parcel parcel) {
        this.f35277Y = parcel.readInt();
        this.f35278Z = parcel.readString();
        this.f35279o0 = parcel.readString();
        this.f35280p0 = parcel.readString();
        int i10 = AbstractC20817s.f66106a;
        this.f35281q0 = parcel.readInt() != 0;
        this.f35282r0 = parcel.readInt();
    }
}
