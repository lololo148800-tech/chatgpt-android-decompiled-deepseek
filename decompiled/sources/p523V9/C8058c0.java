package p523V9;

import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p117Eb.C2392v;

/* JADX INFO: renamed from: V9.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8058c0 {

    /* JADX INFO: renamed from: a */
    public final EnumC7901H4 f25366a;

    /* JADX INFO: renamed from: b */
    public final Boolean f25367b;

    /* JADX INFO: renamed from: c */
    public final C8184r6 f25368c;

    /* JADX INFO: renamed from: d */
    public final C7896H f25369d;

    /* JADX INFO: renamed from: e */
    public final C7896H f25370e;

    public /* synthetic */ C8058c0(C2392v c2392v) {
        this.f25366a = (EnumC7901H4) c2392v.f7436Z;
        this.f25367b = (Boolean) c2392v.f7437o0;
        this.f25368c = (C8184r6) c2392v.f7438p0;
        this.f25369d = (C7896H) c2392v.f7439q0;
        this.f25370e = (C7896H) c2392v.f7440r0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8058c0)) {
            return false;
        }
        C8058c0 c8058c0 = (C8058c0) obj;
        return AbstractC20502t.m21161l(this.f25366a, c8058c0.f25366a) && AbstractC20502t.m21161l(null, null) && AbstractC20502t.m21161l(this.f25367b, c8058c0.f25367b) && AbstractC20502t.m21161l(null, null) && AbstractC20502t.m21161l(this.f25368c, c8058c0.f25368c) && AbstractC20502t.m21161l(this.f25369d, c8058c0.f25369d) && AbstractC20502t.m21161l(this.f25370e, c8058c0.f25370e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25366a, null, this.f25367b, null, this.f25368c, this.f25369d, this.f25370e});
    }
}
