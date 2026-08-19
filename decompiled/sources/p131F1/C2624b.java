package p131F1;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p492U1.C7544i;
import p571X9.AbstractC9233X;
import p774h1.AbstractC14334L;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: F1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2624b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8114Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ScrollCaptureCallbackC2628f f8115Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ScrollCaptureSession f8116o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Rect f8117p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Consumer f8118q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2624b(ScrollCaptureCallbackC2628f scrollCaptureCallbackC2628f, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8115Z = scrollCaptureCallbackC2628f;
        this.f8116o0 = scrollCaptureSession;
        this.f8117p0 = rect;
        this.f8118q0 = consumer;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2624b(this.f8115Z, this.f8116o0, this.f8117p0, this.f8118q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2624b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8114Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ScrollCaptureSession scrollCaptureSession = this.f8116o0;
            Rect rect = this.f8117p0;
            C7544i c7544i = new C7544i(rect.left, rect.top, rect.right, rect.bottom);
            this.f8114Y = 1;
            obj = ScrollCaptureCallbackC2628f.m3620a(this.f8115Z, scrollCaptureSession, c7544i, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        this.f8118q0.m17405p(AbstractC14334L.m15614C((C7544i) obj));
        return C17296C.f55119a;
    }
}
