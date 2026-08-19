package p769gj;

import android.widget.EditText;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p1071w0.AbstractC20734X;
import p544W9.AbstractC8700r;
import p571X9.AbstractC9233X;
import p658b5.C11232c;
import p749fd.C13628m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: gj.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C14178t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44565Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f44566Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11232c f44567o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EditText f44568p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14178t(C11232c c11232c, EditText editText, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44567o0 = c11232c;
        this.f44568p0 = editText;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14178t c14178t = new C14178t(this.f44567o0, this.f44568p0, interfaceC18770c);
        c14178t.f44566Z = obj;
        return c14178t;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C14178t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44565Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC20734X.m21252w(obj);
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f44566Z;
        C11232c c11232c = this.f44567o0;
        C2146N c2146n = (C2146N) c11232c.f33997Z;
        EditText editText = this.f44568p0;
        AbstractC2124C.m3226y(new C1970n(c2146n, 5, new C14177s(editText, null)), interfaceC0571F);
        C13628m c13628m = new C13628m(c11232c, 9);
        this.f44565Y = 1;
        AbstractC8700r.m9405a(editText, c13628m, this);
        return enumC19250a;
    }
}
