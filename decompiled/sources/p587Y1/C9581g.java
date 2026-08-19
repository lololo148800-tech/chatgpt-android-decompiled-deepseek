package p587Y1;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.RunnableC0156C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21098s;
import p492U1.C7545j;

/* JADX INFO: renamed from: Y1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9581g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28837Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9592r f28838Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9581g(C9592r c9592r, int i10) {
        super(1);
        this.f28837Y = i10;
        this.f28838Z = c9592r;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f28837Y) {
            case 0:
                InterfaceC21098s interfaceC21098sMo21527x = ((InterfaceC21098s) obj).mo21527x();
                AbstractC16544l.m18091d(interfaceC21098sMo21527x);
                this.f28838Z.m10140n(interfaceC21098sMo21527x);
                break;
            case 1:
                C7545j c7545j = new C7545j(((C7545j) obj).f23903a);
                C9592r c9592r = this.f28838Z;
                c9592r.m22423setPopupContentSizefhxjrPA(c7545j);
                c9592r.m10141o();
                break;
            default:
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj;
                C9592r c9592r2 = this.f28838Z;
                Handler handler = c9592r2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1426a.invoke();
                } else {
                    Handler handler2 = c9592r2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0156C(1, interfaceC1426a));
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }
}
