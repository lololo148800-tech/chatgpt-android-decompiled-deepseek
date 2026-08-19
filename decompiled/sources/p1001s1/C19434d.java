package p1001s1;

import kotlin.jvm.internal.AbstractC16546n;
import p025An.InterfaceC0571F;
import p1140z1.AbstractC21690f;
import p492U1.C7550o;
import p571X9.AbstractC9233X;
import p887m7.C17176b;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: s1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C19434d {

    /* JADX INFO: renamed from: a */
    public C19437g f61623a;

    /* JADX INFO: renamed from: b */
    public AbstractC16546n f61624b = new C17176b(this, 17);

    /* JADX INFO: renamed from: c */
    public InterfaceC0571F f61625c;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m20512a(long j10, long j11, AbstractC19687c abstractC19687c) {
        C19432b c19432b;
        long j12;
        if (abstractC19687c instanceof C19432b) {
            c19432b = (C19432b) abstractC19687c;
            int i10 = c19432b.f61619o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19432b.f61619o0 = i10 - Integer.MIN_VALUE;
            } else {
                c19432b = new C19432b(this, abstractC19687c);
            }
        } else {
            c19432b = new C19432b(this, abstractC19687c);
        }
        C19432b c19432b2 = c19432b;
        Object objMo4039V = c19432b2.f61617Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19432b2.f61619o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objMo4039V);
            C19437g c19437g = this.f61623a;
            C19437g c19437g2 = null;
            if (c19437g != null && c19437g.f30972y0) {
                c19437g2 = (C19437g) AbstractC21690f.m22206k(c19437g);
            }
            if (c19437g2 != null) {
                c19432b2.f61619o0 = 1;
                objMo4039V = c19437g2.mo4039V(j10, j11, c19432b2);
                if (objMo4039V == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                j12 = 0;
            }
            return new C7550o(j12);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(objMo4039V);
        j12 = ((C7550o) objMo4039V).f23912a;
        return new C7550o(j12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m20513b(long j10, AbstractC19687c abstractC19687c) {
        C19433c c19433c;
        long j11;
        if (abstractC19687c instanceof C19433c) {
            c19433c = (C19433c) abstractC19687c;
            int i10 = c19433c.f61622o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19433c.f61622o0 = i10 - Integer.MIN_VALUE;
            } else {
                c19433c = new C19433c(this, abstractC19687c);
            }
        } else {
            c19433c = new C19433c(this, abstractC19687c);
        }
        Object objMo4040p0 = c19433c.f61620Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19433c.f61622o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objMo4040p0);
            C19437g c19437g = this.f61623a;
            C19437g c19437g2 = null;
            if (c19437g != null && c19437g.f30972y0) {
                c19437g2 = (C19437g) AbstractC21690f.m22206k(c19437g);
            }
            if (c19437g2 != null) {
                c19433c.f61622o0 = 1;
                objMo4040p0 = c19437g2.mo4040p0(j10, c19433c);
                if (objMo4040p0 == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                j11 = 0;
            }
            return new C7550o(j11);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(objMo4040p0);
        j11 = ((C7550o) objMo4040p0).f23912a;
        return new C7550o(j11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: c */
    public final InterfaceC0571F m20514c() {
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f61624b.invoke();
        if (interfaceC0571F != null) {
            return interfaceC0571F;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
