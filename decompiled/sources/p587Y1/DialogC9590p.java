package p587Y1;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.openai.chatgpt.R;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.C0164E1;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p523V9.AbstractC8170q0;
import p544W9.AbstractC8742y;
import p772h.DialogC14229k;

/* JADX INFO: renamed from: Y1.p */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC9590p extends DialogC14229k {

    /* JADX INFO: renamed from: p0 */
    public InterfaceC1426a f28854p0;

    /* JADX INFO: renamed from: q0 */
    public C9588n f28855q0;

    /* JADX INFO: renamed from: r0 */
    public final View f28856r0;

    /* JADX INFO: renamed from: s0 */
    public final C9587m f28857s0;

    /* JADX INFO: renamed from: t0 */
    public final int f28858t0;

    public DialogC9590p(InterfaceC1426a interfaceC1426a, C9588n c9588n, View view, EnumC7546k enumC7546k, InterfaceC7537b interfaceC7537b, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || c9588n.f28853e) ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f28854p0 = interfaceC1426a;
        this.f28855q0 = c9588n;
        this.f28856r0 = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f28858t0 = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC8170q0.m8754c(window, this.f28855q0.f28853e);
        C9587m c9587m = new C9587m(getContext(), window);
        c9587m.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c9587m.setClipChildren(false);
        c9587m.setElevation(interfaceC7537b.mo7864b0(f10));
        c9587m.setOutlineProvider(new C0164E1(2));
        this.f28857s0 = c9587m;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m10134e(viewGroup);
        }
        setContentView(c9587m);
        AbstractC7841A0.m8092d(c9587m, AbstractC7841A0.m8090b(view));
        ViewTreeViewModelStoreOwner.m12148b(c9587m, ViewTreeViewModelStoreOwner.m12147a(view));
        AbstractC8104h6.m8585d(c9587m, AbstractC8104h6.m8583b(view));
        m10135f(this.f28854p0, this.f28855q0, enumC7546k);
        AbstractC8742y.m9485b(this.f44682o0, this, new C9575a(this, 1));
    }

    /* JADX INFO: renamed from: e */
    public static final void m10134e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C9587m) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m10134e(viewGroup2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10135f(InterfaceC1426a interfaceC1426a, C9588n c9588n, EnumC7546k enumC7546k) {
        Window window;
        this.f28854p0 = interfaceC1426a;
        this.f28855q0 = c9588n;
        int i10 = c9588n.f28851c;
        boolean zM10130b = AbstractC9582h.m10130b(this.f28856r0);
        int iM24h = AbstractC0010F.m24h(i10);
        int i11 = 0;
        if (iM24h != 0) {
            if (iM24h == 1) {
                zM10130b = true;
            } else {
                if (iM24h != 2) {
                    throw new C0644w();
                }
                zM10130b = false;
            }
        }
        Window window2 = getWindow();
        AbstractC16544l.m18091d(window2);
        window2.setFlags(zM10130b ? 8192 : -8193, 8192);
        int iOrdinal = enumC7546k.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new C0644w();
            }
            i11 = 1;
        }
        C9587m c9587m = this.f28857s0;
        c9587m.setLayoutDirection(i11);
        boolean z6 = c9588n.f28852d;
        if (z6 && !c9587m.f28847y0 && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        c9587m.f28847y0 = z6;
        if (Build.VERSION.SDK_INT < 31) {
            if (c9588n.f28853e) {
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(this.f28858t0);
                    return;
                }
                return;
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.f28855q0.f28850b) {
            this.f28854p0.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
