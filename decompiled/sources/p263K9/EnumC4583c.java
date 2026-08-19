package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import p247Jj.C4409T0;

/* JADX INFO: renamed from: K9.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4583c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC4583c> CREATOR = new C4409T0(1);

    /* JADX INFO: renamed from: Y */
    public final String f14931Y;

    EnumC4583c(String str) {
        this.f14931Y = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC4583c m5333a(String str) {
        for (EnumC4583c enumC4583c : values()) {
            if (str.equals(enumC4583c.f14931Y)) {
                return enumC4583c;
            }
        }
        throw new C4581b(AbstractC10763a.m11054l("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f14931Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14931Y);
    }
}
