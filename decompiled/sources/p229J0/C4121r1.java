package p229J0;

import mm.C17296C;
import p278L0.AbstractC4850N;
import p492U1.C7540e;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13785r0;
import p758g0.C13756d;
import p894n0.C17398d;
import p894n0.C17402h;
import p894n0.C17409o;
import p894n0.InterfaceC17405k;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: J0.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4121r1 {

    /* JADX INFO: renamed from: a */
    public float f13295a;

    /* JADX INFO: renamed from: b */
    public float f13296b;

    /* JADX INFO: renamed from: c */
    public float f13297c;

    /* JADX INFO: renamed from: d */
    public float f13298d;

    /* JADX INFO: renamed from: e */
    public final C13756d f13299e;

    /* JADX INFO: renamed from: f */
    public InterfaceC17405k f13300f;

    /* JADX INFO: renamed from: g */
    public InterfaceC17405k f13301g;

    public C4121r1(float f10, float f11, float f12, float f13) {
        this.f13295a = f10;
        this.f13296b = f11;
        this.f13297c = f12;
        this.f13298d = f13;
        this.f13299e = new C13756d(new C7540e(f10), AbstractC13785r0.f43530c, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m4765a(InterfaceC17405k interfaceC17405k, AbstractC19687c abstractC19687c) throws Throwable {
        C4109p1 c4109p1;
        float f10;
        C4121r1 c4121r1;
        C13756d c13756d = this.f13299e;
        if (abstractC19687c instanceof C4109p1) {
            c4109p1 = (C4109p1) abstractC19687c;
            int i10 = c4109p1.f13202q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4109p1.f13202q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4109p1 = new C4109p1(this, abstractC19687c);
            }
        } else {
            c4109p1 = new C4109p1(this, abstractC19687c);
        }
        Object obj = c4109p1.f13200o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4109p1.f13202q0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC17405k = c4109p1.f13199Z;
            c4121r1 = c4109p1.f13198Y;
            try {
                AbstractC9233X.m9807c(obj);
                c4121r1.f13300f = interfaceC17405k;
                return C17296C.f55119a;
            } catch (Throwable th2) {
                th = th2;
                c4121r1.f13300f = interfaceC17405k;
                throw th;
            }
        }
        AbstractC9233X.m9807c(obj);
        if (interfaceC17405k instanceof C17409o) {
            f10 = this.f13296b;
        } else if (interfaceC17405k instanceof C17402h) {
            f10 = this.f13297c;
        } else {
            f10 = interfaceC17405k instanceof C17398d ? this.f13298d : this.f13295a;
        }
        this.f13301g = interfaceC17405k;
        try {
            if (!C7540e.m7873a(((C7540e) c13756d.f43413e.getValue()).f23894Y, f10)) {
                InterfaceC17405k interfaceC17405k2 = this.f13300f;
                c4109p1.f13198Y = this;
                c4109p1.f13199Z = interfaceC17405k;
                c4109p1.f13202q0 = 1;
                if (AbstractC4850N.m5498a(c13756d, f10, interfaceC17405k2, interfaceC17405k, c4109p1) == enumC19250a) {
                    return enumC19250a;
                }
            }
            c4121r1 = this;
            c4121r1.f13300f = interfaceC17405k;
            return C17296C.f55119a;
        } catch (Throwable th3) {
            th = th3;
            c4121r1 = this;
            c4121r1.f13300f = interfaceC17405k;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m4766b(AbstractC19687c abstractC19687c) throws Throwable {
        C4115q1 c4115q1;
        float f10;
        C4121r1 c4121r1;
        if (abstractC19687c instanceof C4115q1) {
            c4115q1 = (C4115q1) abstractC19687c;
            int i10 = c4115q1.f13252p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4115q1.f13252p0 = i10 - Integer.MIN_VALUE;
            } else {
                c4115q1 = new C4115q1(this, abstractC19687c);
            }
        } else {
            c4115q1 = new C4115q1(this, abstractC19687c);
        }
        Object obj = c4115q1.f13250Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4115q1.f13252p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC17405k interfaceC17405k = this.f13301g;
            if (interfaceC17405k instanceof C17409o) {
                f10 = this.f13296b;
            } else if (interfaceC17405k instanceof C17402h) {
                f10 = this.f13297c;
            } else {
                f10 = interfaceC17405k instanceof C17398d ? this.f13298d : this.f13295a;
            }
            C13756d c13756d = this.f13299e;
            if (!C7540e.m7873a(((C7540e) c13756d.f43413e.getValue()).f23894Y, f10)) {
                try {
                    C7540e c7540e = new C7540e(f10);
                    c4115q1.f13249Y = this;
                    c4115q1.f13252p0 = 1;
                    if (c13756d.m15226g(c7540e, c4115q1) == enumC19250a) {
                        return enumC19250a;
                    }
                    c4121r1 = this;
                    c4121r1.f13300f = c4121r1.f13301g;
                } catch (Throwable th2) {
                    th = th2;
                    c4121r1 = this;
                    c4121r1.f13300f = c4121r1.f13301g;
                    throw th;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4121r1 = c4115q1.f13249Y;
            try {
                AbstractC9233X.m9807c(obj);
                c4121r1.f13300f = c4121r1.f13301g;
            } catch (Throwable th3) {
                th = th3;
                c4121r1.f13300f = c4121r1.f13301g;
                throw th;
            }
        }
        return C17296C.f55119a;
    }
}
