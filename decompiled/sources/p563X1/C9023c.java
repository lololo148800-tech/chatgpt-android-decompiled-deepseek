package p563X1;

import android.view.MotionEvent;
import androidx.compose.p650ui.node.Owner;
import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0286s;
import p049Bm.InterfaceC1436k;
import p392Q0.C6546d;

/* JADX INFO: renamed from: X1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9023c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27527Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9037q f27528Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9023c(C9037q c9037q, int i10) {
        super(1);
        this.f27527Y = i10;
        this.f27528Z = c9037q;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f27527Y) {
            case 0:
                Owner owner = (Owner) obj;
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                C9037q c9037q = this.f27528Z;
                if (androidComposeView != null) {
                    C0286s c0286s = new C0286s(androidComposeView, 1, c9037q);
                    C6546d c6546d = androidComposeView.f32753B1;
                    if (!c6546d.m7105j(c0286s)) {
                        c6546d.m7099c(c0286s);
                    }
                }
                c9037q.removeAllViewsInLayout();
                return C17296C.f55119a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                C9037q c9037q2 = this.f27528Z;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = c9037q2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = c9037q2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
