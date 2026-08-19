package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p449S9.AbstractC7057a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.I */
/* JADX INFO: loaded from: classes.dex */
public final class C4562I extends AbstractC20851a {
    public static final Parcelable.Creator<C4562I> CREATOR = new C4409T0(19);

    /* JADX INFO: renamed from: Y */
    public final EnumC4560G f14900Y;

    /* JADX INFO: renamed from: Z */
    public final String f14901Z;

    static {
        new C4562I("supported", null);
        new C4562I("not-supported", null);
    }

    public C4562I(String str, String str2) {
        AbstractC20502t.m21157h(str);
        try {
            this.f14900Y = EnumC4560G.m5324a(str);
            this.f14901Z = str2;
        } catch (C4561H e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4562I)) {
            return false;
        }
        C4562I c4562i = (C4562I) obj;
        return AbstractC7057a.m7463h(this.f14900Y, c4562i.f14900Y) && AbstractC7057a.m7463h(this.f14901Z, c4562i.f14901Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14900Y, this.f14901Z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 2, this.f14900Y.f14899Y);
        AbstractC8199t5.m8807f(parcel, 3, this.f14901Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
