package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Parcel;
import android.os.Parcelable;
import p247Jj.C4409T0;

/* JADX INFO: renamed from: K9.K */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4564K implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED(ParameterNames.REQUIRED),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    EF28("discouraged");

    public static final Parcelable.Creator<EnumC4564K> CREATOR = new C4409T0(22);

    /* JADX INFO: renamed from: Y */
    public final String f14904Y;

    EnumC4564K(String str) {
        this.f14904Y = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC4564K m5325a(String str) throws C4573U {
        for (EnumC4564K enumC4564K : values()) {
            if (str.equals(enumC4564K.f14904Y)) {
                return enumC4564K;
            }
        }
        throw new C4573U(AbstractC10763a.m11054l("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f14904Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14904Y);
    }
}
