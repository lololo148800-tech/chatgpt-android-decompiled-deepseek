package p753fh;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: fh.q */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13659q {
    public static final C13658p Companion = new C13658p();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f43131g = {null, null, null, new C11158d(C11181o0.f33827a, 2), null, null};

    /* JADX INFO: renamed from: a */
    public final C13656n f43132a;

    /* JADX INFO: renamed from: b */
    public final C13665w f43133b;

    /* JADX INFO: renamed from: c */
    public final C13662t f43134c;

    /* JADX INFO: renamed from: d */
    public final Set f43135d;

    /* JADX INFO: renamed from: e */
    public final boolean f43136e;

    /* JADX INFO: renamed from: f */
    public final String f43137f;

    public /* synthetic */ C13659q(int i10, C13656n c13656n, C13665w c13665w, C13662t c13662t, Set set, boolean z6, String str) {
        if (63 != (i10 & 63)) {
            AbstractC11153a0.m12389l(i10, 63, C13657o.f43130a.getDescriptor());
            throw null;
        }
        this.f43132a = c13656n;
        this.f43133b = c13665w;
        this.f43134c = c13662t;
        this.f43135d = set;
        this.f43136e = z6;
        this.f43137f = str;
    }
}
