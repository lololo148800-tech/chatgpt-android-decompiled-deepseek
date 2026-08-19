package p822j2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: j2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C16055l {

    /* JADX INFO: renamed from: n */
    public static final SparseIntArray f49684n;

    /* JADX INFO: renamed from: a */
    public float f49685a;

    /* JADX INFO: renamed from: b */
    public float f49686b;

    /* JADX INFO: renamed from: c */
    public float f49687c;

    /* JADX INFO: renamed from: d */
    public float f49688d;

    /* JADX INFO: renamed from: e */
    public float f49689e;

    /* JADX INFO: renamed from: f */
    public float f49690f;

    /* JADX INFO: renamed from: g */
    public float f49691g;

    /* JADX INFO: renamed from: h */
    public int f49692h;

    /* JADX INFO: renamed from: i */
    public float f49693i;

    /* JADX INFO: renamed from: j */
    public float f49694j;

    /* JADX INFO: renamed from: k */
    public float f49695k;

    /* JADX INFO: renamed from: l */
    public boolean f49696l;

    /* JADX INFO: renamed from: m */
    public float f49697m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f49684n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m17627a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC16059p.f49712i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f49684n.get(index)) {
                case 1:
                    this.f49685a = typedArrayObtainStyledAttributes.getFloat(index, this.f49685a);
                    break;
                case 2:
                    this.f49686b = typedArrayObtainStyledAttributes.getFloat(index, this.f49686b);
                    break;
                case 3:
                    this.f49687c = typedArrayObtainStyledAttributes.getFloat(index, this.f49687c);
                    break;
                case 4:
                    this.f49688d = typedArrayObtainStyledAttributes.getFloat(index, this.f49688d);
                    break;
                case 5:
                    this.f49689e = typedArrayObtainStyledAttributes.getFloat(index, this.f49689e);
                    break;
                case 6:
                    this.f49690f = typedArrayObtainStyledAttributes.getDimension(index, this.f49690f);
                    break;
                case 7:
                    this.f49691g = typedArrayObtainStyledAttributes.getDimension(index, this.f49691g);
                    break;
                case 8:
                    this.f49693i = typedArrayObtainStyledAttributes.getDimension(index, this.f49693i);
                    break;
                case 9:
                    this.f49694j = typedArrayObtainStyledAttributes.getDimension(index, this.f49694j);
                    break;
                case 10:
                    this.f49695k = typedArrayObtainStyledAttributes.getDimension(index, this.f49695k);
                    break;
                case 11:
                    this.f49696l = true;
                    this.f49697m = typedArrayObtainStyledAttributes.getDimension(index, this.f49697m);
                    break;
                case 12:
                    this.f49692h = C16056m.m17630k(typedArrayObtainStyledAttributes, index, this.f49692h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
