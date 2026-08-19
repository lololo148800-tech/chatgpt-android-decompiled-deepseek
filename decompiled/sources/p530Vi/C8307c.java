package p530Vi;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1114xp.C21346q;
import p225Im.InterfaceC3756d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vi.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C8307c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f25886Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8312h f25887Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f25888o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8307c(C8312h c8312h, boolean z6, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f25887Z = c8312h;
        this.f25888o0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8307c(this.f25887Z, this.f25888o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8307c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f25886Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21346q c21346q = (C21346q) this.f25887Z.f25903Z.f7436Z;
            C8296D c8296d = new C8296D(this.f25888o0, 0);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8297E.class);
            this.f25886Y = 1;
            if (c21346q.m21740b(c8296d, interfaceC3756dMo5693b, this) == enumC19250a) {
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
