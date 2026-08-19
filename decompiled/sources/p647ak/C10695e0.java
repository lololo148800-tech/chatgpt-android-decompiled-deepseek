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

/* JADX INFO: renamed from: ak.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10695e0 extends AbstractC10712k0 implements InterfaceC10715m {
    public static final Parcelable.Creator<C10695e0> CREATOR = new C8343M(26);

    /* JADX INFO: renamed from: Y */
    public final List f31773Y;

    /* JADX INFO: renamed from: Z */
    public final long f31774Z;

    /* JADX INFO: renamed from: o0 */
    public final C18428A f31775o0;

    /* JADX INFO: renamed from: p0 */
    public final long f31776p0;

    /* JADX INFO: renamed from: q0 */
    public final AbstractC10712k0 f31777q0;

    public C10695e0(List posesNeeded, long j10, C18428A cameraProperties, long j11, AbstractC10712k0 abstractC10712k0) {
        AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f31773Y = posesNeeded;
        this.f31774Z = j10;
        this.f31775o0 = cameraProperties;
        this.f31776p0 = j11;
        this.f31777q0 = abstractC10712k0;
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: c */
    public final List mo11009c() {
        return this.f31773Y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10695e0)) {
            return false;
        }
        C10695e0 c10695e0 = (C10695e0) obj;
        return AbstractC16544l.m18089b(this.f31773Y, c10695e0.f31773Y) && this.f31774Z == c10695e0.f31774Z && AbstractC16544l.m18089b(this.f31775o0, c10695e0.f31775o0) && this.f31776p0 == c10695e0.f31776p0 && AbstractC16544l.m18089b(this.f31777q0, c10695e0.f31777q0);
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: g */
    public final EnumC10723q mo11012g() {
        return (EnumC10723q) AbstractC17680n.m19343S(mo11009c());
    }

    public final int hashCode() {
        int iHashCode = this.f31773Y.hashCode() * 31;
        long j10 = this.f31774Z;
        int iHashCode2 = (this.f31775o0.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        long j11 = this.f31776p0;
        int i10 = (iHashCode2 + ((int) ((j11 >>> 32) ^ j11))) * 31;
        AbstractC10712k0 abstractC10712k0 = this.f31777q0;
        return i10 + (abstractC10712k0 == null ? 0 : abstractC10712k0.hashCode());
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31777q0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return C17689w.f56480Y;
    }

    public final String toString() {
        return "StartCaptureFaceDetected(posesNeeded=" + this.f31773Y + ", startCaptureTimestamp=" + this.f31774Z + ", cameraProperties=" + this.f31775o0 + ", startSelfieTimestamp=" + this.f31776p0 + ", backState=" + this.f31777q0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f31773Y, out);
        while (itM19536s.hasNext()) {
            out.writeString(((EnumC10723q) itM19536s.next()).name());
        }
        out.writeLong(this.f31774Z);
        out.writeParcelable(this.f31775o0, i10);
        out.writeLong(this.f31776p0);
        out.writeParcelable(this.f31777q0, i10);
    }
}
