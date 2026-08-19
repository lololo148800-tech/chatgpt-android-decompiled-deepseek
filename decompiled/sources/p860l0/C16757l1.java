package p860l0;

import androidx.compose.foundation.gestures.AbstractC10840a;
import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1001s1.C19434d;
import p1001s1.C19437g;
import p1140z1.AbstractC21690f;
import p492U1.C7550o;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p773h0.EnumC14284g0;
import p773h0.InterfaceC14300o0;
import p858ko.C16482A;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16757l1 {

    /* JADX INFO: renamed from: a */
    public InterfaceC16736e1 f53757a;

    /* JADX INFO: renamed from: b */
    public InterfaceC14300o0 f53758b;

    /* JADX INFO: renamed from: c */
    public InterfaceC16661B0 f53759c;

    /* JADX INFO: renamed from: d */
    public EnumC16673F0 f53760d;

    /* JADX INFO: renamed from: e */
    public boolean f53761e;

    /* JADX INFO: renamed from: f */
    public C19434d f53762f;

    /* JADX INFO: renamed from: g */
    public int f53763g = 1;

    /* JADX INFO: renamed from: h */
    public InterfaceC16694M0 f53764h = AbstractC10840a.f32468a;

    /* JADX INFO: renamed from: i */
    public final C16748i1 f53765i = new C16748i1(this);

    /* JADX INFO: renamed from: j */
    public final C16482A f53766j = new C16482A(this, 5);

    public C16757l1(InterfaceC16736e1 interfaceC16736e1, InterfaceC14300o0 interfaceC14300o0, InterfaceC16661B0 interfaceC16661B0, EnumC16673F0 enumC16673F0, boolean z6, C19434d c19434d) {
        this.f53757a = interfaceC16736e1;
        this.f53758b = interfaceC14300o0;
        this.f53759c = interfaceC16661B0;
        this.f53760d = enumC16673F0;
        this.f53761e = z6;
        this.f53762f = c19434d;
    }

    /* JADX INFO: renamed from: a */
    public static final long m18531a(C16757l1 c16757l1, InterfaceC16694M0 interfaceC16694M0, long j10, int i10) {
        C19437g c19437g = c16757l1.f53762f.f61623a;
        C19437g c19437g2 = null;
        C19437g c19437g3 = (c19437g == null || !c19437g.f30972y0) ? null : (C19437g) AbstractC21690f.m22206k(c19437g);
        long jMo4041x = 0;
        long jMo4038K = c19437g3 != null ? c19437g3.mo4038K(i10, j10) : 0L;
        long jM15310k = C13800b.m15310k(j10, jMo4038K);
        long jM18534d = c16757l1.m18534d(c16757l1.m18537g(interfaceC16694M0.mo18510a(c16757l1.m18536f(c16757l1.m18534d(C13800b.m15301b(0.0f, c16757l1.f53760d == EnumC16673F0.f53402Z ? 1 : 2, jM15310k))))));
        long jM15310k2 = C13800b.m15310k(jM15310k, jM18534d);
        C19437g c19437g4 = c16757l1.f53762f.f61623a;
        if (c19437g4 != null && c19437g4.f30972y0) {
            c19437g2 = (C19437g) AbstractC21690f.m22206k(c19437g4);
        }
        C19437g c19437g5 = c19437g2;
        if (c19437g5 != null) {
            jMo4041x = c19437g5.mo4041x(jM18534d, i10, jM15310k2);
        }
        return C13800b.m15311l(C13800b.m15311l(jMo4038K, jM18534d), jMo4041x);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m18532b(long j10, AbstractC19687c abstractC19687c) {
        C16739f1 c16739f1;
        C16524A c16524a;
        if (abstractC19687c instanceof C16739f1) {
            c16739f1 = (C16739f1) abstractC19687c;
            int i10 = c16739f1.f53682p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16739f1.f53682p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16739f1 = new C16739f1(this, abstractC19687c);
            }
        } else {
            c16739f1 = new C16739f1(this, abstractC19687c);
        }
        Object obj = c16739f1.f53680Z;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c16739f1.f53682p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16524A c16524a2 = new C16524A();
            c16524a2.f51261Y = j10;
            EnumC14284g0 enumC14284g0 = EnumC14284g0.f44821Y;
            InterfaceC1439n c16745h1 = new C16745h1(this, c16524a2, j10, null);
            c16739f1.f53679Y = c16524a2;
            c16739f1.f53682p0 = 1;
            if (m18535e(enumC14284g0, c16745h1, c16739f1) == obj2) {
                return obj2;
            }
            c16524a = c16524a2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16524a = c16739f1.f53679Y;
            AbstractC9233X.m9807c(obj);
        }
        return new C7550o(c16524a.f51261Y);
    }

    /* JADX INFO: renamed from: c */
    public final float m18533c(float f10) {
        return this.f53761e ? f10 * (-1) : f10;
    }

    /* JADX INFO: renamed from: d */
    public final long m18534d(long j10) {
        return this.f53761e ? C13800b.m15312m(-1.0f, j10) : j10;
    }

    /* JADX INFO: renamed from: e */
    public final Object m18535e(EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        Object objMo5256b = this.f53757a.mo5256b(enumC14284g0, new C16754k1(this, interfaceC1439n, null), abstractC19687c);
        return objMo5256b == EnumC19250a.f61036Y ? objMo5256b : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: f */
    public final float m18536f(long j10) {
        return this.f53760d == EnumC16673F0.f53402Z ? C13800b.m15306g(j10) : C13800b.m15307h(j10);
    }

    /* JADX INFO: renamed from: g */
    public final long m18537g(float f10) {
        if (f10 == 0.0f) {
            return 0L;
        }
        return this.f53760d == EnumC16673F0.f53402Z ? AbstractC8088f6.m8536b(f10, 0.0f) : AbstractC8088f6.m8536b(0.0f, f10);
    }
}
