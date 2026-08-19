package p923oc;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: oc.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C18038B extends AbstractC18048d {

    /* JADX INFO: renamed from: a */
    public final boolean f57584a;

    /* JADX INFO: renamed from: b */
    public final EnumC18039C f57585b;

    public C18038B(boolean z6, EnumC18039C enumC18039C) {
        this.f57584a = z6;
        this.f57585b = enumC18039C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18038B)) {
            return false;
        }
        C18038B c18038b = (C18038B) obj;
        return this.f57584a == c18038b.f57584a && this.f57585b == c18038b.f57585b;
    }

    public final int hashCode() {
        return this.f57585b.hashCode() + ((this.f57584a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "AstTableCell(header=" + this.f57584a + ", alignment=" + this.f57585b + Separators.RPAREN;
    }
}
