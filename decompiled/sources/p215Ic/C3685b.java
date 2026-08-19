package p215Ic;

import gd.C13868K0;
import gd.C13888R0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import ni.C17627a;
import p025An.AbstractC0593T;
import p072Ci.C1705j;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2130F;
import p103Dn.C2207t0;
import p112E6.C2349h;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p1155zi.EnumC22026l;
import p201Hn.C3516e;
import p406Qg.C6712h;
import p406Qg.C6729y;
import p544W9.AbstractC8537P3;
import p571X9.AbstractC9233X;
import p620Zc.InterfaceC10277b;
import p708dh.C13132J;
import p708dh.C13133K;
import p788hf.C14498a;
import p788hf.C14499b;
import p811ih.C15000g;
import p836jh.C16211c;
import p948pi.C18418a;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ic.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3685b implements InterfaceC18419b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11178Y = 2;

    /* JADX INFO: renamed from: Z */
    public final Object f11179Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f11180o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f11181p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f11182q0;

    public C3685b(InterfaceC10277b interfaceC10277b, InterfaceC13849E interfaceC13849E, C13133K c13133k, C17627a c17627a) {
        this.f11179Z = interfaceC10277b;
        this.f11182q0 = interfaceC13849E;
        this.f11180o0 = c13133k;
        this.f11181p0 = c17627a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C6729y c6729y;
        C3685b c3685b;
        C3685b c3685b2;
        AbstractC21955Q1 abstractC21955Q1;
        C14498a c14498a;
        C3685b c3685b3;
        switch (this.f11178Y) {
            case 0:
                AbstractC2124C.m3226y(new C2130F(new C1970n(((C15000g) this.f11179Z).f46691b, 5, new C3684a(this, null)), new C2349h(this, null, 1)), (C17627a) this.f11181p0);
                return C17296C.f55119a;
            case 1:
                if (interfaceC18770c instanceof C6729y) {
                    c6729y = (C6729y) interfaceC18770c;
                    int i10 = c6729y.f21621p0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c6729y.f21621p0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c6729y = new C6729y(this, (AbstractC19687c) interfaceC18770c);
                    }
                } else {
                    c6729y = new C6729y(this, (AbstractC19687c) interfaceC18770c);
                }
                Object objM3221t = c6729y.f21619Z;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c6729y.f21621p0;
                if (i11 != 0) {
                    if (i11 == 1) {
                        c3685b = c6729y.f21618Y;
                        AbstractC9233X.m9807c(objM3221t);
                    } else {
                        if (i11 == 2) {
                            c3685b = c6729y.f21618Y;
                            AbstractC9233X.m9807c(objM3221t);
                            if (((C1705j) objM3221t).f4868a) {
                                C13132J c13132j = (C13132J) c3685b.f11182q0;
                                c6729y.f21618Y = c3685b;
                                c6729y.f21621p0 = 3;
                                objM3221t = c13132j.m14811h(false, c6729y);
                                if (objM3221t == enumC19250a) {
                                    return enumC19250a;
                                }
                                c3685b2 = c3685b;
                            }
                            return C17296C.f55119a;
                        }
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c3685b2 = c6729y.f21618Y;
                        AbstractC9233X.m9807c(objM3221t);
                    }
                    abstractC21955Q1 = (AbstractC21955Q1) objM3221t;
                    if (abstractC21955Q1 instanceof C21952P1) {
                        ((C13133K) c3685b2.f11181p0).m14817a(C6712h.f21575p0);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(objM3221t);
                if (AbstractC8537P3.m9201b((C18418a) this.f11180o0)) {
                    ((C13133K) this.f11181p0).m14817a(C6712h.f21574o0);
                }
                C2207t0 c2207t0M16134a = ((C15000g) this.f11179Z).m16134a(EnumC22026l.MemoryAvailable, C13888R0.f43936c);
                c6729y.f21618Y = this;
                c6729y.f21621p0 = 1;
                objM3221t = AbstractC2124C.m3221t(c2207t0M16134a, c6729y);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                c3685b = this;
                if (((Boolean) objM3221t).booleanValue()) {
                    C13133K c13133k = (C13133K) c3685b.f11181p0;
                    c6729y.f21618Y = c3685b;
                    c6729y.f21621p0 = 2;
                    objM3221t = AbstractC2124C.m3221t(c13133k.f41697b, c6729y);
                    if (objM3221t == enumC19250a) {
                        return enumC19250a;
                    }
                    if (((C1705j) objM3221t).f4868a) {
                        C13132J c13132j2 = (C13132J) c3685b.f11182q0;
                        c6729y.f21618Y = c3685b;
                        c6729y.f21621p0 = 3;
                        objM3221t = c13132j2.m14811h(false, c6729y);
                        if (objM3221t == enumC19250a) {
                            return enumC19250a;
                        }
                        c3685b2 = c3685b;
                        abstractC21955Q1 = (AbstractC21955Q1) objM3221t;
                        if (abstractC21955Q1 instanceof C21952P1) {
                            ((C13133K) c3685b2.f11181p0).m14817a(C6712h.f21575p0);
                        }
                    }
                }
                return C17296C.f55119a;
            default:
                if (interfaceC18770c instanceof C14498a) {
                    c14498a = (C14498a) interfaceC18770c;
                    int i12 = c14498a.f45701p0;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c14498a.f45701p0 = i12 - Integer.MIN_VALUE;
                    } else {
                        c14498a = new C14498a(this, (AbstractC19687c) interfaceC18770c);
                    }
                } else {
                    c14498a = new C14498a(this, (AbstractC19687c) interfaceC18770c);
                }
                Object objM15482b = c14498a.f45699Z;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c14498a.f45701p0;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(objM15482b);
                    C13868K0 c13868k0 = C13868K0.f43906c;
                    c14498a.f45698Y = this;
                    c14498a.f45701p0 = 1;
                    objM15482b = ((C14005w2) ((InterfaceC13849E) this.f11182q0)).m15482b(c13868k0, c14498a);
                    if (objM15482b == enumC19250a2) {
                        return enumC19250a2;
                    }
                    c3685b3 = this;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3685b3 = c14498a.f45698Y;
                    AbstractC9233X.m9807c(objM15482b);
                }
                if (!((Boolean) objM15482b).booleanValue()) {
                    C13133K c13133k2 = (C13133K) c3685b3.f11180o0;
                    AbstractC2124C.m3226y(new C1970n(c13133k2.f41697b, 5, new C14499b(c3685b3, null)), (C17627a) c3685b3.f11181p0);
                }
                return C17296C.f55119a;
        }
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        switch (this.f11178Y) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC0593T.f1824a;
    }

    public C3685b(C17627a scope, C15000g accountUserProvider, C16211c accountIdHeaderPluginProvider, C18418a accountSession) {
        AbstractC16544l.m18094g(scope, "scope");
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        AbstractC16544l.m18094g(accountIdHeaderPluginProvider, "accountIdHeaderPluginProvider");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        this.f11181p0 = scope;
        this.f11179Z = accountUserProvider;
        this.f11182q0 = accountIdHeaderPluginProvider;
        this.f11180o0 = accountSession;
    }

    public C3685b(C15000g c15000g, C13133K c13133k, C13132J c13132j, C18418a c18418a) {
        this.f11179Z = c15000g;
        this.f11181p0 = c13133k;
        this.f11182q0 = c13132j;
        this.f11180o0 = c18418a;
    }
}
