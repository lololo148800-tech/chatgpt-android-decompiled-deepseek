package p294Li;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1000s0.AbstractC19397F;
import p1000s0.C19408d;
import p172Gi.C3077j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Li.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C5091m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f16654Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f16655Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19408d f16656o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5100v f16657p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5091m(List list, C19408d c19408d, C5100v c5100v, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f16655Z = list;
        this.f16656o0 = c19408d;
        this.f16657p0 = c5100v;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5091m(this.f16655Z, this.f16656o0, this.f16657p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5091m) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f16654Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            List list = this.f16655Z;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    String str = ((C3077j) it.next()).f9278a;
                    C3077j c3077j = this.f16657p0.f16672c;
                    if (AbstractC16544l.m18089b(str, c3077j != null ? c3077j.f9278a : null)) {
                        break;
                    }
                    i11++;
                }
                int i12 = i11 >= 0 ? i11 : 0;
                this.f16654Y = 1;
                if (AbstractC19397F.m20494s(this.f16656o0, i12, this) == enumC19250a) {
                    return enumC19250a;
                }
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
