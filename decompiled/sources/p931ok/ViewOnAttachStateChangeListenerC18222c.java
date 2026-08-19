package p931ok;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0738T;

/* JADX INFO: renamed from: ok.c */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC18222c implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58069Y;

    public /* synthetic */ ViewOnAttachStateChangeListenerC18222c(int i10) {
        this.f58069Y = i10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v2) {
        switch (this.f58069Y) {
            case 0:
                AbstractC16544l.m18094g(v2, "v");
                v2.removeOnAttachStateChangeListener(this);
                v2.requestApplyInsets();
                break;
            default:
                v2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                AbstractC0728I.m1543c(v2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v2) {
        switch (this.f58069Y) {
            case 0:
                AbstractC16544l.m18094g(v2, "v");
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m19730a(View view) {
    }
}
