package p023Al;

import io.ktor.utils.p815io.C15071G;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0569E;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.InterfaceC0627n0;
import p488Tn.C7518a;
import p488Tn.C7519b;
import p488Tn.InterfaceC7526i;
import p544W9.AbstractC8694q;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Al.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C0559e implements InterfaceC15088n {

    /* JADX INFO: renamed from: b */
    public final C7519b f1775b;

    /* JADX INFO: renamed from: c */
    public C15071G f1776c;

    /* JADX INFO: renamed from: d */
    public final C7518a f1777d;

    /* JADX INFO: renamed from: e */
    public final C0631p0 f1778e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC18776i f1779f;

    public C0559e(C7519b c7519b, InterfaceC18776i parent) {
        AbstractC16544l.m18094g(parent, "parent");
        this.f1775b = c7519b;
        this.f1777d = new C7518a();
        C0631p0 c0631p0 = new C0631p0((InterfaceC0627n0) parent.get(C0625m0.f1875Y));
        this.f1778e = c0631p0;
        this.f1779f = parent.plus(c0631p0).plus(new C0569E("RawSourceChannel"));
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: a */
    public final Throwable mo1137a() {
        C15071G c15071g = this.f1776c;
        if (c15071g != null) {
            return c15071g.m16195a();
        }
        return null;
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: b */
    public final void mo1138b(Throwable th2) {
        if (this.f1776c != null) {
            return;
        }
        C0631p0 c0631p0 = this.f1778e;
        String message = th2.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        c0631p0.mo1275e(AbstractC0575H.m1172a(message, th2));
        this.f1775b.close();
        String message2 = th2.getMessage();
        this.f1776c = new C15071G(new IOException(message2 != null ? message2 : "Channel was cancelled", th2));
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: c */
    public final InterfaceC7526i mo1139c() {
        return this.f1777d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: d */
    public final Object mo1140d(int i10, AbstractC19687c abstractC19687c) {
        C0557c c0557c;
        C0559e c0559e;
        if (abstractC19687c instanceof C0557c) {
            c0557c = (C0557c) abstractC19687c;
            int i11 = c0557c.f1772q0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0557c.f1772q0 = i11 - Integer.MIN_VALUE;
            } else {
                c0557c = new C0557c(this, abstractC19687c);
            }
        } else {
            c0557c = new C0557c(this, abstractC19687c);
        }
        Object obj = c0557c.f1770o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c0557c.f1772q0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            if (this.f1776c != null) {
                return Boolean.TRUE;
            }
            C0558d c0558d = new C0558d(this, i10, null);
            c0557c.f1768Y = this;
            c0557c.f1769Z = i10;
            c0557c.f1772q0 = 1;
            if (AbstractC0575H.m1168P(this.f1779f, c0558d, c0557c) == enumC19250a) {
                return enumC19250a;
            }
            c0559e = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = c0557c.f1769Z;
            c0559e = c0557c.f1768Y;
            AbstractC9233X.m9807c(obj);
        }
        return Boolean.valueOf(AbstractC8694q.m9397d(c0559e.f1777d) >= ((long) i10));
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: e */
    public final boolean mo1141e() {
        return this.f1776c != null && this.f1777d.mo7821g();
    }
}
