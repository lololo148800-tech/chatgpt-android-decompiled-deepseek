package p773h0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p492U1.C7545j;

/* JADX INFO: renamed from: h0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C14251F {

    /* JADX INFO: renamed from: a */
    public final Context f44720a;

    /* JADX INFO: renamed from: b */
    public final int f44721b;

    /* JADX INFO: renamed from: c */
    public long f44722c = 0;

    /* JADX INFO: renamed from: d */
    public EdgeEffect f44723d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f44724e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f44725f;

    /* JADX INFO: renamed from: g */
    public EdgeEffect f44726g;

    /* JADX INFO: renamed from: h */
    public EdgeEffect f44727h;

    /* JADX INFO: renamed from: i */
    public EdgeEffect f44728i;

    /* JADX INFO: renamed from: j */
    public EdgeEffect f44729j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f44730k;

    public C14251F(Context context, int i10) {
        this.f44720a = context;
        this.f44721b = i10;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m15547f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m15548g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? C14299o.f44894a.m15592b(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final EdgeEffect m15549a() {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f44720a;
        EdgeEffect edgeEffectM15591a = i10 >= 31 ? C14299o.f44894a.m15591a(context, null) : new C14260O(context);
        edgeEffectM15591a.setColor(this.f44721b);
        if (!C7545j.m7886a(this.f44722c, 0L)) {
            long j10 = this.f44722c;
            edgeEffectM15591a.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        return edgeEffectM15591a;
    }

    /* JADX INFO: renamed from: b */
    public final EdgeEffect m15550b() {
        EdgeEffect edgeEffect = this.f44724e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM15549a = m15549a();
        this.f44724e = edgeEffectM15549a;
        return edgeEffectM15549a;
    }

    /* JADX INFO: renamed from: c */
    public final EdgeEffect m15551c() {
        EdgeEffect edgeEffect = this.f44725f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM15549a = m15549a();
        this.f44725f = edgeEffectM15549a;
        return edgeEffectM15549a;
    }

    /* JADX INFO: renamed from: d */
    public final EdgeEffect m15552d() {
        EdgeEffect edgeEffect = this.f44726g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM15549a = m15549a();
        this.f44726g = edgeEffectM15549a;
        return edgeEffectM15549a;
    }

    /* JADX INFO: renamed from: e */
    public final EdgeEffect m15553e() {
        EdgeEffect edgeEffect = this.f44723d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM15549a = m15549a();
        this.f44723d = edgeEffectM15549a;
        return edgeEffectM15549a;
    }
}
