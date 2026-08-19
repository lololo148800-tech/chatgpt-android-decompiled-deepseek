package p647ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8138m0;
import p531Vj.C8343M;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: ak.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10692d0 extends AbstractC10712k0 implements InterfaceC10717n {
    public static final Parcelable.Creator<C10692d0> CREATOR = new C8343M(25);

    /* JADX INFO: renamed from: Y */
    public final boolean f31757Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC10647I f31758Z;

    /* JADX INFO: renamed from: o0 */
    public final List f31759o0;

    /* JADX INFO: renamed from: p0 */
    public final long f31760p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f31761q0;

    /* JADX INFO: renamed from: r0 */
    public final long f31762r0;

    /* JADX INFO: renamed from: s0 */
    public final C18428A f31763s0;

    /* JADX INFO: renamed from: t0 */
    public final AbstractC10712k0 f31764t0;

    /* JADX INFO: renamed from: u0 */
    public final C17689w f31765u0;

    public C10692d0(boolean z6, EnumC10647I enumC10647I, List posesNeeded, long j10, boolean z10, long j11, C18428A cameraProperties, AbstractC10712k0 abstractC10712k0) {
        AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f31757Y = z6;
        this.f31758Z = enumC10647I;
        this.f31759o0 = posesNeeded;
        this.f31760p0 = j10;
        this.f31761q0 = z10;
        this.f31762r0 = j11;
        this.f31763s0 = cameraProperties;
        this.f31764t0 = abstractC10712k0;
        this.f31765u0 = C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: l */
    public static C10692d0 m11018l(C10692d0 c10692d0, EnumC10647I enumC10647I, int i10) {
        if ((i10 & 2) != 0) {
            enumC10647I = c10692d0.f31758Z;
        }
        EnumC10647I enumC10647I2 = enumC10647I;
        List posesNeeded = c10692d0.f31759o0;
        long j10 = c10692d0.f31760p0;
        boolean z6 = (i10 & 16) != 0 ? c10692d0.f31761q0 : false;
        long j11 = c10692d0.f31762r0;
        C18428A cameraProperties = c10692d0.f31763s0;
        AbstractC10712k0 abstractC10712k0 = c10692d0.f31764t0;
        c10692d0.getClass();
        AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        return new C10692d0(false, enumC10647I2, posesNeeded, j10, z6, j11, cameraProperties, abstractC10712k0);
    }

    @Override // p647ak.InterfaceC10717n
    /* JADX INFO: renamed from: a */
    public final long mo11007a() {
        return this.f31760p0;
    }

    @Override // p647ak.InterfaceC10717n
    /* JADX INFO: renamed from: b */
    public final boolean mo11008b() {
        return this.f31761q0;
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: c */
    public final List mo11009c() {
        return this.f31759o0;
    }

    @Override // p647ak.InterfaceC10717n
    /* JADX INFO: renamed from: d */
    public final boolean mo11010d() {
        return AbstractC8138m0.m8671f(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10692d0)) {
            return false;
        }
        C10692d0 c10692d0 = (C10692d0) obj;
        return this.f31757Y == c10692d0.f31757Y && this.f31758Z == c10692d0.f31758Z && AbstractC16544l.m18089b(this.f31759o0, c10692d0.f31759o0) && this.f31760p0 == c10692d0.f31760p0 && this.f31761q0 == c10692d0.f31761q0 && this.f31762r0 == c10692d0.f31762r0 && AbstractC16544l.m18089b(this.f31763s0, c10692d0.f31763s0) && AbstractC16544l.m18089b(this.f31764t0, c10692d0.f31764t0);
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: f */
    public final EnumC10723q mo11011f() {
        return (EnumC10723q) AbstractC17680n.m19341Q(mo11009c());
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: g */
    public final EnumC10723q mo11012g() {
        return (EnumC10723q) AbstractC17680n.m19343S(mo11009c());
    }

    @Override // p647ak.InterfaceC10717n
    /* JADX INFO: renamed from: h */
    public final long mo11013h() {
        return this.f31762r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public final int hashCode() {
        boolean z6 = this.f31757Y;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = r6 * 31;
        EnumC10647I enumC10647I = this.f31758Z;
        int iM15858x = AbstractC14376f.m15858x(this.f31759o0, (i10 + (enumC10647I == null ? 0 : enumC10647I.hashCode())) * 31, 31);
        long j10 = this.f31760p0;
        int i11 = (iM15858x + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z10 = this.f31761q0;
        ?? r10 = z10 ? 1 : z10;
        long j11 = this.f31762r0;
        int iHashCode = (this.f31763s0.hashCode() + ((((i11 + r10) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        AbstractC10712k0 abstractC10712k0 = this.f31764t0;
        return iHashCode + (abstractC10712k0 != null ? abstractC10712k0.hashCode() : 0);
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31764t0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return this.f31765u0;
    }

    public final String toString() {
        return "StartCapture(centered=" + this.f31757Y + ", selfieError=" + this.f31758Z + ", posesNeeded=" + this.f31759o0 + ", startCaptureTimestamp=" + this.f31760p0 + ", autoCaptureSupported=" + this.f31761q0 + ", startSelfieTimestamp=" + this.f31762r0 + ", cameraProperties=" + this.f31763s0 + ", backState=" + this.f31764t0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f31757Y ? 1 : 0);
        EnumC10647I enumC10647I = this.f31758Z;
        if (enumC10647I == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC10647I.name());
        }
        Iterator itM19536s = AbstractC17792x.m19536s(this.f31759o0, out);
        while (itM19536s.hasNext()) {
            out.writeString(((EnumC10723q) itM19536s.next()).name());
        }
        out.writeLong(this.f31760p0);
        out.writeInt(this.f31761q0 ? 1 : 0);
        out.writeLong(this.f31762r0);
        out.writeParcelable(this.f31763s0, i10);
        out.writeParcelable(this.f31764t0, i10);
    }

    public /* synthetic */ C10692d0(int i10, long j10, long j11, EnumC10647I enumC10647I, AbstractC10712k0 abstractC10712k0, List list, C18428A c18428a) {
        this(false, (i10 & 2) != 0 ? EnumC10647I.f31584Y : enumC10647I, list, j10, true, j11, c18428a, abstractC10712k0);
    }
}
