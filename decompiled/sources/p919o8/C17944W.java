package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.W */
/* JADX INFO: loaded from: classes.dex */
public final class C17944W {

    /* JADX INFO: renamed from: a */
    public final C17981j0 f57231a;

    public C17944W(C17981j0 c17981j0) {
        this.f57231a = c17981j0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17944W) && AbstractC16544l.m18089b(this.f57231a, ((C17944W) obj).f57231a);
    }

    public final int hashCode() {
        C17981j0 c17981j0 = this.f57231a;
        if (c17981j0 == null) {
            return 0;
        }
        return c17981j0.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.f57231a + Separators.RPAREN;
    }
}
