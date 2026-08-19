package p658b5;

import androidx.work.OverwritingInputMerger;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p444S4.C6998d;
import p444S4.C7001g;
import p444S4.C7011q;
import p444S4.EnumC7019y;
import p523V9.AbstractC7865D0;
import p561X.C8990d;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: b5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C11245p {

    /* JADX INFO: renamed from: x */
    public static final C8990d f34040x;

    /* JADX INFO: renamed from: a */
    public final String f34041a;

    /* JADX INFO: renamed from: b */
    public EnumC7019y f34042b;

    /* JADX INFO: renamed from: c */
    public final String f34043c;

    /* JADX INFO: renamed from: d */
    public final String f34044d;

    /* JADX INFO: renamed from: e */
    public C7001g f34045e;

    /* JADX INFO: renamed from: f */
    public final C7001g f34046f;

    /* JADX INFO: renamed from: g */
    public long f34047g;

    /* JADX INFO: renamed from: h */
    public final long f34048h;

    /* JADX INFO: renamed from: i */
    public final long f34049i;

    /* JADX INFO: renamed from: j */
    public C6998d f34050j;

    /* JADX INFO: renamed from: k */
    public final int f34051k;

    /* JADX INFO: renamed from: l */
    public final int f34052l;

    /* JADX INFO: renamed from: m */
    public final long f34053m;

    /* JADX INFO: renamed from: n */
    public long f34054n;

    /* JADX INFO: renamed from: o */
    public final long f34055o;

    /* JADX INFO: renamed from: p */
    public final long f34056p;

    /* JADX INFO: renamed from: q */
    public boolean f34057q;

    /* JADX INFO: renamed from: r */
    public final int f34058r;

    /* JADX INFO: renamed from: s */
    public final int f34059s;

    /* JADX INFO: renamed from: t */
    public final int f34060t;

    /* JADX INFO: renamed from: u */
    public final long f34061u;

    /* JADX INFO: renamed from: v */
    public final int f34062v;

    /* JADX INFO: renamed from: w */
    public final int f34063w;

    static {
        AbstractC16544l.m18093f(C7011q.m7409f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
        f34040x = new C8990d(3);
    }

    public C11245p(String id2, EnumC7019y state, String workerClassName, String inputMergerClassName, C7001g input, C7001g output, long j10, long j11, long j12, C6998d constraints, int i10, int i11, long j13, long j14, long j15, long j16, boolean z6, int i12, int i13, int i14, long j17, int i15, int i16) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(workerClassName, "workerClassName");
        AbstractC16544l.m18094g(inputMergerClassName, "inputMergerClassName");
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(output, "output");
        AbstractC16544l.m18094g(constraints, "constraints");
        AbstractC14376f.m15825D(i11, "backoffPolicy");
        AbstractC14376f.m15825D(i12, "outOfQuotaPolicy");
        this.f34041a = id2;
        this.f34042b = state;
        this.f34043c = workerClassName;
        this.f34044d = inputMergerClassName;
        this.f34045e = input;
        this.f34046f = output;
        this.f34047g = j10;
        this.f34048h = j11;
        this.f34049i = j12;
        this.f34050j = constraints;
        this.f34051k = i10;
        this.f34052l = i11;
        this.f34053m = j13;
        this.f34054n = j14;
        this.f34055o = j15;
        this.f34056p = j16;
        this.f34057q = z6;
        this.f34058r = i12;
        this.f34059s = i13;
        this.f34060t = i14;
        this.f34061u = j17;
        this.f34062v = i15;
        this.f34063w = i16;
    }

    /* JADX INFO: renamed from: a */
    public final long m12622a() {
        return AbstractC7865D0.m8145a(this.f34042b == EnumC7019y.f22432Y && this.f34051k > 0, this.f34051k, this.f34052l, this.f34053m, this.f34054n, this.f34059s, m12624c(), this.f34047g, this.f34049i, this.f34048h, this.f34061u);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12623b() {
        return !AbstractC16544l.m18089b(C6998d.f22391i, this.f34050j);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12624c() {
        return this.f34048h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11245p)) {
            return false;
        }
        C11245p c11245p = (C11245p) obj;
        return AbstractC16544l.m18089b(this.f34041a, c11245p.f34041a) && this.f34042b == c11245p.f34042b && AbstractC16544l.m18089b(this.f34043c, c11245p.f34043c) && AbstractC16544l.m18089b(this.f34044d, c11245p.f34044d) && AbstractC16544l.m18089b(this.f34045e, c11245p.f34045e) && AbstractC16544l.m18089b(this.f34046f, c11245p.f34046f) && this.f34047g == c11245p.f34047g && this.f34048h == c11245p.f34048h && this.f34049i == c11245p.f34049i && AbstractC16544l.m18089b(this.f34050j, c11245p.f34050j) && this.f34051k == c11245p.f34051k && this.f34052l == c11245p.f34052l && this.f34053m == c11245p.f34053m && this.f34054n == c11245p.f34054n && this.f34055o == c11245p.f34055o && this.f34056p == c11245p.f34056p && this.f34057q == c11245p.f34057q && this.f34058r == c11245p.f34058r && this.f34059s == c11245p.f34059s && this.f34060t == c11245p.f34060t && this.f34061u == c11245p.f34061u && this.f34062v == c11245p.f34062v && this.f34063w == c11245p.f34063w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    public final int hashCode() {
        int iHashCode = (this.f34046f.hashCode() + ((this.f34045e.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p((this.f34042b.hashCode() + (this.f34041a.hashCode() * 31)) * 31, 31, this.f34043c), 31, this.f34044d)) * 31)) * 31;
        long j10 = this.f34047g;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f34048h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f34049i;
        int iM13820k = AbstractC12107L1.m13820k(this.f34052l, (((this.f34050j.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f34051k) * 31, 31);
        long j13 = this.f34053m;
        int i12 = (iM13820k + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f34054n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f34055o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f34056p;
        int i15 = (i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
        boolean z6 = this.f34057q;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int iM13820k2 = (((AbstractC12107L1.m13820k(this.f34058r, (i15 + r6) * 31, 31) + this.f34059s) * 31) + this.f34060t) * 31;
        long j17 = this.f34061u;
        return ((((iM13820k2 + ((int) (j17 ^ (j17 >>> 32)))) * 31) + this.f34062v) * 31) + this.f34063w;
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("{WorkSpec: "), this.f34041a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C11245p(String str, EnumC7019y enumC7019y, String str2, String str3, C7001g c7001g, C7001g c7001g2, long j10, long j11, long j12, C6998d c6998d, int i10, int i11, long j13, long j14, long j15, long j16, boolean z6, int i12, int i13, long j17, int i14, int i15, int i16) {
        C7001g c7001g3;
        C7001g c7001g4;
        EnumC7019y enumC7019y2 = (i16 & 2) != 0 ? EnumC7019y.f22432Y : enumC7019y;
        String name = (i16 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3;
        if ((i16 & 16) != 0) {
            C7001g EMPTY = C7001g.f22407c;
            AbstractC16544l.m18093f(EMPTY, "EMPTY");
            c7001g3 = EMPTY;
        } else {
            c7001g3 = c7001g;
        }
        if ((i16 & 32) != 0) {
            C7001g EMPTY2 = C7001g.f22407c;
            AbstractC16544l.m18093f(EMPTY2, "EMPTY");
            c7001g4 = EMPTY2;
        } else {
            c7001g4 = c7001g2;
        }
        this(str, enumC7019y2, str2, name, c7001g3, c7001g4, (i16 & 64) != 0 ? 0L : j10, (i16 & 128) != 0 ? 0L : j11, (i16 & 256) != 0 ? 0L : j12, (i16 & 512) != 0 ? C6998d.f22391i : c6998d, (i16 & 1024) != 0 ? 0 : i10, (i16 & 2048) != 0 ? 1 : i11, (i16 & 4096) != 0 ? 30000L : j13, (i16 & 8192) != 0 ? -1L : j14, (i16 & 16384) != 0 ? 0L : j15, (32768 & i16) != 0 ? -1L : j16, (65536 & i16) != 0 ? false : z6, (131072 & i16) != 0 ? 1 : i12, (262144 & i16) != 0 ? 0 : i13, 0, (1048576 & i16) != 0 ? Long.MAX_VALUE : j17, (2097152 & i16) != 0 ? 0 : i14, (i16 & 4194304) != 0 ? -256 : i15);
    }
}
