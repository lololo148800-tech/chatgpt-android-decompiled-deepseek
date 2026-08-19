package p587Y1;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.openai.chatgpt.R;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16524A;
import p003A1.AbstractC0231b;
import p003A1.C0164E1;
import p003A1.C0178J0;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21098s;
import p349O0.AbstractC6025r;
import p349O0.C5944C;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p437Rn.C6949g;
import p492U1.C7544i;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;
import p586Y0.C9555g;
import p586Y0.C9571w;
import p759g1.C13800b;

/* JADX INFO: renamed from: Y1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9592r extends AbstractC0231b {

    /* JADX INFO: renamed from: A0 */
    public final C9594t f28864A0;

    /* JADX INFO: renamed from: B0 */
    public final WindowManager f28865B0;

    /* JADX INFO: renamed from: C0 */
    public final WindowManager.LayoutParams f28866C0;

    /* JADX INFO: renamed from: D0 */
    public InterfaceC9595u f28867D0;

    /* JADX INFO: renamed from: E0 */
    public EnumC7546k f28868E0;

    /* JADX INFO: renamed from: F0 */
    public final C6002f0 f28869F0;

    /* JADX INFO: renamed from: G0 */
    public final C6002f0 f28870G0;

    /* JADX INFO: renamed from: H0 */
    public C7544i f28871H0;

    /* JADX INFO: renamed from: I0 */
    public final C5944C f28872I0;

    /* JADX INFO: renamed from: J0 */
    public final Rect f28873J0;

    /* JADX INFO: renamed from: K0 */
    public final C9571w f28874K0;

    /* JADX INFO: renamed from: L0 */
    public Object f28875L0;

    /* JADX INFO: renamed from: M0 */
    public final C6002f0 f28876M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f28877N0;

    /* JADX INFO: renamed from: O0 */
    public final int[] f28878O0;

    /* JADX INFO: renamed from: w0 */
    public InterfaceC1426a f28879w0;

    /* JADX INFO: renamed from: x0 */
    public C9596v f28880x0;

    /* JADX INFO: renamed from: y0 */
    public String f28881y0;

    /* JADX INFO: renamed from: z0 */
    public final View f28882z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9592r(InterfaceC1426a interfaceC1426a, C9596v c9596v, String str, View view, InterfaceC7537b interfaceC7537b, InterfaceC9595u interfaceC9595u, UUID uuid) {
        super(view.getContext());
        C9594t c9593s = Build.VERSION.SDK_INT >= 29 ? new C9593s() : new C9594t();
        this.f28879w0 = interfaceC1426a;
        this.f28880x0 = c9596v;
        this.f28881y0 = str;
        this.f28882z0 = view;
        this.f28864A0 = c9593s;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f28865B0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C9596v c9596v2 = this.f28880x0;
        boolean zM10130b = AbstractC9582h.m10130b(view);
        boolean z6 = c9596v2.f28884b;
        int i10 = c9596v2.f28883a;
        if (z6 && zM10130b) {
            i10 |= 8192;
        } else if (z6 && !zM10130b) {
            i10 &= -8193;
        }
        layoutParams.flags = i10;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f28866C0 = layoutParams;
        this.f28867D0 = interfaceC9595u;
        this.f28868E0 = EnumC7546k.f23904Y;
        C5975S c5975s = C5975S.f19448r0;
        this.f28869F0 = C5997d.m6430Q(null, c5975s);
        this.f28870G0 = C5997d.m6430Q(null, c5975s);
        this.f28872I0 = C5997d.m6421H(new C6949g(this, 15));
        this.f28873J0 = new Rect();
        this.f28874K0 = new C9571w(new C9581g(this, 2));
        setId(android.R.id.content);
        AbstractC7841A0.m8092d(this, AbstractC7841A0.m8090b(view));
        ViewTreeViewModelStoreOwner.m12148b(this, ViewTreeViewModelStoreOwner.m12147a(view));
        AbstractC8104h6.m8585d(this, AbstractC8104h6.m8583b(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC7537b.mo7864b0((float) 8));
        setOutlineProvider(new C0164E1(3));
        this.f28876M0 = C5997d.m6430Q(AbstractC9586l.f28844a, c5975s);
        this.f28878O0 = new int[2];
    }

    private final InterfaceC1439n getContent() {
        return (InterfaceC1439n) this.f28876M0.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC21098s getParentLayoutCoordinates() {
        return (InterfaceC21098s) this.f28870G0.getValue();
    }

    private final void setContent(InterfaceC1439n interfaceC1439n) {
        this.f28876M0.setValue(interfaceC1439n);
    }

    private final void setParentLayoutCoordinates(InterfaceC21098s interfaceC21098s) {
        this.f28870G0.setValue(interfaceC21098s);
    }

    @Override // p003A1.AbstractC0231b
    /* JADX INFO: renamed from: b */
    public final void mo564b(int i10, C6021p c6021p) {
        int i11;
        c6021p.m6526U(-857613600);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            getContent().invoke(c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(this, i10, 15);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f28880x0.f28885c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC1426a interfaceC1426a = this.f28879w0;
                if (interfaceC1426a != null) {
                    interfaceC1426a.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p003A1.AbstractC0231b
    /* JADX INFO: renamed from: g */
    public final void mo736g(boolean z6, int i10, int i11, int i12, int i13) {
        super.mo736g(z6, i10, i11, i12, i13);
        this.f28880x0.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f28866C0;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f28864A0.getClass();
        this.f28865B0.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f28872I0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f28866C0;
    }

    public final EnumC7546k getParentLayoutDirection() {
        return this.f28868E0;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C7545j m22422getPopupContentSizebOM6tXw() {
        return (C7545j) this.f28869F0.getValue();
    }

    public final InterfaceC9595u getPositionProvider() {
        return this.f28867D0;
    }

    @Override // p003A1.AbstractC0231b
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f28877N0;
    }

    public final String getTestTag() {
        return this.f28881y0;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // p003A1.AbstractC0231b
    /* JADX INFO: renamed from: h */
    public final void mo737h(int i10, int i11) {
        this.f28880x0.getClass();
        super.mo737h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    /* JADX INFO: renamed from: k */
    public final void m10137k(AbstractC6025r abstractC6025r, InterfaceC1439n interfaceC1439n) {
        setParentCompositionContext(abstractC6025r);
        setContent(interfaceC1439n);
        this.f28877N0 = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m10138l(InterfaceC1426a interfaceC1426a, C9596v c9596v, String str, EnumC7546k enumC7546k) {
        int i10;
        this.f28879w0 = interfaceC1426a;
        this.f28881y0 = str;
        if (!AbstractC16544l.m18089b(this.f28880x0, c9596v)) {
            c9596v.getClass();
            WindowManager.LayoutParams layoutParams = this.f28866C0;
            this.f28880x0 = c9596v;
            boolean zM10130b = AbstractC9582h.m10130b(this.f28882z0);
            boolean z6 = c9596v.f28884b;
            int i11 = c9596v.f28883a;
            if (z6 && zM10130b) {
                i11 |= 8192;
            } else if (z6 && !zM10130b) {
                i11 &= -8193;
            }
            layoutParams.flags = i11;
            this.f28864A0.getClass();
            this.f28865B0.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = enumC7546k.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new C0644w();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    /* JADX INFO: renamed from: m */
    public final void m10139m() {
        InterfaceC21098s parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo21522h()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo21524k = parentLayoutCoordinates.mo21524k();
            long jMo21520d = parentLayoutCoordinates.mo21520d(0L);
            long jM9631a = AbstractC9101A4.m9631a(Math.round(C13800b.m15306g(jMo21520d)), Math.round(C13800b.m15307h(jMo21520d)));
            int i10 = (int) (jM9631a >> 32);
            int i11 = (int) (jM9631a & 4294967295L);
            C7544i c7544i = new C7544i(i10, i11, ((int) (jMo21524k >> 32)) + i10, ((int) (jMo21524k & 4294967295L)) + i11);
            if (c7544i.equals(this.f28871H0)) {
                return;
            }
            this.f28871H0 = c7544i;
            m10141o();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m10140n(InterfaceC21098s interfaceC21098s) {
        setParentLayoutCoordinates(interfaceC21098s);
        m10139m();
    }

    /* JADX INFO: renamed from: o */
    public final void m10141o() {
        C7545j c7545jM22422getPopupContentSizebOM6tXw;
        C7544i c7544i = this.f28871H0;
        if (c7544i == null || (c7545jM22422getPopupContentSizebOM6tXw = m22422getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        C9594t c9594t = this.f28864A0;
        c9594t.getClass();
        View view = this.f28882z0;
        Rect rect = this.f28873J0;
        view.getWindowVisibleDisplayFrame(rect);
        long jM9643a = AbstractC9113C4.m9643a(rect.right - rect.left, rect.bottom - rect.top);
        C16524A c16524a = new C16524A();
        c16524a.f51261Y = 0L;
        this.f28874K0.m10123c(this, C9576b.f28825s0, new C9591q(c16524a, this, c7544i, jM9643a, c7545jM22422getPopupContentSizebOM6tXw.f23903a));
        WindowManager.LayoutParams layoutParams = this.f28866C0;
        long j10 = c16524a.f51261Y;
        layoutParams.x = (int) (j10 >> 32);
        layoutParams.y = (int) (j10 & 4294967295L);
        if (this.f28880x0.f28887e) {
            c9594t.mo10142a(this, (int) (jM9643a >> 32), (int) (jM9643a & 4294967295L));
        }
        this.f28865B0.updateViewLayout(this, layoutParams);
    }

    @Override // p003A1.AbstractC0231b, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28874K0.m10124d();
        if (!this.f28880x0.f28885c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f28875L0 == null) {
            this.f28875L0 = AbstractC9583i.m10131a(this.f28879w0);
        }
        AbstractC9583i.m10132b(this, this.f28875L0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9571w c9571w = this.f28874K0;
        C9555g c9555g = c9571w.f28801g;
        if (c9555g != null) {
            c9555g.dispose();
        }
        c9571w.m10122b();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC9583i.m10133c(this, this.f28875L0);
        }
        this.f28875L0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28880x0.f28886d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC1426a interfaceC1426a = this.f28879w0;
            if (interfaceC1426a != null) {
                interfaceC1426a.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC1426a interfaceC1426a2 = this.f28879w0;
        if (interfaceC1426a2 != null) {
            interfaceC1426a2.invoke();
        }
        return true;
    }

    public final void setParentLayoutDirection(EnumC7546k enumC7546k) {
        this.f28868E0 = enumC7546k;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m22423setPopupContentSizefhxjrPA(C7545j c7545j) {
        this.f28869F0.setValue(c7545j);
    }

    public final void setPositionProvider(InterfaceC9595u interfaceC9595u) {
        this.f28867D0 = interfaceC9595u;
    }

    public final void setTestTag(String str) {
        this.f28881y0 = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractC0231b getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}
