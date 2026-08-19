package p636a2;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p254K0.C4526w;

/* JADX INFO: renamed from: a2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10468e {

    /* JADX INFO: renamed from: a */
    public final Integer f30998a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f30999b;

    /* JADX INFO: renamed from: c */
    public final C10469f f31000c;

    /* JADX INFO: renamed from: d */
    public final C10470g f31001d;

    /* JADX INFO: renamed from: e */
    public final C10470g f31002e;

    /* JADX INFO: renamed from: f */
    public final C10470g f31003f;

    /* JADX INFO: renamed from: g */
    public final C10470g f31004g;

    public C10468e(Integer num) {
        this.f30998a = num;
        ArrayList arrayList = new ArrayList();
        this.f30999b = arrayList;
        this.f31000c = new C10469f(0);
        this.f31001d = new C10470g(num, -2, arrayList);
        this.f31002e = new C10470g(num, 0, arrayList);
        this.f31003f = new C10470g(num, -1, arrayList);
        this.f31004g = new C10470g(num, 1, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static void m10938a(C10468e c10468e, C10469f other) {
        c10468e.getClass();
        AbstractC16544l.m18094g(other, "other");
        float f10 = 0;
        C10471h top = other.f31007c;
        AbstractC16544l.m18094g(top, "top");
        C10471h bottom = other.f31009e;
        AbstractC16544l.m18094g(bottom, "bottom");
        C10470g c10470g = c10468e.f31002e;
        c10470g.getClass();
        c10470g.f31010a.add(new C10467d(c10470g, top, f10, f10, 0));
        C10470g c10470g2 = c10468e.f31004g;
        c10470g2.getClass();
        c10470g2.f31010a.add(new C10467d(c10470g2, bottom, f10, f10, 0));
        c10468e.f30999b.add(new C4526w(c10468e, 0.5f, 3));
    }
}
