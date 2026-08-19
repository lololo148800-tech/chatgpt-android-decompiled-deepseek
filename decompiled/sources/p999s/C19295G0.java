package p999s;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p588Y2.C9642z;
import p976r.C18816n;
import p976r.MenuC18814l;

/* JADX INFO: renamed from: s.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19295G0 extends C19285B0 implements InterfaceC19287C0 {

    /* JADX INFO: renamed from: Q0 */
    public static final Method f61138Q0;

    /* JADX INFO: renamed from: P0 */
    public C9642z f61139P0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f61138Q0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p999s.InterfaceC19287C0
    /* JADX INFO: renamed from: K */
    public final void mo10199K(MenuC18814l menuC18814l, C18816n c18816n) {
        C9642z c9642z = this.f61139P0;
        if (c9642z != null) {
            c9642z.mo10199K(menuC18814l, c18816n);
        }
    }

    @Override // p999s.C19285B0
    /* JADX INFO: renamed from: o */
    public final C19369o0 mo20355o(Context context, boolean z6) {
        C19293F0 c19293f0 = new C19293F0(context, z6);
        c19293f0.setHoverListener(this);
        return c19293f0;
    }

    @Override // p999s.InterfaceC19287C0
    /* JADX INFO: renamed from: u */
    public final void mo10221u(MenuC18814l menuC18814l, C18816n c18816n) {
        C9642z c9642z = this.f61139P0;
        if (c9642z != null) {
            c9642z.mo10221u(menuC18814l, c18816n);
        }
    }
}
