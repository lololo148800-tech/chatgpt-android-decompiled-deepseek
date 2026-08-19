package p618Za;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p826j6.C16155i;

/* JADX INFO: renamed from: Za.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10267f {

    /* JADX INFO: renamed from: a */
    public String f30497a;

    /* JADX INFO: renamed from: b */
    public int f30498b;

    public C10267f(String source) {
        AbstractC16544l.m18094g(source, "source");
        this.f30497a = source;
    }

    /* JADX INFO: renamed from: a */
    public boolean m10862a(InterfaceC1436k predicate) {
        AbstractC16544l.m18094g(predicate, "predicate");
        boolean zM10865d = m10865d(predicate);
        if (zM10865d) {
            this.f30498b++;
        }
        return zM10865d;
    }

    /* JADX INFO: renamed from: b */
    public void m10863b(InterfaceC1436k interfaceC1436k) {
        if (m10865d(interfaceC1436k)) {
            while (m10865d(interfaceC1436k)) {
                this.f30498b++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public C16155i m10864c() {
        C16155i c16155i = new C16155i();
        c16155i.f50151a = this.f30498b;
        c16155i.f50152b = this.f30497a;
        return c16155i;
    }

    /* JADX INFO: renamed from: d */
    public boolean m10865d(InterfaceC1436k predicate) {
        AbstractC16544l.m18094g(predicate, "predicate");
        int i10 = this.f30498b;
        String str = this.f30497a;
        return i10 < str.length() && ((Boolean) predicate.invoke(Character.valueOf(str.charAt(this.f30498b)))).booleanValue();
    }

    public /* synthetic */ C10267f(String str, int i10, int i11) {
        this(str, (i11 & 2) != 0 ? 0 : i10, false);
    }

    public C10267f(String regexRaw, int i10, boolean z6) {
        AbstractC16544l.m18094g(regexRaw, "regexRaw");
        this.f30497a = z6 ? AbstractC10763a.m11047e(')', Separators.LPAREN, regexRaw) : regexRaw;
        this.f30498b = z6 ? i10 + 1 : i10;
    }

    public C10267f(int i10, String str) {
        this.f30498b = i10;
        this.f30497a = str;
    }
}
