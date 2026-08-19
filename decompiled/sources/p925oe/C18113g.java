package p925oe;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p404Qe.C6665a;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17681o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: oe.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C18113g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f57778Y;

    /* JADX INFO: renamed from: Z */
    public int f57779Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18127p f57780o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f57781p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f57782q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18113g(String str, C18127p c18127p, InterfaceC18770c interfaceC18770c, boolean z6) {
        super(2, interfaceC18770c);
        this.f57780o0 = c18127p;
        this.f57781p0 = z6;
        this.f57782q0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18113g(this.f57782q0, this.f57780o0, interfaceC18770c, this.f57781p0);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18113g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008e A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        int i10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f57779Z;
        String str = this.f57782q0;
        C18127p c18127p = this.f57780o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i11 == 2) {
                i10 = this.f57778Y;
                AbstractC9233X.m9807c(obj);
                if (this.f57781p0 && i10 != 0) {
                    this.f57779Z = 3;
                    if (C18127p.m19716a(c18127p, str, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C18129r c18129r = c18127p.f57823f;
        this.f57779Z = 1;
        obj = AbstractC2124C.m3221t(c18129r.f64176f, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        Iterator it = ((C18102a0) obj).f57743a.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            Object next = it.next();
            if (i12 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            if (AbstractC16544l.m18089b(((C18098X) next).f57738a, str)) {
                break;
            }
            i12++;
        }
        int i13 = i12 == -1 ? 0 : 1;
        C18129r c18129r2 = c18127p.f57823f;
        C6665a c6665a = new C6665a(str, 15);
        this.f57778Y = i13;
        this.f57779Z = 2;
        if (c18129r2.m21029b(c6665a, this) == enumC19250a) {
            return enumC19250a;
        }
        i10 = i13;
        if (this.f57781p0) {
            this.f57779Z = 3;
            if (C18127p.m19716a(c18127p, str, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
