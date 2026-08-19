package p353O4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: O4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6128o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f19965a;

    /* JADX INFO: renamed from: b */
    public C6127n f19966b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f19967c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f19968d;

    /* JADX INFO: renamed from: e */
    public boolean f19969e;

    /* JADX INFO: renamed from: f */
    public Bitmap f19970f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f19971g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f19972h;

    /* JADX INFO: renamed from: i */
    public int f19973i;

    /* JADX INFO: renamed from: j */
    public boolean f19974j;

    /* JADX INFO: renamed from: k */
    public boolean f19975k;

    /* JADX INFO: renamed from: l */
    public Paint f19976l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f19965a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C6130q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C6130q(this);
    }
}
