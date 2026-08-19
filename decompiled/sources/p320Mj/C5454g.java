package p320Mj;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.C12869g;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import mm.C17296C;
import mo.AbstractC17325B;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Mj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C5454g extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f17809Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12869g f17810Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f17811o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC17325B f17812p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5454g(C12869g c12869g, String str, AbstractC17325B abstractC17325B, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f17810Z = c12869g;
        this.f17811o0 = str;
        this.f17812p0 = abstractC17325B;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C5454g(this.f17810Z, this.f17811o0, this.f17812p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C5454g) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f17809Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            FallbackModeService fallbackModeService = this.f17810Z.f40787a;
            this.f17809Y = 1;
            obj = fallbackModeService.m14537b(this.f17811o0, this.f17812p0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
