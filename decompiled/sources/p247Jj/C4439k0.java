package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;
import p022Ak.EnumC0543d;
import p125Ej.C2566j;

/* JADX INFO: renamed from: Jj.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4439k0 implements InterfaceC4441l0 {
    public static final Parcelable.Creator<C4439k0> CREATOR = new C2566j(28);

    /* JADX INFO: renamed from: Y */
    public final String f14451Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC0543d f14452Z;

    /* JADX INFO: renamed from: o0 */
    public final InternalErrorInfo f14453o0;

    /* JADX INFO: renamed from: p0 */
    public final String f14454p0;

    public C4439k0(String str, EnumC0543d errorCode, InternalErrorInfo cause, String str2) {
        AbstractC16544l.m18094g(errorCode, "errorCode");
        AbstractC16544l.m18094g(cause, "cause");
        this.f14451Y = str;
        this.f14452Z = errorCode;
        this.f14453o0 = cause;
        this.f14454p0 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p247Jj.InterfaceC4441l0
    /* JADX INFO: renamed from: e */
    public final String mo5201e() {
        return this.f14454p0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4439k0)) {
            return false;
        }
        C4439k0 c4439k0 = (C4439k0) obj;
        return AbstractC16544l.m18089b(this.f14451Y, c4439k0.f14451Y) && this.f14452Z == c4439k0.f14452Z && AbstractC16544l.m18089b(this.f14453o0, c4439k0.f14453o0) && AbstractC16544l.m18089b(this.f14454p0, c4439k0.f14454p0);
    }

    public final int hashCode() {
        String str = this.f14451Y;
        int iHashCode = (this.f14453o0.hashCode() + ((this.f14452Z.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        String str2 = this.f14454p0;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Error(debugMessage=" + this.f14451Y + ", errorCode=" + this.f14452Z + ", cause=" + this.f14453o0 + ", sessionToken=" + this.f14454p0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14451Y);
        out.writeParcelable(this.f14452Z, i10);
        out.writeParcelable(this.f14453o0, i10);
        out.writeString(this.f14454p0);
    }
}
