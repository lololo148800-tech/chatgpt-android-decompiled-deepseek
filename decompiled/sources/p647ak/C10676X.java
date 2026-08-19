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

/* JADX INFO: renamed from: ak.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C10676X extends AbstractC10712k0 implements InterfaceC10717n {
    public static final Parcelable.Creator<C10676X> CREATOR = new C8343M(19);

    /* JADX INFO: renamed from: Y */
    public final int f31699Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC10647I f31700Z;

    /* JADX INFO: renamed from: o0 */
    public final C18428A f31701o0;

    /* JADX INFO: renamed from: p0 */
    public final List f31702p0;

    /* JADX INFO: renamed from: q0 */
    public final long f31703q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f31704r0;

    /* JADX INFO: renamed from: s0 */
    public final long f31705s0;

    /* JADX INFO: renamed from: t0 */
    public final AbstractC10712k0 f31706t0;

    public C10676X(int i10, EnumC10647I enumC10647I, C18428A cameraProperties, List posesNeeded, long j10, boolean z6, long j11, AbstractC10712k0 abstractC10712k0) {
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
        this.f31699Y = i10;
        this.f31700Z = enumC10647I;
        this.f31701o0 = cameraProperties;
        this.f31702p0 = posesNeeded;
        this.f31703q0 = j10;
        this.f31704r0 = z6;
        this.f31705s0 = j11;
        this.f31706t0 = abstractC10712k0;
    }

    @Override // p647ak.InterfaceC10717n
    /* JADX INFO: renamed from: a */
    public final long mo11007a() {
        return this.f31703q0;
    }

    @Override // p647ak.InterfaceC10717n
    /* JADX INFO: renamed from: b */
    public final boolean mo11008b() {
        return this.f31704r0;
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: c */
    public final List mo11009c() {
        return this.f31702p0;
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
        if (!(obj instanceof C10676X)) {
            return false;
        }
        C10676X c10676x = (C10676X) obj;
        return this.f31699Y == c10676x.f31699Y && this.f31700Z == c10676x.f31700Z && AbstractC16544l.m18089b(this.f31701o0, c10676x.f31701o0) && AbstractC16544l.m18089b(this.f31702p0, c10676x.f31702p0) && this.f31703q0 == c10676x.f31703q0 && this.f31704r0 == c10676x.f31704r0 && this.f31705s0 == c10676x.f31705s0 && AbstractC16544l.m18089b(this.f31706t0, c10676x.f31706t0);
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
        return this.f31705s0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    public final int hashCode() {
        int i10 = this.f31699Y * 31;
        EnumC10647I enumC10647I = this.f31700Z;
        int iM15858x = AbstractC14376f.m15858x(this.f31702p0, (this.f31701o0.hashCode() + ((i10 + (enumC10647I == null ? 0 : enumC10647I.hashCode())) * 31)) * 31, 31);
        long j10 = this.f31703q0;
        int i11 = (iM15858x + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z6 = this.f31704r0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i12 = (i11 + r6) * 31;
        long j11 = this.f31705s0;
        int i13 = (i12 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        AbstractC10712k0 abstractC10712k0 = this.f31706t0;
        return i13 + (abstractC10712k0 != null ? abstractC10712k0.hashCode() : 0);
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31706t0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return C17689w.f56480Y;
    }

    public final String toString() {
        return "CountdownToManualCapture(countDown=" + this.f31699Y + ", selfieError=" + this.f31700Z + ", cameraProperties=" + this.f31701o0 + ", posesNeeded=" + this.f31702p0 + ", startCaptureTimestamp=" + this.f31703q0 + ", autoCaptureSupported=" + this.f31704r0 + ", startSelfieTimestamp=" + this.f31705s0 + ", backState=" + this.f31706t0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeInt(this.f31699Y);
        EnumC10647I enumC10647I = this.f31700Z;
        if (enumC10647I == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC10647I.name());
        }
        out.writeParcelable(this.f31701o0, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f31702p0, out);
        while (itM19536s.hasNext()) {
            out.writeString(((EnumC10723q) itM19536s.next()).name());
        }
        out.writeLong(this.f31703q0);
        out.writeInt(this.f31704r0 ? 1 : 0);
        out.writeLong(this.f31705s0);
        out.writeParcelable(this.f31706t0, i10);
    }
}
