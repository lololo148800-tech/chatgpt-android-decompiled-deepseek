package fj;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.C1750r;
import p117Eb.C2391u;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: fj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13678j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f43172Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2391u f43173Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13678j(C2391u c2391u, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f43173Z = c2391u;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13678j c13678j = new C13678j(this.f43173Z, interfaceC18770c);
        c13678j.f43172Y = obj;
        return c13678j;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C13678j) create(new C1750r(((C1750r) obj).f5021a), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return null;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        Object obj2 = ((C1750r) this.f43172Y).f5021a;
        Throwable thM2559a = C1750r.m2559a(obj2);
        if (thM2559a != null) {
            throw thM2559a;
        }
        Object objM2560b = C1750r.m2560b(obj2);
        if (objM2560b == null) {
            return null;
        }
        C2391u c2391u = this.f43173Z;
        if (AbstractC16544l.m18089b(c2391u.f7430o0, objM2560b)) {
            return null;
        }
        c2391u.f7430o0 = objM2560b;
        return null;
    }
}
