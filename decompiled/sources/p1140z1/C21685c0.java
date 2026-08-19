package p1140z1;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: z1.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21685c0 implements Comparator {

    /* JADX INFO: renamed from: Z */
    public static final C21685c0 f68829Z = new C21685c0(0);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68830Y;

    public /* synthetic */ C21685c0(int i10) {
        this.f68830Y = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f68830Y) {
            case 0:
                C21658D c21658d = (C21658D) obj;
                C21658D c21658d2 = (C21658D) obj2;
                int iM18096i = AbstractC16544l.m18096i(c21658d2.f68660w0, c21658d.f68660w0);
                return iM18096i != 0 ? iM18096i : AbstractC16544l.m18096i(c21658d.hashCode(), c21658d2.hashCode());
            default:
                C21658D c21658d3 = (C21658D) obj;
                C21658D c21658d4 = (C21658D) obj2;
                int iM18096i2 = AbstractC16544l.m18096i(c21658d3.f68660w0, c21658d4.f68660w0);
                return iM18096i2 != 0 ? iM18096i2 : AbstractC16544l.m18096i(c21658d3.hashCode(), c21658d4.hashCode());
        }
    }
}
