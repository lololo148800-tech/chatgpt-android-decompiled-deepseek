package p003A1;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
import p774h1.AbstractC14334L;
import p774h1.C14328F;

/* JADX INFO: renamed from: A1.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0160D0 implements InterfaceC0157C0 {

    /* JADX INFO: renamed from: a */
    public final int[] f641a;

    /* JADX INFO: renamed from: b */
    public final float[] f642b;

    public C0160D0(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f641a = new int[size];
        this.f642b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f641a[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f642b[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    @Override // p003A1.InterfaceC0157C0
    /* JADX INFO: renamed from: a */
    public void mo496a(View view, float[] fArr) {
        C14328F.m15605d(fArr);
        m497b(view, fArr);
    }

    /* JADX INFO: renamed from: b */
    public void m497b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z6 = parent instanceof View;
        float[] fArr2 = this.f642b;
        if (z6) {
            m497b((View) parent, fArr);
            float f10 = -view.getScrollX();
            float f11 = -view.getScrollY();
            C14328F.m15605d(fArr2);
            C14328F.m15609h(fArr2, f10, f11, 0.0f);
            AbstractC0240d0.m804o(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C14328F.m15605d(fArr2);
            C14328F.m15609h(fArr2, left, top, 0.0f);
            AbstractC0240d0.m804o(fArr, fArr2);
        } else {
            int[] iArr = this.f641a;
            view.getLocationInWindow(iArr);
            float f12 = -view.getScrollX();
            float f13 = -view.getScrollY();
            C14328F.m15605d(fArr2);
            C14328F.m15609h(fArr2, f12, f13, 0.0f);
            AbstractC0240d0.m804o(fArr, fArr2);
            float f14 = iArr[0];
            float f15 = iArr[1];
            C14328F.m15605d(fArr2);
            C14328F.m15609h(fArr2, f14, f15, 0.0f);
            AbstractC0240d0.m804o(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC14334L.m15612A(matrix, fArr2);
        AbstractC0240d0.m804o(fArr, fArr2);
    }

    public C0160D0(int i10, int i11) {
        this.f641a = new int[]{i10, i11};
        this.f642b = new float[]{0.0f, 1.0f};
    }

    public C0160D0(int i10, int i11, int i12) {
        this.f641a = new int[]{i10, i11, i12};
        this.f642b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0160D0(float[] fArr) {
        this.f642b = fArr;
        this.f641a = new int[2];
    }
}
