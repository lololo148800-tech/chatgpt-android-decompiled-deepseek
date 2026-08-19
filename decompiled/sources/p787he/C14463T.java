package p787he;

import gd.C13978q;
import gd.C13979q0;
import gd.C14005w2;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import mm.C17296C;
import p025An.C0644w;
import p041Be.C1216I;
import p041Be.C1217J;
import p041Be.C1219L;
import p041Be.EnumC1228V;
import p049Bm.InterfaceC1439n;
import p103Dn.C2134H;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2186j;
import p1126yd.C21446V;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p269Kh.C4688o;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p405Qf.C6687b;
import p571X9.AbstractC9233X;
import p870le.C16911v;
import p870le.C16916z;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C14463T extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45549Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45550Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14467X f45551o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14487p f45552p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f45553q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ String f45554r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C21446V f45555s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14463T(C14467X c14467x, C14487p c14487p, String str, String str2, C21446V c21446v, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45551o0 = c14467x;
        this.f45552p0 = c14487p;
        this.f45553q0 = str;
        this.f45554r0 = str2;
        this.f45555s0 = c21446v;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14463T c14463t = new C14463T(this.f45551o0, this.f45552p0, this.f45553q0, this.f45554r0, this.f45555s0, interfaceC18770c);
        c14463t.f45550Z = obj;
        return c14463t;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14463T) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException {
        InterfaceC2186j interfaceC2186j;
        AbstractC21955Q1 c21952p1;
        C4688o c4688o;
        String str;
        AbstractC21955Q1 abstractC21955Q1;
        EnumC1228V enumC1228V;
        C2134H c2134h;
        C14462S c14462s;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45549Y;
        C14487p c14487p = this.f45552p0;
        C14467X c14467x = this.f45551o0;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f45550Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f45550Z;
        if (((C14005w2) c14467x.f45569e).m15481a(C13979q0.f44037c)) {
            c21952p1 = null;
        } else {
            c14487p.invoke("integrity_token");
            C16916z c16916z = c14467x.f45567c;
            this.f45550Z = interfaceC2186j;
            this.f45549Y = 1;
            obj = c16916z.m18587b(this.f45553q0, this.f45554r0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        }
        c14487p.invoke("request_sse");
        c4688o = (C4688o) ((C6687b) c14467x.f45568d).f21506f.getValue();
        if (c4688o != null) {
            str = c4688o.f15253b;
        } else {
            str = null;
        }
        C1219L c1219l = c14467x.f45566b;
        if (c21952p1 != null) {
            if (c21952p1 instanceof C21952P1) {
                c21952p1 = new C21952P1(((C16911v) ((C21952P1) c21952p1).f69511a).f54325d);
            } else if (!(c21952p1 instanceof C21929J1) && !(c21952p1 instanceof AbstractC21933K1)) {
                throw new C0644w();
            }
            abstractC21955Q1 = c21952p1;
        } else {
            abstractC21955Q1 = null;
        }
        enumC1228V = (str == null || !((List) c14467x.f45570f.m15477a(C13978q.f44036d)).contains(str)) ? EnumC1228V.Regular : EnumC1228V.Alternate;
        c2134h = new C2134H(new C2219z0(new C1216I(c1219l, this.f45555s0, enumC1228V, abstractC21955Q1, null)), new C1217J(3, (InterfaceC18770c) null, 0));
        c14462s = new C14462S(interfaceC2186j, 0);
        this.f45550Z = null;
        this.f45549Y = 2;
        if (c2134h.mo3141d(c14462s, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
        AbstractC6224C abstractC6224C = (AbstractC6224C) obj;
        if (abstractC6224C instanceof C6223B) {
            c21952p1 = new C21952P1(((C6223B) abstractC6224C).f20258a);
        } else if (abstractC6224C instanceof C6248v) {
            c21952p1 = C21929J1.f69476a;
        } else {
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        c14487p.invoke("request_sse");
        c4688o = (C4688o) ((C6687b) c14467x.f45568d).f21506f.getValue();
        if (c4688o != null) {
            str = c4688o.f15253b;
        } else {
            str = null;
        }
        C1219L c1219l2 = c14467x.f45566b;
        if (c21952p1 != null) {
            if (c21952p1 instanceof C21952P1) {
                c21952p1 = new C21952P1(((C16911v) ((C21952P1) c21952p1).f69511a).f54325d);
            } else if (!(c21952p1 instanceof C21929J1)) {
                throw new C0644w();
            }
            abstractC21955Q1 = c21952p1;
        } else {
            abstractC21955Q1 = null;
        }
        if (str == null) {
            enumC1228V = EnumC1228V.Regular;
        }
        c2134h = new C2134H(new C2219z0(new C1216I(c1219l2, this.f45555s0, enumC1228V, abstractC21955Q1, null)), new C1217J(3, (InterfaceC18770c) null, 0));
        c14462s = new C14462S(interfaceC2186j, 0);
        this.f45550Z = null;
        this.f45549Y = 2;
        if (c2134h.mo3141d(c14462s, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
