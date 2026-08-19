package p003A1;

import android.os.Handler;
import android.view.ViewTreeObserver;
import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16544l;
import p329N3.RunnableC5611a;
import p435Rl.C6934r;

/* JADX INFO: renamed from: A1.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewTreeObserverOnScrollChangedListenerC0265l implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f976a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f977b;

    public /* synthetic */ ViewTreeObserverOnScrollChangedListenerC0265l(Object obj, int i10) {
        this.f976a = i10;
        this.f977b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        Object obj = this.f977b;
        switch (this.f976a) {
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
