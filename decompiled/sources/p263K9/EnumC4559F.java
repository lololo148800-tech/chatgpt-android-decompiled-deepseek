package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Parcel;
import android.os.Parcelable;
import p247Jj.C4409T0;

/* JADX INFO: renamed from: K9.F */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4559F implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED(ParameterNames.REQUIRED);

    public static final Parcelable.Creator<EnumC4559F> CREATOR = new C4409T0(16);

    /* JADX INFO: renamed from: Y */
    public final String f14897Y;

    EnumC4559F(String str) {
        this.f14897Y = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC4559F m5323a(String str) {
        for (EnumC4559F enumC4559F : values()) {
            if (str.equals(enumC4559F.f14897Y)) {
                return enumC4559F;
            }
        }
        throw new C4558E(AbstractC10763a.m11054l("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f14897Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14897Y);
    }
}
