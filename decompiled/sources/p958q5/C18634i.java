package p958q5;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p1075w5.C20835m;

/* JADX INFO: renamed from: q5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C18634i implements InterfaceC18631f {

    /* JADX INFO: renamed from: a */
    public final C17314q f59357a;

    /* JADX INFO: renamed from: b */
    public final C17314q f59358b;

    /* JADX INFO: renamed from: c */
    public final boolean f59359c;

    public C18634i(C17314q c17314q, C17314q c17314q2, boolean z6) {
        this.f59357a = c17314q;
        this.f59358b = c17314q2;
        this.f59359c = z6;
    }

    @Override // p958q5.InterfaceC18631f
    /* JADX INFO: renamed from: a */
    public final InterfaceC18632g mo19984a(Object obj, C20835m c20835m) {
        Uri uri = (Uri) obj;
        if (AbstractC16544l.m18089b(uri.getScheme(), "http") || AbstractC16544l.m18089b(uri.getScheme(), "https")) {
            return new C18637l(uri.toString(), c20835m, this.f59357a, this.f59358b, this.f59359c);
        }
        return null;
    }
}
