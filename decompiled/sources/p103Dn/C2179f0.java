package p103Dn;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p129En.C2590a;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2179f0 implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6673Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19694j f6674Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f6675o0;

    /* JADX WARN: Multi-variable type inference failed */
    public C2179f0(InterfaceC1439n interfaceC1439n, C16525B c16525b, int i10) {
        this.f6673Y = i10;
        switch (i10) {
            case 1:
                this.f6674Z = (AbstractC19694j) interfaceC1439n;
                this.f6675o0 = c16525b;
                break;
            default:
                this.f6674Z = (AbstractC19694j) interfaceC1439n;
                this.f6675o0 = c16525b;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r6v10, types: [Bm.n, sm.j] */
    /* JADX WARN: Type inference failed for: r6v2, types: [Bm.n, sm.j] */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C2177e0 c2177e0;
        C2179f0 c2179f0;
        C2185i0 c2185i0;
        C2179f0 c2179f1;
        switch (this.f6673Y) {
            case 0:
                if (interfaceC18770c instanceof C2177e0) {
                    c2177e0 = (C2177e0) interfaceC18770c;
                    int i10 = c2177e0.f6667o0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2177e0.f6667o0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c2177e0 = new C2177e0(this, interfaceC18770c);
                    }
                } else {
                    c2177e0 = new C2177e0(this, interfaceC18770c);
                }
                Object objInvoke = c2177e0.f6666Z;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c2177e0.f6667o0;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(objInvoke);
                    c2177e0.f6665Y = this;
                    c2177e0.f6669q0 = obj;
                    c2177e0.f6667o0 = 1;
                    objInvoke = this.f6674Z.invoke(obj, c2177e0);
                    if (objInvoke == enumC19250a) {
                        return enumC19250a;
                    }
                    c2179f0 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c2177e0.f6669q0;
                    c2179f0 = c2177e0.f6665Y;
                    AbstractC9233X.m9807c(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return C17296C.f55119a;
                }
                c2179f0.f6675o0.f51262Y = obj;
                throw new C2590a(c2179f0);
            default:
                if (interfaceC18770c instanceof C2185i0) {
                    c2185i0 = (C2185i0) interfaceC18770c;
                    int i12 = c2185i0.f6690o0;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c2185i0.f6690o0 = i12 - Integer.MIN_VALUE;
                    } else {
                        c2185i0 = new C2185i0(this, interfaceC18770c);
                    }
                } else {
                    c2185i0 = new C2185i0(this, interfaceC18770c);
                }
                Object objInvoke2 = c2185i0.f6689Z;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c2185i0.f6690o0;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(objInvoke2);
                    c2185i0.f6688Y = this;
                    c2185i0.f6692q0 = obj;
                    c2185i0.f6690o0 = 1;
                    objInvoke2 = this.f6674Z.invoke(obj, c2185i0);
                    if (objInvoke2 == enumC19250a2) {
                        return enumC19250a2;
                    }
                    c2179f1 = this;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c2185i0.f6692q0;
                    c2179f1 = c2185i0.f6688Y;
                    AbstractC9233X.m9807c(objInvoke2);
                }
                if (!((Boolean) objInvoke2).booleanValue()) {
                    return C17296C.f55119a;
                }
                c2179f1.f6675o0.f51262Y = obj;
                throw new C2590a(c2179f1);
        }
    }
}
