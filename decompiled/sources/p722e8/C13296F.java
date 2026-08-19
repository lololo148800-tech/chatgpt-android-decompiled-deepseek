package p722e8;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p236J7.AbstractC4283g;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.F */
/* JADX INFO: loaded from: classes.dex */
public final class C13296F extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final AbstractC4283g f42030b;

    /* JADX INFO: renamed from: c */
    public final C11691c f42031c;

    public C13296F(AbstractC4283g abstractC4283g) {
        C11691c c11691c = new C11691c();
        this.f42030b = abstractC4283g;
        this.f42031c = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42031c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13296F)) {
            return false;
        }
        C13296F c13296f = (C13296F) obj;
        return AbstractC16544l.m18089b(this.f42030b, c13296f.f42030b) && AbstractC16544l.m18089b(this.f42031c, c13296f.f42031c);
    }

    public final int hashCode() {
        return this.f42031c.hashCode() + (this.f42030b.hashCode() * 31);
    }

    public final String toString() {
        return "TelemetryEventWrapper(event=" + this.f42030b + ", eventTime=" + this.f42031c + HJrCuD.vQnUpoUknzB;
    }
}
