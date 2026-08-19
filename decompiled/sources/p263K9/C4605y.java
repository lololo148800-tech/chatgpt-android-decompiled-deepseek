package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import java.util.Arrays;
import p001A.AbstractC0010F;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.y */
/* JADX INFO: loaded from: classes.dex */
public final class C4605y extends AbstractC20851a {
    public static final Parcelable.Creator<C4605y> CREATOR = new C4409T0(12);

    /* JADX INFO: renamed from: Y */
    public final EnumC4555B f15021Y;

    /* JADX INFO: renamed from: Z */
    public final C4595o f15022Z;

    public C4605y(String str, int i10) {
        AbstractC20502t.m21157h(str);
        try {
            this.f15021Y = EnumC4555B.m5321a(str);
            try {
                this.f15022Z = C4595o.m5339a(i10);
            } catch (C4594n e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (C4554A e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4605y)) {
            return false;
        }
        C4605y c4605y = (C4605y) obj;
        return this.f15021Y.equals(c4605y.f15021Y) && this.f15022Z.equals(c4605y.f15022Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15021Y, this.f15022Z});
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [K9.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        this.f15021Y.getClass();
        AbstractC8199t5.m8807f(parcel, 2, "public-key");
        int iMo5322a = this.f15022Z.f14969Y.mo5322a();
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(iMo5322a);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }

    public final String toString() {
        return AbstractC0010F.m20d("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f15021Y), qffLJgOYizGmMj.JbQxCtb, String.valueOf(this.f15022Z), "\n }");
    }
}
