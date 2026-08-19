package p1014t1;

import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: t1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C19741r extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62505Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19742s f62506Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19741r(C19742s c19742s, int i10) {
        super(1);
        this.f62505Y = i10;
        this.f62506Z = c19742s;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f62505Y) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                InterfaceC1436k interfaceC1436k = this.f62506Z.f62507Y;
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(motionEvent);
                    return C17296C.f55119a;
                }
                AbstractC16544l.m18103p("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                InterfaceC1436k interfaceC1436k2 = this.f62506Z.f62507Y;
                if (interfaceC1436k2 != null) {
                    interfaceC1436k2.invoke(motionEvent2);
                    return C17296C.f55119a;
                }
                AbstractC16544l.m18103p("onTouchEvent");
                throw null;
        }
    }
}
