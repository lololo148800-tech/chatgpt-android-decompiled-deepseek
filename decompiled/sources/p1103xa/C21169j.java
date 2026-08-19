package p1103xa;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import p090Da.AbstractC1982a;
import p140Fa.C2687g;
import p140Fa.C2691k;

/* JADX INFO: renamed from: xa.j */
/* JADX INFO: loaded from: classes.dex */
public final class C21169j extends AbstractC21167h {

    /* JADX INFO: renamed from: K */
    public StateListAnimator f67306K;

    @Override // p1103xa.AbstractC21167h
    /* JADX INFO: renamed from: e */
    public final float mo21599e() {
        return this.f67299s.getElevation();
    }

    @Override // p1103xa.AbstractC21167h
    /* JADX INFO: renamed from: f */
    public final void mo21600f(Rect rect) {
        if (((FloatingActionButton) this.f67300t.f45413Y).f36654y0) {
            super.mo21600f(rect);
            return;
        }
        if (this.f67286f) {
            FloatingActionButton floatingActionButton = this.f67299s;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i10 = this.f67291k;
            if (sizeDimension < i10) {
                int sizeDimension2 = (i10 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // p1103xa.AbstractC21167h
    /* JADX INFO: renamed from: g */
    public final void mo21601g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        C2691k c2691k = this.f67281a;
        c2691k.getClass();
        C21168i c21168i = new C21168i(c2691k);
        this.f67282b = c21168i;
        c21168i.setTintList(colorStateList);
        if (mode != null) {
            this.f67282b.setTintMode(mode);
        }
        C2687g c2687g = this.f67282b;
        FloatingActionButton floatingActionButton = this.f67299s;
        c2687g.m3679i(floatingActionButton.getContext());
        if (i10 > 0) {
            Context context = floatingActionButton.getContext();
            C2691k c2691k2 = this.f67281a;
            c2691k2.getClass();
            C21160a c21160a = new C21160a(c2691k2);
            int color = context.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context.getColor(R.color.design_fab_stroke_end_outer_color);
            c21160a.f67243i = color;
            c21160a.f67244j = color2;
            c21160a.f67245k = color3;
            c21160a.f67246l = color4;
            float f10 = i10;
            if (c21160a.f67242h != f10) {
                c21160a.f67242h = f10;
                c21160a.f67236b.setStrokeWidth(f10 * 1.3333f);
                c21160a.f67248n = true;
                c21160a.invalidateSelf();
            }
            if (colorStateList != null) {
                c21160a.f67247m = colorStateList.getColorForState(c21160a.getState(), c21160a.f67247m);
            }
            c21160a.f67250p = colorStateList;
            c21160a.f67248n = true;
            c21160a.invalidateSelf();
            this.f67284d = c21160a;
            C21160a c21160a2 = this.f67284d;
            c21160a2.getClass();
            C2687g c2687g2 = this.f67282b;
            c2687g2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{c21160a2, c2687g2});
        } else {
            this.f67284d = null;
            layerDrawable = this.f67282b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC1982a.m3155a(colorStateList2), layerDrawable, null);
        this.f67283c = rippleDrawable;
        this.f67285e = rippleDrawable;
    }

    @Override // p1103xa.AbstractC21167h
    /* JADX INFO: renamed from: i */
    public final void mo21603i() {
        m21611q();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p1103xa.AbstractC21167h
    /* JADX INFO: renamed from: k */
    public final void mo21605k(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f67299s;
        if (floatingActionButton.getStateListAnimator() == this.f67306K) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(AbstractC21167h.f67274E, m21612r(f10, f12));
            stateListAnimator.addState(AbstractC21167h.f67275F, m21612r(f10, f11));
            stateListAnimator.addState(AbstractC21167h.f67276G, m21612r(f10, f11));
            stateListAnimator.addState(AbstractC21167h.f67277H, m21612r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            if (i10 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(AbstractC21167h.f67280z);
            stateListAnimator.addState(AbstractC21167h.f67278I, animatorSet);
            stateListAnimator.addState(AbstractC21167h.f67279J, m21612r(0.0f, 0.0f));
            this.f67306K = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (mo21609o()) {
            m21611q();
        }
    }

    @Override // p1103xa.AbstractC21167h
    /* JADX INFO: renamed from: m */
    public final void mo21607m(ColorStateList colorStateList) {
        Drawable drawable = this.f67283c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(AbstractC1982a.m3155a(colorStateList));
        } else {
            super.mo21607m(colorStateList);
        }
    }

    @Override // p1103xa.AbstractC21167h
    /* JADX INFO: renamed from: o */
    public final boolean mo21609o() {
        return ((FloatingActionButton) this.f67300t.f45413Y).f36654y0 || (this.f67286f && this.f67299s.getSizeDimension() < this.f67291k);
    }

    /* JADX INFO: renamed from: r */
    public final AnimatorSet m21612r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f67299s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(AbstractC21167h.f67280z);
        return animatorSet;
    }

    @Override // p1103xa.AbstractC21167h
    /* JADX INFO: renamed from: h */
    public final void mo21602h() {
    }

    @Override // p1103xa.AbstractC21167h
    /* JADX INFO: renamed from: p */
    public final void mo21610p() {
    }

    @Override // p1103xa.AbstractC21167h
    /* JADX INFO: renamed from: j */
    public final void mo21604j(int[] iArr) {
    }
}
