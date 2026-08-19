package p304M2;

import android.graphics.Rect;
import java.util.Comparator;
import p056C2.C1512f;
import p959q8.C18639a;

/* JADX INFO: renamed from: M2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5279b implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final Rect f17368Y = new Rect();

    /* JADX INFO: renamed from: Z */
    public final Rect f17369Z = new Rect();

    /* JADX INFO: renamed from: o0 */
    public final boolean f17370o0;

    /* JADX INFO: renamed from: p0 */
    public final C18639a f17371p0;

    public C5279b(boolean z6, C18639a c18639a) {
        this.f17370o0 = z6;
        this.f17371p0 = c18639a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f17371p0.getClass();
        Rect rect = this.f17368Y;
        ((C1512f) obj).m2216f(rect);
        Rect rect2 = this.f17369Z;
        ((C1512f) obj2).m2216f(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z6 = this.f17370o0;
        if (i12 < i13) {
            return z6 ? 1 : -1;
        }
        if (i12 > i13) {
            return z6 ? -1 : 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            return z6 ? 1 : -1;
        }
        if (i16 > i17) {
            return z6 ? -1 : 1;
        }
        return 0;
    }
}
