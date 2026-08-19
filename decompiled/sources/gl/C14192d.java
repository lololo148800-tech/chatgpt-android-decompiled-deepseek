package gl;

import java.io.Serializable;
import p857kl.InterfaceC16476x;

/* JADX INFO: renamed from: gl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C14192d {

    /* JADX INFO: renamed from: a */
    public final String f44587a;

    /* JADX INFO: renamed from: b */
    public final Serializable f44588b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16476x f44589c;

    public C14192d(String str, Serializable serializable, InterfaceC16476x interfaceC16476x) {
        this.f44587a = str;
        this.f44588b = serializable;
        this.f44589c = interfaceC16476x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14192d)) {
            return false;
        }
        C14192d c14192d = (C14192d) obj;
        return this.f44587a.equals(c14192d.f44587a) && this.f44588b.equals(c14192d.f44588b) && this.f44589c.equals(c14192d.f44589c);
    }

    public final int hashCode() {
        return this.f44589c.hashCode() + ((this.f44588b.hashCode() + (this.f44587a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FormPart(key=" + this.f44587a + ", value=" + this.f44588b + ", headers=" + this.f44589c + ')';
    }
}
