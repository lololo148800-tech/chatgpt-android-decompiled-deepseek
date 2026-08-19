package p822j2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: j2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C16054k {

    /* JADX INFO: renamed from: a */
    public int f49680a;

    /* JADX INFO: renamed from: b */
    public int f49681b;

    /* JADX INFO: renamed from: c */
    public float f49682c;

    /* JADX INFO: renamed from: d */
    public float f49683d;

    /* JADX INFO: renamed from: a */
    public final void m17626a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC16059p.f49710g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f49682c = typedArrayObtainStyledAttributes.getFloat(index, this.f49682c);
            } else if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f49680a);
                this.f49680a = i11;
                this.f49680a = C16056m.f49698d[i11];
            } else if (index == 4) {
                this.f49681b = typedArrayObtainStyledAttributes.getInt(index, this.f49681b);
            } else if (index == 3) {
                this.f49683d = typedArrayObtainStyledAttributes.getFloat(index, this.f49683d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
