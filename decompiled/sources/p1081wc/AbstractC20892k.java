package p1081wc;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: wc.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20892k {

    /* JADX INFO: renamed from: a */
    public final String f66564a;

    public AbstractC20892k(String str) {
        this.f66564a = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo21446a();

    public String toString() {
        StringBuilder sbM11058p = AbstractC10763a.m11058p("Android: ", mo21446a(), ": ");
        sbM11058p.append(this.f66564a);
        return sbM11058p.toString();
    }
}
