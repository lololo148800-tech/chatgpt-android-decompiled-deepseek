package p921oa;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p090Da.AbstractC1982a;
import p140Fa.C2681a;
import p140Fa.C2684d;
import p140Fa.C2687g;
import p140Fa.C2689i;
import p140Fa.C2690j;
import p140Fa.C2691k;
import p197Hj.C3455a;
import p523V9.AbstractC8034Z;
import p523V9.AbstractC8143m5;
import p658b5.C11241l;
import p669c0.AbstractC11556b;
import p669c0.C11555a;
import p783ha.AbstractC14431a;
import p806ia.AbstractC14951a;

/* JADX INFO: renamed from: oa.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18034c {

    /* JADX INFO: renamed from: y */
    public static final double f57557y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z */
    public static final ColorDrawable f57558z;

    /* JADX INFO: renamed from: a */
    public final MaterialCardView f57559a;

    /* JADX INFO: renamed from: c */
    public final C2687g f57561c;

    /* JADX INFO: renamed from: d */
    public final C2687g f57562d;

    /* JADX INFO: renamed from: e */
    public int f57563e;

    /* JADX INFO: renamed from: f */
    public int f57564f;

    /* JADX INFO: renamed from: g */
    public int f57565g;

    /* JADX INFO: renamed from: h */
    public int f57566h;

    /* JADX INFO: renamed from: i */
    public Drawable f57567i;

    /* JADX INFO: renamed from: j */
    public Drawable f57568j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f57569k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f57570l;

    /* JADX INFO: renamed from: m */
    public C2691k f57571m;

    /* JADX INFO: renamed from: n */
    public ColorStateList f57572n;

    /* JADX INFO: renamed from: o */
    public RippleDrawable f57573o;

    /* JADX INFO: renamed from: p */
    public LayerDrawable f57574p;

    /* JADX INFO: renamed from: q */
    public C2687g f57575q;

    /* JADX INFO: renamed from: s */
    public boolean f57577s;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f57578t;

    /* JADX INFO: renamed from: u */
    public final TimeInterpolator f57579u;

    /* JADX INFO: renamed from: v */
    public final int f57580v;

    /* JADX INFO: renamed from: w */
    public final int f57581w;

    /* JADX INFO: renamed from: b */
    public final Rect f57560b = new Rect();

    /* JADX INFO: renamed from: r */
    public boolean f57576r = false;

    /* JADX INFO: renamed from: x */
    public float f57582x = 0.0f;

    static {
        f57558z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C18034c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f57559a = materialCardView;
        C2687g c2687g = new C2687g(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f57561c = c2687g;
        c2687g.m3679i(materialCardView.getContext());
        c2687g.m3684n();
        C2690j c2690jM3694e = c2687g.f8246Y.f8220a.m3694e();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC14431a.f45370c, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            c2690jM3694e.f8265e = new C2681a(dimension);
            c2690jM3694e.f8266f = new C2681a(dimension);
            c2690jM3694e.f8267g = new C2681a(dimension);
            c2690jM3694e.f8268h = new C2681a(dimension);
        }
        this.f57562d = new C2687g();
        m19690h(c2690jM3694e.m3689a());
        this.f57579u = AbstractC8034Z.m8390e(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC14951a.f46571a);
        this.f57580v = AbstractC8034Z.m8389d(materialCardView.getContext(), R.attr.motionDurationShort2, RCHTTPStatusCodes.UNSUCCESSFUL);
        this.f57581w = AbstractC8034Z.m8389d(materialCardView.getContext(), R.attr.motionDurationShort1, RCHTTPStatusCodes.UNSUCCESSFUL);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static float m19683b(AbstractC8143m5 abstractC8143m5, float f10) {
        if (abstractC8143m5 instanceof C2689i) {
            return (float) ((1.0d - f57557y) * ((double) f10));
        }
        if (abstractC8143m5 instanceof C2684d) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final float m19684a() {
        AbstractC8143m5 abstractC8143m5 = this.f57571m.f8274a;
        C2687g c2687g = this.f57561c;
        return Math.max(Math.max(m19683b(abstractC8143m5, c2687g.m3677g()), m19683b(this.f57571m.f8275b, c2687g.f8246Y.f8220a.f8279f.mo3657a(c2687g.m3676f()))), Math.max(m19683b(this.f57571m.f8276c, c2687g.f8246Y.f8220a.f8280g.mo3657a(c2687g.m3676f())), m19683b(this.f57571m.f8277d, c2687g.f8246Y.f8220a.f8281h.mo3657a(c2687g.m3676f()))));
    }

    /* JADX INFO: renamed from: c */
    public final LayerDrawable m19685c() {
        if (this.f57573o == null) {
            int[] iArr = AbstractC1982a.f5854a;
            this.f57575q = new C2687g(this.f57571m);
            this.f57573o = new RippleDrawable(this.f57569k, null, this.f57575q);
        }
        if (this.f57574p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f57573o, this.f57562d, this.f57568j});
            this.f57574p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f57574p;
    }

    /* JADX INFO: renamed from: d */
    public final C18033b m19686d(Drawable drawable) {
        int iCeil;
        int i10;
        MaterialCardView materialCardView = this.f57559a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (m19691i() ? m19684a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (m19691i() ? m19684a() : 0.0f));
            i10 = iCeil2;
        } else {
            iCeil = 0;
            i10 = 0;
        }
        return new C18033b(drawable, iCeil, i10, iCeil, i10);
    }

    /* JADX INFO: renamed from: e */
    public final void m19687e(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f57574p != null) {
            MaterialCardView materialCardView = this.f57559a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (m19691i() ? m19684a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (m19691i() ? m19684a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = this.f57565g;
            int i15 = (i14 & 8388613) == 8388613 ? ((i10 - this.f57563e) - this.f57564f) - iCeil2 : this.f57563e;
            int i16 = (i14 & 80) == 80 ? this.f57563e : ((i11 - this.f57563e) - this.f57564f) - iCeil;
            int i17 = (i14 & 8388613) == 8388613 ? this.f57563e : ((i10 - this.f57563e) - this.f57564f) - iCeil2;
            int i18 = (i14 & 80) == 80 ? ((i11 - this.f57563e) - this.f57564f) - iCeil : this.f57563e;
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            if (materialCardView.getLayoutDirection() == 1) {
                i13 = i17;
                i12 = i15;
            } else {
                i12 = i17;
                i13 = i15;
            }
            this.f57574p.setLayerInset(2, i13, i18, i12, i16);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19688f(boolean z6, boolean z10) {
        Drawable drawable = this.f57568j;
        if (drawable != null) {
            if (!z10) {
                drawable.setAlpha(z6 ? 255 : 0);
                this.f57582x = z6 ? 1.0f : 0.0f;
                return;
            }
            float f10 = z6 ? 1.0f : 0.0f;
            float f11 = z6 ? 1.0f - this.f57582x : this.f57582x;
            ValueAnimator valueAnimator = this.f57578t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f57578t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f57582x, f10);
            this.f57578t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C3455a(this, 4));
            this.f57578t.setInterpolator(this.f57579u);
            this.f57578t.setDuration((long) ((z6 ? this.f57580v : this.f57581w) * f11));
            this.f57578t.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m19689g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f57568j = drawableMutate;
            drawableMutate.setTintList(this.f57570l);
            m19688f(this.f57559a.f36500x0, false);
        } else {
            this.f57568j = f57558z;
        }
        LayerDrawable layerDrawable = this.f57574p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f57568j);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m19690h(C2691k c2691k) {
        this.f57571m = c2691k;
        C2687g c2687g = this.f57561c;
        c2687g.setShapeAppearanceModel(c2691k);
        c2687g.f8245H0 = !c2687g.m3680j();
        C2687g c2687g2 = this.f57562d;
        if (c2687g2 != null) {
            c2687g2.setShapeAppearanceModel(c2691k);
        }
        C2687g c2687g3 = this.f57575q;
        if (c2687g3 != null) {
            c2687g3.setShapeAppearanceModel(c2691k);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m19691i() {
        MaterialCardView materialCardView = this.f57559a;
        return materialCardView.getPreventCornerOverlap() && this.f57561c.m3680j() && materialCardView.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: j */
    public final void m19692j() {
        MaterialCardView materialCardView = this.f57559a;
        float cardViewRadius = 0.0f;
        float fM19684a = ((materialCardView.getPreventCornerOverlap() && !this.f57561c.m3680j()) || m19691i()) ? m19684a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f57557y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i10 = (int) (fM19684a - cardViewRadius);
        Rect rect = this.f57560b;
        materialCardView.f32363q0.set(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
        C11241l c11241l = materialCardView.f32365s0;
        if (!((CardView) c11241l.f34017Z).getUseCompatPadding()) {
            c11241l.m12589I(0, 0, 0, 0);
            return;
        }
        C11555a c11555a = (C11555a) ((Drawable) c11241l.f34016Y);
        float f10 = c11555a.f34924e;
        float f11 = c11555a.f34920a;
        CardView cardView = (CardView) c11241l.f34017Z;
        int iCeil = (int) Math.ceil(AbstractC11556b.m12934a(f10, f11, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC11556b.m12935b(f10, f11, cardView.getPreventCornerOverlap()));
        c11241l.m12589I(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: k */
    public final void m19693k() {
        boolean z6 = this.f57576r;
        MaterialCardView materialCardView = this.f57559a;
        if (!z6) {
            materialCardView.setBackgroundInternal(m19686d(this.f57561c));
        }
        materialCardView.setForeground(m19686d(this.f57567i));
    }
}
