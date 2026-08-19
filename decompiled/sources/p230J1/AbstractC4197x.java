package p230J1;

import android.text.Layout;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: J1.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4197x {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f13632a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f13633b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (AbstractC16544l.m18089b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC16544l.m18089b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f13632a = alignment;
        f13633b = alignment2;
    }
}
