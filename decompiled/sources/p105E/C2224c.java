package p105E;

import java.util.ArrayList;
import java.util.Iterator;
import p109E3.C2288l;
import p228J.AbstractC3810L;
import p523V9.AbstractC8072d6;

/* JADX INFO: renamed from: E.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2224c {

    /* JADX INFO: renamed from: a */
    public boolean f6808a;

    /* JADX INFO: renamed from: b */
    public boolean f6809b;

    /* JADX INFO: renamed from: c */
    public boolean f6810c;

    /* JADX INFO: renamed from: a */
    public C2288l m3264a() {
        if (this.f6808a || !(this.f6809b || this.f6810c)) {
            return new C2288l(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    /* JADX INFO: renamed from: b */
    public void m3265b(ArrayList arrayList) {
        if ((this.f6808a || this.f6809b || this.f6810c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC3810L) it.next()).mo4507a();
            }
            AbstractC8072d6.m8486c("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
