package p546Wb;

import java.util.Arrays;
import p1060v9.AbstractC20502t;

/* JADX INFO: renamed from: Wb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8756b {

    /* JADX INFO: renamed from: a */
    public final int f26676a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8756b) {
            return this.f26676a == ((C8756b) obj).f26676a && AbstractC20502t.m21161l(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26676a), Boolean.FALSE, null});
    }
}
