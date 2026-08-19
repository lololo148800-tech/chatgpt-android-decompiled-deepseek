package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import p247Jj.C4409T0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: K9.B */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4555B implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4555B EF5;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC4555B[] f14887Y = {new EnumC4555B("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<EnumC4555B> CREATOR = new C4409T0(14);

    /* JADX INFO: renamed from: a */
    public static EnumC4555B m5321a(String str) throws C4554A {
        for (EnumC4555B enumC4555B : values()) {
            enumC4555B.getClass();
            if (str.equals("public-key")) {
                return enumC4555B;
            }
        }
        throw new C4554A(AbstractC10763a.m11054l("PublicKeyCredentialType ", str, " not supported"));
    }

    public static EnumC4555B valueOf(String str) {
        return (EnumC4555B) Enum.valueOf(EnumC4555B.class, str);
    }

    public static EnumC4555B[] values() {
        return (EnumC4555B[]) f14887Y.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString("public-key");
    }
}
