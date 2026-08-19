package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: K9.r */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4598r implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC4598r> CREATOR = new C4576X(8);

    /* JADX INFO: renamed from: Y */
    public final int f14985Y;

    EnumC4598r(int i10) {
        this.f14985Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC4598r m5340a(int i10) throws C4597q {
        for (EnumC4598r enumC4598r : values()) {
            if (i10 == enumC4598r.f14985Y) {
                return enumC4598r;
            }
        }
        Locale locale = Locale.US;
        throw new C4597q(AbstractC0010F.m19c(i10, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14985Y);
    }
}
