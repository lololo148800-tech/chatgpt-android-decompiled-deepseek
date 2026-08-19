package p615Z6;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: Z6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C10227n {

    /* JADX INFO: renamed from: a */
    public final int f30357a;

    /* JADX INFO: renamed from: b */
    public final String f30358b;

    /* JADX INFO: renamed from: c */
    public ArrayList f30359c = null;

    /* JADX INFO: renamed from: d */
    public ArrayList f30360d = null;

    public C10227n(int i10, String str) {
        this.f30357a = 0;
        this.f30358b = null;
        this.f30357a = i10 == 0 ? 1 : i10;
        this.f30358b = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m10792a(int i10, String str, String str2) {
        if (this.f30359c == null) {
            this.f30359c = new ArrayList();
        }
        this.f30359c.add(new C10203b(str, i10, str2));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f30357a;
        if (i10 == 2) {
            sb2.append("> ");
        } else if (i10 == 3) {
            sb2.append("+ ");
        }
        String str = this.f30358b;
        if (str == null) {
            str = Separators.STAR;
        }
        sb2.append(str);
        ArrayList<C10203b> arrayList = this.f30359c;
        if (arrayList != null) {
            for (C10203b c10203b : arrayList) {
                sb2.append('[');
                sb2.append(c10203b.f30316a);
                int iM24h = AbstractC0010F.m24h(c10203b.f30317b);
                String str2 = c10203b.f30318c;
                if (iM24h == 1) {
                    sb2.append('=');
                    sb2.append(str2);
                } else if (iM24h == 2) {
                    sb2.append("~=");
                    sb2.append(str2);
                } else if (iM24h == 3) {
                    sb2.append("|=");
                    sb2.append(str2);
                }
                sb2.append(']');
            }
        }
        ArrayList<InterfaceC10209e> arrayList2 = this.f30360d;
        if (arrayList2 != null) {
            for (InterfaceC10209e interfaceC10209e : arrayList2) {
                sb2.append(':');
                sb2.append(interfaceC10209e);
            }
        }
        return sb2.toString();
    }
}
