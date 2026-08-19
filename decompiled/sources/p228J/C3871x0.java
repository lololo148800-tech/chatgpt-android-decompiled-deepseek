package p228J;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: J.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3871x0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f11703a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static void m4593b(ArrayList arrayList, int i10, int[] iArr, int i11) {
        if (i11 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    iArr[i11] = i12;
                    m4593b(arrayList, i10, iArr, i11 + 1);
                    break;
                } else if (i12 == iArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4594a(C3838h c3838h) {
        this.f11703a.add(c3838h);
    }

    /* JADX INFO: renamed from: c */
    public final List m4595c(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f11703a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList<int[]> arrayList2 = new ArrayList();
        boolean z6 = false;
        m4593b(arrayList2, size2, new int[size2], 0);
        C3838h[] c3838hArr = new C3838h[list.size()];
        for (int[] iArr : arrayList2) {
            boolean z10 = true;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (iArr[i10] < list.size()) {
                    C3838h c3838h = (C3838h) arrayList.get(i10);
                    C3838h c3838h2 = (C3838h) list.get(iArr[i10]);
                    c3838h.getClass();
                    z10 &= c3838h2.f11613b.f11714Y <= c3838h.f11613b.f11714Y && c3838h2.f11612a == c3838h.f11612a;
                    if (!z10) {
                        break;
                    }
                    c3838hArr[iArr[i10]] = (C3838h) arrayList.get(i10);
                }
            }
            if (z10) {
                z6 = true;
                break;
            }
        }
        if (z6) {
            return Arrays.asList(c3838hArr);
        }
        return null;
    }
}
