package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;

/* JADX INFO: renamed from: Jj.S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4407S0 extends AbstractC4413V0 {
    public static final Parcelable.Creator<C4407S0> CREATOR = new C2566j(29);

    /* JADX INFO: renamed from: Y */
    public final EnumC4392K0 f14302Y;

    public C4407S0(EnumC4392K0 pollingMode) {
        AbstractC16544l.m18094g(pollingMode, "pollingMode");
        this.f14302Y = pollingMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4407S0) && this.f14302Y == ((C4407S0) obj).f14302Y;
    }

    public final int hashCode() {
        return this.f14302Y.hashCode();
    }

    public final String toString() {
        return "CheckingForNextState(pollingMode=" + this.f14302Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14302Y.name());
    }

    public /* synthetic */ C4407S0() {
        this(EnumC4392K0.f14274Z);
    }
}
