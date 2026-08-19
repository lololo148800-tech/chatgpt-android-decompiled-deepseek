package id;

import gd.C13917a2;
import mm.C17296C;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p834jd.C16194c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: id.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C14965d implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46610Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2186j f46611Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14968g f46612o0;

    public /* synthetic */ C14965d(InterfaceC2186j interfaceC2186j, C14968g c14968g, int i10) {
        this.f46610Y = i10;
        this.f46611Z = interfaceC2186j;
        this.f46612o0 = c14968g;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C14964c c14964c;
        boolean z6;
        C14967f c14967f;
        switch (this.f46610Y) {
            case 0:
                if (interfaceC18770c instanceof C14964c) {
                    c14964c = (C14964c) interfaceC18770c;
                    int i10 = c14964c.f46608Z;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c14964c.f46608Z = i10 - Integer.MIN_VALUE;
                    } else {
                        c14964c = new C14964c(this, interfaceC18770c);
                    }
                } else {
                    c14964c = new C14964c(this, interfaceC18770c);
                }
                Object obj2 = c14964c.f46607Y;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c14964c.f46608Z;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj2);
                    C16194c c16194c = (C16194c) obj;
                    C14968g c14968g = this.f46612o0;
                    if (!c14968g.f46619Y.f58773a.f58783b || c16194c.f50269c || c16194c.f50268b) {
                        z6 = false;
                    } else {
                        if (c16194c.f50270d >= ((Number) c14968g.f46621o0.m15479a(C13917a2.f43969d)).intValue()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z6);
                    c14964c.f46608Z = 1;
                    if (this.f46611Z.mo395a(boolValueOf, c14964c) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj2);
                }
                return C17296C.f55119a;
            default:
                if (interfaceC18770c instanceof C14967f) {
                    c14967f = (C14967f) interfaceC18770c;
                    int i12 = c14967f.f46617Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c14967f.f46617Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c14967f = new C14967f(this, interfaceC18770c);
                    }
                } else {
                    c14967f = new C14967f(this, interfaceC18770c);
                }
                Object obj3 = c14967f.f46616Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c14967f.f46617Z;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(obj3);
                    C16194c c16194c2 = (C16194c) obj;
                    Boolean boolValueOf2 = Boolean.valueOf(this.f46612o0.f46619Y.f58773a.f58783b && c16194c2.f50269c && !c16194c2.f50267a);
                    c14967f.f46617Z = 1;
                    if (this.f46611Z.mo395a(boolValueOf2, c14967f) == enumC19250a2) {
                        return enumC19250a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj3);
                }
                return C17296C.f55119a;
        }
    }
}
