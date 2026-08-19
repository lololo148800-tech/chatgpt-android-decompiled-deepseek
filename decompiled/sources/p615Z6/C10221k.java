package p615Z6;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Z6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10221k implements InterfaceC10209e {

    /* JADX INFO: renamed from: a */
    public final boolean f30347a;

    /* JADX INFO: renamed from: b */
    public final String f30348b;

    public C10221k(String str, boolean z6) {
        this.f30347a = z6;
        this.f30348b = str;
    }

    @Override // p615Z6.InterfaceC10209e
    /* JADX INFO: renamed from: a */
    public final boolean mo10789a(AbstractC10199Y abstractC10199Y) {
        int i10;
        boolean z6 = this.f30347a;
        String strMo10764n = this.f30348b;
        if (z6 && strMo10764n == null) {
            strMo10764n = abstractC10199Y.mo10764n();
        }
        InterfaceC10197W interfaceC10197W = abstractC10199Y.f30315b;
        if (interfaceC10197W != null) {
            Iterator it = interfaceC10197W.getChildren().iterator();
            i10 = 0;
            while (it.hasNext()) {
                AbstractC10199Y abstractC10199Y2 = (AbstractC10199Y) ((AbstractC10202a0) it.next());
                if (strMo10764n == null || abstractC10199Y2.mo10764n().equals(strMo10764n)) {
                    i10++;
                }
            }
        } else {
            i10 = 1;
        }
        return i10 == 1;
    }

    public final String toString() {
        if (!this.f30347a) {
            return "only-child";
        }
        return AbstractC9306j0.m9891j(this.f30348b, Separators.GREATER_THAN, new StringBuilder("only-of-type <"));
    }
}
