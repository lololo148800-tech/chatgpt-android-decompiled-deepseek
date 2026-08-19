package al;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15074J;
import io.ktor.utils.p815io.C15085k;
import io.ktor.utils.p815io.InterfaceC15066B;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.C0564B0;
import p025An.C0636s;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11234e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: al.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C10745c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f31930Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f31931Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f31932o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10745c(C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31932o0 = c16525b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C10745c c10745c = new C10745c(this.f31932o0, interfaceC18770c);
        c10745c.f31931Z = obj;
        return c10745c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10745c) create((C15074J) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C15074J c15074j;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f31930Y;
        if (i10 != 0) {
            if (i10 == 1) {
                c15074j = (C15074J) this.f31931Z;
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
        c15074j = (C15074J) this.f31931Z;
        Object obj2 = this.f31932o0.f51262Y;
        AbstractC16544l.m18091d(obj2);
        C10744b c10744b = (C10744b) obj2;
        this.f31931Z = c15074j;
        this.f31930Y = 1;
        C11234e c11234e = c10744b.f31928b;
        if (c11234e == null) {
            AbstractC16544l.m18103p("writerJob");
            throw null;
        }
        if (!((C0564B0) c11234e.f34002o0).m1296M()) {
            C11234e c11234e2 = c10744b.f31928b;
            if (c11234e2 == null) {
                AbstractC16544l.m18103p("writerJob");
                throw null;
            }
            ((C15085k) c11234e2.f34001Z).mo1138b(new C0644w("Save body abandoned"));
        }
        obj = ((C0636s) c10744b.f31927a).m1309u(this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        byte[] bArr = (byte[]) obj;
        InterfaceC15066B interfaceC15066B = c15074j.f46837Y;
        this.f31931Z = null;
        this.f31930Y = 2;
        if (AbstractC15070F.m16191s(interfaceC15066B, bArr, 0, bArr.length, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
