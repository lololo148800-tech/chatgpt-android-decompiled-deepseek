package p1089wl;

import java.util.List;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import mm.C17312o;
import p049Bm.InterfaceC1440o;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: wl.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C21018l extends AbstractC21011e {

    /* JADX INFO: renamed from: Z */
    public final List f66879Z;

    /* JADX INFO: renamed from: o0 */
    public final C21017k f66880o0;

    /* JADX INFO: renamed from: p0 */
    public Object f66881p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC18770c[] f66882q0;

    /* JADX INFO: renamed from: r0 */
    public int f66883r0;

    /* JADX INFO: renamed from: s0 */
    public int f66884s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21018l(Object initial, Object context, List blocks) {
        super(context);
        AbstractC16544l.m18094g(initial, "initial");
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(blocks, "blocks");
        this.f66879Z = blocks;
        this.f66880o0 = new C21017k(this);
        this.f66881p0 = initial;
        this.f66882q0 = new InterfaceC18770c[blocks.size()];
        this.f66883r0 = -1;
    }

    @Override // p1089wl.AbstractC21011e
    /* JADX INFO: renamed from: a */
    public final Object mo21462a(Object obj, AbstractC19687c abstractC19687c) {
        this.f66884s0 = 0;
        if (this.f66879Z.size() == 0) {
            return obj;
        }
        AbstractC16544l.m18094g(obj, "<set-?>");
        this.f66881p0 = obj;
        if (this.f66883r0 < 0) {
            return mo21464c(abstractC19687c);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // p1089wl.AbstractC21011e
    /* JADX INFO: renamed from: b */
    public final Object mo21463b() {
        return this.f66881p0;
    }

    @Override // p1089wl.AbstractC21011e
    /* JADX INFO: renamed from: c */
    public final Object mo21464c(InterfaceC18770c frame) {
        Object obj;
        if (this.f66884s0 == this.f66879Z.size()) {
            obj = this.f66881p0;
        } else {
            InterfaceC18770c interfaceC18770cM8714e = AbstractC8154o0.m8714e(frame);
            int i10 = this.f66883r0 + 1;
            this.f66883r0 = i10;
            InterfaceC18770c[] interfaceC18770cArr = this.f66882q0;
            interfaceC18770cArr[i10] = interfaceC18770cM8714e;
            if (m21472e(true)) {
                int i11 = this.f66883r0;
                if (i11 < 0) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                this.f66883r0 = i11 - 1;
                interfaceC18770cArr[i11] = null;
                obj = this.f66881p0;
            } else {
                obj = EnumC19250a.f61036Y;
            }
        }
        if (obj == EnumC19250a.f61036Y) {
            AbstractC16544l.m18094g(frame, "frame");
        }
        return obj;
    }

    @Override // p1089wl.AbstractC21011e
    /* JADX INFO: renamed from: d */
    public final Object mo21465d(Object obj, InterfaceC18770c interfaceC18770c) {
        AbstractC16544l.m18094g(obj, "<set-?>");
        this.f66881p0 = obj;
        return mo21464c(interfaceC18770c);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m21472e(boolean z6) {
        InterfaceC1440o interceptor;
        Object subject;
        C21017k continuation;
        do {
            int i10 = this.f66884s0;
            List list = this.f66879Z;
            if (i10 == list.size()) {
                if (z6) {
                    return true;
                }
                m21473f(this.f66881p0);
                return false;
            }
            this.f66884s0 = i10 + 1;
            interceptor = (InterfaceC1440o) list.get(i10);
            try {
                subject = this.f66881p0;
                continuation = this.f66880o0;
                AbstractC16544l.m18094g(interceptor, "interceptor");
                AbstractC16544l.m18094g(subject, "subject");
                AbstractC16544l.m18094g(continuation, "continuation");
                AbstractC16529F.m18081e(3, interceptor);
            } catch (Throwable th2) {
                m21473f(AbstractC9233X.m9806b(th2));
                return false;
            }
        } while (interceptor.invoke(this, subject, continuation) != EnumC19250a.f61036Y);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m21473f(Object obj) {
        int i10 = this.f66883r0;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        InterfaceC18770c[] interfaceC18770cArr = this.f66882q0;
        InterfaceC18770c interfaceC18770c = interfaceC18770cArr[i10];
        AbstractC16544l.m18091d(interfaceC18770c);
        int i11 = this.f66883r0;
        this.f66883r0 = i11 - 1;
        interfaceC18770cArr[i11] = null;
        if (!(obj instanceof C17311n)) {
            interfaceC18770c.resumeWith(obj);
            return;
        }
        Throwable thM18979a = C17312o.m18979a(obj);
        AbstractC16544l.m18091d(thM18979a);
        try {
            thM18979a.getCause();
        } catch (Throwable unused) {
        }
        interfaceC18770c.resumeWith(AbstractC9233X.m9806b(thM18979a));
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f66880o0.getContext();
    }
}
