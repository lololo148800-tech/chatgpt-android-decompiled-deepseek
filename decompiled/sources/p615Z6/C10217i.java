package p615Z6;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import java.util.List;
import p449S9.C7042K;

/* JADX INFO: renamed from: Z6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10217i implements InterfaceC10209e {

    /* JADX INFO: renamed from: a */
    public List f30343a;

    @Override // p615Z6.InterfaceC10209e
    /* JADX INFO: renamed from: a */
    public final boolean mo10789a(AbstractC10199Y abstractC10199Y) {
        Iterator it = this.f30343a.iterator();
        while (it.hasNext()) {
            if (C7042K.m7433j((C10225m) it.next(), abstractC10199Y)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "not(" + this.f30343a + Separators.RPAREN;
    }
}
