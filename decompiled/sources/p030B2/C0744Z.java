package p030B2;

import android.view.ViewParent;
import kotlin.jvm.internal.AbstractC16541i;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: B2.Z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0744Z extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C0744Z f2112Y = new C0744Z(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
