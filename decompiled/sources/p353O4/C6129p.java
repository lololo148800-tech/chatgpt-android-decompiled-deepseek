package p353O4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: O4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6129p extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f19977a;

    public C6129p(Drawable.ConstantState constantState) {
        this.f19977a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f19977a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f19977a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C6130q c6130q = new C6130q();
        c6130q.f19923Y = (VectorDrawable) this.f19977a.newDrawable();
        return c6130q;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C6130q c6130q = new C6130q();
        c6130q.f19923Y = (VectorDrawable) this.f19977a.newDrawable(resources);
        return c6130q;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C6130q c6130q = new C6130q();
        c6130q.f19923Y = (VectorDrawable) this.f19977a.newDrawable(resources, theme);
        return c6130q;
    }
}
