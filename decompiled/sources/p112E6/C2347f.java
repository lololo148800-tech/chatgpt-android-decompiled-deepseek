package p112E6;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.C0205S1;
import p049Bm.InterfaceC1439n;
import p059C5.C1592j;
import p086D6.C1970n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: E6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2347f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7286Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7287Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1970n f7288o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1592j f7289p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2347f(C1970n c1970n, C1592j c1592j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7288o0 = c1970n;
        this.f7289p0 = c1592j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2347f c2347f = new C2347f(this.f7288o0, this.f7289p0, interfaceC18770c);
        c2347f.f7287Z = obj;
        return c2347f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2347f) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C2346e owner;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7286Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f7287Z;
            C1970n c1970n = this.f7288o0;
            C2346e c2346e = new C2346e(this.f7289p0, interfaceC2186j);
            try {
                C0205S1 c0205s1 = new C0205S1(c2346e, 2);
                this.f7287Z = c2346e;
                this.f7286Y = 1;
                if (c1970n.mo3141d(c0205s1, this) == enumC19250a) {
                    return enumC19250a;
                }
            } catch (C2342a e10) {
                e = e10;
                owner = c2346e;
                AbstractC16544l.m18094g(owner, "owner");
                if (e.f7270Y != owner) {
                    throw e;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            owner = (C2346e) this.f7287Z;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (C2342a e11) {
                e = e11;
                AbstractC16544l.m18094g(owner, "owner");
                if (e.f7270Y != owner) {
                    throw e;
                }
            }
        }
        return C17296C.f55119a;
    }
}
