package p030B2;

import android.view.View;
import android.view.ViewGroup;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1091wn.C21030k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: B2.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0743Y extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f2109Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f2110o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ View f2111p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0743Y(View view, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f2111p0 = view;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C0743Y c0743y = new C0743Y(this.f2111p0, interfaceC18770c);
        c0743y.f2110o0 = obj;
        return c0743y;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0743Y) create((C21030k) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f2109Z;
        View view = this.f2111p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21030k c21030k = (C21030k) this.f2110o0;
            this.f2110o0 = c21030k;
            this.f2109Z = 1;
            c21030k.m21482c(view, this);
            return enumC19250a;
        }
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 1) {
            C21030k c21030k2 = (C21030k) this.f2110o0;
            AbstractC9233X.m9807c(obj);
            if (view instanceof ViewGroup) {
                this.f2110o0 = null;
                this.f2109Z = 2;
                c21030k2.getClass();
                C0716A c0716a = new C0716A(new C0742X((ViewGroup) view, 0));
                if (c0716a.f2073Z.hasNext()) {
                    c21030k2.f66910o0 = c0716a;
                    c21030k2.f66908Y = 2;
                    c21030k2.f66911p0 = this;
                    obj2 = enumC19250a;
                } else {
                    obj2 = c17296c;
                }
                if (obj2 != enumC19250a) {
                    obj2 = c17296c;
                }
                if (obj2 == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
