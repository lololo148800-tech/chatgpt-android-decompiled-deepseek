package p811ih;

import ke.C16378f;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p103Dn.InterfaceC2186j;
import p1155zi.C21891A;
import p571X9.AbstractC9233X;
import p948pi.C18418a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: ih.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C14998e implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46684Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2186j f46685Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18418a f46686o0;

    public /* synthetic */ C14998e(InterfaceC2186j interfaceC2186j, C18418a c18418a, int i10) {
        this.f46684Y = i10;
        this.f46685Z = interfaceC2186j;
        this.f46686o0 = c18418a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C14997d c14997d;
        C16378f c16378f;
        switch (this.f46684Y) {
            case 0:
                if (interfaceC18770c instanceof C14997d) {
                    c14997d = (C14997d) interfaceC18770c;
                    int i10 = c14997d.f46682Z;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c14997d.f46682Z = i10 - Integer.MIN_VALUE;
                    } else {
                        c14997d = new C14997d(this, interfaceC18770c);
                    }
                } else {
                    c14997d = new C14997d(this, interfaceC18770c);
                }
                Object obj2 = c14997d.f46681Y;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c14997d.f46682Z;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj2);
                    String strM22322a = ((C21891A) obj).m22322a();
                    if (strM22322a == null) {
                        strM22322a = null;
                    }
                    if (AbstractC16544l.m18089b(strM22322a, this.f46686o0.f58775c)) {
                        c14997d.f46682Z = 1;
                        if (this.f46685Z.mo395a(obj, c14997d) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj2);
                }
                return C17296C.f55119a;
            default:
                if (interfaceC18770c instanceof C16378f) {
                    c16378f = (C16378f) interfaceC18770c;
                    int i12 = c16378f.f50863Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c16378f.f50863Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c16378f = new C16378f(this, interfaceC18770c);
                    }
                } else {
                    c16378f = new C16378f(this, interfaceC18770c);
                }
                Object obj3 = c16378f.f50862Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c16378f.f50863Z;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(obj3);
                    if (!this.f46686o0.f58773a.f58783b) {
                        c16378f.f50863Z = 1;
                        if (this.f46685Z.mo395a(obj, c16378f) == enumC19250a2) {
                            return enumC19250a2;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj3);
                }
                return C17296C.f55119a;
        }
    }
}
