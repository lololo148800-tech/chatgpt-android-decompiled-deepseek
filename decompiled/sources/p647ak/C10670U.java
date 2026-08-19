package p647ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
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

/* JADX INFO: renamed from: ak.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C10670U extends AbstractC10712k0 implements InterfaceC10717n {
    public static final Parcelable.Creator<C10670U> CREATOR = new C8343M(16);

    /* JADX INFO: renamed from: Y */
    public final List f31669Y;

    /* JADX INFO: renamed from: Z */
    public final List f31670Z;

    /* JADX INFO: renamed from: o0 */
    public final EnumC10647I f31671o0;

    /* JADX INFO: renamed from: p0 */
    public final long f31672p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f31673q0;

    /* JADX INFO: renamed from: r0 */
    public final long f31674r0;

    /* JADX INFO: renamed from: s0 */
    public final C18428A f31675s0;

    /* JADX INFO: renamed from: t0 */
    public final AbstractC10712k0 f31676t0;

    public C10670U(List selfies, List posesNeeded, EnumC10647I enumC10647I, long j10, boolean z6, long j11, C18428A cameraProperties, AbstractC10712k0 abstractC10712k0) {
        AbstractC16544l.m18094g(selfies, "selfies");
        AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f31669Y = selfies;
        this.f31670Z = posesNeeded;
        this.f31671o0 = enumC10647I;
        this.f31672p0 = j10;
        this.f31673q0 = z6;
        this.f31674r0 = j11;
        this.f31675s0 = cameraProperties;
        this.f31676t0 = abstractC10712k0;
    }

    /* JADX INFO: renamed from: l */
    public static C10670U m11006l(C10670U c10670u, EnumC10647I enumC10647I, int i10) {
        List selfies = c10670u.f31669Y;
        List posesNeeded = c10670u.f31670Z;
        if ((i10 & 4) != 0) {
            enumC10647I = c10670u.f31671o0;
        }
        EnumC10647I enumC10647I2 = enumC10647I;
        long j10 = c10670u.f31672p0;
        boolean z6 = (i10 & 16) != 0 ? c10670u.f31673q0 : false;
        long j11 = c10670u.f31674r0;
        C18428A cameraProperties = c10670u.f31675s0;
        AbstractC10712k0 abstractC10712k0 = c10670u.f31676t0;
        c10670u.getClass();
        AbstractC16544l.m18094g(selfies, "selfies");
        AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        return new C10670U(selfies, posesNeeded, enumC10647I2, j10, z6, j11, cameraProperties, abstractC10712k0);
    }

    @Override // p647ak.InterfaceC10717n
    /* JADX INFO: renamed from: a */
    public final long mo11007a() {
        return this.f31672p0;
    }

    @Override // p647ak.InterfaceC10717n
    /* JADX INFO: renamed from: b */
    public final boolean mo11008b() {
        return this.f31673q0;
    }

    @Override // p647ak.InterfaceC10715m
    /* JADX INFO: renamed from: c */
    public final List mo11009c() {
        return this.f31670Z;
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
        if (!(obj instanceof C10670U)) {
            return false;
        }
        C10670U c10670u = (C10670U) obj;
        return AbstractC16544l.m18089b(this.f31669Y, c10670u.f31669Y) && AbstractC16544l.m18089b(this.f31670Z, c10670u.f31670Z) && this.f31671o0 == c10670u.f31671o0 && this.f31672p0 == c10670u.f31672p0 && this.f31673q0 == c10670u.f31673q0 && this.f31674r0 == c10670u.f31674r0 && AbstractC16544l.m18089b(this.f31675s0, c10670u.f31675s0) && AbstractC16544l.m18089b(this.f31676t0, c10670u.f31676t0);
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
        return this.f31674r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f31670Z, this.f31669Y.hashCode() * 31, 31);
        EnumC10647I enumC10647I = this.f31671o0;
        int iHashCode = (iM15858x + (enumC10647I == null ? 0 : enumC10647I.hashCode())) * 31;
        long j10 = this.f31672p0;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z6 = this.f31673q0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i11 = (i10 + r6) * 31;
        long j11 = this.f31674r0;
        int iHashCode2 = (this.f31675s0.hashCode() + ((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        AbstractC10712k0 abstractC10712k0 = this.f31676t0;
        return iHashCode2 + (abstractC10712k0 != null ? abstractC10712k0.hashCode() : 0);
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31676t0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return this.f31669Y;
    }

    public final String toString() {
        return "Capture(selfies=" + this.f31669Y + ", posesNeeded=" + this.f31670Z + ", selfieError=" + this.f31671o0 + ", startCaptureTimestamp=" + this.f31672p0 + ", autoCaptureSupported=" + this.f31673q0 + ", startSelfieTimestamp=" + this.f31674r0 + ", cameraProperties=" + this.f31675s0 + ", backState=" + this.f31676t0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f31669Y, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f31670Z, out);
        while (itM19536s2.hasNext()) {
            out.writeString(((EnumC10723q) itM19536s2.next()).name());
        }
        EnumC10647I enumC10647I = this.f31671o0;
        if (enumC10647I == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC10647I.name());
        }
        out.writeLong(this.f31672p0);
        out.writeInt(this.f31673q0 ? 1 : 0);
        out.writeLong(this.f31674r0);
        out.writeParcelable(this.f31675s0, i10);
        out.writeParcelable(this.f31676t0, i10);
    }

    public /* synthetic */ C10670U(ArrayList arrayList, List list, EnumC10647I enumC10647I, long j10, boolean z6, long j11, C18428A c18428a, AbstractC10712k0 abstractC10712k0, int i10) {
        this((i10 & 1) != 0 ? C17689w.f56480Y : arrayList, list, (i10 & 4) != 0 ? null : enumC10647I, j10, (i10 & 16) != 0 ? true : z6, j11, c18428a, abstractC10712k0);
    }
}
