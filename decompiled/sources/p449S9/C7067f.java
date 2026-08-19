package p449S9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: S9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7067f implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Object f22542Y;

    public C7067f(Object obj) {
        this.f22542Y = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7067f) {
            return AbstractC7057a.m7463h(this.f22542Y, ((C7067f) obj).f22542Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22542Y});
    }

    public final String toString() {
        return AbstractC10763a.m11054l("Suppliers.ofInstance(", this.f22542Y.toString(), Separators.RPAREN);
    }
}
