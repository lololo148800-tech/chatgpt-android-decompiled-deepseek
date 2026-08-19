package p636a2;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.RunnableC0156C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: a2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C10478o extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31035Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10479p f31036Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10478o(C10479p c10479p, int i10) {
        super(1);
        this.f31035Y = i10;
        this.f31036Z = c10479p;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f31035Y) {
            case 0:
                InterfaceC1426a it = (InterfaceC1426a) obj;
                AbstractC16544l.m18094g(it, "it");
                if (AbstractC16544l.m18089b(Looper.myLooper(), Looper.getMainLooper())) {
                    it.invoke();
                } else {
                    C10479p c10479p = this.f31036Z;
                    Handler handler = c10479p.f31038Z;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        c10479p.f31038Z = handler;
                    }
                    handler.post(new RunnableC0156C(2, it));
                }
                break;
            default:
                C17296C noName_0 = (C17296C) obj;
                AbstractC16544l.m18094g(noName_0, "$noName_0");
                this.f31036Z.f31040p0 = true;
                break;
        }
        return C17296C.f55119a;
    }
}
