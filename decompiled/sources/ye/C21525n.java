package ye;

import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.InterfaceC21098s;

/* JADX INFO: renamed from: ye.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C21525n {

    /* JADX INFO: renamed from: a */
    public final String f68168a;

    /* JADX INFO: renamed from: b */
    public final String f68169b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21098s f68170c;

    /* JADX INFO: renamed from: d */
    public final boolean f68171d;

    public C21525n(String messageId, String str, InterfaceC21098s interfaceC21098s, boolean z6) {
        AbstractC16544l.m18094g(messageId, "messageId");
        this.f68168a = messageId;
        this.f68169b = str;
        this.f68170c = interfaceC21098s;
        this.f68171d = z6;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21525n)) {
            return false;
        }
        C21525n c21525n = (C21525n) obj;
        if (!AbstractC16544l.m18089b(this.f68168a, c21525n.f68168a)) {
            return false;
        }
        String str = this.f68169b;
        String str2 = c21525n.f68169b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f68170c, c21525n.f68170c) && this.f68171d == c21525n.f68171d;
    }

    public final int hashCode() {
        int iHashCode = this.f68168a.hashCode() * 31;
        String str = this.f68169b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC21098s interfaceC21098s = this.f68170c;
        return ((iHashCode2 + (interfaceC21098s != null ? interfaceC21098s.hashCode() : 0)) * 31) + (this.f68171d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
