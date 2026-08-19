package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import p247Jj.C4409T0;

/* JADX INFO: renamed from: K9.e */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4585e implements Parcelable {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC4585e> CREATOR = new C4409T0(20);

    /* JADX INFO: renamed from: Y */
    public final String f14934Y;

    EnumC4585e(String str) {
        this.f14934Y = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC4585e m5334a(String str) throws C4584d {
        for (EnumC4585e enumC4585e : values()) {
            if (str.equals(enumC4585e.f14934Y)) {
                return enumC4585e;
            }
        }
        throw new C4584d(AbstractC10763a.m11054l("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f14934Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14934Y);
    }
}
