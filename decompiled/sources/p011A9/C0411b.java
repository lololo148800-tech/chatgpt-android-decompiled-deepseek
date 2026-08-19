package p011A9;

import java.util.Comparator;
import p1009s9.C19501d;

/* JADX INFO: renamed from: A9.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0411b implements Comparator {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ C0411b f1370Y = new C0411b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C19501d c19501d = (C19501d) obj;
        C19501d c19501d2 = (C19501d) obj2;
        return !c19501d.f61946Y.equals(c19501d2.f61946Y) ? c19501d.f61946Y.compareTo(c19501d2.f61946Y) : (c19501d.m20594b() > c19501d2.m20594b() ? 1 : (c19501d.m20594b() == c19501d2.m20594b() ? 0 : -1));
    }
}
