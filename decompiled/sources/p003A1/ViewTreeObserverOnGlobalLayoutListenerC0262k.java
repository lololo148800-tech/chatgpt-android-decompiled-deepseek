package p003A1;

import android.os.Handler;
import android.view.ViewTreeObserver;
import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16544l;
import p329N3.RunnableC5611a;
import p435Rl.C6934r;

/* JADX INFO: renamed from: A1.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalLayoutListenerC0262k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f970Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f971Z;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0262k(Object obj, int i10) {
        this.f970Y = i10;
        this.f971Z = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object obj = this.f971Z;
        switch (this.f970Y) {
            case 0:
                Class cls = AndroidComposeView.f32748K1;
                ((AndroidComposeView) obj).m11338J();
                break;
            default:
                C6934r this$0 = (C6934r) obj;
                AbstractC16544l.m18094g(this$0, "this$0");
                Handler handler = this$0.f22209c;
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed(new RunnableC5611a(this$0, 7), 2000L);
                break;
        }
    }
}
