package p296Lk;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Lk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5106c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1436k f16683a;

    /* JADX INFO: renamed from: b */
    public final AbstractC16546n f16684b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5106c(InterfaceC1436k columnSize, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(columnSize, "columnSize");
        this.f16683a = columnSize;
        this.f16684b = (AbstractC16546n) interfaceC1436k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5106c)) {
            return false;
        }
        C5106c c5106c = (C5106c) obj;
        return AbstractC16544l.m18089b(this.f16683a, c5106c.f16683a) && this.f16684b.equals(c5106c.f16684b);
    }

    public final int hashCode() {
        return this.f16684b.hashCode() + (this.f16683a.hashCode() * 31);
    }

    public final String toString() {
        return "Dynamic(columnSize=" + this.f16683a + ", rowSize=" + this.f16684b + Separators.RPAREN;
    }
}
