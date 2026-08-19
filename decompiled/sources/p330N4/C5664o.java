package p330N4;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;
import p499U9.AbstractC7589s;
import p979r2.C18864e;

/* JADX INFO: renamed from: N4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5664o implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18383a;

    /* JADX INFO: renamed from: b */
    public Object f18384b;

    public /* synthetic */ C5664o(int i10) {
        this.f18383a = i10;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        switch (this.f18383a) {
            case 0:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i10 = rect.left;
                int i11 = i10 + ((int) ((rect2.left - i10) * f10));
                int i12 = rect.top;
                int i13 = i12 + ((int) ((rect2.top - i12) * f10));
                int i14 = rect.right;
                int i15 = i14 + ((int) ((rect2.right - i14) * f10));
                int i16 = rect.bottom;
                int i17 = i16 + ((int) ((rect2.bottom - i16) * f10));
                Rect rect3 = (Rect) this.f18384b;
                if (rect3 == null) {
                    return new Rect(i11, i13, i15, i17);
                }
                rect3.set(i11, i13, i15, i17);
                return rect3;
            case 1:
                C18864e[] c18864eArr = (C18864e[]) obj;
                C18864e[] c18864eArr2 = (C18864e[]) obj2;
                if (!AbstractC7589s.m7926a(c18864eArr, c18864eArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!AbstractC7589s.m7926a((C18864e[]) this.f18384b, c18864eArr)) {
                    this.f18384b = AbstractC7589s.m7930e(c18864eArr);
                }
                for (int i18 = 0; i18 < c18864eArr.length; i18++) {
                    C18864e c18864e = ((C18864e[]) this.f18384b)[i18];
                    C18864e c18864e2 = c18864eArr[i18];
                    C18864e c18864e3 = c18864eArr2[i18];
                    c18864e.getClass();
                    c18864e.f60091a = c18864e2.f60091a;
                    int i19 = 0;
                    while (true) {
                        float[] fArr = c18864e2.f60092b;
                        if (i19 < fArr.length) {
                            c18864e.f60092b[i19] = (c18864e3.f60092b[i19] * f10) + ((1.0f - f10) * fArr[i19]);
                            i19++;
                        }
                    }
                }
                return (C18864e[]) this.f18384b;
            default:
                float fFloatValue = ((FloatEvaluator) this.f18384b).evaluate(f10, (Number) obj, (Number) obj2).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
