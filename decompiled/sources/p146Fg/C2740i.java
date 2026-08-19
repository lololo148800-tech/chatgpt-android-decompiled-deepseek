package p146Fg;

import ao.AbstractC11153a0;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fg.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2740i {
    public static final C2739h Companion = new C2739h();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f8404e = {EnumC2743l.Companion.serializer(), null, null, null};

    /* JADX INFO: renamed from: a */
    public final EnumC2743l f8405a;

    /* JADX INFO: renamed from: b */
    public final String f8406b;

    /* JADX INFO: renamed from: c */
    public final String f8407c;

    /* JADX INFO: renamed from: d */
    public final String f8408d;

    public /* synthetic */ C2740i(int i10, EnumC2743l enumC2743l, String str, String str2, String str3) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C2738g.f8403a.getDescriptor());
            throw null;
        }
        this.f8405a = enumC2743l;
        if ((i10 & 2) == 0) {
            this.f8406b = null;
        } else {
            this.f8406b = str;
        }
        if ((i10 & 4) == 0) {
            this.f8407c = null;
        } else {
            this.f8407c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f8408d = null;
        } else {
            this.f8408d = str3;
        }
    }
}
