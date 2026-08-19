package p353O4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p1103xa.C21160a;

/* JADX INFO: renamed from: O4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6118e extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19914a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f19915b;

    public C6118e(C21160a c21160a) {
        this.f19915b = c21160a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f19914a) {
            case 0:
                return ((Drawable.ConstantState) this.f19915b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f19914a) {
            case 0:
                return ((Drawable.ConstantState) this.f19915b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f19914a) {
            case 0:
                C6119f c6119f = new C6119f(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f19915b).newDrawable();
                c6119f.f19923Y = drawableNewDrawable;
                drawableNewDrawable.setCallback(c6119f.f19921r0);
                return c6119f;
            default:
                return (C21160a) this.f19915b;
        }
    }

    public C6118e(Drawable.ConstantState constantState) {
        this.f19915b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f19914a) {
            case 0:
                C6119f c6119f = new C6119f(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f19915b).newDrawable(resources);
                c6119f.f19923Y = drawableNewDrawable;
                drawableNewDrawable.setCallback(c6119f.f19921r0);
                return c6119f;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f19914a) {
            case 0:
                C6119f c6119f = new C6119f(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f19915b).newDrawable(resources, theme);
                c6119f.f19923Y = drawableNewDrawable;
                drawableNewDrawable.setCallback(c6119f.f19921r0);
                return c6119f;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
