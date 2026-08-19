package p822j2;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p694d2.AbstractC12995a;

/* JADX INFO: renamed from: j2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C16053j {

    /* JADX INFO: renamed from: j */
    public static final SparseIntArray f49670j;

    /* JADX INFO: renamed from: a */
    public int f49671a;

    /* JADX INFO: renamed from: b */
    public int f49672b;

    /* JADX INFO: renamed from: c */
    public int f49673c;

    /* JADX INFO: renamed from: d */
    public float f49674d;

    /* JADX INFO: renamed from: e */
    public float f49675e;

    /* JADX INFO: renamed from: f */
    public float f49676f;

    /* JADX INFO: renamed from: g */
    public int f49677g;

    /* JADX INFO: renamed from: h */
    public String f49678h;

    /* JADX INFO: renamed from: i */
    public int f49679i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f49670j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX INFO: renamed from: a */
    public final void m17625a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC16059p.f49709f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f49670j.get(index)) {
                case 1:
                    this.f49675e = typedArrayObtainStyledAttributes.getFloat(index, this.f49675e);
                    break;
                case 2:
                    this.f49673c = typedArrayObtainStyledAttributes.getInt(index, this.f49673c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC12995a.f41246a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f49671a = C16056m.m17630k(typedArrayObtainStyledAttributes, index, this.f49671a);
                    break;
                case 6:
                    this.f49672b = typedArrayObtainStyledAttributes.getInteger(index, this.f49672b);
                    break;
                case 7:
                    this.f49674d = typedArrayObtainStyledAttributes.getFloat(index, this.f49674d);
                    break;
                case 8:
                    this.f49677g = typedArrayObtainStyledAttributes.getInteger(index, this.f49677g);
                    break;
                case 9:
                    this.f49676f = typedArrayObtainStyledAttributes.getFloat(index, this.f49676f);
                    break;
                case 10:
                    int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        this.f49679i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i11 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f49678h = string;
                        if (string.indexOf(Separators.SLASH) > 0) {
                            this.f49679i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f49679i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
