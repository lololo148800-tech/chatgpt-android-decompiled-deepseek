package p003A1;

import android.view.View;
import com.openai.chatgpt.R;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p349O0.C6022p0;
import p349O0.C6032u0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A1.O1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0194O1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f728Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6032u0 f729Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ View f730o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0194O1(C6032u0 c6032u0, View view, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f729Z = c6032u0;
        this.f730o0 = view;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0194O1(this.f729Z, this.f730o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0194O1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f728Y;
        C17296C c17296c = C17296C.f55119a;
        View view = this.f730o0;
        C6032u0 c6032u0 = this.f729Z;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f728Y = 1;
                Object objM3220s = AbstractC2124C.m3220s(c6032u0.f19663s, new C6022p0(2, null), this);
                if (objM3220s != enumC19250a) {
                    objM3220s = c17296c;
                }
                if (objM3220s == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            if (AbstractC0223Y1.m694c(view) == c6032u0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return c17296c;
        } catch (Throwable th2) {
            if (AbstractC0223Y1.m694c(view) == c6032u0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            throw th2;
        }
    }
}
