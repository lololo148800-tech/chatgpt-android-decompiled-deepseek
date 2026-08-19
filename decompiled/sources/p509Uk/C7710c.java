package p509Uk;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mo.C17356w;
import p025An.C0625m0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18774g;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Uk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7710c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f24288Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7713f f24289Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7710c(C7713f c7713f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f24289Z = c7713f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7710c(this.f24289Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7710c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f24288Y;
        C7713f c7713f = this.f24289Z;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC18774g interfaceC18774g = c7713f.f24305r0.get(C0625m0.f1875Y);
                AbstractC16544l.m18091d(interfaceC18774g);
                this.f24288Y = 1;
                if (((InterfaceC0627n0) interfaceC18774g).mo1272P(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            Iterator it = c7713f.f24307t0.entrySet().iterator();
            while (it.hasNext()) {
                C17356w c17356w = (C17356w) ((Map.Entry) it.next()).getValue();
                c17356w.f55358Z.m16554e();
                ((ThreadPoolExecutor) c17356w.f55357Y.m3524v()).shutdown();
            }
            return C17296C.f55119a;
        } catch (Throwable th2) {
            Iterator it2 = c7713f.f24307t0.entrySet().iterator();
            while (it2.hasNext()) {
                C17356w c17356w2 = (C17356w) ((Map.Entry) it2.next()).getValue();
                c17356w2.f55358Z.m16554e();
                ((ThreadPoolExecutor) c17356w2.f55357Y.m3524v()).shutdown();
            }
            throw th2;
        }
    }
}
