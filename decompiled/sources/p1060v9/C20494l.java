package p1060v9;

import java.util.Arrays;
import p1022t9.InterfaceC19817b;

/* JADX INFO: renamed from: v9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C20494l implements InterfaceC19817b {

    /* JADX INFO: renamed from: Z */
    public static final C20494l f65076Z = new C20494l(null);

    /* JADX INFO: renamed from: Y */
    public final String f65077Y;

    public /* synthetic */ C20494l(String str) {
        this.f65077Y = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20494l) {
            return AbstractC20502t.m21161l(this.f65077Y, ((C20494l) obj).f65077Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f65077Y});
    }
}
