package p253K;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: renamed from: K.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4493d implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final boolean f14654Y;

    public C4493d(boolean z6) {
        this.f14654Y = z6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f14654Y ? iSignum * (-1) : iSignum;
    }
}
