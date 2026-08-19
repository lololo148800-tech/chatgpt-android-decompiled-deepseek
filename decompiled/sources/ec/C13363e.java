package ec;

import java.util.ArrayList;
import p1061vb.C20513d;
import p594Y9.AbstractC9710C4;
import p594Y9.C9861b5;
import p594Y9.C9998y;

/* JADX INFO: renamed from: ec.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13363e {

    /* JADX INFO: renamed from: a */
    public final ArrayList f42403a;

    /* JADX INFO: renamed from: b */
    public final String f42404b;

    public C13363e(C9861b5 c9861b5) {
        ArrayList arrayList = new ArrayList();
        this.f42403a = arrayList;
        this.f42404b = c9861b5.f29369Y;
        arrayList.addAll(AbstractC9710C4.m10304b(c9861b5.f29370Z, new C20513d()));
    }

    public C13363e(String str, C9998y c9998y) {
        ArrayList arrayList = new ArrayList();
        this.f42403a = arrayList;
        arrayList.addAll(c9998y);
        this.f42404b = str;
    }
}
