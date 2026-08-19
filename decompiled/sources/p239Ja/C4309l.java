package p239Ja;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p001A.RunnableC0000A;
import p021Aj.ViewOnClickListenerC0529n;
import p030B2.AbstractC0738T;
import p056C2.C1512f;
import p197Hj.C3455a;
import p523V9.AbstractC8034Z;
import p544W9.AbstractC8473F;
import p806ia.AbstractC14951a;

/* JADX INFO: renamed from: Ja.l */
/* JADX INFO: loaded from: classes.dex */
public final class C4309l extends AbstractC4314q {

    /* JADX INFO: renamed from: e */
    public final int f13999e;

    /* JADX INFO: renamed from: f */
    public final int f14000f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f14001g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f14002h;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC0529n f14003i;

    /* JADX INFO: renamed from: j */
    public final ViewOnFocusChangeListenerC4298a f14004j;

    /* JADX INFO: renamed from: k */
    public final C4307j f14005k;

    /* JADX INFO: renamed from: l */
    public boolean f14006l;

    /* JADX INFO: renamed from: m */
    public boolean f14007m;

    /* JADX INFO: renamed from: n */
    public boolean f14008n;

    /* JADX INFO: renamed from: o */
    public long f14009o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f14010p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f14011q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f14012r;

    public C4309l(C4313p c4313p) {
        super(c4313p);
        this.f14003i = new ViewOnClickListenerC0529n(this, 4);
        this.f14004j = new ViewOnFocusChangeListenerC4298a(this, 1);
        this.f14005k = new C4307j(this, 0);
        this.f14009o = Long.MAX_VALUE;
        this.f14000f = AbstractC8034Z.m8389d(c4313p.getContext(), R.attr.motionDurationShort3, 67);
        this.f13999e = AbstractC8034Z.m8389d(c4313p.getContext(), R.attr.motionDurationShort3, 50);
        this.f14001g = AbstractC8034Z.m8390e(c4313p.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC14951a.f46571a);
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: a */
    public final void mo5041a() {
        if (this.f14010p.isTouchExplorationEnabled() && AbstractC8473F.m9107b(this.f14002h) && !this.f14045d.hasFocus()) {
            this.f14002h.dismissDropDown();
        }
        this.f14002h.post(new RunnableC0000A(this, 27));
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: c */
    public final int mo5042c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: d */
    public final int mo5043d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo5044e() {
        return this.f14004j;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo5045f() {
        return this.f14003i;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: h */
    public final C4307j mo5059h() {
        return this.f14005k;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: i */
    public final boolean mo5060i(int i10) {
        return i10 != 0;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: j */
    public final boolean mo5061j() {
        return this.f14006l;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: l */
    public final boolean mo5062l() {
        return this.f14008n;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: m */
    public final void mo5047m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f14002h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: Ja.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C4309l c4309l = this.f13993Y;
                c4309l.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c4309l.f14009o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c4309l.f14007m = false;
                    }
                    c4309l.m5066u();
                    c4309l.f14007m = true;
                    c4309l.f14009o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f14002h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: Ja.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C4309l c4309l = this.f13994a;
                c4309l.f14007m = true;
                c4309l.f14009o = System.currentTimeMillis();
                c4309l.m5065t(false);
            }
        });
        this.f14002h.setThreshold(0);
        TextInputLayout textInputLayout = this.f14042a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!AbstractC8473F.m9107b(editText) && this.f14010p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            this.f14045d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: n */
    public final void mo5063n(C1512f c1512f) {
        if (!AbstractC8473F.m9107b(this.f14002h)) {
            c1512f.m2219i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? c1512f.f4042a.isShowingHintText() : c1512f.m2215e(4)) {
            c1512f.m2221k(null);
        }
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: o */
    public final void mo5064o(AccessibilityEvent accessibilityEvent) {
        if (!this.f14010p.isEnabled() || AbstractC8473F.m9107b(this.f14002h)) {
            return;
        }
        boolean z6 = accessibilityEvent.getEventType() == 32768 && this.f14008n && !this.f14002h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z6) {
            m5066u();
            this.f14007m = true;
            this.f14009o = System.currentTimeMillis();
        }
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: r */
    public final void mo5049r() {
        int i10 = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f14001g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f14000f);
        valueAnimatorOfFloat.addUpdateListener(new C3455a(this, i10));
        this.f14012r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f13999e);
        valueAnimatorOfFloat2.addUpdateListener(new C3455a(this, i10));
        this.f14011q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C4308k(this, 0));
        this.f14010p = (AccessibilityManager) this.f14044c.getSystemService("accessibility");
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: s */
    public final void mo5050s() {
        AutoCompleteTextView autoCompleteTextView = this.f14002h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f14002h.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5065t(boolean z6) {
        if (this.f14008n != z6) {
            this.f14008n = z6;
            this.f14012r.cancel();
            this.f14011q.start();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m5066u() {
        if (this.f14002h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f14009o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f14007m = false;
        }
        if (this.f14007m) {
            this.f14007m = false;
            return;
        }
        m5065t(!this.f14008n);
        if (!this.f14008n) {
            this.f14002h.dismissDropDown();
        } else {
            this.f14002h.requestFocus();
            this.f14002h.showDropDown();
        }
    }
}
