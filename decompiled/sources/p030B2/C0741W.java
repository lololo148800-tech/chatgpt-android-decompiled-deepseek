package p030B2;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: B2.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0741W extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C0741W f2105Y = new C0741W(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new C0742X(viewGroup, 0);
        }
        return null;
    }
}
