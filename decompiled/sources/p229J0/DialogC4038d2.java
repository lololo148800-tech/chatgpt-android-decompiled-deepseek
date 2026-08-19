package p229J0;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.openai.chatgpt.R;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.C0164E1;
import p025An.C0644w;
import p030B2.C0717A0;
import p030B2.C0721C0;
import p030B2.C0723D0;
import p030B2.C0795z;
import p030B2.C0796z0;
import p049Bm.InterfaceC1426a;
import p153Fn.C2925c;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p523V9.AbstractC8170q0;
import p523V9.AbstractC8186s0;
import p544W9.AbstractC8742y;
import p758g0.C13756d;
import p772h.DialogC14229k;

/* JADX INFO: renamed from: J0.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC4038d2 extends DialogC14229k {

    /* JADX INFO: renamed from: p0 */
    public InterfaceC1426a f12713p0;

    /* JADX INFO: renamed from: q0 */
    public C4158x2 f12714q0;

    /* JADX INFO: renamed from: r0 */
    public final View f12715r0;

    /* JADX INFO: renamed from: s0 */
    public final C4026b2 f12716s0;

    public DialogC4038d2(InterfaceC1426a interfaceC1426a, C4158x2 c4158x2, View view, EnumC7546k enumC7546k, InterfaceC7537b interfaceC7537b, UUID uuid, C13756d c13756d, C2925c c2925c, boolean z6) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f12713p0 = interfaceC1426a;
        this.f12714q0 = c4158x2;
        this.f12715r0 = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC8170q0.m8754c(window, false);
        Context context = getContext();
        this.f12714q0.getClass();
        C4026b2 c4026b2 = new C4026b2(context, window, true, this.f12713p0, c13756d, c2925c);
        c4026b2.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c4026b2.setClipChildren(false);
        c4026b2.setElevation(interfaceC7537b.mo7864b0(f10));
        c4026b2.setOutlineProvider(new C0164E1(1));
        this.f12716s0 = c4026b2;
        setContentView(c4026b2);
        AbstractC7841A0.m8092d(c4026b2, AbstractC7841A0.m8090b(view));
        ViewTreeViewModelStoreOwner.m12148b(c4026b2, ViewTreeViewModelStoreOwner.m12147a(view));
        AbstractC8104h6.m8585d(c4026b2, AbstractC8104h6.m8583b(view));
        m4730e(this.f12713p0, this.f12714q0, enumC7546k);
        View decorView = window.getDecorView();
        if (Build.VERSION.SDK_INT >= 30) {
            new C0795z(decorView, 3).f2210o0 = decorView;
        }
        int i10 = Build.VERSION.SDK_INT;
        AbstractC8186s0 c0723d0 = i10 >= 35 ? new C0723D0(window) : i10 >= 30 ? new C0721C0(window) : i10 >= 26 ? new C0717A0(window) : new C0796z0(window);
        boolean z10 = !z6;
        c0723d0.mo1532c(z10);
        c0723d0.mo1489b(z10);
        AbstractC8742y.m9485b(this.f44682o0, this, new C4032c2(this, 0));
    }

    /* JADX INFO: renamed from: e */
    public final void m4730e(InterfaceC1426a interfaceC1426a, C4158x2 c4158x2, EnumC7546k enumC7546k) {
        this.f12713p0 = interfaceC1426a;
        this.f12714q0 = c4158x2;
        c4158x2.getClass();
        ViewGroup.LayoutParams layoutParams = this.f12715r0.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i10 = 1;
        boolean z6 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iM24h = AbstractC0010F.m24h(1);
        if (iM24h != 0) {
            if (iM24h == 1) {
                z6 = true;
            } else {
                if (iM24h != 2) {
                    throw new C0644w();
                }
                z6 = false;
            }
        }
        Window window = getWindow();
        AbstractC16544l.m18091d(window);
        window.setFlags(z6 ? 8192 : -8193, 8192);
        int iOrdinal = enumC7546k.ordinal();
        if (iOrdinal == 0) {
            i10 = 0;
        } else if (iOrdinal != 1) {
            throw new C0644w();
        }
        this.f12716s0.setLayoutDirection(i10);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f12713p0.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
