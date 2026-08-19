package p1009s9;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Arrays;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;
import sk.C19665d;

/* JADX INFO: renamed from: s9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C19501d extends AbstractC20851a {
    public static final Parcelable.Creator<C19501d> CREATOR = new C18658l(5);

    /* JADX INFO: renamed from: Y */
    public final String f61946Y;

    /* JADX INFO: renamed from: Z */
    public final int f61947Z;

    /* JADX INFO: renamed from: o0 */
    public final long f61948o0;

    public C19501d(long j10, String str) {
        this.f61946Y = str;
        this.f61948o0 = j10;
        this.f61947Z = -1;
    }

    /* JADX INFO: renamed from: b */
    public final long m20594b() {
        long j10 = this.f61948o0;
        return j10 == -1 ? this.f61947Z : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19501d) {
            C19501d c19501d = (C19501d) obj;
            String str = this.f61946Y;
            if (((str != null && str.equals(c19501d.f61946Y)) || (str == null && c19501d.f61946Y == null)) && m20594b() == c19501d.m20594b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f61946Y, Long.valueOf(m20594b())});
    }

    public final String toString() {
        C19665d c19665d = new C19665d(this);
        c19665d.m20639a(this.f61946Y, DiagnosticsEntry.NAME_KEY);
        c19665d.m20639a(Long.valueOf(m20594b()), "version");
        return c19665d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f61946Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f61947Z);
        long jM20594b = m20594b();
        AbstractC8199t5.m8813l(parcel, 3, 8);
        parcel.writeLong(jM20594b);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }

    public C19501d(long j10, String str, int i10) {
        this.f61946Y = str;
        this.f61947Z = i10;
        this.f61948o0 = j10;
    }
}
