package p774h1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import p797i1.AbstractC14901c;
import p797i1.C14902d;

/* JADX INFO: renamed from: h1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14355k {
    /* JADX INFO: renamed from: a */
    public static final AbstractC14901c m15737a(Bitmap bitmap) {
        AbstractC14901c abstractC14901cM15813b;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (abstractC14901cM15813b = AbstractC14370z.m15813b(colorSpace)) == null) ? C14902d.f46407c : abstractC14901cM15813b;
    }

    /* JADX INFO: renamed from: b */
    public static final Bitmap m15738b(int i10, int i11, int i12, boolean z6, AbstractC14901c abstractC14901c) {
        return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, AbstractC14334L.m15618G(i12), z6, AbstractC14370z.m15812a(abstractC14901c));
    }
}
