package p647ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: ak.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10674W extends AbstractC10712k0 implements InterfaceC10715m {
    public static final Parcelable.Creator<C10674W> CREATOR = new C8343M(18);

    /* JADX INFO: renamed from: Y */
    public final int f31689Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC10647I f31690Z;

    /* JADX INFO: renamed from: o0 */
    public final List f31691o0;

    /* JADX INFO: renamed from: p0 */
    public final long f31692p0;

    /* JADX INFO: renamed from: q0 */
    public final C18428A f31693q0;

    /* JADX INFO: renamed from: r0 */
    public final long f31694r0;

    /* JADX INFO: renamed from: s0 */
    public final AbstractC10712k0 f31695s0;

    public C10674W(int i10, long j10, long j11, EnumC10647I enumC10647I, AbstractC10712k0 abstractC10712k0, List posesNeeded, C18428A cameraProperties) {
        AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f31689Y = i10;
        this.f31690Z = enumC10647I;
        this.f31691o0 = posesNeeded;
        this.f31692p0 = j10;
        this.f31693q0 = cameraProperties;
        this.f31694r0 = j11;
        this.f31695s0 = abstractC10712k0;
    }

    /* JADX INFO: renamed from: l */
    public static C10674W m11016l(C10674W c10674w, int i10, EnumC10647I enumC10647I, int i11) {
        if ((i11 & 1) != 0) {
            i10 = c10674w.f31689Y;
        }
        List posesNeeded = c10674w.f31691o0;
        AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
        C18428A cameraProperties = c10674w.f31693q0;
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        return new C10674W(i10, c10674w.f31692p0, c10674w.f31694r0, enumC10647I, c10674w.f31695s0, posesNeeded, cameraProperties);
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: c */
    public final List mo11009c() {
        return this.f31691o0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10674W)) {
            return false;
        }
        C10674W c10674w = (C10674W) obj;
        return this.f31689Y == c10674w.f31689Y && this.f31690Z == c10674w.f31690Z && AbstractC16544l.m18089b(this.f31691o0, c10674w.f31691o0) && this.f31692p0 == c10674w.f31692p0 && AbstractC16544l.m18089b(this.f31693q0, c10674w.f31693q0) && this.f31694r0 == c10674w.f31694r0 && AbstractC16544l.m18089b(this.f31695s0, c10674w.f31695s0);
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: g */
    public final EnumC10723q mo11012g() {
        return (EnumC10723q) AbstractC17680n.m19343S(mo11009c());
    }

    public final int hashCode() {
        int i10 = this.f31689Y * 31;
        EnumC10647I enumC10647I = this.f31690Z;
        int iM15858x = AbstractC14376f.m15858x(this.f31691o0, (i10 + (enumC10647I == null ? 0 : enumC10647I.hashCode())) * 31, 31);
        long j10 = this.f31692p0;
        int iHashCode = (this.f31693q0.hashCode() + ((iM15858x + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        long j11 = this.f31694r0;
        int i11 = (iHashCode + ((int) ((j11 >>> 32) ^ j11))) * 31;
        AbstractC10712k0 abstractC10712k0 = this.f31695s0;
        return i11 + (abstractC10712k0 != null ? abstractC10712k0.hashCode() : 0);
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31695s0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return C17689w.f56480Y;
    }

    public final String toString() {
        return "CountdownToCapture(countDown=" + this.f31689Y + ", selfieError=" + this.f31690Z + ", posesNeeded=" + this.f31691o0 + ", startCaptureTimestamp=" + this.f31692p0 + ", cameraProperties=" + this.f31693q0 + ", startSelfieTimestamp=" + this.f31694r0 + ", backState=" + this.f31695s0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f31689Y);
        EnumC10647I enumC10647I = this.f31690Z;
        if (enumC10647I == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC10647I.name());
        }
        Iterator itM19536s = AbstractC17792x.m19536s(this.f31691o0, out);
        while (itM19536s.hasNext()) {
            out.writeString(((EnumC10723q) itM19536s.next()).name());
        }
        out.writeLong(this.f31692p0);
        out.writeParcelable(this.f31693q0, i10);
        out.writeLong(this.f31694r0);
        out.writeParcelable(this.f31695s0, i10);
    }
}
