package p999s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p001A.C0017I0;
import p353O4.C6130q;
import p692d0.C12959L;
import p692d0.C12960M;
import p692d0.C12977p;

/* JADX INFO: renamed from: s.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19301J0 {

    /* JADX INFO: renamed from: i */
    public static C19301J0 f61151i;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f61153a;

    /* JADX INFO: renamed from: b */
    public C12959L f61154b;

    /* JADX INFO: renamed from: c */
    public C12960M f61155c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap f61156d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e */
    public TypedValue f61157e;

    /* JADX INFO: renamed from: f */
    public boolean f61158f;

    /* JADX INFO: renamed from: g */
    public C0017I0 f61159g;

    /* JADX INFO: renamed from: h */
    public static final PorterDuff.Mode f61150h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j */
    public static final C19297H0 f61152j = new C19297H0(6);

    /* JADX INFO: renamed from: d */
    public static synchronized C19301J0 m20377d() {
        try {
            if (f61151i == null) {
                C19301J0 c19301j0 = new C19301J0();
                f61151i = c19301j0;
                m20379j(c19301j0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f61151i;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized PorterDuffColorFilter m20378h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C19297H0 c19297h0 = f61152j;
        c19297h0.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c19297h0.m3122g(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: j */
    public static void m20379j(C19301J0 c19301j0) {
        if (Build.VERSION.SDK_INT < 24) {
            c19301j0.m20380a("vector", new C19299I0(3));
            c19301j0.m20380a("animated-vector", new C19299I0(2));
            c19301j0.m20380a("animated-selector", new C19299I0(1));
            c19301j0.m20380a("drawable", new C19299I0(0));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20380a(String str, C19299I0 c19299i0) {
        if (this.f61154b == null) {
            this.f61154b = new C12959L(0);
        }
        this.f61154b.put(str, c19299i0);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m20381b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C12977p c12977p = (C12977p) this.f61156d.get(context);
                if (c12977p == null) {
                    c12977p = new C12977p((Object) null);
                    this.f61156d.put(context, c12977p);
                }
                c12977p.m14668h(j10, new WeakReference(constantState));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m20382c(Context context, int i10) {
        if (this.f61157e == null) {
            this.f61157e = new TypedValue();
        }
        TypedValue typedValue = this.f61157e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM20383e = m20383e(context, j10);
        if (drawableM20383e != null) {
            return drawableM20383e;
        }
        LayerDrawable layerDrawableM61s = null;
        if (this.f61159g != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableM61s = new LayerDrawable(new Drawable[]{m20384f(context, R.drawable.abc_cab_background_internal_bg), m20384f(context, 2131230783)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableM61s = C0017I0.m61s(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM61s = C0017I0.m61s(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM61s = C0017I0.m61s(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM61s != null) {
            layerDrawableM61s.setChangingConfigurations(typedValue.changingConfigurations);
            m20381b(context, j10, layerDrawableM61s);
        }
        return layerDrawableM61s;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized Drawable m20383e(Context context, long j10) {
        C12977p c12977p = (C12977p) this.f61156d.get(context);
        if (c12977p == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c12977p.m14664d(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c12977p.m14669i(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized Drawable m20384f(Context context, int i10) {
        return m20385g(context, i10, false);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Drawable m20385g(Context context, int i10, boolean z6) {
        Drawable drawableM20387k;
        try {
            if (!this.f61158f) {
                this.f61158f = true;
                Drawable drawableM20384f = m20384f(context, R.drawable.abc_vector_test);
                if (drawableM20384f == null || (!(drawableM20384f instanceof C6130q) && !"android.graphics.drawable.VectorDrawable".equals(drawableM20384f.getClass().getName()))) {
                    this.f61158f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM20387k = m20387k(context, i10);
            if (drawableM20387k == null) {
                drawableM20387k = m20382c(context, i10);
            }
            if (drawableM20387k == null) {
                drawableM20387k = context.getDrawable(i10);
            }
            if (drawableM20387k != null) {
                drawableM20387k = m20390n(context, i10, z6, drawableM20387k);
            }
            if (drawableM20387k != null) {
                AbstractC19357i0.m20462a(drawableM20387k);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableM20387k;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized ColorStateList m20386i(Context context, int i10) {
        ColorStateList colorStateList;
        C12960M c12960m;
        WeakHashMap weakHashMap = this.f61153a;
        ColorStateList colorStateListM83u = null;
        colorStateList = (weakHashMap == null || (c12960m = (C12960M) weakHashMap.get(context)) == null) ? null : (ColorStateList) c12960m.m14652c(i10);
        if (colorStateList == null) {
            C0017I0 c0017i0 = this.f61159g;
            if (c0017i0 != null) {
                colorStateListM83u = c0017i0.m83u(context, i10);
            }
            if (colorStateListM83u != null) {
                if (this.f61153a == null) {
                    this.f61153a = new WeakHashMap();
                }
                C12960M c12960m2 = (C12960M) this.f61153a.get(context);
                if (c12960m2 == null) {
                    c12960m2 = new C12960M(0);
                    this.f61153a.put(context, c12960m2);
                }
                c12960m2.m14650a(i10, colorStateListM83u);
            }
            colorStateList = colorStateListM83u;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m20387k(Context context, int i10) {
        int next;
        C12959L c12959l = this.f61154b;
        if (c12959l == null || c12959l.isEmpty()) {
            return null;
        }
        C12960M c12960m = this.f61155c;
        if (c12960m != null) {
            String str = (String) c12960m.m14652c(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f61154b.get(str) == null)) {
                return null;
            }
        } else {
            this.f61155c = new C12960M(0);
        }
        if (this.f61157e == null) {
            this.f61157e = new TypedValue();
        }
        TypedValue typedValue = this.f61157e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM20383e = m20383e(context, j10);
        if (drawableM20383e != null) {
            return drawableM20383e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f61155c.m14650a(i10, name);
                C19299I0 c19299i0 = (C19299I0) this.f61154b.get(name);
                if (c19299i0 != null) {
                    drawableM20383e = c19299i0.m20375a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM20383e != null) {
                    drawableM20383e.setChangingConfigurations(typedValue.changingConfigurations);
                    m20381b(context, j10, drawableM20383e);
                }
            } catch (Exception e10) {
                AbstractC15256t.m16466d("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableM20383e == null) {
            this.f61155c.m14650a(i10, "appcompat_skip_skip");
        }
        return drawableM20383e;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m20388l(Context context) {
        C12977p c12977p = (C12977p) this.f61156d.get(context);
        if (c12977p != null) {
            c12977p.m14662b();
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m20389m(C0017I0 c0017i0) {
        this.f61159g = c0017i0;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX INFO: renamed from: n */
    public final Drawable m20390n(Context context, int i10, boolean z6, Drawable drawable) {
        int i11;
        boolean z10;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListM20386i = m20386i(context, i10);
        PorterDuff.Mode mode = null;
        if (colorStateListM20386i != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListM20386i);
            if (this.f61159g != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawableMutate2;
            }
            drawableMutate2.setTintMode(mode);
            return drawableMutate2;
        }
        if (this.f61159g != null) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM20396c = AbstractC19311O0.m20396c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C19372q.f61352b;
                C0017I0.m55C(drawableFindDrawableByLayerId, iM20396c, mode2);
                C0017I0.m55C(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC19311O0.m20396c(context, R.attr.colorControlNormal), mode2);
                C0017I0.m55C(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC19311O0.m20396c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM20395b = AbstractC19311O0.m20395b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C19372q.f61352b;
                C0017I0.m55C(drawableFindDrawableByLayerId2, iM20395b, mode3);
                C0017I0.m55C(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC19311O0.m20396c(context, R.attr.colorControlActivated), mode3);
                C0017I0.m55C(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC19311O0.m20396c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0017I0 c0017i0 = this.f61159g;
        boolean z11 = false;
        if (c0017i0 != null) {
            PorterDuff.Mode mode4 = C19372q.f61352b;
            if (C0017I0.m58g((int[]) c0017i0.f64Y, i10)) {
                i11 = R.attr.colorControlNormal;
            } else if (C0017I0.m58g((int[]) c0017i0.f66o0, i10)) {
                i11 = R.attr.colorControlActivated;
            } else {
                if (C0017I0.m58g((int[]) c0017i0.f67p0, i10)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i10 == 2131230803) {
                        z10 = true;
                        iRound = Math.round(40.8f);
                        i11 = 16842800;
                    } else {
                        if (i10 != R.drawable.abc_dialog_material_background) {
                            i11 = 0;
                            z10 = false;
                        }
                        iRound = -1;
                    }
                    if (z10) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C19372q.m20474c(AbstractC19311O0.m20396c(context, i11), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z11 = true;
                    }
                }
                i11 = 16842801;
            }
            z10 = true;
            iRound = -1;
            if (z10) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C19372q.m20474c(AbstractC19311O0.m20396c(context, i11), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z11 = true;
            }
        }
        if (z11 || !z6) {
            return drawable;
        }
        return null;
    }
}
