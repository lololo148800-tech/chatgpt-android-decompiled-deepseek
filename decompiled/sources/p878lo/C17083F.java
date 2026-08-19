package p878lo;

import java.util.concurrent.CancellationException;
import mm.C17296C;
import p003A1.AbstractC0187M0;
import p003A1.InterfaceC0161D1;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1743k;
import p1014t1.C19748y;
import p1030u1.C20097d;
import p1140z1.AbstractC21690f;
import p492U1.C7550o;
import p544W9.AbstractC8472E4;
import p571X9.AbstractC9125E4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: lo.F */
/* JADX INFO: loaded from: classes2.dex */
public final class C17083F extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f54596Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f54597o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17087J f54598p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC0571F f54599q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17083F(C17087J c17087j, InterfaceC0571F interfaceC0571F, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54598p0 = c17087j;
        this.f54599q0 = interfaceC0571F;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17083F c17083f = new C17083F(this.f54598p0, this.f54599q0, interfaceC18770c);
        c17083f.f54597o0 = obj;
        return c17083f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17083F) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[Catch: all -> 0x00a9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00a9, blocks: (B:33:0x0084, B:38:0x00a8), top: B:52:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C20097d c20097d;
        long jM9659a;
        long jM20929b;
        C17079B c17079b;
        long jM9659a2;
        long jM20929b2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54596Z;
        boolean z6 = false;
        long j10 = 0;
        C17087J c17087j = this.f54598p0;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20097d = (C20097d) this.f54597o0;
            try {
                AbstractC9233X.m9807c(obj);
                InterfaceC0161D1 interfaceC0161D1 = (InterfaceC0161D1) AbstractC21690f.m22204i(c17087j, AbstractC0187M0.f715q);
                jM9659a2 = AbstractC9125E4.m9659a(interfaceC0161D1.mo502e(), interfaceC0161D1.mo502e());
                jM20929b2 = c20097d.m20929b(jM9659a2);
                if (!Float.isNaN(C7550o.m7902c(jM20929b2)) && !Float.isNaN(C7550o.m7903d(jM20929b2))) {
                    jM9659a2 = jM20929b2;
                }
                c17079b = new C17079B(jM9659a2);
            } catch (CancellationException e10) {
                e = e10;
                try {
                    if (AbstractC0575H.m1196y(this.f54599q0)) {
                        throw e;
                    }
                    InterfaceC0161D1 interfaceC0161D2 = (InterfaceC0161D1) AbstractC21690f.m22204i(c17087j, AbstractC0187M0.f715q);
                    AbstractC9125E4.m9659a(interfaceC0161D2.mo502e(), interfaceC0161D2.mo502e());
                    c17079b = new C17079B(0L);
                } catch (Throwable th2) {
                    th = th2;
                    z6 = true;
                    InterfaceC0161D1 interfaceC0161D3 = (InterfaceC0161D1) AbstractC21690f.m22204i(c17087j, AbstractC0187M0.f715q);
                    jM9659a = AbstractC9125E4.m9659a(interfaceC0161D3.mo502e(), interfaceC0161D3.mo502e());
                    if (!z6) {
                        jM20929b = c20097d.m20929b(jM9659a);
                        if (!Float.isNaN(C7550o.m7902c(jM20929b)) || Float.isNaN(C7550o.m7903d(jM20929b))) {
                            j10 = jM9659a;
                        } else {
                            j10 = jM20929b;
                        }
                    }
                    c17087j.f54615H0.mo2524p(new C17079B(j10));
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                InterfaceC0161D1 interfaceC0161D4 = (InterfaceC0161D1) AbstractC21690f.m22204i(c17087j, AbstractC0187M0.f715q);
                jM9659a = AbstractC9125E4.m9659a(interfaceC0161D4.mo502e(), interfaceC0161D4.mo502e());
                if (!z6) {
                    jM20929b = c20097d.m20929b(jM9659a);
                    if (Float.isNaN(C7550o.m7902c(jM20929b))) {
                        j10 = jM9659a;
                    } else {
                        j10 = jM9659a;
                    }
                }
                c17087j.f54615H0.mo2524p(new C17079B(j10));
                throw th;
            }
            c17087j.f54615H0.mo2524p(c17079b);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C19748y c19748y = (C19748y) this.f54597o0;
        C20097d c20097d2 = new C20097d();
        try {
            c17087j.getClass();
            C1743k c1743k = c17087j.f54615H0;
            C17086I c17086i = c17087j.f54613F0;
            this.f54597o0 = c20097d2;
            this.f54596Z = 1;
            if (AbstractC8472E4.m9105a(c19748y, c1743k, c17086i, c20097d2, this) == enumC19250a) {
                return enumC19250a;
            }
            c20097d = c20097d2;
            InterfaceC0161D1 interfaceC0161D5 = (InterfaceC0161D1) AbstractC21690f.m22204i(c17087j, AbstractC0187M0.f715q);
            jM9659a2 = AbstractC9125E4.m9659a(interfaceC0161D5.mo502e(), interfaceC0161D5.mo502e());
            jM20929b2 = c20097d.m20929b(jM9659a2);
            if (!Float.isNaN(C7550o.m7902c(jM20929b2))) {
                jM9659a2 = jM20929b2;
            }
            c17079b = new C17079B(jM9659a2);
            c17087j.f54615H0.mo2524p(c17079b);
            return C17296C.f55119a;
        } catch (CancellationException e11) {
            e = e11;
            c20097d = c20097d2;
            if (AbstractC0575H.m1196y(this.f54599q0)) {
                throw e;
            }
            InterfaceC0161D1 interfaceC0161D6 = (InterfaceC0161D1) AbstractC21690f.m22204i(c17087j, AbstractC0187M0.f715q);
            AbstractC9125E4.m9659a(interfaceC0161D6.mo502e(), interfaceC0161D6.mo502e());
            c17079b = new C17079B(0L);
        } catch (Throwable th4) {
            th = th4;
            c20097d = c20097d2;
            InterfaceC0161D1 interfaceC0161D7 = (InterfaceC0161D1) AbstractC21690f.m22204i(c17087j, AbstractC0187M0.f715q);
            jM9659a = AbstractC9125E4.m9659a(interfaceC0161D7.mo502e(), interfaceC0161D7.mo502e());
            if (!z6) {
                jM20929b = c20097d.m20929b(jM9659a);
                if (Float.isNaN(C7550o.m7902c(jM20929b))) {
                    j10 = jM9659a;
                } else {
                    j10 = jM9659a;
                }
            }
            c17087j.f54615H0.mo2524p(new C17079B(j10));
            throw th;
        }
    }
}
