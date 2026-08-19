package p084D4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: D4.Z */
/* JADX INFO: loaded from: classes.dex */
public class C1901Z extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC1933p0 f5557a;

    /* JADX INFO: renamed from: b */
    public final Rect f5558b;

    /* JADX INFO: renamed from: c */
    public boolean f5559c;

    /* JADX INFO: renamed from: d */
    public boolean f5560d;

    public C1901Z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5558b = new Rect();
        this.f5559c = true;
        this.f5560d = false;
    }

    public C1901Z(int i10, int i11) {
        super(i10, i11);
        this.f5558b = new Rect();
        this.f5559c = true;
        this.f5560d = false;
    }

    public C1901Z(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5558b = new Rect();
        this.f5559c = true;
        this.f5560d = false;
    }

    public C1901Z(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5558b = new Rect();
        this.f5559c = true;
        this.f5560d = false;
    }

    public C1901Z(C1901Z c1901z) {
        super((ViewGroup.LayoutParams) c1901z);
        this.f5558b = new Rect();
        this.f5559c = true;
        this.f5560d = false;
    }
}
