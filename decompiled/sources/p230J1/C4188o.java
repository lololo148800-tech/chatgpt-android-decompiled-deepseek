package p230J1;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import p279L1.C4904e;
import p279L1.C4905f;

/* JADX INFO: renamed from: J1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4188o {

    /* JADX INFO: renamed from: a */
    public final CharSequence f13603a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f13604b;

    /* JADX INFO: renamed from: c */
    public final int f13605c;

    /* JADX INFO: renamed from: d */
    public float f13606d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f13607e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f13608f;

    /* JADX INFO: renamed from: g */
    public boolean f13609g;

    public C4188o(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f13603a = charSequence;
        this.f13604b = textPaint;
        this.f13605c = i10;
    }

    /* JADX INFO: renamed from: a */
    public final BoringLayout.Metrics m4881a() {
        if (!this.f13609g) {
            TextDirectionHeuristic textDirectionHeuristicM4792a = AbstractC4173A.m4792a(this.f13605c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f13603a;
            TextPaint textPaint = this.f13604b;
            this.f13608f = i10 >= 33 ? AbstractC4176c.m4795b(charSequence, textPaint, textDirectionHeuristicM4792a) : AbstractC4177d.m4798b(charSequence, textPaint, textDirectionHeuristicM4792a);
            this.f13609g = true;
        }
        return this.f13608f;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX INFO: renamed from: b */
    public final float m4882b() {
        if (!Float.isNaN(this.f13606d)) {
            return this.f13606d;
        }
        BoringLayout.Metrics metricsM4881a = m4881a();
        float fCeil = metricsM4881a != null ? metricsM4881a.width : -1;
        TextPaint textPaint = this.f13604b;
        CharSequence charSequence = this.f13603a;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint));
        }
        if (fCeil != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC4194u.m4893e(spanned, C4905f.class) || AbstractC4194u.m4893e(spanned, C4904e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f13606d = fCeil;
        return fCeil;
    }
}
