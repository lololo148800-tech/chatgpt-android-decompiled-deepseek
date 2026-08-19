package p1126yd;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: yd.A0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21406A0 {
    public static final C21511z0 Companion = new C21511z0();

    /* JADX INFO: renamed from: u */
    public static final KSerializer[] f67952u = {EnumC21418G0.Companion.serializer(), null, null, null, EnumC21414E0.Companion.serializer(), EnumC21410C0.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, new C11158d(C11181o0.f33827a, 0), null};

    /* JADX INFO: renamed from: a */
    public final EnumC21418G0 f67953a;

    /* JADX INFO: renamed from: b */
    public final String f67954b;

    /* JADX INFO: renamed from: c */
    public final String f67955c;

    /* JADX INFO: renamed from: d */
    public final String f67956d;

    /* JADX INFO: renamed from: e */
    public final EnumC21414E0 f67957e;

    /* JADX INFO: renamed from: f */
    public final EnumC21410C0 f67958f;

    /* JADX INFO: renamed from: g */
    public final long f67959g;

    /* JADX INFO: renamed from: h */
    public final long f67960h;

    /* JADX INFO: renamed from: i */
    public final long f67961i;

    /* JADX INFO: renamed from: j */
    public final long f67962j;

    /* JADX INFO: renamed from: k */
    public final long f67963k;

    /* JADX INFO: renamed from: l */
    public final long f67964l;

    /* JADX INFO: renamed from: m */
    public final Float f67965m;

    /* JADX INFO: renamed from: n */
    public final Float f67966n;

    /* JADX INFO: renamed from: o */
    public final Float f67967o;

    /* JADX INFO: renamed from: p */
    public final Float f67968p;

    /* JADX INFO: renamed from: q */
    public final String f67969q;

    /* JADX INFO: renamed from: r */
    public final String f67970r;

    /* JADX INFO: renamed from: s */
    public final List f67971s;

    /* JADX INFO: renamed from: t */
    public final long f67972t;

    public C21406A0(int i10, EnumC21418G0 enumC21418G0, String str, String str2, String str3, EnumC21414E0 enumC21414E0, EnumC21410C0 enumC21410C0, long j10, long j11, long j12, long j13, long j14, long j15, Float f10, Float f11, Float f12, Float f13, String str4, String str5, List list, long j16) {
        if (4095 != (i10 & 4095)) {
            AbstractC11153a0.m12389l(i10, 4095, C21509y0.f68129a.getDescriptor());
            throw null;
        }
        this.f67953a = enumC21418G0;
        this.f67954b = str;
        this.f67955c = str2;
        this.f67956d = str3;
        this.f67957e = enumC21414E0;
        this.f67958f = enumC21410C0;
        this.f67959g = j10;
        this.f67960h = j11;
        this.f67961i = j12;
        this.f67962j = j13;
        this.f67963k = j14;
        this.f67964l = j15;
        this.f67965m = (i10 & 4096) == 0 ? Float.valueOf(1.0f) : f10;
        this.f67966n = (i10 & 8192) == 0 ? Float.valueOf(1.0f) : f11;
        this.f67967o = (i10 & 16384) == 0 ? Float.valueOf(0.0f) : f12;
        this.f67968p = (32768 & i10) == 0 ? Float.valueOf(0.0f) : f13;
        this.f67969q = (65536 & i10) == 0 ? "none" : str4;
        this.f67970r = (131072 & i10) == 0 ? "" : str5;
        this.f67971s = (262144 & i10) == 0 ? C17689w.f56480Y : list;
        this.f67972t = (i10 & 524288) == 0 ? System.currentTimeMillis() : j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21406A0)) {
            return false;
        }
        C21406A0 c21406a0 = (C21406A0) obj;
        return this.f67953a == c21406a0.f67953a && AbstractC16544l.m18089b(this.f67954b, c21406a0.f67954b) && AbstractC16544l.m18089b(this.f67955c, c21406a0.f67955c) && AbstractC16544l.m18089b(this.f67956d, c21406a0.f67956d) && this.f67957e == c21406a0.f67957e && this.f67958f == c21406a0.f67958f && this.f67959g == c21406a0.f67959g && this.f67960h == c21406a0.f67960h && this.f67961i == c21406a0.f67961i && this.f67962j == c21406a0.f67962j && this.f67963k == c21406a0.f67963k && this.f67964l == c21406a0.f67964l && AbstractC16544l.m18089b(this.f67965m, c21406a0.f67965m) && AbstractC16544l.m18089b(this.f67966n, c21406a0.f67966n) && AbstractC16544l.m18089b(this.f67967o, c21406a0.f67967o) && AbstractC16544l.m18089b(this.f67968p, c21406a0.f67968p) && AbstractC16544l.m18089b(this.f67969q, c21406a0.f67969q) && AbstractC16544l.m18089b(this.f67970r, c21406a0.f67970r) && AbstractC16544l.m18089b(this.f67971s, c21406a0.f67971s) && this.f67972t == c21406a0.f67972t;
    }

    public final int hashCode() {
        int iHashCode = (this.f67958f.hashCode() + ((this.f67957e.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f67953a.hashCode() * 31, 31, this.f67954b), 31, this.f67955c), 31, this.f67956d)) * 31)) * 31;
        long j10 = this.f67959g;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f67960h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f67961i;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f67962j;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f67963k;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f67964l;
        int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        Float f10 = this.f67965m;
        int iHashCode2 = (i15 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f67966n;
        int iHashCode3 = (iHashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.f67967o;
        int iHashCode4 = (iHashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.f67968p;
        int iM15858x = AbstractC14376f.m15858x(this.f67971s, AbstractC0168G.m527p(AbstractC0168G.m527p((iHashCode4 + (f13 != null ? f13.hashCode() : 0)) * 31, 31, this.f67969q), 31, this.f67970r), 31);
        long j16 = this.f67972t;
        return iM15858x + ((int) (j16 ^ (j16 >>> 32)));
    }

    public final String toString() {
        return "█";
    }

    public C21406A0(EnumC21418G0 enumC21418G0, String originalMessageId, String newMessageId, String conversationId, EnumC21414E0 enumC21414E0, EnumC21410C0 enumC21410C0, long j10, long j11, long j12, long j13, long j14, long j15, Float f10) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        C17689w c17689w = C17689w.f56480Y;
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC16544l.m18094g(originalMessageId, "originalMessageId");
        AbstractC16544l.m18094g(newMessageId, "newMessageId");
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f67953a = enumC21418G0;
        this.f67954b = originalMessageId;
        this.f67955c = newMessageId;
        this.f67956d = conversationId;
        this.f67957e = enumC21414E0;
        this.f67958f = enumC21410C0;
        this.f67959g = j10;
        this.f67960h = j11;
        this.f67961i = j12;
        this.f67962j = j13;
        this.f67963k = j14;
        this.f67964l = j15;
        this.f67965m = fValueOf;
        this.f67966n = fValueOf;
        this.f67967o = fValueOf2;
        this.f67968p = f10;
        this.f67969q = "none";
        this.f67970r = "";
        this.f67971s = c17689w;
        this.f67972t = jCurrentTimeMillis;
    }
}
