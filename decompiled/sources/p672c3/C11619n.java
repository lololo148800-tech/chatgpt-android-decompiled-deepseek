package p672c3;

import android.content.Context;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C11619n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35181Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC11579L f35182Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f35183o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11597c f35184p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11619n(AbstractC11579L abstractC11579L, Context context, C11597c c11597c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35182Z = abstractC11579L;
        this.f35183o0 = context;
        this.f35184p0 = c11597c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11619n(this.f35182Z, this.f35183o0, this.f35184p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11619n) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35181Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        this.f35181Y = 1;
        this.f35182Z.mo12975b(this.f35183o0, this);
        return enumC19250a;
    }
}
