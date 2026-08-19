package p005A3;

import java.util.Comparator;

/* JADX INFO: renamed from: A3.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0330q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC0322i abstractC0322i = (AbstractC0322i) obj;
        AbstractC0322i abstractC0322i2 = (AbstractC0322i) obj2;
        long j10 = abstractC0322i.f1126r0;
        long j11 = abstractC0322i2.f1126r0;
        if (j10 - j11 == 0) {
            return abstractC0322i.compareTo(abstractC0322i2);
        }
        return j10 < j11 ? -1 : 1;
    }
}
