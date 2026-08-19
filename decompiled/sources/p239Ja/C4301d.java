package p239Ja;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.openai.chatgpt.R;
import p001A.RunnableC0000A;
import p021Aj.ViewOnClickListenerC0529n;
import p523V9.AbstractC8034Z;
import p806ia.AbstractC14951a;

/* JADX INFO: renamed from: Ja.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4301d extends AbstractC4314q {

    /* JADX INFO: renamed from: e */
    public final int f13980e;

    /* JADX INFO: renamed from: f */
    public final int f13981f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f13982g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f13983h;

    /* JADX INFO: renamed from: i */
    public EditText f13984i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC0529n f13985j;

    /* JADX INFO: renamed from: k */
    public final ViewOnFocusChangeListenerC4298a f13986k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f13987l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f13988m;

    public C4301d(C4313p c4313p) {
        super(c4313p);
        this.f13985j = new ViewOnClickListenerC0529n(this, 3);
        this.f13986k = new ViewOnFocusChangeListenerC4298a(this, 0);
        this.f13980e = AbstractC8034Z.m8389d(c4313p.getContext(), R.attr.motionDurationShort3, 100);
        this.f13981f = AbstractC8034Z.m8389d(c4313p.getContext(), R.attr.motionDurationShort3, 150);
        this.f13982g = AbstractC8034Z.m8390e(c4313p.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC14951a.f46571a);
        this.f13983h = AbstractC8034Z.m8390e(c4313p.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC14951a.f46574d);
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: a */
    public final void mo5041a() {
        if (this.f14043b.f14023D0 != null) {
            return;
        }
        m5051t(m5052u());
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: c */
    public final int mo5042c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: d */
    public final int mo5043d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo5044e() {
        return this.f13986k;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo5045f() {
        return this.f13985j;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: g */
    public final View.OnFocusChangeListener mo5046g() {
        return this.f13986k;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: m */
    public final void mo5047m(EditText editText) {
        this.f13984i = editText;
        this.f14042a.setEndIconVisible(m5052u());
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: p */
    public final void mo5048p(boolean z6) {
        if (this.f14043b.f14023D0 == null) {
            return;
        }
        m5051t(z6);
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: r */
    public final void mo5049r() {
        final int i10 = 1;
        final int i11 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f13983h);
        valueAnimatorOfFloat.setDuration(this.f13981f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Ja.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4301d f13977b;

            {
                this.f13977b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        C4301d c4301d = this.f13977b;
                        c4301d.getClass();
                        c4301d.f14045d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C4301d c4301d2 = this.f13977b;
                        c4301d2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c4301d2.f14045d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f13982g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i12 = this.f13980e;
        valueAnimatorOfFloat2.setDuration(i12);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Ja.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4301d f13977b;

            {
                this.f13977b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        C4301d c4301d = this.f13977b;
                        c4301d.getClass();
                        c4301d.f14045d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C4301d c4301d2 = this.f13977b;
                        c4301d2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c4301d2.f14045d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f13987l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f13987l.addListener(new C4300c(this, i11));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i12);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Ja.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4301d f13977b;

            {
                this.f13977b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        C4301d c4301d = this.f13977b;
                        c4301d.getClass();
                        c4301d.f14045d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C4301d c4301d2 = this.f13977b;
                        c4301d2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c4301d2.f14045d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f13988m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C4300c(this, i10));
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: s */
    public final void mo5050s() {
        EditText editText = this.f13984i;
        if (editText != null) {
            editText.post(new RunnableC0000A(this, 26));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5051t(boolean z6) {
        boolean z10 = this.f14043b.m5109c() == z6;
        if (z6 && !this.f13987l.isRunning()) {
            this.f13988m.cancel();
            this.f13987l.start();
            if (z10) {
                this.f13987l.end();
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        this.f13987l.cancel();
        this.f13988m.start();
        if (z10) {
            this.f13988m.end();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5052u() {
        EditText editText = this.f13984i;
        return editText != null && (editText.hasFocus() || this.f14045d.hasFocus()) && this.f13984i.getText().length() > 0;
    }
}
