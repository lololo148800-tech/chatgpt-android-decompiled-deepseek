package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: K9.m */
/* JADX INFO: loaded from: classes.dex */
public final class C4593m extends AbstractC20851a {
    public static final Parcelable.Creator<C4593m> CREATOR = new C4576X(3);

    /* JADX INFO: renamed from: Y */
    public final EnumC4583c f14965Y;

    /* JADX INFO: renamed from: Z */
    public final Boolean f14966Z;

    /* JADX INFO: renamed from: o0 */
    public final EnumC4564K f14967o0;

    /* JADX INFO: renamed from: p0 */
    public final EnumC4559F f14968p0;

    public C4593m(String str, Boolean bool, String str2, String str3) {
        EnumC4583c enumC4583cM5333a;
        EnumC4559F enumC4559FM5323a = null;
        if (str == null) {
            enumC4583cM5333a = null;
        } else {
            try {
                enumC4583cM5333a = EnumC4583c.m5333a(str);
            } catch (C4558E | C4573U | C4581b e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f14965Y = enumC4583cM5333a;
        this.f14966Z = bool;
        this.f14967o0 = str2 == null ? null : EnumC4564K.m5325a(str2);
        if (str3 != null) {
            enumC4559FM5323a = EnumC4559F.m5323a(str3);
        }
        this.f14968p0 = enumC4559FM5323a;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC4559F m5338b() {
        EnumC4559F enumC4559F = this.f14968p0;
        if (enumC4559F != null) {
            return enumC4559F;
        }
        Boolean bool = this.f14966Z;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return EnumC4559F.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4593m)) {
            return false;
        }
        C4593m c4593m = (C4593m) obj;
        return AbstractC20502t.m21161l(this.f14965Y, c4593m.f14965Y) && AbstractC20502t.m21161l(this.f14966Z, c4593m.f14966Z) && AbstractC20502t.m21161l(this.f14967o0, c4593m.f14967o0) && AbstractC20502t.m21161l(m5338b(), c4593m.m5338b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14965Y, this.f14966Z, this.f14967o0, m5338b()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14965Y);
        String strValueOf2 = String.valueOf(this.f14967o0);
        String strValueOf3 = String.valueOf(this.f14968p0);
        StringBuilder sbM11058p = AbstractC10763a.m11058p("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbM11058p.append(this.f14966Z);
        sbM11058p.append(", \n requireUserVerification=");
        sbM11058p.append(strValueOf2);
        sbM11058p.append(", \n residentKeyRequirement=");
        return AbstractC9306j0.m9891j(strValueOf3, "\n }", sbM11058p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        EnumC4583c enumC4583c = this.f14965Y;
        AbstractC8199t5.m8807f(parcel, 2, enumC4583c == null ? null : enumC4583c.f14931Y);
        Boolean bool = this.f14966Z;
        if (bool != null) {
            AbstractC8199t5.m8813l(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        EnumC4564K enumC4564K = this.f14967o0;
        AbstractC8199t5.m8807f(parcel, 4, enumC4564K == null ? null : enumC4564K.f14904Y);
        EnumC4559F enumC4559FM5338b = m5338b();
        AbstractC8199t5.m8807f(parcel, 5, enumC4559FM5338b != null ? enumC4559FM5338b.f14897Y : null);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
