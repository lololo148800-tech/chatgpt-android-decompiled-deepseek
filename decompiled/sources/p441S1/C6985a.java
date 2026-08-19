package p441S1;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.AbstractC16544l;
import p774h1.AbstractC14334L;
import p821j1.AbstractC16040e;
import p821j1.C16042g;
import p821j1.C16043h;

/* JADX INFO: renamed from: S1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6985a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: Y */
    public final AbstractC16040e f22332Y;

    public C6985a(AbstractC16040e abstractC16040e) {
        this.f22332Y = abstractC16040e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            C16042g c16042g = C16042g.f49483a;
            AbstractC16040e abstractC16040e = this.f22332Y;
            if (AbstractC16544l.m18089b(abstractC16040e, c16042g)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC16040e instanceof C16043h) {
                textPaint.setStyle(Paint.Style.STROKE);
                C16043h c16043h = (C16043h) abstractC16040e;
                textPaint.setStrokeWidth(c16043h.f49484a);
                textPaint.setStrokeMiter(c16043h.f49485b);
                int i10 = c16043h.f49487d;
                if (AbstractC14334L.m15643u(i10, 0)) {
                    join = Paint.Join.MITER;
                } else if (AbstractC14334L.m15643u(i10, 1)) {
                    join = Paint.Join.ROUND;
                } else {
                    join = AbstractC14334L.m15643u(i10, 2) ? Paint.Join.BEVEL : Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i11 = c16043h.f49486c;
                if (AbstractC14334L.m15642t(i11, 0)) {
                    cap = Paint.Cap.BUTT;
                } else if (AbstractC14334L.m15642t(i11, 1)) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = AbstractC14334L.m15642t(i11, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                c16043h.getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
