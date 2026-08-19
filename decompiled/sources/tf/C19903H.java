package tf;

import android.content.Context;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p033B5.InterfaceC0832p;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p454Se.C7112f;
import p571X9.AbstractC9233X;
import p749fd.C13625j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: tf.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C19903H extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f63061Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7112f f63062Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13625j f63063o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Context f63064p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC0832p f63065q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f63066r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19903H(C7112f c7112f, C13625j c13625j, Context context, InterfaceC0832p interfaceC0832p, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f63062Z = c7112f;
        this.f63063o0 = c13625j;
        this.f63064p0 = context;
        this.f63065q0 = interfaceC0832p;
        this.f63066r0 = interfaceC1436k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19903H(this.f63062Z, this.f63063o0, this.f63064p0, this.f63065q0, this.f63066r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19903H) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f63061Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f63061Y = 1;
            if (AbstractC19905J.m20795h(this.f63062Z, this.f63063o0, this.f63064p0, this.f63065q0, this.f63066r0, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
