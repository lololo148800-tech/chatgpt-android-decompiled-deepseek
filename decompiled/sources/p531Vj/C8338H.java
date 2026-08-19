package p531Vj;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p086D6.C1971o;
import p103Dn.InterfaceC2186j;
import p1071w0.AbstractC20734X;
import p385Pj.C6447v;
import p571X9.AbstractC9233X;
import p859l.AbstractC16651b;
import p859l.C16650a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vj.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C8338H extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f25990Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f25991Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8339I f25992o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8338H(C8339I c8339i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f25992o0 = c8339i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C8338H c8338h = new C8338H(this.f25992o0, interfaceC18770c);
        c8338h.f25991Z = obj;
        return c8338h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8338H) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f25990Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f25991Z;
            C8339I c8339i = this.f25992o0;
            AbstractC16651b abstractC16651bMo10187a = c8339i.f25993b.mo10187a();
            Context context = c8339i.f25994c;
            EnumC8334D enumC8334D = c8339i.f25995d;
            C16650a synchronousResult = abstractC16651bMo10187a.getSynchronousResult(context, AbstractC8367f0.m8939b(enumC8334D));
            if (!AbstractC16544l.m18089b(synchronousResult != null ? synchronousResult.f53351a : null, Boolean.TRUE)) {
                c8339i.f25993b.mo10188b(AbstractC8367f0.m8939b(enumC8334D));
                C6447v c6447v = new C6447v();
                C1971o c1971o = new C1971o(interfaceC2186j, 20);
                this.f25990Y = 2;
                c6447v.mo3141d(c1971o, this);
                return enumC19250a;
            }
            C8336F c8336f = C8336F.f25989a;
            this.f25990Y = 1;
            if (interfaceC2186j.mo395a(c8336f, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw AbstractC20734X.m21252w(obj);
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
