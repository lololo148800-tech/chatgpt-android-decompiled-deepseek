package p486Tl;

import java.util.ArrayList;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p117Eb.C2392v;
import p275Kn.C4816c;
import p533Vl.AbstractC8394f;
import p571X9.AbstractC9233X;
import p972qm.C18778k;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Tl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7503b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f23808Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2392v f23809Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18778k f23810o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7503b(C2392v c2392v, C18778k c18778k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23809Z = c2392v;
        this.f23810o0 = c18778k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7503b(this.f23809Z, this.f23810o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7503b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f23808Y;
        C2392v c2392v = this.f23809Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4816c c4816c = (C4816c) c2392v.f7436Z;
            this.f23808Y = 1;
            if (c4816c.m5448e(null, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC8394f abstractC8394f = (AbstractC8394f) c2392v.f7439q0;
        C18778k c18778k = this.f23810o0;
        C4816c c4816c2 = (C4816c) c2392v.f7436Z;
        if (abstractC8394f != null) {
            c4816c2.m5450g(null);
            c18778k.resumeWith(abstractC8394f);
        } else {
            ((ArrayList) c2392v.f7440r0).add(c18778k);
            c4816c2.m5450g(null);
        }
        return C17296C.f55119a;
    }
}
