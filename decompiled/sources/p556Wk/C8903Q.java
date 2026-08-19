package p556Wk;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p409Qk.C6752c;
import p434Rk.C6911c;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p754fl.C13696f;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Wk.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C8903Q implements InterfaceC8921e0 {

    /* JADX INFO: renamed from: a */
    public final C6752c f27249a;

    /* JADX INFO: renamed from: b */
    public int f27250b;

    /* JADX INFO: renamed from: c */
    public C6911c f27251c;

    public C8903Q(C6752c client) {
        AbstractC16544l.m18094g(client, "client");
        this.f27249a = client;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p556Wk.InterfaceC8921e0
    /* JADX INFO: renamed from: a */
    public final Object mo9562a(C13693c c13693c, AbstractC19687c abstractC19687c) {
        C8902P c8902p;
        C8903Q c8903q;
        if (abstractC19687c instanceof C8902P) {
            c8902p = (C8902P) abstractC19687c;
            int i10 = c8902p.f27248p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c8902p.f27248p0 = i10 - Integer.MIN_VALUE;
            } else {
                c8902p = new C8902P(this, abstractC19687c);
            }
        } else {
            c8902p = new C8902P(this, abstractC19687c);
        }
        Object objM21467a = c8902p.f27246Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c8902p.f27248p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM21467a);
            C6911c c6911c = this.f27251c;
            if (c6911c != null) {
                AbstractC0575H.m1180i(c6911c, null);
            }
            int i12 = this.f27250b;
            if (i12 >= 20) {
                throw new C8919d0("Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required.");
            }
            this.f27250b = i12 + 1;
            C13696f c13696f = this.f27249a.f21673t0;
            Object obj = c13693c.f43198d;
            c8902p.f27245Y = this;
            c8902p.f27248p0 = 1;
            objM21467a = c13696f.m21467a(c13693c, obj, c8902p);
            if (objM21467a == enumC19250a) {
                return enumC19250a;
            }
            c8903q = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c8903q = c8902p.f27245Y;
            AbstractC9233X.m9807c(objM21467a);
        }
        C6911c c6911c2 = objM21467a instanceof C6911c ? (C6911c) objM21467a : null;
        if (c6911c2 != null) {
            c8903q.f27251c = c6911c2;
            return c6911c2;
        }
        throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + objM21467a).toString());
    }
}
