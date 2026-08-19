package na;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p090Da.AbstractC1982a;
import p140Fa.C2686f;
import p140Fa.C2687g;
import p140Fa.C2691k;
import p140Fa.InterfaceC2701u;
import p523V9.AbstractC8070d4;

/* JADX INFO: renamed from: na.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17542c {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f56101a;

    /* JADX INFO: renamed from: b */
    public C2691k f56102b;

    /* JADX INFO: renamed from: c */
    public int f56103c;

    /* JADX INFO: renamed from: d */
    public int f56104d;

    /* JADX INFO: renamed from: e */
    public int f56105e;

    /* JADX INFO: renamed from: f */
    public int f56106f;

    /* JADX INFO: renamed from: g */
    public int f56107g;

    /* JADX INFO: renamed from: h */
    public int f56108h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f56109i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f56110j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f56111k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f56112l;

    /* JADX INFO: renamed from: m */
    public C2687g f56113m;

    /* JADX INFO: renamed from: q */
    public boolean f56117q;

    /* JADX INFO: renamed from: s */
    public RippleDrawable f56119s;

    /* JADX INFO: renamed from: t */
    public int f56120t;

    /* JADX INFO: renamed from: n */
    public boolean f56114n = false;

    /* JADX INFO: renamed from: o */
    public boolean f56115o = false;

    /* JADX INFO: renamed from: p */
    public boolean f56116p = false;

    /* JADX INFO: renamed from: r */
    public boolean f56118r = true;

    public C17542c(MaterialButton materialButton, C2691k c2691k) {
        this.f56101a = materialButton;
        this.f56102b = c2691k;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2701u m19207a() {
        RippleDrawable rippleDrawable = this.f56119s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f56119s.getNumberOfLayers() > 2 ? (InterfaceC2701u) this.f56119s.getDrawable(2) : (InterfaceC2701u) this.f56119s.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public final C2687g m19208b(boolean z6) {
        RippleDrawable rippleDrawable = this.f56119s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C2687g) ((LayerDrawable) ((InsetDrawable) this.f56119s.getDrawable(0)).getDrawable()).getDrawable(!z6 ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m19209c(C2691k c2691k) {
        this.f56102b = c2691k;
        if (m19208b(false) != null) {
            m19208b(false).setShapeAppearanceModel(c2691k);
        }
        if (m19208b(true) != null) {
            m19208b(true).setShapeAppearanceModel(c2691k);
        }
        if (m19207a() != null) {
            m19207a().setShapeAppearanceModel(c2691k);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19210d(int i10, int i11) {
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        MaterialButton materialButton = this.f56101a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f56105e;
        int i13 = this.f56106f;
        this.f56106f = i11;
        this.f56105e = i10;
        if (!this.f56115o) {
            m19211e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    /* JADX INFO: renamed from: e */
    public final void m19211e() {
        C2687g c2687g = new C2687g(this.f56102b);
        MaterialButton materialButton = this.f56101a;
        c2687g.m3679i(materialButton.getContext());
        c2687g.setTintList(this.f56110j);
        PorterDuff.Mode mode = this.f56109i;
        if (mode != null) {
            c2687g.setTintMode(mode);
        }
        float f10 = this.f56108h;
        ColorStateList colorStateList = this.f56111k;
        c2687g.f8246Y.f8229j = f10;
        c2687g.invalidateSelf();
        C2686f c2686f = c2687g.f8246Y;
        if (c2686f.f8223d != colorStateList) {
            c2686f.f8223d = colorStateList;
            c2687g.onStateChange(c2687g.getState());
        }
        C2687g c2687g2 = new C2687g(this.f56102b);
        c2687g2.setTint(0);
        float f11 = this.f56108h;
        int iM8478e = this.f56114n ? AbstractC8070d4.m8478e(materialButton, R.attr.colorSurface) : 0;
        c2687g2.f8246Y.f8229j = f11;
        c2687g2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM8478e);
        C2686f c2686f2 = c2687g2.f8246Y;
        if (c2686f2.f8223d != colorStateListValueOf) {
            c2686f2.f8223d = colorStateListValueOf;
            c2687g2.onStateChange(c2687g2.getState());
        }
        C2687g c2687g3 = new C2687g(this.f56102b);
        this.f56113m = c2687g3;
        c2687g3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC1982a.m3155a(this.f56112l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c2687g2, c2687g}), this.f56103c, this.f56105e, this.f56104d, this.f56106f), this.f56113m);
        this.f56119s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C2687g c2687gM19208b = m19208b(false);
        if (c2687gM19208b != null) {
            c2687gM19208b.m3681k(this.f56120t);
            c2687gM19208b.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19212f() {
        C2687g c2687gM19208b = m19208b(false);
        C2687g c2687gM19208b2 = m19208b(true);
        if (c2687gM19208b != null) {
            float f10 = this.f56108h;
            ColorStateList colorStateList = this.f56111k;
            c2687gM19208b.f8246Y.f8229j = f10;
            c2687gM19208b.invalidateSelf();
            C2686f c2686f = c2687gM19208b.f8246Y;
            if (c2686f.f8223d != colorStateList) {
                c2686f.f8223d = colorStateList;
                c2687gM19208b.onStateChange(c2687gM19208b.getState());
            }
            if (c2687gM19208b2 != null) {
                float f11 = this.f56108h;
                int iM8478e = this.f56114n ? AbstractC8070d4.m8478e(this.f56101a, R.attr.colorSurface) : 0;
                c2687gM19208b2.f8246Y.f8229j = f11;
                c2687gM19208b2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM8478e);
                C2686f c2686f2 = c2687gM19208b2.f8246Y;
                if (c2686f2.f8223d != colorStateListValueOf) {
                    c2686f2.f8223d = colorStateListValueOf;
                    c2687gM19208b2.onStateChange(c2687gM19208b2.getState());
                }
            }
        }
    }
}
