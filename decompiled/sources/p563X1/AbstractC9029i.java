package p563X1;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p650ui.draw.AbstractC10861a;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.compose.p650ui.node.Owner;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p003A1.AbstractC0223Y1;
import p003A1.AbstractC0240d0;
import p025An.AbstractC0575H;
import p030B2.C0781s;
import p030B2.InterfaceC0779r;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1001s1.C19434d;
import p1001s1.C19437g;
import p1014t1.C19742s;
import p1047un.C20393b;
import p1140z1.AbstractC21690f;
import p1140z1.C21658D;
import p1140z1.C21691f0;
import p1140z1.InterfaceC21689e0;
import p156G1.AbstractC2965l;
import p183H4.InterfaceC3232g;
import p329N3.RunnableC5611a;
import p349O0.AbstractC6025r;
import p349O0.InterfaceC6009j;
import p392Q0.C6546d;
import p402Qc.C6593i;
import p482Tg.C7448e;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8104h6;
import p523V9.AbstractC8111i5;
import p530Vi.AbstractC8301I;
import p552Wg.C8847i;
import p571X9.AbstractC9125E4;
import p571X9.AbstractC9394x4;
import p586Y0.C9570v;
import p586Y0.C9571w;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p692d0.C12948A;
import p759g1.C13800b;

/* JADX INFO: renamed from: X1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9029i extends ViewGroup implements InterfaceC0779r, InterfaceC6009j, InterfaceC21689e0 {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC3232g f27545A0;

    /* JADX INFO: renamed from: B0 */
    public final C9028h f27546B0;

    /* JADX INFO: renamed from: C0 */
    public final C9028h f27547C0;

    /* JADX INFO: renamed from: D0 */
    public InterfaceC1436k f27548D0;

    /* JADX INFO: renamed from: E0 */
    public final int[] f27549E0;

    /* JADX INFO: renamed from: F0 */
    public int f27550F0;

    /* JADX INFO: renamed from: G0 */
    public int f27551G0;

    /* JADX INFO: renamed from: H0 */
    public final C0781s f27552H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f27553I0;

    /* JADX INFO: renamed from: J0 */
    public final C21658D f27554J0;

    /* JADX INFO: renamed from: o0 */
    public final C19434d f27555o0;

    /* JADX INFO: renamed from: p0 */
    public final View f27556p0;

    /* JADX INFO: renamed from: q0 */
    public final Owner f27557q0;

    /* JADX INFO: renamed from: r0 */
    public InterfaceC1426a f27558r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f27559s0;

    /* JADX INFO: renamed from: t0 */
    public InterfaceC1426a f27560t0;

    /* JADX INFO: renamed from: u0 */
    public InterfaceC1426a f27561u0;

    /* JADX INFO: renamed from: v0 */
    public InterfaceC10459q f27562v0;

    /* JADX INFO: renamed from: w0 */
    public InterfaceC1436k f27563w0;

    /* JADX INFO: renamed from: x0 */
    public InterfaceC7537b f27564x0;

    /* JADX INFO: renamed from: y0 */
    public InterfaceC1436k f27565y0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC11112u f27566z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9029i(Context context, AbstractC6025r abstractC6025r, int i10, C19434d c19434d, View view, Owner owner) {
        super(context);
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        this.f27555o0 = c19434d;
        this.f27556p0 = view;
        this.f27557q0 = owner;
        if (abstractC6025r != null) {
            LinkedHashMap linkedHashMap = AbstractC0223Y1.f851a;
            setTag(R.id.androidx_compose_ui_view_composition_context, abstractC6025r);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.f27558r0 = C9027g.f27541p0;
        this.f27560t0 = C9027g.f27540o0;
        this.f27561u0 = C9027g.f27539Z;
        C10456n c10456n = C10456n.f30959Y;
        this.f27562v0 = c10456n;
        this.f27564x0 = AbstractC9394x4.m9976a();
        C9037q c9037q = (C9037q) this;
        this.f27546B0 = new C9028h(c9037q, i12);
        this.f27547C0 = new C9028h(c9037q, i13);
        this.f27549E0 = new int[2];
        this.f27550F0 = Integer.MIN_VALUE;
        this.f27551G0 = Integer.MIN_VALUE;
        this.f27552H0 = new C0781s(0);
        C21658D c21658d = new C21658D(false, 3, 0);
        c21658d.f68659v0 = c9037q;
        InterfaceC10459q interfaceC10459qM3789a = AbstractC2965l.m3789a(AbstractC10866a.m11313a(c10456n, AbstractC9031k.f27567a, c19434d), true, C9021a.f27521p0);
        C19742s c19742s = new C19742s();
        c19742s.f62507Y = new C9023c(c9037q, i12);
        C20393b c20393b = new C20393b();
        C20393b c20393b2 = c19742s.f62508Z;
        if (c20393b2 != null) {
            c20393b2.f64501Z = null;
        }
        c19742s.f62508Z = c20393b;
        c20393b.f64501Z = c19742s;
        setOnRequestDisallowInterceptTouchEvent$ui_release(c20393b);
        InterfaceC10459q interfaceC10459qM11318d = AbstractC10868a.m11318d(AbstractC10861a.m11295a(interfaceC10459qM3789a.mo428M(c19742s), new C7448e(c9037q, c21658d, c9037q, 7)), new C9022b(c9037q, c21658d, i11));
        c21658d.m22069y0(this.f27562v0.mo428M(interfaceC10459qM11318d));
        this.f27563w0 = new C8847i(c21658d, i11, interfaceC10459qM11318d);
        c21658d.m22063v0(this.f27564x0);
        this.f27565y0 = new C6593i(c21658d, 24);
        c21658d.f68644O0 = new C9022b(c9037q, c21658d, i13);
        c21658d.f68645P0 = new C9023c(c9037q, i13);
        c21658d.m22067x0(new C9024d(c9037q, i13, c21658d));
        this.f27554J0 = c21658d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C21691f0 getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return this.f27557q0.getSnapshotObserver();
        }
        AbstractC8111i5.m8592c("Expected AndroidViewHolder to be attached when observing reads.");
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static final int m9598k(C9037q c9037q, int i10, int i11, int i12) {
        if (i12 >= 0 || i10 == i11) {
            return View.MeasureSpec.makeMeasureSpec(AbstractC8301I.m8921l(i12, i10, i11), 1073741824);
        }
        if (i12 != -2 || i11 == Integer.MAX_VALUE) {
            return (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    @Override // p349O0.InterfaceC6009j
    /* JADX INFO: renamed from: a */
    public final void mo6477a() {
        this.f27561u0.invoke();
    }

    @Override // p349O0.InterfaceC6009j
    /* JADX INFO: renamed from: b */
    public final void mo6478b() {
        this.f27560t0.invoke();
        removeAllViewsInLayout();
    }

    @Override // p030B2.InterfaceC0779r
    /* JADX INFO: renamed from: c */
    public final void mo1748c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f27556p0.isNestedScrollingEnabled()) {
            float f10 = i10;
            float f11 = -1;
            long jM8536b = AbstractC8088f6.m8536b(f10 * f11, i11 * f11);
            long jM8536b2 = AbstractC8088f6.m8536b(i12 * f11, i13 * f11);
            int i15 = i14 == 0 ? 1 : 2;
            C19437g c19437g = this.f27555o0.f61623a;
            C19437g c19437g2 = null;
            if (c19437g != null && c19437g.f30972y0) {
                c19437g2 = (C19437g) AbstractC21690f.m22206k(c19437g);
            }
            C19437g c19437g3 = c19437g2;
            long jMo4041x = c19437g3 != null ? c19437g3.mo4041x(jM8536b, i15, jM8536b2) : 0L;
            iArr[0] = AbstractC0240d0.m793d(C13800b.m15306g(jMo4041x));
            iArr[1] = AbstractC0240d0.m793d(C13800b.m15307h(jMo4041x));
        }
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: d */
    public final void mo1742d(View view, int i10, int i11, int i12, int i13, int i14) {
        if (this.f27556p0.isNestedScrollingEnabled()) {
            float f10 = i10;
            float f11 = -1;
            long jM8536b = AbstractC8088f6.m8536b(f10 * f11, i11 * f11);
            long jM8536b2 = AbstractC8088f6.m8536b(i12 * f11, i13 * f11);
            int i15 = i14 == 0 ? 1 : 2;
            C19437g c19437g = this.f27555o0.f61623a;
            C19437g c19437g2 = null;
            if (c19437g != null && c19437g.f30972y0) {
                c19437g2 = (C19437g) AbstractC21690f.m22206k(c19437g);
            }
            C19437g c19437g3 = c19437g2;
            if (c19437g3 != null) {
                c19437g3.mo4041x(jM8536b, i15, jM8536b2);
            }
        }
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: e */
    public final boolean mo1743e(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: f */
    public final void mo1744f(View view, View view2, int i10, int i11) {
        C0781s c0781s = this.f27552H0;
        if (i11 == 1) {
            c0781s.f2193c = i10;
        } else {
            c0781s.f2192b = i10;
        }
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: g */
    public final void mo1745g(View view, int i10) {
        C0781s c0781s = this.f27552H0;
        if (i10 == 1) {
            c0781s.f2193c = 0;
        } else {
            c0781s.f2192b = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f27549E0;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC7537b getDensity() {
        return this.f27564x0;
    }

    public final View getInteropView() {
        return this.f27556p0;
    }

    public final C21658D getLayoutNode() {
        return this.f27554J0;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f27556p0.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC11112u getLifecycleOwner() {
        return this.f27566z0;
    }

    public final InterfaceC10459q getModifier() {
        return this.f27562v0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0781s c0781s = this.f27552H0;
        return c0781s.f2193c | c0781s.f2192b;
    }

    public final InterfaceC1436k getOnDensityChanged$ui_release() {
        return this.f27565y0;
    }

    public final InterfaceC1436k getOnModifierChanged$ui_release() {
        return this.f27563w0;
    }

    public final InterfaceC1436k getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f27548D0;
    }

    public final InterfaceC1426a getRelease() {
        return this.f27561u0;
    }

    public final InterfaceC1426a getReset() {
        return this.f27560t0;
    }

    public final InterfaceC3232g getSavedStateRegistryOwner() {
        return this.f27545A0;
    }

    public final InterfaceC1426a getUpdate() {
        return this.f27558r0;
    }

    public final View getView() {
        return this.f27556p0;
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: h */
    public final void mo1746h(View view, int i10, int i11, int[] iArr, int i12) {
        if (this.f27556p0.isNestedScrollingEnabled()) {
            float f10 = i10;
            float f11 = -1;
            long jM8536b = AbstractC8088f6.m8536b(f10 * f11, i11 * f11);
            int i13 = i12 == 0 ? 1 : 2;
            C19437g c19437g = this.f27555o0.f61623a;
            C19437g c19437g2 = null;
            if (c19437g != null && c19437g.f30972y0) {
                c19437g2 = (C19437g) AbstractC21690f.m22206k(c19437g);
            }
            long jMo4038K = c19437g2 != null ? c19437g2.mo4038K(i13, jM8536b) : 0L;
            iArr[0] = AbstractC0240d0.m793d(C13800b.m15306g(jMo4038K));
            iArr[1] = AbstractC0240d0.m793d(C13800b.m15307h(jMo4038K));
        }
    }

    @Override // p349O0.InterfaceC6009j
    /* JADX INFO: renamed from: i */
    public final void mo6479i() {
        View view = this.f27556p0;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f27560t0.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f27553I0) {
            this.f27554J0.m22017O();
            return null;
        }
        this.f27556p0.postOnAnimation(new RunnableC5611a(this.f27547C0, 17));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f27556p0.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27546B0.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f27553I0) {
            this.f27554J0.m22017O();
        } else {
            this.f27556p0.postOnAnimation(new RunnableC5611a(this.f27547C0, 17));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0075 A[Catch: all -> 0x0093, LOOP:1: B:12:0x0035->B:22:0x0075, LOOP_END, TryCatch #0 {all -> 0x0093, blocks: (B:4:0x000e, B:6:0x0016, B:23:0x007a, B:28:0x0085, B:33:0x0095, B:30:0x008a, B:9:0x0029, B:12:0x0035, B:14:0x004a, B:16:0x0056, B:18:0x0060, B:19:0x006d, B:22:0x0075, B:34:0x0099), top: B:39:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x007a A[EDGE_INSN: B:46:0x007a->B:23:0x007a BREAK  A[LOOP:1: B:12:0x0035->B:22:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        C9571w c9571w = getSnapshotObserver().f68847a;
        synchronized (c9571w.f28800f) {
            try {
                C6546d c6546d = c9571w.f28800f;
                int i11 = c6546d.f21184o0;
                int i12 = 0;
                int i13 = 0;
                while (i12 < i11) {
                    C9570v c9570v = (C9570v) c6546d.f21182Y[i12];
                    C12948A c12948a = (C12948A) c9570v.f28788f.m14621g(this);
                    if (c12948a == null) {
                        i10 = i12;
                    } else {
                        Object[] objArr = c12948a.f41110b;
                        int[] iArr = c12948a.f41111c;
                        long[] jArr = c12948a.f41109a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j10 = jArr[i14];
                                i10 = i12;
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8;
                                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        if ((j10 & 255) < 128) {
                                            int i18 = (i14 << 3) + i17;
                                            Object obj = objArr[i18];
                                            int i19 = iArr[i18];
                                            c9570v.m10119d(this, obj);
                                            i15 = 8;
                                        }
                                        j10 >>= i15;
                                    }
                                    if (i16 != i15) {
                                        break;
                                    }
                                    if (i14 != length) {
                                        break;
                                    }
                                    i14++;
                                    i12 = i10;
                                } else if (i14 != length) {
                                    break;
                                    break;
                                } else {
                                    i14++;
                                    i12 = i10;
                                }
                            }
                        } else {
                            i10 = i12;
                        }
                    }
                    if (!(c9570v.f28788f.f41127e != 0)) {
                        i13++;
                    } else if (i13 > 0) {
                        Object[] objArr2 = c6546d.f21182Y;
                        objArr2[i10 - i13] = objArr2[i10];
                    }
                    i12 = i10 + 1;
                }
                int i20 = i11 - i13;
                Arrays.fill(c6546d.f21182Y, i20, i11, (Object) null);
                c6546d.f21184o0 = i20;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        this.f27556p0.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f27556p0;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f27550F0 = i10;
        this.f27551G0 = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z6) {
        if (!this.f27556p0.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC0575H.m1156D(this.f27555o0.m20514c(), null, null, new C9025e(z6, this, AbstractC9125E4.m9659a(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if (!this.f27556p0.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC0575H.m1156D(this.f27555o0.m20514c(), null, null, new C9026f(this, AbstractC9125E4.m9659a(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        InterfaceC1436k interfaceC1436k = this.f27548D0;
        if (interfaceC1436k != null) {
            interfaceC1436k.invoke(Boolean.valueOf(z6));
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    public final void setDensity(InterfaceC7537b interfaceC7537b) {
        if (interfaceC7537b != this.f27564x0) {
            this.f27564x0 = interfaceC7537b;
            InterfaceC1436k interfaceC1436k = this.f27565y0;
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(interfaceC7537b);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC11112u interfaceC11112u) {
        if (interfaceC11112u != this.f27566z0) {
            this.f27566z0 = interfaceC11112u;
            AbstractC7841A0.m8092d(this, interfaceC11112u);
        }
    }

    public final void setModifier(InterfaceC10459q interfaceC10459q) {
        if (interfaceC10459q != this.f27562v0) {
            this.f27562v0 = interfaceC10459q;
            InterfaceC1436k interfaceC1436k = this.f27563w0;
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(interfaceC10459q);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC1436k interfaceC1436k) {
        this.f27565y0 = interfaceC1436k;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC1436k interfaceC1436k) {
        this.f27563w0 = interfaceC1436k;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC1436k interfaceC1436k) {
        this.f27548D0 = interfaceC1436k;
    }

    public final void setRelease(InterfaceC1426a interfaceC1426a) {
        this.f27561u0 = interfaceC1426a;
    }

    public final void setReset(InterfaceC1426a interfaceC1426a) {
        this.f27560t0 = interfaceC1426a;
    }

    public final void setSavedStateRegistryOwner(InterfaceC3232g interfaceC3232g) {
        if (interfaceC3232g != this.f27545A0) {
            this.f27545A0 = interfaceC3232g;
            AbstractC8104h6.m8585d(this, interfaceC3232g);
        }
    }

    public final void setUpdate(InterfaceC1426a interfaceC1426a) {
        this.f27558r0 = interfaceC1426a;
        this.f27559s0 = true;
        this.f27546B0.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // p1140z1.InterfaceC21689e0
    /* JADX INFO: renamed from: u */
    public final boolean mo874u() {
        return isAttachedToWindow();
    }
}
