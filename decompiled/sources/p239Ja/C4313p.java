package p239Ja;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p003A1.ViewOnAttachStateChangeListenerC0171H;
import p030B2.AbstractC0738T;
import p056C2.AccessibilityManagerTouchExplorationStateChangeListenerC1508b;
import p228J.AbstractC3794B0;
import p523V9.AbstractC7979R3;
import p544W9.AbstractC8479G;
import p571X9.AbstractC9106B3;
import p658b5.C11242m;
import p999s.C19329Y;
import za.AbstractC21828k;

/* JADX INFO: renamed from: Ja.p */
/* JADX INFO: loaded from: classes.dex */
public final class C4313p extends LinearLayout {

    /* JADX INFO: renamed from: A0 */
    public int f14020A0;

    /* JADX INFO: renamed from: B0 */
    public ImageView.ScaleType f14021B0;

    /* JADX INFO: renamed from: C0 */
    public View.OnLongClickListener f14022C0;

    /* JADX INFO: renamed from: D0 */
    public CharSequence f14023D0;

    /* JADX INFO: renamed from: E0 */
    public final C19329Y f14024E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f14025F0;

    /* JADX INFO: renamed from: G0 */
    public EditText f14026G0;

    /* JADX INFO: renamed from: H0 */
    public final AccessibilityManager f14027H0;

    /* JADX INFO: renamed from: I0 */
    public C4307j f14028I0;

    /* JADX INFO: renamed from: J0 */
    public final C4310m f14029J0;

    /* JADX INFO: renamed from: o0 */
    public final TextInputLayout f14030o0;

    /* JADX INFO: renamed from: p0 */
    public final FrameLayout f14031p0;

    /* JADX INFO: renamed from: q0 */
    public final CheckableImageButton f14032q0;

    /* JADX INFO: renamed from: r0 */
    public ColorStateList f14033r0;

    /* JADX INFO: renamed from: s0 */
    public PorterDuff.Mode f14034s0;

    /* JADX INFO: renamed from: t0 */
    public View.OnLongClickListener f14035t0;

    /* JADX INFO: renamed from: u0 */
    public final CheckableImageButton f14036u0;

    /* JADX INFO: renamed from: v0 */
    public final C4312o f14037v0;

    /* JADX INFO: renamed from: w0 */
    public int f14038w0;

    /* JADX INFO: renamed from: x0 */
    public final LinkedHashSet f14039x0;

    /* JADX INFO: renamed from: y0 */
    public ColorStateList f14040y0;

    /* JADX INFO: renamed from: z0 */
    public PorterDuff.Mode f14041z0;

    public C4313p(TextInputLayout textInputLayout, C11242m c11242m) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f14038w0 = 0;
        this.f14039x0 = new LinkedHashSet();
        this.f14029J0 = new C4310m(this);
        C4311n c4311n = new C4311n(this);
        this.f14027H0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f14030o0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f14031p0 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM5107a = m5107a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f14032q0 = checkableImageButtonM5107a;
        CheckableImageButton checkableImageButtonM5107a2 = m5107a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f14036u0 = checkableImageButtonM5107a2;
        this.f14037v0 = new C4312o(this, c11242m);
        C19329Y c19329y = new C19329Y(getContext(), null);
        this.f14024E0 = c19329y;
        TypedArray typedArray = (TypedArray) c11242m.f34019Z;
        if (typedArray.hasValue(36)) {
            this.f14033r0 = AbstractC7979R3.m8280d(getContext(), c11242m, 36);
        }
        if (typedArray.hasValue(37)) {
            this.f14034s0 = AbstractC21828k.m22312g(typedArray.getInt(37, -1), null);
        }
        if (typedArray.hasValue(35)) {
            m5114h(c11242m.m12601B(35));
        }
        checkableImageButtonM5107a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        checkableImageButtonM5107a.setImportantForAccessibility(2);
        checkableImageButtonM5107a.setClickable(false);
        checkableImageButtonM5107a.setPressable(false);
        checkableImageButtonM5107a.setFocusable(false);
        if (!typedArray.hasValue(51)) {
            if (typedArray.hasValue(30)) {
                this.f14040y0 = AbstractC7979R3.m8280d(getContext(), c11242m, 30);
            }
            if (typedArray.hasValue(31)) {
                this.f14041z0 = AbstractC21828k.m22312g(typedArray.getInt(31, -1), null);
            }
        }
        if (typedArray.hasValue(28)) {
            m5112f(typedArray.getInt(28, 0));
            if (typedArray.hasValue(25) && checkableImageButtonM5107a2.getContentDescription() != (text = typedArray.getText(25))) {
                checkableImageButtonM5107a2.setContentDescription(text);
            }
            checkableImageButtonM5107a2.setCheckable(typedArray.getBoolean(24, true));
        } else if (typedArray.hasValue(51)) {
            if (typedArray.hasValue(52)) {
                this.f14040y0 = AbstractC7979R3.m8280d(getContext(), c11242m, 52);
            }
            if (typedArray.hasValue(53)) {
                this.f14041z0 = AbstractC21828k.m22312g(typedArray.getInt(53, -1), null);
            }
            m5112f(typedArray.getBoolean(51, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(49);
            if (checkableImageButtonM5107a2.getContentDescription() != text2) {
                checkableImageButtonM5107a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f14020A0) {
            this.f14020A0 = dimensionPixelSize;
            checkableImageButtonM5107a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM5107a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM5107a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM5107a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(29)) {
            ImageView.ScaleType scaleTypeM9121b = AbstractC8479G.m9121b(typedArray.getInt(29, -1));
            this.f14021B0 = scaleTypeM9121b;
            checkableImageButtonM5107a2.setScaleType(scaleTypeM9121b);
            checkableImageButtonM5107a.setScaleType(scaleTypeM9121b);
        }
        c19329y.setVisibility(8);
        c19329y.setId(R.id.textinput_suffix_text);
        c19329y.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c19329y.setAccessibilityLiveRegion(1);
        c19329y.setTextAppearance(typedArray.getResourceId(70, 0));
        if (typedArray.hasValue(71)) {
            c19329y.setTextColor(c11242m.m12600A(71));
        }
        CharSequence text3 = typedArray.getText(69);
        this.f14023D0 = TextUtils.isEmpty(text3) ? null : text3;
        c19329y.setText(text3);
        m5119m();
        frameLayout.addView(checkableImageButtonM5107a2);
        addView(c19329y);
        addView(frameLayout);
        addView(checkableImageButtonM5107a);
        textInputLayout.f36761n1.add(c4311n);
        if (textInputLayout.f36768r0 != null) {
            c4311n.m5067a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0171H(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m5107a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (AbstractC7979R3.m8283g(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC4314q m5108b() {
        AbstractC4314q c4302e;
        int i10 = this.f14038w0;
        C4312o c4312o = this.f14037v0;
        SparseArray sparseArray = (SparseArray) c4312o.f14018d;
        AbstractC4314q c4320w = (AbstractC4314q) sparseArray.get(i10);
        if (c4320w == null) {
            C4313p c4313p = (C4313p) c4312o.f14019e;
            if (i10 == -1) {
                c4302e = new C4302e(c4313p, 0);
            } else if (i10 != 0) {
                if (i10 == 1) {
                    c4320w = new C4320w(c4313p, c4312o.f14017c);
                } else if (i10 == 2) {
                    c4302e = new C4301d(c4313p);
                } else {
                    if (i10 != 3) {
                        throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Invalid end icon mode: "));
                    }
                    c4302e = new C4309l(c4313p);
                }
                sparseArray.append(i10, c4320w);
            } else {
                c4302e = new C4302e(c4313p, 1);
            }
            c4320w = c4302e;
            sparseArray.append(i10, c4320w);
        }
        return c4320w;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5109c() {
        return this.f14031p0.getVisibility() == 0 && this.f14036u0.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5110d() {
        return this.f14032q0.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m5111e(boolean z6) {
        boolean z10;
        boolean zIsActivated;
        boolean z11;
        AbstractC4314q abstractC4314qM5108b = m5108b();
        boolean zMo5121k = abstractC4314qM5108b.mo5121k();
        CheckableImageButton checkableImageButton = this.f14036u0;
        boolean z12 = true;
        if (!zMo5121k || (z11 = checkableImageButton.f36659r0) == abstractC4314qM5108b.mo5062l()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        }
        if (!(abstractC4314qM5108b instanceof C4309l) || (zIsActivated = checkableImageButton.isActivated()) == abstractC4314qM5108b.mo5061j()) {
            z12 = z10;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z6 || z12) {
            AbstractC8479G.m9123d(this.f14030o0, checkableImageButton, this.f14040y0);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5112f(int i10) {
        if (this.f14038w0 == i10) {
            return;
        }
        AbstractC4314q abstractC4314qM5108b = m5108b();
        C4307j c4307j = this.f14028I0;
        AccessibilityManager accessibilityManager = this.f14027H0;
        if (c4307j != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1508b(c4307j));
        }
        this.f14028I0 = null;
        abstractC4314qM5108b.mo5050s();
        this.f14038w0 = i10;
        Iterator it = this.f14039x0.iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
        m5113g(i10 != 0);
        AbstractC4314q abstractC4314qM5108b2 = m5108b();
        int iMo5043d = this.f14037v0.f14016b;
        if (iMo5043d == 0) {
            iMo5043d = abstractC4314qM5108b2.mo5043d();
        }
        Drawable drawableM9636b = iMo5043d != 0 ? AbstractC9106B3.m9636b(getContext(), iMo5043d) : null;
        CheckableImageButton checkableImageButton = this.f14036u0;
        checkableImageButton.setImageDrawable(drawableM9636b);
        TextInputLayout textInputLayout = this.f14030o0;
        if (drawableM9636b != null) {
            AbstractC8479G.m9120a(textInputLayout, checkableImageButton, this.f14040y0, this.f14041z0);
            AbstractC8479G.m9123d(textInputLayout, checkableImageButton, this.f14040y0);
        }
        int iMo5042c = abstractC4314qM5108b2.mo5042c();
        CharSequence text = iMo5042c != 0 ? getResources().getText(iMo5042c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC4314qM5108b2.mo5121k());
        if (!abstractC4314qM5108b2.mo5060i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        abstractC4314qM5108b2.mo5049r();
        C4307j c4307jMo5059h = abstractC4314qM5108b2.mo5059h();
        this.f14028I0 = c4307jMo5059h;
        if (c4307jMo5059h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1508b(this.f14028I0));
            }
        }
        View.OnClickListener onClickListenerMo5045f = abstractC4314qM5108b2.mo5045f();
        View.OnLongClickListener onLongClickListener = this.f14022C0;
        checkableImageButton.setOnClickListener(onClickListenerMo5045f);
        AbstractC8479G.m9125f(checkableImageButton, onLongClickListener);
        EditText editText = this.f14026G0;
        if (editText != null) {
            abstractC4314qM5108b2.mo5047m(editText);
            m5115i(abstractC4314qM5108b2);
        }
        AbstractC8479G.m9120a(textInputLayout, checkableImageButton, this.f14040y0, this.f14041z0);
        m5111e(true);
    }

    /* JADX INFO: renamed from: g */
    public final void m5113g(boolean z6) {
        if (m5109c() != z6) {
            this.f14036u0.setVisibility(z6 ? 0 : 8);
            m5116j();
            m5118l();
            this.f14030o0.m13671q();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5114h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f14032q0;
        checkableImageButton.setImageDrawable(drawable);
        m5117k();
        AbstractC8479G.m9120a(this.f14030o0, checkableImageButton, this.f14033r0, this.f14034s0);
    }

    /* JADX INFO: renamed from: i */
    public final void m5115i(AbstractC4314q abstractC4314q) {
        if (this.f14026G0 == null) {
            return;
        }
        if (abstractC4314q.mo5044e() != null) {
            this.f14026G0.setOnFocusChangeListener(abstractC4314q.mo5044e());
        }
        if (abstractC4314q.mo5046g() != null) {
            this.f14036u0.setOnFocusChangeListener(abstractC4314q.mo5046g());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5116j() {
        this.f14031p0.setVisibility((this.f14036u0.getVisibility() != 0 || m5110d()) ? 8 : 0);
        setVisibility((m5109c() || m5110d() || ((this.f14023D0 == null || this.f14025F0) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: k */
    public final void m5117k() {
        CheckableImageButton checkableImageButton = this.f14032q0;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f14030o0;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f36780x0.f14070q && textInputLayout.m13668n()) ? 0 : 8);
        m5116j();
        m5118l();
        if (this.f14038w0 != 0) {
            return;
        }
        textInputLayout.m13671q();
    }

    /* JADX INFO: renamed from: l */
    public final void m5118l() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f14030o0;
        if (textInputLayout.f36768r0 == null) {
            return;
        }
        if (m5109c() || m5110d()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f36768r0;
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f36768r0.getPaddingTop();
        int paddingBottom = textInputLayout.f36768r0.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
        this.f14024E0.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX INFO: renamed from: m */
    public final void m5119m() {
        C19329Y c19329y = this.f14024E0;
        int visibility = c19329y.getVisibility();
        int i10 = (this.f14023D0 == null || this.f14025F0) ? 8 : 0;
        if (visibility != i10) {
            m5108b().mo5048p(i10 == 0);
        }
        m5116j();
        c19329y.setVisibility(i10);
        this.f14030o0.m13671q();
    }
}
