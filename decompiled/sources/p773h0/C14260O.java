package p773h0;

import android.content.Context;
import android.widget.EdgeEffect;
import p571X9.AbstractC9382v4;

/* JADX INFO: renamed from: h0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C14260O extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f44750a;

    /* JADX INFO: renamed from: b */
    public float f44751b;

    public C14260O(Context context) {
        super(context);
        this.f44750a = AbstractC9382v4.m9955a(context).f23891Y * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f44751b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        this.f44751b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f44751b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        this.f44751b = 0.0f;
        super.onPull(f10);
    }
}
