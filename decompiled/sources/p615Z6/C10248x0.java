package p615Z6;

import android.graphics.Paint;
import android.graphics.Typeface;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: Z6.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10248x0 {

    /* JADX INFO: renamed from: a */
    public final C10193S f30432a;

    /* JADX INFO: renamed from: b */
    public boolean f30433b;

    /* JADX INFO: renamed from: c */
    public boolean f30434c;

    /* JADX INFO: renamed from: d */
    public final Paint f30435d;

    /* JADX INFO: renamed from: e */
    public final Paint f30436e;

    /* JADX INFO: renamed from: f */
    public C10235r f30437f;

    /* JADX INFO: renamed from: g */
    public C10235r f30438g;

    /* JADX INFO: renamed from: h */
    public boolean f30439h;

    public C10248x0() {
        Paint paint = new Paint();
        this.f30435d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f30436e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f30432a = C10193S.m10774a();
    }

    public C10248x0(C10248x0 c10248x0) {
        this.f30433b = c10248x0.f30433b;
        this.f30434c = c10248x0.f30434c;
        this.f30435d = new Paint(c10248x0.f30435d);
        this.f30436e = new Paint(c10248x0.f30436e);
        C10235r c10235r = c10248x0.f30437f;
        if (c10235r != null) {
            this.f30437f = new C10235r(c10235r);
        }
        C10235r c10235r2 = c10248x0.f30438g;
        if (c10235r2 != null) {
            this.f30438g = new C10235r(c10235r2);
        }
        this.f30439h = c10248x0.f30439h;
        try {
            this.f30432a = (C10193S) c10248x0.f30432a.clone();
        } catch (CloneNotSupportedException e10) {
            AbstractC15256t.m16466d("SVGAndroidRenderer", "Unexpected clone error", e10);
            this.f30432a = C10193S.m10774a();
        }
    }
}
