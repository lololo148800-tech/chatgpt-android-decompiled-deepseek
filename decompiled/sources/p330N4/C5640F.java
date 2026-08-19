package p330N4;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: N4.F */
/* JADX INFO: loaded from: classes.dex */
public final class C5640F {

    /* JADX INFO: renamed from: b */
    public final View f18321b;

    /* JADX INFO: renamed from: a */
    public final HashMap f18320a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f18322c = new ArrayList();

    public C5640F(View view) {
        this.f18321b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5640F)) {
            return false;
        }
        C5640F c5640f = (C5640F) obj;
        return this.f18321b == c5640f.f18321b && this.f18320a.equals(c5640f.f18320a);
    }

    public final int hashCode() {
        return this.f18320a.hashCode() + (this.f18321b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM9895n = AbstractC9306j0.m9895n("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM9895n.append(this.f18321b);
        sbM9895n.append(Separators.RETURN);
        String strM11052j = AbstractC10763a.m11052j(sbM9895n.toString(), "    values:");
        HashMap map = this.f18320a;
        for (String str : map.keySet()) {
            strM11052j = strM11052j + "    " + str + ": " + map.get(str) + Separators.RETURN;
        }
        return strM11052j;
    }
}
