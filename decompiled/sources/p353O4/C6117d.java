package p353O4;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p692d0.C12966e;

/* JADX INFO: renamed from: O4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6117d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C6130q f19910a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f19911b;

    /* JADX INFO: renamed from: c */
    public ArrayList f19912c;

    /* JADX INFO: renamed from: d */
    public C12966e f19913d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
