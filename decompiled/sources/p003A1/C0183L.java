package p003A1;

import java.util.Comparator;
import mm.C17309l;
import p156G1.C2968o;
import p759g1.C13801c;

/* JADX INFO: renamed from: A1.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0183L implements Comparator {

    /* JADX INFO: renamed from: Z */
    public static final C0183L f682Z = new C0183L(0);

    /* JADX INFO: renamed from: o0 */
    public static final C0183L f683o0 = new C0183L(1);

    /* JADX INFO: renamed from: p0 */
    public static final C0183L f684p0 = new C0183L(2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f685Y;

    public /* synthetic */ C0183L(int i10) {
        this.f685Y = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f685Y) {
            case 0:
                C13801c c13801cM3796f = ((C2968o) obj).m3796f();
                C13801c c13801cM3796f2 = ((C2968o) obj2).m3796f();
                int iCompare = Float.compare(c13801cM3796f.f43586a, c13801cM3796f2.f43586a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c13801cM3796f.f43587b, c13801cM3796f2.f43587b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c13801cM3796f.f43589d, c13801cM3796f2.f43589d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c13801cM3796f.f43588c, c13801cM3796f2.f43588c);
            case 1:
                C13801c c13801cM3796f3 = ((C2968o) obj).m3796f();
                C13801c c13801cM3796f4 = ((C2968o) obj2).m3796f();
                int iCompare4 = Float.compare(c13801cM3796f4.f43588c, c13801cM3796f3.f43588c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c13801cM3796f3.f43587b, c13801cM3796f4.f43587b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c13801cM3796f3.f43589d, c13801cM3796f4.f43589d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c13801cM3796f4.f43586a, c13801cM3796f3.f43586a);
            default:
                C17309l c17309l = (C17309l) obj;
                C17309l c17309l2 = (C17309l) obj2;
                int iCompare7 = Float.compare(((C13801c) c17309l.f55136Y).f43587b, ((C13801c) c17309l2.f55136Y).f43587b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C13801c) c17309l.f55136Y).f43589d, ((C13801c) c17309l2.f55136Y).f43589d);
        }
    }
}
