package p279L1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.AbstractC16544l;
import p230J1.AbstractC4173A;
import p230J1.C4198y;
import p544W9.AbstractC8583X2;

/* JADX INFO: renamed from: L1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4902c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z6, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1) {
            return;
        }
        C4198y c4198y = AbstractC4173A.f13587a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fM9247b = AbstractC8583X2.m9247b(layout, lineForOffset, paint) + AbstractC8583X2.m9246a(layout, lineForOffset, paint);
            if (fM9247b == 0.0f) {
                return;
            }
            AbstractC16544l.m18091d(canvas);
            canvas.translate(fM9247b, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z6) {
        return 0;
    }
}
