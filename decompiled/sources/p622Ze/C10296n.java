package p622Ze;

import kotlin.jvm.internal.AbstractC16544l;
import p550We.EnumC8830k;

/* JADX INFO: renamed from: Ze.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C10296n implements InterfaceC10297o {

    /* JADX INFO: renamed from: a */
    public final String f30579a;

    /* JADX INFO: renamed from: b */
    public final String f30580b;

    /* JADX INFO: renamed from: c */
    public final EnumC8830k f30581c;

    public C10296n(String actionId, String str, EnumC8830k enumC8830k) {
        AbstractC16544l.m18094g(actionId, "actionId");
        this.f30579a = actionId;
        this.f30580b = str;
        this.f30581c = enumC8830k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10296n)) {
            return false;
        }
        C10296n c10296n = (C10296n) obj;
        return AbstractC16544l.m18089b(this.f30579a, c10296n.f30579a) && AbstractC16544l.m18089b(this.f30580b, c10296n.f30580b) && this.f30581c == c10296n.f30581c;
    }

    public final int hashCode() {
        int iHashCode = this.f30579a.hashCode() * 31;
        String str = this.f30580b;
        return this.f30581c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }
}
