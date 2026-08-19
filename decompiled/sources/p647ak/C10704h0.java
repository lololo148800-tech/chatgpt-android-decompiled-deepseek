package p647ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: ak.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10704h0 extends AbstractC10712k0 implements InterfaceC10715m {
    public static final Parcelable.Creator<C10704h0> CREATOR = new C8343M(29);

    /* JADX INFO: renamed from: Y */
    public final String f31810Y;

    /* JADX INFO: renamed from: Z */
    public final C18428A f31811Z;

    /* JADX INFO: renamed from: o0 */
    public final long f31812o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC10712k0 f31813p0;

    /* JADX INFO: renamed from: q0 */
    public final List f31814q0;

    public C10704h0(long j10, AbstractC10712k0 abstractC10712k0, String str, List posesNeeded, C18428A cameraProperties) {
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
        this.f31810Y = str;
        this.f31811Z = cameraProperties;
        this.f31812o0 = j10;
        this.f31813p0 = abstractC10712k0;
        this.f31814q0 = posesNeeded;
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: c */
    public final List mo11009c() {
        return this.f31814q0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10704h0)) {
            return false;
        }
        C10704h0 c10704h0 = (C10704h0) obj;
        return AbstractC16544l.m18089b(this.f31810Y, c10704h0.f31810Y) && AbstractC16544l.m18089b(this.f31811Z, c10704h0.f31811Z) && this.f31812o0 == c10704h0.f31812o0 && AbstractC16544l.m18089b(this.f31813p0, c10704h0.f31813p0) && AbstractC16544l.m18089b(this.f31814q0, c10704h0.f31814q0);
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: g */
    public final EnumC10723q mo11012g() {
        return (EnumC10723q) AbstractC17680n.m19343S(mo11009c());
    }

    public final int hashCode() {
        String str = this.f31810Y;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.f31811Z.hashCode();
        long j10 = this.f31812o0;
        int i10 = (((iHashCode2 + (iHashCode * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        AbstractC10712k0 abstractC10712k0 = this.f31813p0;
        return this.f31814q0.hashCode() + ((i10 + (abstractC10712k0 != null ? abstractC10712k0.hashCode() : 0)) * 31);
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31813p0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return C17689w.f56480Y;
    }

    public final String toString() {
        return "WaitForWebRtcSetup(webRtcJwt=" + this.f31810Y + ", cameraProperties=" + this.f31811Z + ", startSelfieTimestamp=" + this.f31812o0 + ", backState=" + this.f31813p0 + ", posesNeeded=" + this.f31814q0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f31810Y);
        out.writeParcelable(this.f31811Z, i10);
        out.writeLong(this.f31812o0);
        out.writeParcelable(this.f31813p0, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f31814q0, out);
        while (itM19536s.hasNext()) {
            out.writeString(((EnumC10723q) itM19536s.next()).name());
        }
    }
}
