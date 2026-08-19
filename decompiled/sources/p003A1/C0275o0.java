package p003A1;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import p002A0.C0122V;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p350O1.C6046D;
import p571X9.AbstractC9233X;
import p635a1.C10462t;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: A1.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0275o0 implements InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final View f999Y;

    /* JADX INFO: renamed from: Z */
    public final C6046D f1000Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC0571F f1001o0;

    /* JADX INFO: renamed from: p0 */
    public final AtomicReference f1002p0 = new AtomicReference(null);

    public C0275o0(View view, C6046D c6046d, InterfaceC0571F interfaceC0571F) {
        this.f999Y = view;
        this.f1000Z = c6046d;
        this.f1001o0 = interfaceC0571F;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final void m860a(InterfaceC0255h1 interfaceC0255h1, AbstractC19687c abstractC19687c) {
        C0269m0 c0269m0;
        if (abstractC19687c instanceof C0269m0) {
            c0269m0 = (C0269m0) abstractC19687c;
            int i10 = c0269m0.f983o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0269m0.f983o0 = i10 - Integer.MIN_VALUE;
            } else {
                c0269m0 = new C0269m0(this, abstractC19687c);
            }
        } else {
            c0269m0 = new C0269m0(this, abstractC19687c);
        }
        Object obj = c0269m0.f981Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0269m0.f983o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            AtomicReference atomicReference = this.f1002p0;
            C0122V c0122v = new C0122V(interfaceC0255h1, 3, this);
            C0272n0 c0272n0 = new C0272n0(this, null);
            c0269m0.f983o0 = 1;
            if (AbstractC0575H.m1183l(new C10462t(c0122v, atomicReference, c0272n0, null), c0269m0) == enumC19250a) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f1001o0.getCoroutineContext();
    }
}
