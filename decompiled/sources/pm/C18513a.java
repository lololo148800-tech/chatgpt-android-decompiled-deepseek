package pm;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pm.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18513a implements Comparator, p817j$.util.Comparator {

    /* JADX INFO: renamed from: Z */
    public static final C18513a f58995Z = new C18513a(0);

    /* JADX INFO: renamed from: o0 */
    public static final C18513a f58996o0 = new C18513a(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58997Y;

    public /* synthetic */ C18513a(int i10) {
        this.f58997Y = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f58997Y) {
            case 0:
                Comparable a10 = (Comparable) obj;
                Comparable b = (Comparable) obj2;
                AbstractC16544l.m18094g(a10, "a");
                AbstractC16544l.m18094g(b, "b");
                return a10.compareTo(b);
            default:
                Comparable a11 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                AbstractC16544l.m18094g(a11, "a");
                AbstractC16544l.m18094g(b10, "b");
                return b10.compareTo(a11);
        }
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final Comparator reversed() {
        switch (this.f58997Y) {
            case 0:
                return f58996o0;
            default:
                return f58995Z;
        }
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        int i10 = this.f58997Y;
        return p817j$.util.Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        int i10 = this.f58997Y;
        return p817j$.util.Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        int i10 = this.f58997Y;
        return p817j$.util.Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        int i10 = this.f58997Y;
        return p817j$.util.Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function) {
        int i10 = this.f58997Y;
        return p817j$.util.Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        int i10 = this.f58997Y;
        return p817j$.util.Comparator.CC.$default$thenComparing(this, function, comparator);
    }
}
