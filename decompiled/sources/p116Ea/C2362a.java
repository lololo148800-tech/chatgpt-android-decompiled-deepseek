package p116Ea;

import android.graphics.Paint;
import android.graphics.Path;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: Ea.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2362a {

    /* JADX INFO: renamed from: i */
    public static final int[] f7320i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f7321j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f7322k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f7323l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f7324a;

    /* JADX INFO: renamed from: b */
    public final Paint f7325b;

    /* JADX INFO: renamed from: c */
    public final Paint f7326c;

    /* JADX INFO: renamed from: d */
    public int f7327d;

    /* JADX INFO: renamed from: e */
    public int f7328e;

    /* JADX INFO: renamed from: f */
    public int f7329f;

    /* JADX INFO: renamed from: g */
    public final Path f7330g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f7331h;

    public C2362a() {
        Paint paint = new Paint();
        this.f7331h = paint;
        this.f7324a = new Paint();
        m3450a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f7325b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f7326c = new Paint(paint2);
    }

    /* JADX INFO: renamed from: a */
    public final void m3450a(int i10) {
        this.f7327d = AbstractC18861b.m20169g(i10, 68);
        this.f7328e = AbstractC18861b.m20169g(i10, 20);
        this.f7329f = AbstractC18861b.m20169g(i10, 0);
        this.f7324a.setColor(this.f7327d);
    }
}
