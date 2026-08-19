package p239Ja;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8034Z;
import p544W9.AbstractC8608b3;
import p806ia.AbstractC14951a;
import p999s.C19329Y;

/* JADX INFO: renamed from: Ja.t */
/* JADX INFO: loaded from: classes.dex */
public final class C4317t {

    /* JADX INFO: renamed from: A */
    public ColorStateList f14052A;

    /* JADX INFO: renamed from: B */
    public Typeface f14053B;

    /* JADX INFO: renamed from: a */
    public final int f14054a;

    /* JADX INFO: renamed from: b */
    public final int f14055b;

    /* JADX INFO: renamed from: c */
    public final int f14056c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f14057d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f14058e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f14059f;

    /* JADX INFO: renamed from: g */
    public final Context f14060g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f14061h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f14062i;

    /* JADX INFO: renamed from: j */
    public int f14063j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f14064k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f14065l;

    /* JADX INFO: renamed from: m */
    public final float f14066m;

    /* JADX INFO: renamed from: n */
    public int f14067n;

    /* JADX INFO: renamed from: o */
    public int f14068o;

    /* JADX INFO: renamed from: p */
    public CharSequence f14069p;

    /* JADX INFO: renamed from: q */
    public boolean f14070q;

    /* JADX INFO: renamed from: r */
    public C19329Y f14071r;

    /* JADX INFO: renamed from: s */
    public CharSequence f14072s;

    /* JADX INFO: renamed from: t */
    public int f14073t;

    /* JADX INFO: renamed from: u */
    public int f14074u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f14075v;

    /* JADX INFO: renamed from: w */
    public CharSequence f14076w;

    /* JADX INFO: renamed from: x */
    public boolean f14077x;

    /* JADX INFO: renamed from: y */
    public C19329Y f14078y;

    /* JADX INFO: renamed from: z */
    public int f14079z;

    public C4317t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f14060g = context;
        this.f14061h = textInputLayout;
        this.f14066m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f14054a = AbstractC8034Z.m8389d(context, R.attr.motionDurationShort4, 217);
        this.f14055b = AbstractC8034Z.m8389d(context, R.attr.motionDurationMedium4, 167);
        this.f14056c = AbstractC8034Z.m8389d(context, R.attr.motionDurationShort4, 167);
        this.f14057d = AbstractC8034Z.m8390e(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC14951a.f46574d);
        LinearInterpolator linearInterpolator = AbstractC14951a.f46571a;
        this.f14058e = AbstractC8034Z.m8390e(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f14059f = AbstractC8034Z.m8390e(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m5123a(C19329Y c19329y, int i10) {
        if (this.f14062i == null && this.f14064k == null) {
            Context context = this.f14060g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f14062i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f14062i;
            TextInputLayout textInputLayout = this.f14061h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f14064k = new FrameLayout(context);
            this.f14062i.addView(this.f14064k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m5124b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f14064k.setVisibility(0);
            this.f14064k.addView(c19329y);
        } else {
            this.f14062i.addView(c19329y, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f14062i.setVisibility(0);
        this.f14063j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m5124b() {
        if (this.f14062i != null) {
            TextInputLayout textInputLayout = this.f14061h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f14060g;
                boolean zM8283g = AbstractC7979R3.m8283g(context);
                LinearLayout linearLayout = this.f14062i;
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                int paddingStart = editText.getPaddingStart();
                if (zM8283g) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM8283g) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM8283g) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5125c() {
        AnimatorSet animatorSet = this.f14065l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5126d(ArrayList arrayList, boolean z6, C19329Y c19329y, int i10, int i11, int i12) {
        if (c19329y == null || !z6) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z10 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c19329y, (Property<C19329Y, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i13 = this.f14056c;
            objectAnimatorOfFloat.setDuration(z10 ? this.f14055b : i13);
            objectAnimatorOfFloat.setInterpolator(z10 ? this.f14058e : this.f14059f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c19329y, (Property<C19329Y, Float>) View.TRANSLATION_Y, -this.f14066m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f14054a);
            objectAnimatorOfFloat2.setInterpolator(this.f14057d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final TextView m5127e(int i10) {
        if (i10 == 1) {
            return this.f14071r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f14078y;
    }

    /* JADX INFO: renamed from: f */
    public final void m5128f() {
        this.f14069p = null;
        m5125c();
        if (this.f14067n == 1) {
            if (!this.f14077x || TextUtils.isEmpty(this.f14076w)) {
                this.f14068o = 0;
            } else {
                this.f14068o = 2;
            }
        }
        m5131i(this.f14067n, this.f14068o, m5130h(this.f14071r, ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m5129g(C19329Y c19329y, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f14062i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f14064k) != null) {
            frameLayout.removeView(c19329y);
        } else {
            linearLayout.removeView(c19329y);
        }
        int i11 = this.f14063j - 1;
        this.f14063j = i11;
        LinearLayout linearLayout2 = this.f14062i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5130h(C19329Y c19329y, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        TextInputLayout textInputLayout = this.f14061h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f14068o == this.f14067n && c19329y != null && TextUtils.equals(c19329y.getText(), charSequence));
    }

    /* JADX INFO: renamed from: i */
    public final void m5131i(int i10, int i11, boolean z6) {
        TextView textViewM5127e;
        TextView textViewM5127e2;
        if (i10 == i11) {
            return;
        }
        if (z6) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f14065l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m5126d(arrayList, this.f14077x, this.f14078y, 2, i10, i11);
            m5126d(arrayList, this.f14070q, this.f14071r, 1, i10, i11);
            AbstractC8608b3.m9259c(animatorSet, arrayList);
            animatorSet.addListener(new C4315r(this, i11, m5127e(i10), i10, m5127e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewM5127e2 = m5127e(i11)) != null) {
                textViewM5127e2.setVisibility(0);
                textViewM5127e2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewM5127e = m5127e(i10)) != null) {
                textViewM5127e.setVisibility(4);
                if (i10 == 1) {
                    textViewM5127e.setText((CharSequence) null);
                }
            }
            this.f14067n = i11;
        }
        TextInputLayout textInputLayout = this.f14061h;
        textInputLayout.m13672r();
        textInputLayout.m13675u(z6, false);
        textInputLayout.m13678x();
    }
}
