package p193Hf;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import ye.C21514c;
import ye.C21522k;
import ye.C21523l;

/* JADX INFO: renamed from: Hf.r1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3399r1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10361Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10362Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3414w1 f10363o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f10364p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f10365q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3399r1(C3414w1 c3414w1, String str, String str2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10363o0 = c3414w1;
        this.f10364p0 = str;
        this.f10365q0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3399r1 c3399r1 = new C3399r1(this.f10363o0, this.f10364p0, this.f10365q0, interfaceC18770c);
        c3399r1.f10362Z = obj;
        return c3399r1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3399r1) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x0083 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.Map] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        C21523l c21523l;
        C21522k c21522k;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10361Y;
        String str = this.f10364p0;
        C3414w1 c3414w1 = this.f10363o0;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f10362Z;
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                interfaceC2186j = (InterfaceC2186j) this.f10362Z;
                AbstractC9233X.m9807c(obj);
                c21523l = (C21523l) c3414w1.f10400d.get(new C21514c(str));
                if (c21523l != null) {
                    c21522k = new C21522k(c21523l, false, null);
                    this.f10362Z = null;
                    this.f10361Y = 3;
                    if (interfaceC2186j.mo395a(c21522k, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f10362Z;
        C21523l c21523l2 = (C21523l) c3414w1.f10400d.get(new C21514c(str));
        if (c21523l2 != null) {
            C21522k c21522k2 = new C21522k(c21523l2, true, null);
            this.f10362Z = interfaceC2186j;
            this.f10361Y = 1;
            if (interfaceC2186j.mo395a(c21522k2, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        this.f10362Z = interfaceC2186j;
        this.f10361Y = 2;
        if (C3414w1.m4183a(c3414w1, this.f10365q0, this) == enumC19250a) {
            return enumC19250a;
        }
        c21523l = (C21523l) c3414w1.f10400d.get(new C21514c(str));
        if (c21523l != null) {
            c21522k = new C21522k(c21523l, false, null);
            this.f10362Z = null;
            this.f10361Y = 3;
            if (interfaceC2186j.mo395a(c21522k, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
