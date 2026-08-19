package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import p247Jj.C4409T0;

/* JADX INFO: renamed from: K9.G */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4560G implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<EnumC4560G> CREATOR = new C4409T0(18);

    /* JADX INFO: renamed from: Y */
    public final String f14899Y;

    EnumC4560G(String str) {
        this.f14899Y = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC4560G m5324a(String str) throws C4561H {
        for (EnumC4560G enumC4560G : values()) {
            if (str.equals(enumC4560G.f14899Y)) {
                return enumC4560G;
            }
        }
        throw new C4561H(AbstractC10763a.m11054l("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f14899Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14899Y);
    }
}
