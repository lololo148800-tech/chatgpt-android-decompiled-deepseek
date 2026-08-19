package bh;

import java.util.Date;
import java.util.Iterator;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p624Zg.C10346P;
import p624Zg.C10387s;
import p708dh.C13158l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11430d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f34527Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11431e f34528Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10346P f34529o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11430d(C11431e c11431e, C10346P c10346p, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34528Z = c11431e;
        this.f34529o0 = c10346p;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11430d(this.f34528Z, this.f34529o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11430d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f34527Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13158l c13158l = this.f34528Z.f34532o0;
            Iterator it = this.f34529o0.f30689Z.f30783c.values().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Date date = ((C10387s) next).f30788d;
                    do {
                        Object next2 = it.next();
                        Date date2 = ((C10387s) next2).f30788d;
                        if (date.compareTo(date2) < 0) {
                            next = next2;
                            date = date2;
                        }
                    } while (it.hasNext());
                }
                obj2 = next;
            } else {
                obj2 = null;
            }
            C10387s c10387s = (C10387s) obj2;
            boolean z6 = false;
            if (c10387s != null && c10387s.f30787c) {
                z6 = true;
            }
            this.f34527Y = 1;
            if (c13158l.m14825f(z6, this) == enumC19250a) {
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
