package p838jj;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC7841A0;
import p769gj.C14183y;
import p791hj.InterfaceC14521d;
import p791hj.ViewOnAttachStateChangeListenerC14519b;

/* JADX INFO: renamed from: jj.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C16231l {

    /* JADX INFO: renamed from: a */
    public final Object f50349a;

    /* JADX INFO: renamed from: b */
    public final C14183y f50350b;

    /* JADX INFO: renamed from: c */
    public final Dialog f50351c;

    /* JADX INFO: renamed from: d */
    public final Object f50352d;

    /* JADX INFO: renamed from: e */
    public String f50353e;

    public C16231l(Object modalRendering, C14183y viewEnvironment, Dialog dialog, Object obj) {
        AbstractC16544l.m18094g(modalRendering, "modalRendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        this.f50349a = modalRendering;
        this.f50350b = viewEnvironment;
        this.f50351c = dialog;
        this.f50352d = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m17808a() {
        Dialog dialog = this.f50351c;
        Window window = dialog.getWindow();
        View decorView = window == null ? null : window.getDecorView();
        if (decorView != null) {
            InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(decorView);
            InterfaceC14521d interfaceC14521d = interfaceC11112uM8090b instanceof InterfaceC14521d ? (InterfaceC14521d) interfaceC11112uM8090b : null;
            if (interfaceC14521d != null) {
                ((ViewOnAttachStateChangeListenerC14519b) interfaceC14521d).m16007b();
            }
        }
        dialog.dismiss();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C16231l.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            return AbstractC16544l.m18089b(this.f50351c, ((C16231l) obj).f50351c);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.ModalContainer.DialogRef<*>");
    }

    public final int hashCode() {
        return this.f50351c.hashCode();
    }
}
