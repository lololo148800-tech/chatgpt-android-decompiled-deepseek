package p484Ti;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p530Vi.InterfaceC8294B;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ti.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C7490s extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f23770Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7491t f23771Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f23772o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f23773p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7490s(C7491t c7491t, String str, String str2, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f23771Z = c7491t;
        this.f23772o0 = str;
        this.f23773p0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C7490s(this.f23771Z, this.f23772o0, this.f23773p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C7490s) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f23770Y;
        C7491t c7491t = this.f23771Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC8294B interfaceC8294B = c7491t.f23786x0;
        if (interfaceC8294B == null) {
            AbstractC16544l.m18103p("storage");
            throw null;
        }
        String currentVersion = this.f23772o0;
        AbstractC16544l.m18093f(currentVersion, "currentVersion");
        this.f23770Y = 1;
        if (interfaceC8294B.mo7524a(6, currentVersion, this) == enumC19250a) {
            return enumC19250a;
        }
        InterfaceC8294B interfaceC8294B2 = c7491t.f23786x0;
        if (interfaceC8294B2 == null) {
            AbstractC16544l.m18103p("storage");
            throw null;
        }
        this.f23770Y = 2;
        if (interfaceC8294B2.mo7524a(7, this.f23773p0, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
