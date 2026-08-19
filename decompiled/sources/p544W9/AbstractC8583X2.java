package p544W9;

import android.content.ClipData;
import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.text.Layout;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0166F0;
import p230J1.AbstractC4173A;
import p230J1.C4198y;
import p279L1.AbstractC4903d;

/* JADX INFO: renamed from: W9.X2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8583X2 {
    /* JADX INFO: renamed from: a */
    public static final float m9246a(Layout layout, int i10, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        C4198y c4198y = AbstractC4173A.f13587a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : AbstractC4903d.f15966a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX INFO: renamed from: b */
    public static final float m9247b(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        C4198y c4198y = AbstractC4173A.f13587a;
        if (layout.getEllipsisCount(i10) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i10) != -1 || layout.getWidth() >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment != null ? AbstractC4903d.f15966a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX INFO: renamed from: c */
    public static final String m9248c(C0166F0 c0166f0) {
        ClipData clipData;
        int itemCount = c0166f0.f648a.getItemCount();
        int i10 = 0;
        boolean z6 = false;
        while (true) {
            clipData = c0166f0.f648a;
            if (i10 >= itemCount) {
                break;
            }
            z6 = z6 || clipData.getItemAt(i10).getText() != null;
            i10++;
        }
        if (!z6) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int itemCount2 = clipData.getItemCount();
        boolean z10 = false;
        for (int i11 = 0; i11 < itemCount2; i11++) {
            CharSequence text = clipData.getItemAt(i11).getText();
            if (text != null) {
                if (z10) {
                    sb2.append(Separators.RETURN);
                }
                sb2.append(text);
                z10 = true;
            }
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
