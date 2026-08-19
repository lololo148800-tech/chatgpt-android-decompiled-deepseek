package p033B5;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.android.replay.C15295i;
import io.sentry.rrweb.AbstractC15461b;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import md.C17229c;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p040Bd.AbstractC0985Q1;
import p040Bd.C0958L4;
import p051Bo.C1462h;
import p084D4.C1879C;
import p084D4.C1936r;
import p165G9.AbstractC3021g;
import p225Im.InterfaceC3776x;
import p344Nl.AbstractC5821C;
import p354O5.C6134d;
import p435Rl.InterfaceC6919c;
import p445S5.C7021a;
import p479Td.AbstractC7343b0;
import p479Td.C7344c;
import p655b2.C11221e;
import p988rc.C18931s;
import p993rj.C19032L;
import p994rk.C19191m0;
import p994rk.C19199o0;

/* JADX INFO: renamed from: B5.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0842z implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2348Y;

    public /* synthetic */ C0842z(int i10) {
        this.f2348Y = i10;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01a0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 1;
        switch (this.f2348Y) {
            case 0:
                return AbstractC3021g.m3873a(Integer.valueOf(((C6134d) obj2).m6676a()), Integer.valueOf(((C6134d) obj).m6676a()));
            case 1:
                ((C7021a) obj2).getClass();
                ((C7021a) obj).getClass();
                return AbstractC3021g.m3873a(0, 0);
            case 2:
                return AbstractC3021g.m3873a(((C1462h) obj).f3845a, ((C1462h) obj2).f3845a);
            case 3:
                return AbstractC3021g.m3873a(((C0958L4) obj2).f2720a, ((C0958L4) obj).f2720a);
            case 4:
                return ((C1936r) obj).f5714a - ((C1936r) obj2).f5714a;
            case 5:
                C1879C c1879c = (C1879C) obj;
                C1879C c1879c2 = (C1879C) obj2;
                RecyclerView recyclerView = c1879c.f5462d;
                if ((recyclerView == null) == (c1879c2.f5462d == null)) {
                    boolean z6 = c1879c.f5459a;
                    if (z6 == c1879c2.f5459a) {
                        i10 = c1879c2.f5460b - c1879c.f5460b;
                        if (i10 == 0) {
                            int i11 = c1879c.f5461c - c1879c2.f5461c;
                            if (i11 != 0) {
                                return i11;
                            }
                            return 0;
                        }
                    } else if (z6) {
                        i10 = -1;
                    }
                } else if (recyclerView != null) {
                    i10 = -1;
                }
                return i10;
            case 6:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 7:
                AbstractC5821C abstractC5821C = (AbstractC5821C) obj;
                abstractC5821C.getClass();
                InterfaceC3776x[] interfaceC3776xArr = AbstractC5821C.f18993u;
                Float fValueOf = Float.valueOf(((Number) abstractC5821C.f19001h.m8943c(interfaceC3776xArr[2])).floatValue());
                AbstractC5821C abstractC5821C2 = (AbstractC5821C) obj2;
                abstractC5821C2.getClass();
                return AbstractC3021g.m3873a(fValueOf, Float.valueOf(((Number) abstractC5821C2.f19001h.m8943c(interfaceC3776xArr[2])).floatValue()));
            case 8:
                return AbstractC3021g.m3873a(Integer.valueOf(((InterfaceC6919c) obj2).getCameraVersion()), Integer.valueOf(((InterfaceC6919c) obj).getCameraVersion()));
            case 9:
                return AbstractC3021g.m3873a(((AbstractC0985Q1) obj2).mo1961c(), ((AbstractC0985Q1) obj).mo1961c());
            case 10:
                return AbstractC3021g.m3873a(Integer.valueOf(((AbstractC7343b0) obj) instanceof C7344c ? 1 : 0), Integer.valueOf(((AbstractC7343b0) obj2) instanceof C7344c ? 1 : 0));
            case 11:
                return ((C11221e) obj).f33968Z - ((C11221e) obj2).f33968Z;
            case 12:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 13:
                return AbstractC3021g.m3873a((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
            case 14:
                return AbstractC3021g.m3873a(Long.valueOf(((C15295i) obj).f47782b), Long.valueOf(((C15295i) obj2).f47782b));
            case 15:
                return AbstractC3021g.m3873a(Long.valueOf(((AbstractC15461b) obj).f48291Z), Long.valueOf(((AbstractC15461b) obj2).f48291Z));
            case 16:
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                float fM1550g = AbstractC0730K.m1550g((View) obj);
                float fM1550g2 = AbstractC0730K.m1550g((View) obj2);
                if (fM1550g > fM1550g2) {
                    return -1;
                }
                return fM1550g < fM1550g2 ? 1 : 0;
            case 17:
                return AbstractC3021g.m3873a(Integer.valueOf(((C17229c) obj).f54983d), Integer.valueOf(((C17229c) obj2).f54983d));
            case 18:
                return AbstractC3021g.m3873a(Integer.valueOf(((C18931s) obj2).f60405a), Integer.valueOf(((C18931s) obj).f60405a));
            case 19:
                C19032L c19032l = (C19032L) obj2;
                C19032L c19032l2 = (C19032L) obj;
                return AbstractC3021g.m3873a(Integer.valueOf(c19032l.f60670b.getHeight() * c19032l.f60670b.getWidth()), Integer.valueOf(c19032l2.f60670b.getHeight() * c19032l2.f60670b.getWidth()));
            case 20:
                return AbstractC3021g.m3873a(((C19199o0) obj).f60924b, ((C19199o0) obj2).f60924b);
            case 21:
                return AbstractC3021g.m3873a(((C19191m0) obj).f60915a, ((C19191m0) obj2).f60915a);
            case 22:
                return AbstractC3021g.m3873a(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue()));
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
